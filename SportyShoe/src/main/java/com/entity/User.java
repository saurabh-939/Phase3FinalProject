package com.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({"hibernateLazyInitializer"})
@Entity
public class User implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false)
	private int user_id;
	private String user_name;
	private int user_contact_no;
	private String user_email;
	private String user_password;
	
	@ManyToMany(mappedBy = "users")
	@JsonIgnore
	private List<Product> products1=new ArrayList<>();
	

	public User() {
		
	}

	public User(int user_id, String user_name, int user_contact_no, String user_email, String user_password, List<Product> products) {
		super();
		this.user_id = user_id;
		this.user_name = user_name;
		this.user_contact_no = user_contact_no;
		this.user_email = user_email;
		this.user_password = user_password;
		this.products1 = products;
	}



	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public int getUser_contact_no() {
		return user_contact_no;
	}

	public void setUser_contact_no(int user_contact_no) {
		this.user_contact_no = user_contact_no;
	}

	public String getUser_email() {
		return user_email;
	}

	public void setUser_email(String user_email) {
		this.user_email = user_email;
	}

	public String getUser_password() {
		return user_password;
	}

	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}

	public List<Product> getProducts1() {
		return products1;
	}

	public void addProducts1(Product product) {
		this.products1.add(product);
	}

}
