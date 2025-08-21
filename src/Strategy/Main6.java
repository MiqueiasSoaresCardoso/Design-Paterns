package Strategy;

import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        boolean teste = true;
        while (teste) {
            CalculadoradeFrete calculadoradeFrete = new CalculadoradeFrete();
            FreteEconomico freteEconomico = new FreteEconomico();
            FreteExpresso freteExpresso = new FreteExpresso();
            FreteRetirada freteRetirada = new FreteRetirada();
            System.out.println("Selecione o frete desejado");
            System.out.println("1- ECONOMICO\n" +
                    "2- EXPRESSO\n" +
                    "3- RETIRADA");
            Scanner sc = new Scanner(System.in);
            int option = sc.nextInt();
            System.out.println("Digite o valor do peso do item desejado: ");
            int peso = sc.nextInt();
            switch (option) {
                case 1:
                    calculadoradeFrete.setFrete(freteEconomico);
                    break;
                case 2:
                    calculadoradeFrete.setFrete(freteExpresso);
                    break;
                case 3:
                    calculadoradeFrete.setFrete(freteRetirada);
                    break;

            }
            System.out.println("FRETE FINAL DESEJADO:  " + calculadoradeFrete.calcularFrete(peso));
            System.out.println("DESEJA VERIFICAR OUTRA POSSIBILIDADE\n DIGITE 1 PARA SIM E 2 PARA NÃO? ");
            int verificacao = sc.nextInt();
            switch (verificacao) {
                case 1:
                    teste = true;
                    break;
                case 2:
                    teste = false;
                    break;
            }
        }
    }
}
