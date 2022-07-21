package listas;

import exercicio02.Aluno;

public class ListaAluno {
	
	private class NO{
		Aluno dado;
		NO prox;
	}
	
	NO lista = null;
	
	public void insere(Aluno elem) {
		NO novo = new NO();
		novo.dado = elem;
		if(lista == null) { //lista estava vazia
			novo.prox = null;
			lista = novo;
		}
		else {
			if (novo.dado.getRm() < lista.dado.getRm()) { //novo nó torna-se o 1º da lista
				novo.prox = lista;
				lista = novo;
			}
			else {
				NO aux = lista;
				boolean achou = false;
				while (aux.prox != null && !achou) {
					if (aux.prox.dado.getRm() < novo.dado.getRm())
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
		if (lista.dado.getRm() == valor)
			lista=lista.prox;
		else {
			
			NO aux = lista;
			boolean achou = true;
		while(aux.prox !=null && !achou) {
			if (aux.prox.dado.getRm() == valor)
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

	

	public double select(int rm) {
		double media = -1; //Sinaliza a não ocorrencia se nao encontrou o aluno
		NO aux = lista;	
		while (aux !=null && media == -1) {
		if(aux.dado.getRm() == rm) {
		
		media = aux.dado.getMedia();
	}
		aux = aux.prox;
		
		}
		return media;
	
	

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
