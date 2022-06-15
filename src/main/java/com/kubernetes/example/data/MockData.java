package com.kubernetes.example.data;

import java.util.ArrayList;
import java.util.List;

import com.kubernetes.example.domain.Customer;

public class MockData {

	public static List<Customer> createCustomers() {
		List<Customer> customers = new ArrayList<>();
		Customer c = Customer.builder().age(10).email("vikas@gmail.com").id(1).salary(1000).build();
		Customer c1 = Customer.builder().age(30).email("vikas1@gmail.com").id(1).salary(3000).build();
		Customer c2 = Customer.builder().age(20).email("vikas2@gmail.com").id(1).salary(4000).build();
		customers.add(c);
		customers.add(c1);
		customers.add(c2);
		return customers;
	}
}
