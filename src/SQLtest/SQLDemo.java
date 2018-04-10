package SQLtest;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Connection conn = ConnectToSQL.connect();

		Statement st = null;
		ResultSet rs = null;
	    
	      try {
          st = conn.createStatement();
          String qs = "SELECT * FROM \"persons\"";
          rs = st.executeQuery(qs);
          
          
          rs.next();


          System.out.println(rs.getArray(6));
;
          
          conn.close();
	      }catch(SQLException e) {
	    	  System.out.println(e.getMessage());
	    	  
	      }
	}

	
}

class ConnectToSQL{

	static Connection connect() {
		
		Connection conn = null;
		 try {
		        Class.forName("org.postgresql.Driver");
		         conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/myDatabase?currentSchema=myschema","pedro", "pedro");
		      } catch (Exception e) {
		         e.printStackTrace();
		         System.err.println(e.getClass().getName()+": "+e.getMessage());
		         System.exit(0);
		      }
		      System.out.println("Opened database successfully");

		return conn;
		
		
	}
	
}

