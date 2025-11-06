/* Anna Beatriz Waldheim da Silva
 * Mariana dos Santos Lima
 * Maria Rita Fagundes Vargas */

package viagem;
import pessoa.*;

public class Viagem {
    private Pacote pacote;
    private String dataIda;
    private String dataVolta;
    private Cliente cliente;
    private Pessoa[] acompanhantes;
    private int qtdPessoas;

    public Viagem (Pacote pacote, String dataIda, String dataVolta, Cliente cliente, int qtdPessoas) {
        this.pacote = pacote;
        this.dataIda = dataIda;
        this.dataVolta = dataVolta;
        this.cliente = cliente;
        this.qtdPessoas = qtdPessoas;
        this.acompanhantes = new Pessoa[10]; 
    }
    
    public void incluirAcompanhates(Pessoa acomp) {

    }

    public double calculaPrecoViagem () {
        int qtdCrianca = 0;
        for(int i = 0; i < (qtdPessoas - 1); i++) {
            int idade = acompanhantes[i].getIdade();
            if (idade <= 12) {
                qtdCrianca += 1;
            }
        }
        double valCrianca = pacote.getPrecoPorPessoa() * 0.5 * qtdCrianca;
        double valor = valCrianca + ((pacote.getPrecoPorPessoa()) * (qtdPessoas - qtdCrianca));
        return valor;
    }

    public void exibe() {
        System.out.println("-----DADOS DA VIAGEM-----");
        pacote.exibe();
        System.out.println("Valor total: R$" + calculaPrecoViagem());
        cliente.exibe();
        for (int i = 0; i < (qtdPessoas - 1); i++) {
            acompanhantes[i].exibe();
        }
    }

    public Pacote getPacote() {
        return pacote;
    }

    public void setPacote(Pacote pacote) {
        this.pacote = pacote;
    }

    public String getDataIda() {
        return dataIda;
    }

    public void setDataIda(String dataIda) {
        this.dataIda = dataIda;
    }

    public String getDataVolta() {
        return dataVolta;
    }

    public void setDataVolta(String dataVolta) {
        this.dataVolta = dataVolta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Pessoa[] getAcompanhantes() {
        return acompanhantes;
    }

    public void setAcompanhantes(Pessoa[] acompanhantes) {
        this.acompanhantes = acompanhantes;
    }

    public int getQtdPessoas() {
        return qtdPessoas;
    }

    public void setQtdPessoas(int qtdPessoas) {
        this.qtdPessoas = qtdPessoas;
    }

}
