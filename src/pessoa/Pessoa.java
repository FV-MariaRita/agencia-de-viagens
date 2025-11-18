/* Anna Beatriz Waldheim da Silva
 * Mariana dos Santos Lima
 * Maria Rita Fagundes Vargas */

package pessoa;

public class Pessoa {
    protected String nome;
    protected int idade;
    protected String cpf;
    protected String nacionalidade;

    public Pessoa(String nome, int idade, String cpf, String nacionalidade) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf; 
        this.nacionalidade = nacionalidade;
    }

    public void exibe() {
        System.out.printf("| | %-76s| |\n", "Nome: " + nome);
        System.out.printf("| | %-76s| |\n", "Idade: " + idade);
        System.out.printf("| | %-76s| |\n", "CPF: " + cpf);
        System.out.printf("| | %-76s| |\n", "Nacionalidade: " + nacionalidade);
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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    
}
