package exercicioExtra;

public class Paciente {

	String nome;
	int idade;
	int id;
	
	
	public Paciente(String nome, int idade, int id) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.id = id;
	}


	@Override
	public String toString() {
		return "Paciente \nNome: " + nome + " Idade: " + idade + " Id:" + id + "\n";
	}
	

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	
	
	
	
}
