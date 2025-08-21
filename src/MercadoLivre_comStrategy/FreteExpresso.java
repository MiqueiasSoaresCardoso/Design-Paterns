package MercadoLivre_comStrategy;

import Strategy.Frete;

public class FreteExpresso implements Frete {
    @Override
    public double calcularfrete(double peso) {
        return peso * 4.2;
    }
}
