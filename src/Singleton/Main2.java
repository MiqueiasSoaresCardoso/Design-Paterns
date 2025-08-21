package Singleton;

public class Main2 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Iniciando o Game....");
        Thread.sleep(5000);
        //Jogador 01 obtem a instância do placar
        System.out.println("Jogador 01 entrou....");
        Thread.sleep(10000);
        PlacarJogo jogador01 = PlacarJogo.getInstance();
        System.out.println("+10pts para Jogador 01");
        //Jogador 01 obteve 10 pts
        jogador01.setPontuacao(10);
        //Jogador 02 entra na partida
        System.out.println("Jogador 02 entrou....");
        PlacarJogo jogador02 = PlacarJogo.getInstance();
        //Jogador dois consegue 50 pts
        Thread.sleep(7000);
        System.out.println("+50pts para Jogador 02");
        jogador02.setPontuacao(50);
        Thread.sleep(6000);
        System.out.println("+30pts para Jogador 02");
        jogador02.setPontuacao(30);
        boolean saoiquais = (jogador01 == jogador02);
        if (saoiquais) {
            System.out.println("As Instancias são iguais");
        }else{
            System.out.println("Não são iguais");
        }
        Thread.sleep(10000);
        System.out.println("TOTAL DE PONTOS: " + PlacarJogo.getInstance().getPontuacao());

    }
}
