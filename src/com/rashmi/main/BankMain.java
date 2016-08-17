package com.rashmi.main;

import com.digitekbank.dao.CustomerDAO;

public class BankMain {
	public static void main(String[] args){
		CustomerDAO dao = new CustomerDAO();
		dao.printCustomer();
	}
}
