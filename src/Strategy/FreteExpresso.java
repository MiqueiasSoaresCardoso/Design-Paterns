package Strategy;

public class FreteExpresso implements Frete{
    @Override
    public double calcularfrete(double peso) {
        return peso * 4.2;
    }
}
