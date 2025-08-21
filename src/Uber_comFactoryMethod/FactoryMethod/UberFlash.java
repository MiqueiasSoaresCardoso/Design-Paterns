package Uber_comFactoryMethod.FactoryMethod;


public class UberFlash implements IVeiculo {
    private String motorista;
    private String fabricante;
    private String modelo;
    private String cor;
    private double avaliacao;

    public UberFlash(String motorista, String fabricante, String modelo, String cor, double avaliacao) {
        this.motorista = motorista;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.cor = cor;
        this.avaliacao = avaliacao;
    }

    @Override
    public void exibirInfo() {
        System.out.println("Veiculo: UberFlash");
        System.out.printf("Motorista: %s, Avaliacao: %.1f%n", motorista, avaliacao);
    }
}