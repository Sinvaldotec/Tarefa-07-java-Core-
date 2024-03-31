package exercicio01;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Solicitando ao usuário que insira um número
        System.out.print("Digite um número: ");

        // Lendo o número fornecido pelo usuário
        double numero = scanner.nextDouble();

        // Verificando se o número é positivo, negativo ou zero
        if (numero > 0) {
            System.out.println("O número é positivo.");
        } else if (numero < 0) {
            System.out.println("O número é negativo.");
        } else {
            System.out.println("O número é zero.");
        }

        // Fechando o Scanner para liberar recursos
        scanner.close();
    }
}
