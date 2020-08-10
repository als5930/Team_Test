package com.biz.team.controller;

import org.springframework.context.annotation.Configuration;

@Configuration
public class BookController {

	public String List(){
		
		return "book/list";
		
	}
}
