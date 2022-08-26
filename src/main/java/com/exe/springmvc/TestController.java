package com.exe.springmvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller("test.controller")
public class TestController {
/*
	@RequestMapping(value = "/test/param.action",method = RequestMethod.GET)
	public String processGetRequest() {
		
		System.out.println("Get��� Request");
		
		return "paramResult";
	}
	
	@RequestMapping(value = "/test/param.action",method = RequestMethod.POST)
	public String processPostRequest() {
		
		System.out.println("Post��� Request");
		
		return "paramResult";
		
	}
*/	
	/**���� �ּ�ó���� �� �޼ҵ带 �ϳ��� ��ģ ��*/
	@RequestMapping(value = "/test/param.action",
			method = {RequestMethod.GET,RequestMethod.POST})
	public String processRequest(PersonDTO dto,String name,HttpServletRequest request) {
		
		System.out.println("Get/Post ��� Request");
	
		System.out.println(name);
		System.out.println(request.getParameter("phone"));
		
		/**�ؽ��ڵ� ��µ� = ��ü�� �����Ǿ��ٴ� �ǹ�*/
		System.out.println(dto);
		
		System.out.println("name: " + dto.getName());
		System.out.println("phone: " + dto.getPhone());
		System.out.println("email: " + dto.getEmail());
		
		return "paramResult";
	}
	
}