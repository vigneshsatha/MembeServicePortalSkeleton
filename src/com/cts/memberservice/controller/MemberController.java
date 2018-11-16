package com.cts.memberservice.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.cts.memberservice.validator.MemberServiceValidator;
import com.cts.memberservice.vo.Member;

@Controller
public class MemberController {
	@Autowired
	MemberServiceValidator validator;

	// Use this private method to display the services drop down in
	// subscribe.jsp
	/**
	 * @return List<String>
	 */
	@RequestMapping(value = "/subscribe*", method = RequestMethod.GET)
	public ModelAndView subscribe() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("subscribe");
		Member member = new Member();

		mv.addObject("member", member);
		mv.addObject("subscriptionList", new String[] {"Premium", "Basic"});
		mv.addObject("services", generateServicesList());
		return mv;
	}

	@RequestMapping(value = "/subscribe*", method = RequestMethod.POST)
	public String subscribePost(@ModelAttribute("member") Member member,
			BindingResult bindingResult, ModelMap modelMap) {
		validator.validate(member, bindingResult);
		//member.setServices(generateServicesList());
		modelMap.addAttribute("member", member);
		modelMap.addAttribute("subscriptionList", new String[] {"Premium", "Basic"});
		modelMap.addAttribute("services", generateServicesList());
		if (bindingResult.hasErrors()) {
			return "subscribe";
		}
		
		return "redirect:/success.html";
	}

	@RequestMapping(value = "/success*", method = RequestMethod.GET)
	public ModelAndView success() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("success");
		return mv;
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
