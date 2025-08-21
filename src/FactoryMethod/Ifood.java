package FactoryMethod;

public class Ifood {
    private VeiculoFactory fabrica;

    public Ifood(VeiculoFactory fabrica) {
        this.fabrica = fabrica;
    }

    public void iniciarEntrega(){
        Veiculo veiculo = fabrica.criarVeiculo();
        veiculo.entregar();
        System.out.println("Entregando com " + veiculo);
    }
}
