package com.corejava.exceptions;

import java.time.LocalDate;

public class CustomExceptiondDemo  {
	

	public static void main(String[] args) {
		
		//Customer customer = new Customer(67854, "Arjun", "Arjun@gmail.com", "9876543210", LocalDate.now());
		Customer customer = new Customer(0, "Arati", "Arati@gmail.com", "8896543210", LocalDate.now());
		
		getcustomerDetails(customer);
	}

	public static String getcustomerDetails(Customer customer) throws CustomerNotFoundException, ResourceNotFoundException{
		int id = customer.getCustomerId();
		if(id != 0) {
			return customer.toString();
		}
		else
			throw new CustomerNotFoundException("Customer Details are not found");
	}
   
}
