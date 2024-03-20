package com.demostore.asuka.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.demostore.asuka.entity.CartItems;


@Repository
public interface CartItemsRepository extends JpaRepository<CartItems, Integer>{

}
