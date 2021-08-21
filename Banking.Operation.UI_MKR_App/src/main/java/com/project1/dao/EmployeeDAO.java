package com.project1.dao;

import java.util.List;

import com.project1.model.Customer;
import com.project1.model.Employee;

public interface EmployeeDAO {

	//As a Employee, I can register
	public int addEmployee(Employee employee);
	//As a Employee, I can login
	public boolean login(int employeeId,String password);
	//As a Employee, I can View a particular registered customer 
	public Customer getCustomerById(int customerId);
	//As a Employee, I can View all registered customer
	public List<Customer> getCustomers();
	//As a Employee, I can delete a particular customer
	public boolean deleteCustomer(int customerId);
}
