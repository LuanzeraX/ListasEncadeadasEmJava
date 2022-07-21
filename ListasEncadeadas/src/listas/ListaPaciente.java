package listas;


import exercicioExtra.Paciente;


public class ListaPaciente {
	
	
	private class NO{
		Paciente dado;
		NO prox;
	}
	
	NO lista = null;
	
	public void insere(Paciente elem) {
		NO novo = new NO();
		novo.dado = elem;
		if(lista == null) { //lista estava vazia
			novo.prox = null;
			lista = novo;
		}
		else {
			if (novo.dado.getIdade() < lista.dado.getIdade()) { //novo nó torna-se o 1º da lista
				novo.prox = lista;
				lista = novo;
			}
			else {
				NO aux = lista;
				boolean achou = false;
				while (aux.prox != null && !achou) {
					if (aux.prox.dado.getIdade() < novo.dado.getIdade())
						aux = aux.prox;
					else
						achou = true;				
				}
				
				novo.prox = aux.prox;
				aux.prox = novo;	
			}
		}	
	}
	
	public void show() {
		NO aux = lista;
		
		while (aux !=null) {
			System.out.println(aux.dado);
			aux = aux.prox;
		}
		
		System.out.println();
	}
	
	
	public int contaNos() {
		NO aux = lista;
		int cont = 0;
		while (aux !=null) {
			cont++;
			aux = aux.prox;
			
		}
		return cont;
		
	}
	
	
	

	
	public void remove(int valor) {
		if (lista == null)
			System.out.println("Lista Vazia");
		else {
		if (lista.dado.getId() == valor)
			lista=lista.prox;
		else {
			
			NO aux = lista;
			boolean achou = true;
		while(aux.prox !=null && !achou) {
			if (aux.prox.dado.getId() == valor)
				achou =true;
			else
				aux = aux.prox;
		}
		if (achou)
			aux.prox = aux.prox.prox;
		else
			System.out.println("Valor não encontrado na lista");
		
		
		}
		}
	}

	

	public double select(int idade) {
		int id = -1; 
		String nome;
		//Sinaliza a não ocorrencia se nao encontrou o aluno
		NO aux = lista;	
		while (aux !=null && id == -1) {
		if(aux.dado.getIdade() == idade) {
		
		id = aux.dado.getId();
		nome = aux.dado.getNome();
	}
		aux = aux.prox;
		
		}
		return id;
	
	

	/*public void showGreaters(int limite) {
		NO aux = lista;
		System.out.println("\n - Valores da lista maiores do que "+ limite);
		while (aux !=null) {
	if(aux.dado > limite) {
		System.out.println(aux.dado);
		
	}
			aux = aux.prox;
		}
		
	}*/
	
	
	
	
	
	
	
	
	
	}
	





}
