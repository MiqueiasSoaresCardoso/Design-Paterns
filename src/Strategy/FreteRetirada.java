package Strategy;

public class FreteRetirada implements Frete{
    @Override
    public double calcularfrete(double peso) {
        return peso * 0.10;
    }
}
