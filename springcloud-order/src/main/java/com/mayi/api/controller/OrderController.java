package com.mayi.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class OrderController {
	
	@Autowired
	RestTemplate restTemplate;
	
	@RequestMapping("/getOrder")
	public String getOrder() {
		String s=restTemplate.getForObject("http://MEMBER/getMember", String.class);  //url 服务名+方法名
		return s;
	}

}
