package polegadas.para.centimentros;

import java.util.Scanner;

public class polegadasParaCentimetros {
    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);
        System.out.println("Bem-vinda ao conversor de polegadas para centímetros!");
        System.out.println("Digite a medida em polegadas: ");
        double polegada = dados.nextDouble();
        double centimentros;
        centimentros = 2.54*polegada;
        System.out.printf("O valor de %.2f polegadas em centímetros é %.2f \n", polegada, centimentros);
        System.out.println("Obrigada por usar nosso programa!");
        System.out.println("Fim do programa.");
    }
}
