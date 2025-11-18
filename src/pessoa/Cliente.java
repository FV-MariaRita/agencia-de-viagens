/* Anna Beatriz Waldheim da Silva
 * Mariana dos Santos Lima
 * Maria Rita Fagundes Vargas */

package pessoa;

public class Cliente extends Pessoa {
    private Endereco endereco;
    private String email;
    private String telefone;

    public Cliente (String nome, int idade, String cpf, String nacionalidade, Endereco endereco, String email, String telefone) {
        super(nome, idade, cpf, nacionalidade);
        this.endereco = endereco;
        this.email = email;
        this.telefone = telefone;
    }

    public void exibe() {
    	System.out.print("| " + "- ".repeat(3) + "DADOS DO CLIENTE " + "- ".repeat(28).trim() + "  |\n");
        super.exibe();
        endereco.exibe();
        System.out.printf("| | %-75s | |\n", "Email: " + email);
        System.out.printf("| | %-75s | |\n", "Telefone: " + telefone);
        System.out.print("| " + "- ".repeat(40).trim() + " |\n");
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    
}

