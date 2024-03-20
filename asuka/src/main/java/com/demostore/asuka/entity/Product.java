package com.demostore.asuka.entity;

import java.sql.Timestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Product {
	@Id
	public Integer id;
	
	public String name;
	
	public Integer stock;
	
	public String description;
	
	public String imageUrl;
	
	public Integer categoryId;
	
	public Integer deleteFlg;
	
	public String enterUser;
	
	public Timestamp enterDate;
	
	public String updateUser;
	
	public Timestamp updateDate;

}
