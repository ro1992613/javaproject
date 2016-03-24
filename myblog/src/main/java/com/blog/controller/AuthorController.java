package com.blog.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.blog.service.AuthorService;

@Controller 
public class AuthorController {

	@Resource	
	AuthorService authorService;
	
	 @RequestMapping("/hello1")  
	    public ModelAndView hello1(){  
	        ModelAndView mv = new ModelAndView();  
	        mv.setViewName("helloworld"); 
	        mv.addObject("name", "xiao");
	        System.out.println(authorService.getAuthorById("1").getAuthorName()); 
	        return mv;        
	    } 
	 @RequestMapping("/test")
	 public ModelAndView test(){
		 ModelAndView mv = new ModelAndView();
		 System.out.println(authorService.getAuthorById("1").getAuthorName());
		 
		 return mv;
	 }
}
