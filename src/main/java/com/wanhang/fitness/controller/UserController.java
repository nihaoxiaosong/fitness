package com.wanhang.fitness.controller;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.wanhang.common.cipher.CipherHelper;
import com.wanhang.fitness.common.util.ListUtil;
import com.wanhang.fitness.common.util.StringUtil;
import com.wanhang.fitness.model.Module;
import com.wanhang.fitness.model.RoleModule;
import com.wanhang.fitness.model.User;
import com.wanhang.fitness.model.UserRole;
import com.wanhang.fitness.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController extends BaseController {
	private static final Logger LOG = LoggerFactory.getLogger(UserController.class);
	
	@Resource
	private UserService userServiceImpl;
	
	@RequestMapping("/login")
	public ModelAndView login(User user){
		if(StringUtil.isNotEmpty(user.getPassword())){
			user.setPassword(CipherHelper.aesEncryptBase64(user.getPassword()));
		}
		//级联查询user-userRole-role-roleModule-module
		User resultUser = userServiceImpl.login(user);
		ModelAndView mav = new ModelAndView();
		if(resultUser==null){
			mav.addObject("currentUser", user);
			mav.addObject("messsage", "用户名密码错误!");
			mav.setViewName("/login");
		}else{
			String ip = "";
			if (request.getHeader("x-forwarded-for") == null) {
				ip = request.getRemoteAddr();
			}else{
				ip = request.getHeader("x-forwarded-for");
			}
			LOG.info("来自IP["+ip+"]"+resultUser.getUserName()+"登录. 用户详情: "+resultUser.toString());
			//因为一个可以有多个role，然后一个role又有多个module，所以需要合并然后用map去重
			Map<String,Module> moduleMap = new HashMap<String,Module>();
			Module module = null;
			if(ListUtil.isNotEmpty(resultUser.getUserRoleList())){
				for (UserRole userRole : resultUser.getUserRoleList()) {
					if(userRole.getRole()!=null){
						if(ListUtil.isNotEmpty(userRole.getRole().getRoleModuleList())){
							for (RoleModule roleModule : userRole.getRole().getRoleModuleList()) {
								if(roleModule!=null){
									module = moduleMap.get(roleModule.getModuleCode());
									if(module!=null){
										continue;
									}else{
										moduleMap.put(roleModule.getModuleCode(), roleModule.getModule());
									}
								}
							}
						}
						
					}
				}
			}
			//将map转成list，并排序
			List<Module> moduleList = new ArrayList<Module>(moduleMap.values());
			Collections.sort(moduleList, new Comparator<Module>() {
	            public int compare(Module arg0, Module arg1) {
	                return arg0.getId().compareTo(arg1.getId());
	            }
	        });
			session.setAttribute("currentUser", resultUser);
			session.setAttribute("moduleList", moduleList);
			
			mav.addObject("currentUser", resultUser);
			mav.addObject("moduleList",moduleList);
			mav.setViewName("/index");
		}
		return mav;
	}
}
