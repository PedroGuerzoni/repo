package SQLtest;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;
public class JoinsPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
		List<usuario> al = new ArrayList<usuario>();
		
		
		
		
		DBConnection db =  new DBConnection();
		db.connect();
		ResultSet rs  = null; 
		
		rs = db.SelectJoins("select * from myschema.usuario  left join myschema.usercepmap on myschema.usuario.id = myschema.usercepmap.id_usuario left join myschema.cep on myschema.usercepmap.id_cep = myschema.cep.id left join myschema.telefone on myschema.usuario.id = myschema.telefone.id_usuario");
		
		try {
			while(rs.next()) {
				
				al.add(new usuario(rs.getInt(1), rs.getString(2),rs.getInt(3),rs.getInt(7),rs.getString(8),rs.getInt(10)));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		for(usuario usr: al) {
			
			System.out.println("ID: " + usr.id );
			System.out.println("nome: " + usr.nome );
			System.out.println("cpf: " + usr.cpf );
			System.out.println("cep: " + usr.cep );
			System.out.println("Cidade: " + usr.cidade );
			System.out.println("Telefone: " + usr.telefone );

			System.out.println("-------");



		}
		
		
		
		
		
		
		db.closeConnection();
		*/
		

		List<usuario> al = new ArrayList<usuario>();
		
		
		
		
		DBConnection db =  new DBConnection();
		db.connect();
		ResultSet rs  = null; 
		ResultSet rs2  = null; 

		
		rs = db.SelectJoins("select * from myschema.usuario");
		
		try {
			while(rs.next()) {
				
				al.add(new usuario(rs.getInt(1), rs.getString(2),rs.getInt(3)));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(usuario usr: al) {
			rs = db.SelectJoins("select * from myschema.telefone\n" + 
					"where id_usuario = ( select id from myschema.usuario where id = " + usr.id + ")");
			
			try {
				while(rs.next()) {
					
					usr.telefone.add(rs.getInt(2));
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
		}
		

		for(usuario usr: al) {
				rs = db.SelectJoins("select id_cep from myschema.usercepmap where id_usuario = ( select id from myschema.usuario where id = " + usr.id + ")");
			try {
				while(rs.next()) {
	
					rs2 = db.SelectJoins("select * from myschema.cep where id = " + rs.getInt(1));
					
					while(rs2.next()) {
					
						usr.cidade_cep.put(rs2.getInt(2),rs2.getString(3));
					
					}
				} 
				
			}catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

		}
			

	

		
		
		
		
		
		for(usuario usr: al) {
			
			System.out.println("ID: " + usr.id );
			System.out.println("nome: " + usr.nome );
			System.out.println("cpf: " + usr.cpf );
		    System.out.println("Cidade: " + usr.cidade_cep.toString());
			System.out.println("Telefone: " + usr.telefone );

			System.out.println("-------------------------------");



		}
		
		
		
		
		
		
		db.closeConnection();
		
		
		
	}

}
