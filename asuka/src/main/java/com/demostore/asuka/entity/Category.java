package com.demostore.asuka.entity;

import java.sql.Timestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Category {
	@Id
	public Integer id;
	
	public String name;
	
	public String description;
	
	public Integer deleteFlg;
	
	public String enterUser;
	
	public Timestamp enterDate;
	
	public String updateUser;
	
	public Timestamp updateDate;


}
