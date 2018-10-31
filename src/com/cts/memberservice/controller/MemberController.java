package com.cts.memberservice.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cts.memberservice.validator.MemberServiceValidator;

@Controller
public class MemberController {
	
	MemberServiceValidator validator;
	
	//Use this private method to display the services drop down in subscribe.jsp
	/**
	 * @return List<String>
	 */
	@RequestMapping(value = "/subscribe*", method = RequestMethod.GET)
	public ModelAndView subscribe(ModelMap model) {
		ModelAndView modelView = new ModelAndView();
		modelView.setViewName("subscribe");
		return modelView;
	}

	@RequestMapping(value = "/subscribe*", method = RequestMethod.POST)
	public ModelAndView subscribePost(ModelMap model) {
		ModelAndView modelView = new ModelAndView();
		modelView.setViewName("subscribe");
		return modelView;
	}
	
	private List<String> generateServicesList() {
		List<String> services = new ArrayList<String>();
		services.add("Premium Due Reminders");
		services.add("Payment Notifications");
		services.add("Policy Changes");
		services.add("Policy Topup Window Notifications");
		return services;
	}

}
