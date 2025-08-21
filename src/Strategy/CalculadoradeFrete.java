package Strategy;

public class CalculadoradeFrete {
    private Frete frete;

    //Aqui eu recebo o "motor"
    public void setFrete(Frete frete) {
        this.frete = frete;
    }
    //Aqui eu aciono um metodo do motor
    public double calcularFrete(double peso) {
        return frete.calcularfrete(peso);
    }

}
