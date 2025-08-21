package MercadoLivre_comStrategy;

// CalculadoraDeFrete.java
public class CalculadoraDeFrete {
    // A referência para a estratégia (o "motor" do nosso carro)
    private EstrategiaFrete estrategia;

    // Método para definir ou trocar a estratégia
    public void setEstrategia(EstrategiaFrete estrategia) {
        this.estrategia = estrategia;
    }

    // Método que executa o cálculo, delegando a chamada para a estratégia
    public double calcular(double peso) {
        if (estrategia == null) {
            System.out.println("Nenhuma estratégia de frete foi definida.");
            return 0.0;
        }
        // A mágica acontece aqui: o contexto usa a estratégia sem saber qual ela é
        return estrategia.calcularFrete(peso);
    }
}