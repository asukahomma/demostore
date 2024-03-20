package com.demostore.asuka.entity;

import java.sql.Timestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class User {
	@Id
	public Integer id;
	
	public String userName;
	
	public String name;
	
	public Integer authority;
	
	public String mail;
	
	public Integer tel;
	
	public String password;
	
	public Integer deleteFlg;
	
	public String enterUser;
	
	public Timestamp enterDate;
	
	public String updateUser;
	
	public Timestamp updateDate;
	
}
