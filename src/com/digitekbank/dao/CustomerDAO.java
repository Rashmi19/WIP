package com.digitekbank.dao;
import java.sql.*;

import com.digitekbank.domain.Customer;

public class CustomerDAO {
	Connection conn = null;
	PreparedStatement statement;
	public CustomerDAO() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
	
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/digitek","rashmi","simple");
		} catch (SQLException e ) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
				} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
/**
 * This method creates the customer in DB
 * @param customer
 * @throws SQLException
 */
	public void createCustomer(Customer customer) throws SQLException{
	if(conn == null){
		return ;
		}	
		String query = "insert into Customer (cust_id, name, gender, city, state,zip) values ('"+customer.getCustId()+"','"+customer.getName()+"','"+customer.getGender()+"','"+customer.getCity()+"','"+customer.getState()+"',"+customer.getZip()+")";
		statement=conn.prepareStatement(query);
		
		statement.executeUpdate();
	}
	
	public void updateCustomer(Customer customer) {
		if (conn==null) {
			return;
		}
		
		
		
	}

public void printCustomer(){
		PreparedStatement statement;
		try {
			statement = conn.prepareStatement("select * from customer");
		
		ResultSet resultSet;
		 resultSet = statement.executeQuery();

		while(resultSet.next()){
			String custId = resultSet.getString("CUST_ID");
			String name = resultSet.getString("Name");
			String gender = resultSet.getString("Gender");
			String city = resultSet.getString("City");
			String state = resultSet.getString("State");
			String zip = resultSet.getString("Zip");
			
			System.out.println("CUST_ID: "+ custId+ " Name: "+ name+" Gender "+gender+" City "+ city + " State"+ state+" Zip"+ zip);
		} 
		}
		catch (SQLException e) {
		
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}

public void updateAddress(String city, String state, String zipCode, String custid) {
	String query = "Update Customer set city='"+city+"', state='"+state+"', zip="+zipCode+" where cust_id='"+custid+"'";
	try {
		statement=conn.prepareStatement(query);
		statement.executeUpdate();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

public void deleteCustomer(String custid) {
 String query= "delete from Customer where cust_id ='"+custid+"'";
	try {
		statement=conn.prepareStatement(query);
		statement.executeUpdate();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

}

}	







