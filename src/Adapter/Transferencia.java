package Adapter;

public class Transferencia {
    public String contaOrigem;
    public String contaDestino;
    public double valor;

    public Transferencia(){

    }
    public Transferencia(String contaOrigem, String contaDestino, double valor) {
        this.contaOrigem = contaOrigem;
        this.contaDestino = contaDestino;
        this.valor = valor;
    }
}
