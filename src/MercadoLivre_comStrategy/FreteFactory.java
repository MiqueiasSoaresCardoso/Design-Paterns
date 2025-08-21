package MercadoLivre_comStrategy;

// FreteFactory.java
public class FreteFactory {
    public static EstrategiaFrete criarEstrategiaFrete(int opcao) {
        switch (opcao) {
            case 1:
                return new FreteEconomico();
            case 2:
                return new FreteExpresso();
            case 3:
                return new FreteRetirada();
            default:
                throw new IllegalArgumentException("Opção de frete inválida.");
        }
    }
}