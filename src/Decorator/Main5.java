package Decorator;

public class Main5 {
    public static void main(String[] args) throws InterruptedException {
        //iniciando o jogo com o Alex
        Aventureiro alex = new Aventureiro();
        System.out.println("Personagem Base: " + alex.getDescricao());
        System.out.println("Dano: " + alex.getDano());
        System.out.println("------------------------------------");
        Thread.sleep(5000);
        System.out.println("Adicionando Armadura de Diamante");
        Thread.sleep(5000);
        //Adicionando armadura
        ArmaduraDeDiamante alexcomarmadura = new ArmaduraDeDiamante(alex);
        System.out.println("\nCom Armadura: " + alexcomarmadura.getDescricao());
        System.out.println("Dano: " + alexcomarmadura.getDano());
        System.out.println("-----------------------------------");
        Thread.sleep(10000);
        System.out.println("Pegando Espada de Ferro");
        Thread.sleep(5000);
        EspadadeFerro alexcomespadadeferro = new EspadadeFerro(alex);
        System.out.println("\nCom Espada: " + alexcomespadadeferro.getDescricao());
        System.out.println("Dano: " + alexcomespadadeferro.getDano());
        Thread.sleep(10000);
        System.out.println("-----------------------------------");


    }
}
