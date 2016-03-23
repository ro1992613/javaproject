package com.techbirds.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloContorller {
	
	
	//hello world����
	@RequestMapping(value="/hello")
	public String hello(){
		System.out.println("spring mvc hello world!");
		return "hello";
	}
	
	/*
	 * 1.�ͻ���->��������   get��ʽ�Ĳ�������-url
	 * 2.uri�Ĳ��������Ǹ���Ӧ�����󷽷��Ĳ���һ��(��struts��ͬ)
	 *   
	 */
	//1
	@RequestMapping(value="/ok")
	public String ok(@RequestParam("userid") int id){
		System.out.println(id);
		return "ok";
	}
	//2
	@RequestMapping(value="/ok1")
	public String ok1(@RequestParam int id){
		System.out.println(id);
		return "ok";
	}
	//3
	@RequestMapping(value="/ok2")
	public String ok2(int id,int age){
		System.out.println(id);
		System.out.println(age);
		return "ok";
	}
	/*
	 * ��������->�ͻ��� �������ݷ�ʽ
	 */
	//1
	@RequestMapping(value="/ok3")
	public String ok3(Map<String, Object> map){
		map.put("hello", "world");
		return "ok";
	}
	//2-�Ƽ�ʹ��
	@RequestMapping(value="/ok4")
	public String ok4(Model model){
		model.addAttribute("hello","world");
		model.addAttribute("world");//keyΪvalue������
		return "ok";
	}
	
	
	//��ȡreq,resp
	@RequestMapping(value="req")
	public String req(HttpServletRequest req,HttpServletResponse resp){
		System.out.println(req.getParameter("id"));
		return "ok";
	}
}
