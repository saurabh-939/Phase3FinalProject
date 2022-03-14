package com.entity;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepo extends JpaRepository<Orders, Integer> {

	public List<Orders> findByOrderdate(String orderdate);
	
}
