package com.wanhang.fitness.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.wanhang.fitness.common.util.PageUtil;
import com.wanhang.fitness.common.util.StringUtil;
import com.wanhang.fitness.model.PageBean;
import com.wanhang.fitness.model.SystemLog;
import com.wanhang.fitness.service.SystemLogService;

@Controller
@RequestMapping("/systemLog")
public class SystemLogController extends BaseController {
	
	private static final Logger LOG = LoggerFactory.getLogger(SystemLogController.class);
	private static final Integer pageSize = 10;
	
	@Resource
	private SystemLogService systemLogServiceImpl;
	
	@RequestMapping("/list")
	public ModelAndView list(@RequestParam(value="page",required=false)String page){
		ModelAndView mav = new ModelAndView();
		if(StringUtil.isEmpty(page)){
			page="1";
		}
		Map<String, Object> map = new HashMap<String, Object>();
		//计算分页
		PageBean pageBean=new PageBean(Integer.parseInt(page), pageSize);
		//计算总数
		int total=systemLogServiceImpl.count();
		//得到分页li
		String pageCode=PageUtil.getPagation(request.getContextPath()+"/systemLog/list", total, Integer.parseInt(page), pageSize);
		map.put("start", pageBean.getStart());
		map.put("pageSize", pageBean.getPageSize());
		List<SystemLog> systemLogList = systemLogServiceImpl.list(map);
		LOG.info("查询系统日志第"+pageBean.getStart()+"条到第"+(pageBean.getStart()+pageSize)+"条.");
		mav.addObject("systemLogList",systemLogList);
		mav.addObject("pageCode", pageCode);
		mav.setViewName("/systemLog/systemLog");
		return mav;
	}
	
	@RequestMapping("/save")
	public ModelAndView save(){
		ModelAndView mav = new ModelAndView();
		SystemLog systemLog = new SystemLog();
		systemLog.setVenueId(79);
		systemLog.setVenueName("江南摩卡体育馆");
		systemLog.setModuleCode("user");
		systemLog.setModuleName("用户模块");
		systemLog.setLogContent("保存日志");
		systemLog.setCreaterCode("song");
		systemLog.setCreaterName("宋杰");
		systemLog.setCreateDate(new Date());
		systemLogServiceImpl.save(systemLog);
		LOG.info("保存系统日志");
		mav.addObject("message","保存成功");
		mav.setViewName("/systemLog/save");
		return mav;
	}
}
