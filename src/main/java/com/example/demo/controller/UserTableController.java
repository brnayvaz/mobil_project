package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.emaple.demo.model.UserTableModel;
import com.example.demo.service.IUserTableService;


@RestController
@RequestMapping(value = "/userTable")
public class UserTableController {
	
	@Autowired
	private IUserTableService iUserTableService;
	
	@RequestMapping(value="/insert",method = RequestMethod.POST)
    public UserTableModel insert(@RequestBody UserTableModel userTableModel) throws Exception {
       
		UserTableModel result=iUserTableService.insert(userTableModel);
		return result;//
		
    }

}
