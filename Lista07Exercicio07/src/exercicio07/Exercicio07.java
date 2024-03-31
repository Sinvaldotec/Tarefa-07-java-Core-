package exercicio07;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        int numero1 = scanner.nextInt();

        System.out.println("Digite o segundo número:");
        int numero2 = scanner.nextInt();

        if (numero1 == numero2) {
            System.out.println("Números iguais");
        } else if (numero1 > numero2) {
            System.out.println("Primeiro é maior");
        } else {
            System.out.println("Segundo é maior");
        }

        scanner.close();
    }
}