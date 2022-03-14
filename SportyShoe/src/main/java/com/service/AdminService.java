package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Admin;
import com.entity.AdminRepo;
import com.entity.Product;

@Service
public class AdminService {

	@Autowired
	AdminRepo admin_repo;

	public Admin addAdmin(Admin admin)
	{
		return admin_repo.save(admin);
	}
	
	public List<Admin> getAllAdmin() {
		return admin_repo.findAll();
	}
	
	public Admin updateAdmin(int admin_id, Admin admin)
	{
		Admin a=admin_repo.getById(admin_id);
		a.setAdmin_password(admin.getAdmin_password());
		admin_repo.save(a);
		return a;
	}
	
}
