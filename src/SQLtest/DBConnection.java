package SQLtest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {
	private Connection conn = null;
	private Statement st = null;
	private ResultSet rs = null;
	
	
	ResultSet selectFrom(String columns, String table, String condition) {
	      try {
	          st = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,
	        		    ResultSet.CONCUR_READ_ONLY);
	          rs = condition.equals("") ? 
	         (columns.equals("") ? st.executeQuery("SELECT * FROM " + table): st.executeQuery("SELECT " + columns + " FROM " + table)):
	        	 (columns.equals("") ? st.executeQuery("SELECT * FROM " + table + " WHERE " + condition):st.executeQuery("SELECT " + columns + " FROM " + table + " WHERE " + condition));

	          return rs;
		      }catch(SQLException e) {
		    	  System.out.println(e.getMessage());
			return null;
		      }
	      	
	      
	}
	
     boolean checkRecord(String columns, String table, String condition) {
    	 
    	 rs = this.selectFrom(columns, table, condition);
    	 try {
			return rs.next();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
    	 
    	 
     }
	
	 void connect() {
			
			 try {
			        Class.forName("org.postgresql.Driver");
			         conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/myDatabase?currentSchema=myschema","pedro", "pedro");
			      } catch (Exception e) {
			         e.printStackTrace();
			         System.err.println(e.getClass().getName()+": "+e.getMessage());
			         System.exit(0);
			      }
			      System.out.println("Opened database successfully");
				
			
		}
	
	 void InsertinDB(String str) {
	    
	      try {
          st = conn.createStatement();
          rs = st.executeQuery("INSERT INTO " + str);
	      }catch(SQLException e) {
	    	  System.out.println(e.getMessage());
		
	      }

	 }
	 
	 int getLastKey(String table) {
		 try {
	          st = conn.createStatement();
	          rs = st.executeQuery("SELECT MAX(ID) FROM " +  table);
	          rs.next();
	    	  	 System.out.println("Last Primary Key: " + rs.getInt(1));

	          return rs.getInt(1);
		      }catch(SQLException e) {
		    	  System.out.println(e.getMessage());
		    	  return 0;
		      }
		 
		
	 }
	 
	 void closeConnection() {
	  
	 try {
		conn.close();
		System.out.println("DB connection closed successfully");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	 
	 }
	 
	 ResultSet SelectJoins(String str) {
		 
		 try {
	          st = conn.createStatement();
			return st.executeQuery(str);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		 
	 }
	 
	 
	 
	 
}
