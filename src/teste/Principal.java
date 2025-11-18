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
		System.out.println("Digite o nome: ");
		String nome = sca.nextLine();
		System.out.println("Digite a idade: ");
		int idade = sca.nextInt();
		sca.nextLine();
		System.out.println("Digite o CPF: ");
		String cpf = sca.nextLine();
		System.out.println("Digite a nacionalidade: ");
		String nacio = sca.nextLine();
		Pessoa pessoa = new Pessoa(nome, idade, cpf, nacio);
		return pessoa;
	}

	// CRIACAO DO CLIENTE
	public static Cliente leCriaCliente(Scanner sca) {
		System.out.println("Digite seu nome: ");
		String nome = sca.nextLine();
		System.out.println("Digite sua idade: ");
		int idade = sca.nextInt();
		sca.nextLine();
		System.out.println("Digite seu CPF: ");
		String cpf = sca.nextLine();
		System.out.println("Digite sua nacionalidade: ");
		String nacio = sca.nextLine();
		System.out.println("Digite o seu e-mail: ");
		String email = sca.nextLine();
		System.out.println("Digite o seu telefone ");
		String telefone = sca.nextLine();
		System.out.println("Informações do seu endereço: ");
		int tipo = menu(sca);
		Endereco endereco = leCriaEndereco(sca, tipo);
		Cliente cliente = new Cliente (nome, idade, cpf, nacio, endereco, email, telefone);
		return cliente;
	}

	public static String[] getTodosDestinos(){
        int i=0;
        String[] destinos = new String[PacoteDisp.values().length];
        for (PacoteDisp pacote: PacoteDisp.values()){
            destinos[i] = pacote.getDestino();
            i++;
        }
        return destinos;
    }

    public static String[] getTodosHospedagens(){
        int i=0;
        String[] hospedagens = new String[PacoteDisp.values().length];
        for (PacoteDisp pacote: PacoteDisp.values()){
            hospedagens[i] = pacote.getHospedagem();
            i++;
        }
        return hospedagens;
    }
	public static int opcoes(String[] opcoes, String nomeOpcao, Scanner sca){
		System.out.println("Selecione " + nomeOpcao +":");
		for (int i=0; i<opcoes.length; i++){
			System.out.println((i+1) + " - " +  opcoes[i]);
		}
		System.out.println("Digite o código correspondente: ");
		int codigo = sca.nextInt();
		do {
			if (codigo<1 || codigo>(opcoes.length)){
				System.out.println("Opção inválida. Tente novamente");
				codigo = sca.nextInt();
			}
		} while (codigo<1 || codigo>(opcoes.length));
		return codigo-1;
	}
	// CRIAÇÃO DO PACOTE
	public static Pacote leCriaPacote(Scanner sca) {
		int codDestino = opcoes(getTodosDestinos(), "o destino", sca);
		String destino = getTodosDestinos()[codDestino];
		int codHospedagem = opcoes(getTodosHospedagens(), " a hospedagem", sca);
		String hospedagem = getTodosHospedagens()[codHospedagem];
		String[] transportes = {"Companhia", "Carro", "Ônibus"};
		int codTransporte = opcoes(transportes, "o meio de transporte", sca);
		String transporte = transportes[codTransporte];
		System.out.println("Preço por pessoa: R$ 1500,00");
		Pacote pacote = new Pacote(destino, hospedagem, transporte, 1500.00);
		return pacote;
	}
	
	//CRIAÇÃO DA VIAGEM
	public static Viagem leCriaViagem(Pacote pacote, Cliente cliente, int qtdPessoas, Scanner sca) {
		sca.nextLine();
		System.out.println("Digite a data de ida da viagem: ");
		String dataIda = sca.nextLine();
		System.out.println("Digite a data de volta da viagem: ");
		String dataVolta = sca.nextLine();
		//VER A QUESTÃO DO ARRAY
		Viagem viagem = new Viagem(pacote, dataIda, dataVolta, cliente, qtdPessoas);
		return viagem;
	}

	public static Endereco leCriaEndereco(Scanner sca, int lograd) {  
		System.out.println("Digite nome logradouro: "); 
		String nome = sca.nextLine(); 
		System.out.println("Digite número logradouro: "); 
		int num = sca.nextInt();
		int apto = 0;
		String compl = "";
		if (lograd==2 || lograd==4){
			System.out.println("Digite apartamento: "); 
			apto = sca.nextInt();
		}
		sca.nextLine();
		if (lograd==3 || lograd==4){
			System.out.println("Digite complemento: "); 
			compl = sca.nextLine();
		}
		Endereco end = null;
		switch (lograd){
			case 1 -> end = new Endereco("Casa", nome, num);
			case 2 -> end = new Endereco("Apartamento", nome, num, apto);
			case 3 -> end = new Endereco("Casa com complemento", nome, num, compl);
			case 4 -> end = new Endereco("Apartamento com complemento", nome, num, apto, compl);
		}
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
		sca.nextLine();
		return lograd; 

	}

	public static void main (String[] args){
		Scanner sca = new Scanner (System.in);
		System.out.println("Seja bem-vindo ao sistema da Agência *nome criativo papagaio*");
		System.out.println("Vamos te acompanhar em cada passo da sua viagem! Para isso, primeiro se identifique");
		Cliente cliente = leCriaCliente(sca);

		// QTD ACOMPANHANTES
		System.out.println("Digite a quantidade de acompanhantes até 10 pessoas: ");
		int qtdPessoas = sca.nextInt();
		

		// ESCOLHER PACOTE
		System.out.println("\nEscolha um dos nossos pacotes disponíveis abaixo ou crie um pacote personalizado");
		
		// PACOTE DISPONIVEL
		PacoteDisp[] pacoteDisp = PacoteDisp.values();
		for (PacoteDisp p: pacoteDisp){
			System.out.println("\nPacote " + (p.ordinal()+1));
			p.exibe();
		}

		System.out.println("\nCaso queira um desses pacotes, insira o número correspondente. Caso queira criar, insira 0");
		int opcao = sca.nextInt();
		do {
			if (opcao<0 || opcao>(pacoteDisp.length)){
				System.out.println("Opção inválida. Tente novamente");
				System.out.println("Caso queira um dos pacotes, insira o número correspondente. Caso queira criar, insira 0");
				opcao = sca.nextInt();
			}
		} while (opcao<0 || opcao>(pacoteDisp.length));

		Pacote pacote = new Pacote();

		if (opcao==0){
			// PACOTE PERSONALIZADO
			System.out.println("Vamos criar o seu pacote personalizado!");
			pacote = leCriaPacote(sca);
		} else{
			pacote.setDestino(pacoteDisp[opcao-1].getDestino());
			pacote.setHospedagem(pacoteDisp[opcao-1].getHospedagem());
			pacote.setTransporte(pacoteDisp[opcao-1].getTransporte());
			pacote.setPrecoPorPessoa(pacoteDisp[opcao-1].getPreco());
		}

		// ADD DADOS DA VIAGEM
		Viagem viagem = leCriaViagem(pacote, cliente, qtdPessoas+1, sca);
		// qtdPessoas + 1 = acompanhantes + clientes
		
		// ADD ACOMPANHANTES
		if (qtdPessoas!=0) {
			System.out.println("Adicione os acompanhantes: ");
			Pessoa pessoa;
			for (int i=0; i<qtdPessoas; i++){
				System.out.println("Acompanhante " + (i+1));
				pessoa = leCriaPessoa(sca);
				viagem.incluirAcompanhantes(pessoa, i);
			}
		}
		
		System.out.println("Quase lá! Antes de concluir, confira o resumo da sua compra");
		System.out.printf(" " + "_ ".repeat(41).trim());
		System.out.println("\n|" + " ".repeat(37) + "RESUMO" + " ".repeat(37) + " |");
		viagem.exibe();
		System.out.printf(" " + "_ ".repeat(41).trim());
	}

}
