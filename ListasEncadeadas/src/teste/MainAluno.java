package teste;

import java.util.Scanner;

import exercicio02.Aluno;
import listas.ListaAluno;

public class MainAluno {

	public static void main(String[] args) {
	
		Scanner rd = new Scanner(System.in);
		
		ListaAluno lista = new ListaAluno();
		
		int opcao = 0;
		
		do {
			
			System.out.println("0 - SAIR");
			System.out.println("1 - Inserir Aluno");
			System.out.println("2 - Remover Aluno");
			System.out.println("3 - Retornar Aluno");
			System.out.println(" Opção: ");
			opcao = rd.nextInt();
			switch(opcao) {
			
			case 0:
				System.out.println("Programa encerrado");
				
				break;
			case 1:
				System.out.println("Digite o RM do Aluno: ");
				int rm = rd.nextInt();
				System.out.println("Digite a Média do Aluno: ");
				double media = rd.nextDouble();
				Aluno aluno = new Aluno (rm, media);
				lista.insere(aluno);
				lista.show();
				
				break;
			case 2:
				System.out.println("Digite o RM do Aluno que será removido: ");
				rm = rd.nextInt();
				lista.remove(rm);
				lista.show();
				
				break;
			case 3:
				System.out.println("Selecione a media do Aluno pelo seu RM: ");
				rm = rd.nextInt();
				double m = lista.select(rm);
				if (m == -1)
					System.out.println("Aluno não encontrado");
				else
					System.out.println("A média do Aluno é:" + m);
				
			
			default:
			}
			
			
			
		}while (opcao !=3);
		
		rd.close();
		
		
		
		

	}

}
