/* Anna Beatriz Waldheim da Silva
 * Mariana dos Santos Lima
 * Maria Rita Fagundes Vargas */

package teste;
import pessoa.*;
import viagem.*;
import java.util.Scanner;

public class Principal {
	// CRIAÇÃO DA PESSOA
	public static Pessoa leCriaPessoa(Scanner sca) {
		System.out.println("Digite seu nome: ");
		String nome = sca.nextLine();
		System.out.println("Digite sua idade: ");
		int idade = sca.nextInt();
		sca.nextLine();
		System.out.println("Digite seu CPF: ");
		String cpf = sca.nextLine();
		System.out.println("Digite sua nacionalidade: ");
		String nacio = sca.nextLine();
		Pessoa pessoa = new Pessoa(nome, idade, cpf, nacio);
		return pessoa;
	}
	// CRIAÇÃO DO PACOTE
	public static Pacote leCriaPacote(Scanner sca) {
		System.out.println("Digite seu destino: ");
		String destino = sca.nextLine();
		System.out.println("Digite seu local de hospedagem: ");
		String hospedagem = sca.nextLine();
		System.out.println("Digite seu modo de transporte: ");
		String transporte = sca.nextLine();
		System.out.println("Digite o preço por pessoa: ");
		double precoPessoa = sca.nextDouble();
		Pacote pacote = new Pacote(destino, hospedagem, transporte, precoPessoa);
		return pacote;
	}
	
	//CRIAÇÃO DA VIAGEM
	public static Viagem leCriaViagem(Pacote pacote,Cliente cliente, Scanner sca) {
		leCriaPacote(sca);
		System.out.println("Digite a data de ida da viagem: ");
		String dataIda = sca.nextLine();
		System.out.println("Digite a data de volta da viagem: ");
		String dataVolta = sca.nextLine();
		System.out.println("Digite a quantidade de pessoas: ");
		int qtdPessoas = sca.nextInt();
		sca.nextLine();
		//VER A QUESTÃO DO ARRAY
		Viagem viagem = new Viagem(pacote, dataIda, dataVolta, cliente, qtdPessoas);
		return viagem;
	}
	
	//CRIAÇÃO DOS TIPOS DE ENDEREÇO (DESCOBRIR COMO VAI FICAR EM UM LECRIA DE CLIENTE)
	public static Endereco leCriaCasa(Scanner sca) { 
		System.out.println("Digite tipo logradouro: "); 
		String tipo = sca.nextLine(); 
		System.out.println("Digite nome logradouro: "); 
		String nome = sca.nextLine(); 
		System.out.println("Digite número logradouro: "); 
		int num = sca.nextInt(); 
		Endereco end = new Endereco(tipo, nome, num); 
		return end; 
		} 

		public static Endereco leCriaApto(Scanner sca) { 
		System.out.println("Digite tipo logradouro: "); 
		String tipo = sca.nextLine(); 
		System.out.println("Digite nome logradouro: "); 
		String nome = sca.nextLine(); 
		System.out.println("Digite número logradouro: "); 
		int num = sca.nextInt(); 
		System.out.println("Digite apartamento: "); 
		int apto = sca.nextInt(); 
		Endereco end = new Endereco(tipo, nome, num, apto); 
		return end; 

		} 

		public static Endereco leCriaCasaCompl(Scanner sca) { 
		System.out.println("Digite tipo logradouro: "); 
		String tipo = sca.nextLine(); 
		System.out.println("Digite nome logradouro: "); 
		String nome = sca.nextLine(); 
		System.out.println("Digite número logradouro: "); 
		int num = sca.nextInt(); 
		sca.nextLine(); 
		System.out.println("Digite complemento: "); 
		String compl = sca.nextLine(); 
		Endereco end = new Endereco(tipo, nome, num, compl); 
		return end; 
		} 

		public static Endereco leCriaAptoCompl(Scanner sca) { 
		System.out.println("Digite tipo logradouro: "); 
		String tipo = sca.nextLine(); 
		System.out.println("Digite nome logradouro: "); 
		String nome = sca.nextLine(); 
		System.out.println("Digite número logradouro: "); 
		int num = sca.nextInt(); 
		System.out.println("Digite apartamento: "); 
		int apto = sca.nextInt(); 
		sca.nextLine(); 
		System.out.println("Digite complemento: "); 
		String compl = sca.nextLine(); 
		Endereco end = new Endereco(tipo, nome, num, apto, compl); 
		return end; 

		} 
		//MENU DOS ENDEREÇOS
		public static int menu(Scanner sca) { 
		int lograd; 
		do { 
		System.out.println("----MENU----"); 
		System.out.println("1 - Casa"); 
		System.out.println("2 - Apartamento"); 
		System.out.println("3 - Casa com complemento"); 
		System.out.println("4 - Apartamento com complemento"); 
		System.out.println("5 - Fim"); 
		System.out.println("Digite o número referente ao tipo do logradouro :)"); 
		lograd = sca.nextInt(); 

		if (lograd < 1 || lograd > 5) 
		System.out.println("Resposta inválida!!"); 
		} while (lograd < 1 || lograd > 5); 
		return lograd; 

		} 

}
