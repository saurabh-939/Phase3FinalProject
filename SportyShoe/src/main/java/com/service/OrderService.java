package com.service;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Admin;
import com.entity.OrderRepo;
import com.entity.Orders;

@Service
public class OrderService {

	@Autowired
	OrderRepo orepo;
	
	public List<Orders> getAllOrders()
	{
		return orepo.findAll();
	}
	
	public List<Orders> findByDate(String orderdate)
	{
		return orepo.findByOrderdate(orderdate);
	}
	
	public Orders update(int oid, Orders order)
	{
		Orders o=orepo.getById(oid);
		o.setOrderdate(order.getOrderdate());
		o.setPid(order.getPid());
		o.setUid(order.getUid());
		orepo.save(o);
		return o;
	}
}
