/* Anna Beatriz Waldheim da Silva
 * Mariana dos Santos Lima
 * Maria Rita Fagundes Vargas */

package viagem;

public class Pacote {
    private String destino;
    private String hospedagem;
    private String transporte;
    private double precoPorPessoa;

    public Pacote (){
        
    }

    public Pacote(String destino, String hospedagem, String transporte, double precoPorPessoa) {
        this.destino = destino;
        this.hospedagem = hospedagem;
        this.transporte = transporte;
        this.precoPorPessoa = precoPorPessoa;
    }
    
    public void exibe() {
    	System.out.printf("| %-80s|\n", "Destino: " + destino);
        System.out.printf("| %-80s|\n", "Hospedagem: " + hospedagem);
        System.out.printf("| %-80s|\n", "Transporte: " + transporte);
        System.out.printf("| %-80s|\n", String.format("Preço por pessoa (desconto de 50%% para crianças de até 12 anos): R$ %.2f", precoPorPessoa));
        //System.out.println("Destino: " + destino);
        //System.out.println("Hospedagem: " + hospedagem);
        //System.out.println("Transporte: " + transporte);
        //System.out.println("Preço por pessoa (desconto de 50% para crianças de até 12 anos): R$" + precoPorPessoa);
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getHospedagem() {
        return hospedagem;
    }

    public void setHospedagem(String hospedagem) {
        this.hospedagem = hospedagem;
    }

    public String getTransporte() {
        return transporte;
    }

    public void setTransporte(String transporte) {
        this.transporte = transporte;
    }

    public double getPrecoPorPessoa() {
        return precoPorPessoa;
    }

    public void setPrecoPorPessoa(double precoPorPessoa) {
        this.precoPorPessoa = precoPorPessoa;
    }

    

}
