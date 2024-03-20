package com.demostore.asuka.entity;

import java.sql.Timestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Order {
	@Id
	public Integer id;
	
	public Timestamp orderDate;
	
	public Integer shippingStatus;
	
	public Integer userId;
	
	public String shippingAddress;
	
	public String mail;
	
	public Integer paymentStatus;
	
	public Integer paymentMethod;
	
	public Integer tax;
	
	public Integer deleteFlg;
	
	public String enterUser;
	
	public Timestamp enterDate;
	
	public String updateUser;
	
	public Timestamp updateDate;


}
