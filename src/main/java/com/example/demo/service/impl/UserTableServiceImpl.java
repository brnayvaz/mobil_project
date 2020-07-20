package com.example.demo.service.impl;

import java.util.Date;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emaple.demo.model.UserTableModel;
import com.example.demo.entity.UserTable;
import com.example.demo.repository.IUserTableRepository;
import com.example.demo.service.IUserTableService;

@Service
public class UserTableServiceImpl implements IUserTableService {

	@Autowired
	private IUserTableRepository iUserTableRepository;
	
	@Override
	public UserTableModel insert(UserTableModel userTableModel) throws Exception {
		
		UserTable userTable=new UserTable();
		userTable.setName(userTableModel.getName());
		userTable.setLastName(userTable.getLastName());
		userTable.setUserName(crateUserName(userTableModel.getName(),userTableModel.getLastName()));
		userTable.setContactPhone(userTableModel.getContactPhone());
		userTable.setContactAdress(userTableModel.getContactAdress());
		userTable.setContactMail(userTableModel.getContactMail());
		userTable.setUserBirthDate(userTableModel.getUserBirthDate());
		
		if(userTableModel.getId()==null)
		{
			userTable.setInsertDateTime(new Date());
			if(iUserTableRepository.findByContactMail(userTableModel.getContactMail()).size()>0)
			{
				throw new Exception("Bu mail adresi daha önce kullanılmıştır.");
			}
			
			
		}
		else
		{
			UserTable user=iUserTableRepository.findById(userTableModel.getId());
			
			userTable.setInsertDateTime(user.getInsertDateTime());
			userTable.setUpdateDateTime(new Date());
			userTable.setId(userTableModel.getId());
		}
		
		UserTable result=iUserTableRepository.save(userTable);
		
		ModelMapper modelMapper=new ModelMapper();
		
		UserTableModel resultModel = modelMapper.map(result, UserTableModel.class);
		
		return resultModel;
	}
	
	
	
	private String crateUserName(String name,String lastName)
	{
		
		String userName=name.substring(0,1) + "." + lastName;
		
		if(iUserTableRepository.findByUserName(userName).size()>0)
		{
			userName=userName + String.valueOf(iUserTableRepository.findByUserName(userName).size());
		}
		
		
		return userName;
			
	}

}
