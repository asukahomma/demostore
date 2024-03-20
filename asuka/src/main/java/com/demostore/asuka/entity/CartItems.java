package com.demostore.asuka.entity;

import java.sql.Timestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class CartItems {
	@Id
	public Integer id;
	
	public Integer cartId ;
	
	public Integer productId;
	
	public Integer quantity;
	
	public Integer unitPrice;
	
	public Integer deleteFlg;
	
	public String enterUser;
	
	public Timestamp enterDate;
	
	public String updateUser;
	
	public Timestamp updateDate;

}
