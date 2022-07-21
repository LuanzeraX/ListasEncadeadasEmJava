package teste;

import java.util.Scanner;

import listas.ListaIntCrescente;

public class MainTeste {
	
	public static void main(String[] args) {
	
	ListaIntCrescente lista = new ListaIntCrescente();
	
	
	Scanner teclado = new Scanner(System.in);
	
	System.out.println("Informe valor positivo para inserir ou negativo para sair");
	int valor = teclado.nextInt();
	
	while(valor>=0) {
		lista.insere(valor);
		lista.show();
		System.out.println("Informe valor positivo para inserir ou negativo para sair");
		valor = teclado.nextInt();
		
	}
	
	
	System.out.println("\nQuantidade de Nós da lista: " + lista.contaNos());
	
	System.out.println("\nQual o valor do limite inferior  do intervalo deveria apresentar?");
	valor = teclado.nextInt();
	lista.showGreaters(valor);

	System.out.println("Informe valor positivo ou negativo para sair");
	valor = teclado.nextInt();
	
	while(valor>=0) {
		lista.remove(valor);
		lista.show();
		System.out.println("Informe valor positivo para remover ou negativo para sair");
		valor = teclado.nextInt();
		
	}
	
	teclado.close();

	
}
}