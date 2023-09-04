package jdbcConnection.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Starter {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	    Connection con 	= JdbcOperation.getConnection();
	     Statement st = con.createStatement();
	     
	     //get all user
	     JdbcOperation.getAllData(st);
	     
	     //insert User
	     JdbcOperation.insertData(st);
	     
	     //update User
	     JdbcOperation.updateData(st);
	     
	     //Delete Data 
	     JdbcOperation.deleteData(st);
	     //get all user
	     
	     
	     
	     //insert User
	     JdbcOperation.insertData(st);
	     
	     //update User
	     JdbcOperation.updateData(st);
	     
	     //Delete Data 
	     JdbcOperation.deleteData(st);
	     
	    
	     
	     
	}
	
	

}
