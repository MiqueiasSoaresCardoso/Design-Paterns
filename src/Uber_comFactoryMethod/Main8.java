package Uber_comFactoryMethod;

import java.util.Scanner;

public class Main8{
    public static void main(String[] args) {
        System.out.println("Escolha o tipo de Veiculo:");
        System.out.println("1. UberX\n 2-UberComfort\n 3-UberFlash");
        Scanner in = new Scanner(System.in);
        int tipoVeiculo = in.nextInt();
        switch(tipoVeiculo){
            case 1:
                System.out.println("Veiculo UberX");
                UberX veiculoX = new UberX("João Fernandes","Chevrolet","Onix","Branco",4.2);
                break;
            case 2:
                System.out.println("Veiculo UberComfort");
                UberComfort veiculoBlack = new UberComfort("João Fernandes","Chevrolet","Onix","Branco",4.2);
                break;
            case 3:
                System.out.println("Veiculo UberFlash");
                UberFlash veiculoPool = new UberFlash("João Fernandes","Chevrolet","Onix","Branco",4.2);
                break;

        }

    }
}
