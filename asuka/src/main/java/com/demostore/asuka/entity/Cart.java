package com.demostore.asuka.entity;

import java.sql.Timestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Cart {
	@Id
	public Integer id;
	
	public Integer deleteFlg;

	public String enterUser;

	public Timestamp enterDate;

	public String updateUser;

	public Timestamp updateDate;

}
