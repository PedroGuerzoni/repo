package SQLtest;
import java.util.*;

public class usuario {
	
	int id;
	String nome;
	int cpf;
	Map<Integer,String> cidade_cep;
	List<Integer> telefone;

	usuario(int id,String nome, int cpf){
		
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		telefone = new ArrayList<Integer>();
		cidade_cep = new HashMap<Integer,String>();

	}
	
}
