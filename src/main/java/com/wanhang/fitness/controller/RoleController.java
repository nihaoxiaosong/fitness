package com.wanhang.fitness.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/role")
public class RoleController extends BaseController {
	
	@RequestMapping("/list")
	public ModelAndView list(){
		ModelAndView mav = new ModelAndView();
		//TODO:查询角色列表
		mav.setViewName("/authority/role");
		return mav;
	}
}
