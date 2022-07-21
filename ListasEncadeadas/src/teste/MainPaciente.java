package teste;

import java.util.Scanner;

import exercicioExtra.Paciente;
import listas.ListaPaciente;

public class MainPaciente {

	public static void main(String[] args) {


		Scanner teclado = new Scanner(System.in);
		
		ListaPaciente lista = new ListaPaciente();
		
		int opcao = 0;
		
		do {
			
			System.out.println("Bem vindo a Clinica: ");
			System.out.println("0 - Sair do Consultorio");
			System.out.println("1 - Inserir o Paciente");
			System.out.println("2 - Remover o Paciente");
			System.out.println("3 - Retorna o Paciente");
			System.out.println("Escolha a opção:");
			opcao = teclado.nextInt();
			
			if (opcao >4) 
				System.out.println("Escolha entre 0 - 4");
			

			switch(opcao) {
			
			
			case 0:
				
				System.out.println("Programa  Finalizado!!!\n");
				
				break;
			case 1:
				
				System.out.println("Digite o nome do Paciente: ");
				String nome = teclado.next();
				System.out.println("Digite a idade do Paciente");
				int idade = teclado.nextInt();
				System.out.println("Digite o código do Paciente:");
				int id = teclado.nextInt();
				Paciente paciente = new Paciente(nome, idade, id);
				lista.insere(paciente);
				lista.show();
				
				
				break;
				
				
			case 2:
				System.out.println("Digite o Codigo do Paciente que deseja remover:");
				id = teclado.nextInt();
				lista.remove(id);
				lista.show();
				
				
				break;
			case 3:
				System.out.println("Retorne o Paciente pela sua Idade:");
				idade = teclado.nextInt();
				int m = (int) lista.select(idade);
				if (m == -1) 
					System.out.println("Paciente nao encontrado");
					else
						System.out.println("Paciente do Codigo: " + m + " está sendo chamado!");
				
				
				
				break;
			case 4:
				break;
				default:
			
			
			
			}
			
			
			
			
		}while (opcao !=4);
		System.out.println("Atendimento Finalizado !!!");
		teclado.close();

	}

}
