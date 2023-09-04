package jdbcConnection.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcOperation {
	
public static Connection getConnection() throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Connected...");
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/finzly","root","0000");
		
	}


  public static  void getAllData(Statement st) throws SQLException {
	 String query = "select * from logindata";
	 ResultSet rs = st.executeQuery(query);
	 
	 if(rs == null) {
		 System.out.println("Data Not found in database..");
	 }
	 
	 else {
	 System.out.println("userid \t username \t email \t password");
	     while(rs.next()) {
	    	 
	    	 System.out.print(rs.getInt(1) +" ");
	    	 System.out.print(rs.getString(2)+" ");
	    	 System.out.print(rs.getString(3)+" ");
	    	 System.out.print(rs.getString(4)+" ");
	     }
	 }
}

  public static void insertData(Statement st) throws SQLException {
	  
	  String query = "insert into logindata values (2,'sat20','sat@gmail.com','12345')";
	  int isInseted = st.executeUpdate(query);
	  System.out.println("data is inserted with no. "+ isInseted );
	  
  }
  
  public static void updateData(Statement st) throws SQLException {

	  String query = " UPDATE logindata SET email='updatemail@.com' WHERE userid in (1,2)";
	  int updated = st.executeUpdate(query);
	  System.out.println("data is updated with no. "+ updated);
	  
  }
  
  public static void deleteData(Statement st) throws SQLException {
	  
	  String query = " Delete from  logindata  WHERE userid =1";
	  int updated = st.executeUpdate(query);
	  System.out.println("data is updated with no. "+ updated);
	  
  }
  
  
  public static void insertDataUsingPreparedStatement(Connection con) throws SQLException {
	  
	  String query = "insert into logindata into(username,email,password)  values (?,?,?);";
	  PreparedStatement pst = con.prepareStatement(query);
	  pst.setString(1,"sdk30" );
	  pst.setString(2,"sdk@gmail.com" );
	  pst.setString(3,"sdk1120" );
	  pst.executeUpdate(query);
	  System.out.println("data is inserted with no. ");
	  
  }
  
  public static void updateDataUsingPreparedStatement(Connection con) throws SQLException {
	  
	  String query = " UPDATE logindata SET email= ?  WHERE  userid = ? ";
	  PreparedStatement pst = con.prepareStatement(query);
	  
	  pst.setString(2,"sdk@gmail.com" );
	  pst.setInt(2,2 );
	  
	 
	  int updated = pst.executeUpdate(query);
	  System.out.println("data is updated with no. "+ updated);
	  
  }
  
  public static void deleteDataUsingPreparedStatement(Connection con) throws SQLException {
	  
	  String query = " Delete from  logindata  WHERE userid =?";
	  
	  PreparedStatement pst = con.prepareStatement(query);
	  pst.setInt(1,2);
	  int updated = pst.executeUpdate(query);
	  
	  System.out.println("data is updated with no. "+ updated);
	  
  }
  
  
	
  
}
