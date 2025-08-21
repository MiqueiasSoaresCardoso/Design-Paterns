package Adapter;

public class BancoAdapter implements OperacaoBancaria{
    private SistemaLegadoBanco sistemaLegadoBanco;

    //Para não preciar instanciar
    public BancoAdapter(SistemaLegadoBanco sistemaLegadoBanco) {
        this.sistemaLegadoBanco = sistemaLegadoBanco;
    }
    @Override
    public void executar(Transferencia transferencia) {
        sistemaLegadoBanco = new SistemaLegadoBanco();
        boolean resposta = sistemaLegadoBanco.realizarTransacao(
                transferencia.contaOrigem,
                transferencia.contaDestino,
                transferencia.valor);

        if (resposta == true) {
            System.out.println("Valor enviado com sucesso!");
            System.out.println("Conta origem: " + transferencia.contaOrigem +
                    "\nConta destino: " + transferencia.contaDestino
                    + "\nValor: " + transferencia.valor);

        }

    }
}
