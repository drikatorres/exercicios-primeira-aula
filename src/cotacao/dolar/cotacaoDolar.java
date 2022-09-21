package cotacao.dolar;

import java.util.Scanner;

public class cotacaoDolar {
    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);
        System.out.println("Bem-vinda ao conversor de Celsius para Farenheit!");
        System.out.println("Digite a cotação do dolar do dia: ");
        double dolar = dados.nextDouble();
        System.out.println("Digite quantos reais você possui: ");
        double reais = dados.nextDouble();
        dolar = reais/dolar;
        System.out.printf("Você tem R$ %.2f, esse valor convertido em dólar é $ %.2f. \n", reais, dolar);
        System.out.println("Obrigada por usar nosso programa!");
        System.out.println("Fim do programa.");
    }
}
