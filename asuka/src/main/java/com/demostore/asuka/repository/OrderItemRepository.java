package com.demostore.asuka.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demostore.asuka.entity.OrderItems;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItems, Integer>{

}
