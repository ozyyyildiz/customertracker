package com.ozanYildiz.springdemo.Dao;

import java.util.List;

import com.ozanYildiz.springdemo.entity.Customer;

public interface CustomerDao {
	
	public List<Customer> getCustomers();

	public void saveCustomer(Customer customer);

	public Customer getCustomer(int id);

	public void deleteCustomer(int id);
	
}
