package com.serviceLagbeNaki.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.serviceLagbeNaki.main.model.customer;
import com.serviceLagbeNaki.main.model.serviceProvider;
import com.serviceLagbeNaki.main.repository.customerRepo;
import com.serviceLagbeNaki.main.repository.serviceProviderRepo;

@Controller
public class mainController {
	@Autowired
	customerRepo cr;
	@Autowired
	serviceProviderRepo spr;
	

	@RequestMapping("/home")
	public String home() {
		return "home.html";
	}
	/*cr.save(customer);
	 * 
	 * , method = RequestMethod.POST
	 */
	@RequestMapping(value ="/serviceNewarForm")
	public String serviceNewarForm() {
		
		return "serviceNewarForm.html";
	}
	
	@RequestMapping(value ="/service_khujci", method = RequestMethod.POST)
	public String service_khujci(@ModelAttribute customer customer) {
		cr.save(customer);
		return "service_khujci.html";
	}
	
	
	@RequestMapping("/serviceDewarForm")
	public String serviceDewarForm() {
		return "serviceDewarForm.html";
	}

	@RequestMapping(value="/job_khujci", method = RequestMethod.POST )
	public String job_khujci(@ModelAttribute serviceProvider serviceProvider) {
		spr.save(serviceProvider);
		return "job_khujci.html";
	}

	

}
