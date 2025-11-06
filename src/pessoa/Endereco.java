/* Anna Beatriz Waldheim da Silva
 * Mariana dos Santos Lima
 * Maria Rita Fagundes Vargas */

package pessoa;

public class Endereco {
    private String tipoLograd;
    private String nomeLograd;
    private int numLograd;
    private int apto;
    private String compl;

    public Endereco (String tipoLograd, String nomeLograd, int numLograd) {
        this.tipoLograd = tipoLograd;
        this.nomeLograd = nomeLograd;
        this.numLograd = numLograd;
    }

    public Endereco (String tipoLograd, String nomeLograd, int numLograd, String compl) {
        this.tipoLograd = tipoLograd;
        this.nomeLograd = nomeLograd;
        this.numLograd = numLograd;
        this.compl = compl;
    }

    public Endereco (String tipoLograd, String nomeLograd, int numLograd, int apto) {
        this.tipoLograd = tipoLograd;
        this.nomeLograd = nomeLograd;
        this.numLograd = numLograd;
        this.apto = apto;
    }
    
    public Endereco (String tipoLograd, String nomeLograd, int numLograd, int apto, String compl) {
        this.tipoLograd = tipoLograd;
        this.nomeLograd = nomeLograd;
        this.numLograd = numLograd;
        this.apto = apto;
        this.compl = compl;
    }

    public void exibe() {
        System.out.print("Endereço: " + tipoLograd + ", "); 
        System.out.print(nomeLograd + ", "); 
        System.out.print(numLograd); 
        if (apto != 0) { 
            System.out.print(" / " + apto); 
        } 
        if (compl != null) { 
            System.out.print(" - " + compl); 
        } 
        System.out.println("\n"); 
    }
}
