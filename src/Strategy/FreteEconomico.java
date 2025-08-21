package Strategy;

public class FreteEconomico implements Frete{
    @Override
    public double calcularfrete(double peso) {
        return peso*2.06;
    }
}
