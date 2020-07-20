package com.example.demo.controller;

import javax.xml.ws.Response;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/example")
public class ExampleController {
	
	
	@RequestMapping("/hello")
    public String greet() {
        return "hello";
    }
	
}
