package consumo.combustivel;

import java.util.Scanner;

public class consumoCombustivel {
    public static void main(String[] args) {
        final double DISTANCIA, TEMPO, VELOCIDADE, LITROS_USADOS;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Bem-vinda à calculadora de litros gastos em viagens! ");
        System.out.println("1. Digite o tempo gasto em horas: ");
        TEMPO = entrada.nextDouble();
        System.out.println("2. Digite a velocidade média em km/h");
        VELOCIDADE = entrada.nextDouble();
        DISTANCIA = TEMPO * VELOCIDADE;
        LITROS_USADOS = DISTANCIA / 12;
        System.out.printf("A valocidade média foi de %.2f km/h \n", VELOCIDADE);
        System.out.printf("O tempo gasto foi de foi de %.2f horas \n", TEMPO);
        System.out.printf("A distância percorrida foi de %.2f km \n", DISTANCIA);
        System.out.printf("O consumo do veículo é de 12km/L, logo foram utilizados %.2f litros de combustível. \n", LITROS_USADOS);
        System.out.println("Obrigada por usar nosso programa!");
        System.out.println("Fim do programa.");
    }
}
