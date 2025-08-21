package MercadoLivre_comStrategy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        CalculadoraDeFrete calculadora = new CalculadoraDeFrete();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Selecione o tipo de frete:");
        System.out.println("1 - Econômico");
        System.out.println("2 - Expresso");
        System.out.println("3 - Retirada na loja");
        System.out.print("Sua opção: ");
        int opcao = scanner.nextInt();

        System.out.print("Digite o peso do pacote (kg): ");
        double peso = scanner.nextDouble();

        // O cliente usa a fábrica para obter a estratégia. O 'new' agora está escondido.
        EstrategiaFrete estrategia = FreteFactory.criarEstrategiaFrete(opcao);
        calculadora.setEstrategia(estrategia);

        // A calculadora usa a estratégia injetada para fazer o cálculo
        double valorFrete = calculadora.calcular(peso);
        System.out.printf("O valor final do frete é: R$ %.2f%n", valorFrete);
    }
}