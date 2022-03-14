package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Category;
import com.entity.CategoryRepo;

@Service
public class CategoryService {

	@Autowired
	CategoryRepo cat_repo;
	
	public Category addCategory(Category category)
	{
		return cat_repo.save(category);		
	}
	
	public List<String> getAllCategory()
	{
		return cat_repo.findCategory();
	}
	
	public List<String> CategoryByCid(int cid)
	{
		return cat_repo.findCid(cid);
	}
}
