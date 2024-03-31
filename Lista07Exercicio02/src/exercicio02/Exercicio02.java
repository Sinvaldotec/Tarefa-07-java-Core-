package exercicio02;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        // Solicita ao usuário que insira os três valores
	        System.out.println("Digite o primeiro valor:");
	        double valor1 = scanner.nextDouble();

	        System.out.println("Digite o segundo valor:");
	        double valor2 = scanner.nextDouble();

	        System.out.println("Digite o terceiro valor:");
	        double valor3 = scanner.nextDouble();

	        // Determina o maior valor
	        double maior = valor1;
	        if (valor2 > maior) {
	            maior = valor2;
	        }
	        if (valor3 > maior) {
	            maior = valor3;
	        }

	        // Imprime o maior valor
	        System.out.println("O maior valor é: " + maior);

	        scanner.close();
	    }
	}
