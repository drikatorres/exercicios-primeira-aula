package conversor.celsius.farenheit;

import java.util.Scanner;

public class conversorCelsiusParaFarenheit {
    public static void main(String[] args) {
        System.out.println("Bem-vinda ao conversor de Celsius para Farenheit!");
        Scanner dados = new Scanner(System.in);
        System.out.println("Digite a temperatura em graus Celsius: ");
        double celsius = dados.nextDouble();
        double farenheit;
        farenheit = (celsius * 1.8) + 32;
        System.out.printf("O valor da temperatura em graus Farenheit é %.2f.", farenheit);
        System.out.println("Obrigada por usar nosso programa!");
        System.out.println("Fim do programa.");
    }
}
