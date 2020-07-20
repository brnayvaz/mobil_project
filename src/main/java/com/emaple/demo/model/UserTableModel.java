package com.emaple.demo.model;

import java.util.Date;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class UserTableModel {
	
	private Integer id;
	
	private String userName;

	private String name;

	private String lastName;

	private String contactPhone;

	private String contactAdress;

	private String contactMail;

	private Date userBirthDate;
	
	private Date insertDateTime;
	
	private Date updateDateTime;

}
