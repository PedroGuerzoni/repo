package SQLtest;

import java.sql.ResultSet;
import java.sql.SQLException;

public class SQLClassestester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DBConnection db = new DBConnection();
		db.connect();
		ResultSet rs;
		rs = db.selectFrom("", "mySchema.userinfo", "");
		try {
			rs.next();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		userinfo table = new userinfo("mySchema.userinfo",db);
		
		
		table.select();
		System.out.println(table.userlogin[1]);
		
		
		db.closeConnection();

	}

}


