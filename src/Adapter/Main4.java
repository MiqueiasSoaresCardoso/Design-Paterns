package Adapter;

public class Main4 {
    public static void main(String[] args) {
        //Sistema Legado
        SistemaLegadoBanco sl = new SistemaLegadoBanco();

        //Adaptador
        BancoAdapter bd = new BancoAdapter(sl);

        //criando uma transferencia no App
        Transferencia transferencia = new Transferencia();
        transferencia.contaOrigem = "00ZYXGH";
        transferencia.contaDestino = "00ZYX14";
        transferencia.valor = 100.0;

        //Acionando o adaptador
        bd.executar(transferencia);

    }
}
