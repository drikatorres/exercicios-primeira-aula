package tabuada;

import java.util.Scanner;

public class tabuada {
    public static void main(String[] args) {
        System.out.println("Bem-vinda à tabuada! :)");
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o número que seja obter a tabuada:");
        int numero = entrada.nextInt();

        System.out.println("A tabuada de " + numero + " é: ");
        System.out.printf("%d * 1 = %d \n", numero, numero);
        System.out.printf("%d * 2 = %d \n", numero, numero*2);
        System.out.printf("%d * 3 = %d \n", numero, numero*3);
        System.out.printf("%d * 4 = %d \n", numero, numero*4);
        System.out.printf("%d * 5 = %d \n", numero, numero*5);
        System.out.printf("%d * 6 = %d \n", numero, numero*6);
        System.out.printf("%d * 7 = %d \n", numero, numero*7);
        System.out.printf("%d * 8 = %d \n", numero, numero*8);
        System.out.printf("%d * 9 = %d \n", numero, numero*9);
        System.out.printf("%d * 10 = %d \n",numero, numero*10);
        System.out.println("Obrigada por usar nosso programa!");
        System.out.println("Fim do programa.");

    }
}
