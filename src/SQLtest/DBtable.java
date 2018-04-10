package SQLtest;

import java.sql.ResultSet;
import java.sql.SQLException;

public abstract class DBtable {
	String tableName;
	DBConnection db;
	ResultSet rs;

	
	DBtable(String tableName, DBConnection db){
		this.tableName = tableName;
		this.db = db;
	}
	
	public abstract void select();

	
}


class userinfo extends DBtable{
	
	int ID[];
	String[] userlogin;
	String[] password;
	String[] name;
	String[] surname;
	
	
	
	
	userinfo(String tableName, DBConnection db) {
		super(tableName,db);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void select() {
		// TODO Auto-generated method stub
		rs = db.selectFrom("", tableName, "");
		int rowCount = 0;
		
		try {
			rs.last();

			rowCount = rs.getRow();
			
			rs.beforeFirst();
			 ID = new int[rowCount];
			 userlogin = new String[rowCount];
			 password  =  new String[rowCount];
			 name =  new String[rowCount];
			 surname =  new String[rowCount];

			int i = 0;
			while(rs.next()) {

					
				 ID[i] = rs.getInt(1);
				 userlogin[i] = rs.getString(2);
				 password[i]  = rs.getString(3);
				 name[i] = rs.getString(4);
				 surname[i] = rs.getString(5);
				 i++;
			}
		}catch(SQLException e) {
			System.out.println(e.toString());
		}
	}

	
}