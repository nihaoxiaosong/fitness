package com.wanhang.fitness.controller;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.wanhang.fitness.model.Module;
import com.wanhang.fitness.service.ModuleService;

@Controller
@RequestMapping("/module")
public class ModuleController extends BaseController {
	
	private static final Logger LOG = LoggerFactory.getLogger(ModuleController.class);
	
	@Resource
	private ModuleService moduleServiceImpl;
	
	@RequestMapping("/list")
	public ModelAndView list(){
		ModelAndView mav = new ModelAndView();
		List<Module> moduleList = moduleServiceImpl.list();
		LOG.info("查到模块"+moduleList.size()+"个.");
		mav.addObject("moduleList",moduleList);
		mav.setViewName("/module/list");
		return mav;
	}
}
