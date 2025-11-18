/* Anna Beatriz Waldheim da Silva
 * Mariana dos Santos Lima
 * Maria Rita Fagundes Vargas */

package viagem;

public enum PacoteDisp {

	PACOTE1 ("Salvador", "Ibis Rio Vermelho", "Carro", 1300.00),
	PACOTE2 ("Gramado", "Ibis Igrejinha", "Avião", 1770.00),
	PACOTE3 ("Recife", "Hilton - Motto", "Avião", 1850.00),
	PACOTE4 ("Belo Horizonte", "Hilton - Garden", "Ônibus", 1250.00),
	PACOTE5 ("São Paulo", "Hilton - Guarulhos", "Carro", 1400.00),
	PACOTE6 ("Rio de Janeiro", "Windsor - Copacabana", "Ônibus", 1550.00),
	PACOTE7 ("Fortaleza", "Ibis Praia de Iracema", "Avião", 1600.00),
	PACOTE8 ("Brasília", "Windsor - Brasília", "Avião", 1550.00),
	PACOTE9 ("Belém", "Ibis Styles Nazaré", "Ônibus", 1370.00),
	PACOTE10 ("Foz do Iguaçu", "Hilton - Double Tree", "Carro", 1200.00);
    
    private final String destino;
    private final String hospedagem;
    private final String transporte;
    private final double precoPorPessoa;

    private PacoteDisp (String destino, String hospedagem, String transporte, double precoPorPessoa) {
        this.destino = destino;
        this.hospedagem = hospedagem;
        this.transporte = transporte;
        this.precoPorPessoa = precoPorPessoa;
    }
	
	// metodos
    public String getDestino(){
        return this.destino;
    }

    public String getHospedagem(){
        return this.hospedagem;
    }

    public String getTransporte(){
        return this.transporte;
    }

    public double getPreco(){
        return this.precoPorPessoa;
    }

	public void exibe() {
        System.out.println("Destino: " + destino);
        System.out.println("Hospedagem: " + hospedagem);
        System.out.println("Transporte: " + transporte);
        System.out.println("Preço por pessoa (desconto de 50% para crianças de até 12 anos): R$" + precoPorPessoa);
    }

}
