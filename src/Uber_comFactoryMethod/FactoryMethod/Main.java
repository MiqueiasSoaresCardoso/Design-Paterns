package Uber_comFactoryMethod.FactoryMethod;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Escolha o tipo de Veiculo:");
        System.out.println("1. UberX\n2. UberBlack\n3. UberPool");
        Scanner in = new Scanner(System.in);
        int tipoVeiculo = in.nextInt();
        // O cliente usa a fábrica para obter o objeto
        IVeiculo veiculo = VeiculoFactory.criarVeiculo(tipoVeiculo);
        // O cliente interage com o objeto de forma genérica
        if (veiculo != null) {
            veiculo.exibirInfo();
        } else {
            System.out.println("Opção inválida.");
        }
    }
}