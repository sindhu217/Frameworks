package com.automation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MYSQL {

	public static void main(String[] args) throws SQLException {
		 Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/automation", "root", "root");
         Statement statement =  connection.createStatement();
         ResultSet resultSet =  statement.executeQuery("select * from EMPLOYEE; ");
         while (resultSet.next()) {
        	 System.out.print(resultSet.getString(1)+ "\t");
        	 System.out.print(resultSet.getString(2)+ "\t");
        	 System.out.print(resultSet.getString(3)+ "\t");
        	 System.out.print(resultSet.getString(4)+ "\t");
        	 System.out.println(resultSet.getString(5)+ "\t");
         }
         connection.close();
	}

}
