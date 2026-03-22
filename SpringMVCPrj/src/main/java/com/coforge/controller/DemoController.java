package com.coforge.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
@ResponseBody
@RequestMapping("/democontroller")

public class DemoController {
	
	@RequestMapping("/hello")
	public String sayHello() {
		return "Hello from DemoController";

}
	@RequestMapping("/name")
	public String printName() {
		return "Hello Anuradha";
		
	}
}
