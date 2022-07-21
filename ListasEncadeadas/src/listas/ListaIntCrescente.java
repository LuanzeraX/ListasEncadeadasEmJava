package listas;

public class ListaIntCrescente {
	
	private class NO{
		int dado;
		NO prox;
	}
	
	NO lista = null;
	
	public void insere(int elem) {
		NO novo = new NO();
		novo.dado = elem;
		if(lista == null) { //lista estava vazia
			novo.prox = null;
			lista = novo;
		}
		else {
			if (novo.dado < lista.dado) { //novo nó torna-se o 1º da lista
				novo.prox = lista;
				lista = novo;
			}
			else {
				NO aux = lista;
				boolean achou = false;
				while (aux.prox != null && !achou) {
					if (aux.prox.dado < novo.dado)
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
			System.out.print(aux.dado + "\t");
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
		if (lista.dado == valor)
			lista=lista.prox;
		else {
			
			NO aux = lista;
			boolean achou = true;
		while(aux.prox !=null && !achou) {
			if (aux.prox.dado == valor)
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
	
	

	public void showGreaters(int limite) {
		NO aux = lista;
		System.out.println("\n - Valores da lista maiores do que "+ limite);
		while (aux !=null) {
	if(aux.dado > limite) {
		System.out.println(aux.dado);
		
	}
			aux = aux.prox;
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
