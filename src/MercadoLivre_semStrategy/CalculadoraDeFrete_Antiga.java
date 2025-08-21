package MercadoLivre_semStrategy;

public class CalculadoraDeFrete_Antiga {
    // O problema está aqui: a responsabilidade de calcular todos os tipos de frete
    // está concentrada em um único método.
    public double calcularFrete(String tipoFrete, double peso) {
        switch (tipoFrete.toLowerCase()) {
            case "economico":
                // Lógica de frete econômico
                return peso * 2.50;
            case "expresso":
                // Lógica de frete expresso
                return peso * 5.75;
            case "retirada":
                // Lógica de frete para retirada
                return 0.0;
            default:
                throw new IllegalArgumentException("Tipo de frete inválido.");
        }
    }
}