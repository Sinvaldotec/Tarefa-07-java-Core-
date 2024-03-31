package exercicio04;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        
	        // Solicitar e ler os três valores
	        System.out.println("Digite o primeiro valor:");
	        double valor1 = scanner.nextDouble();
	        
	        System.out.println("Digite o segundo valor:");
	        double valor2 = scanner.nextDouble();
	        
	        System.out.println("Digite o terceiro valor:");
	        double valor3 = scanner.nextDouble();
	        
	        // Encontrar o menor, o meio e o maior valor
	        double menor, meio, maior;
	        if (valor1 < valor2 && valor1 < valor3) {
	            menor = valor1;
	            if (valor2 < valor3) {
	                meio = valor2;
	                maior = valor3;
	            } else {
	                meio = valor3;
	                maior = valor2;
	            }
	        } else if (valor2 < valor1 && valor2 < valor3) {
	            menor = valor2;
	            if (valor1 < valor3) {
	                meio = valor1;
	                maior = valor3;
	            } else {
	                meio = valor3;
	                maior = valor1;
	            }
	        } else {
	            menor = valor3;
	            if (valor1 < valor2) {
	                meio = valor1;
	                maior = valor2;
	            } else {
	                meio = valor2;
	                maior = valor1;
	            }
	        }
	        
	        // Exibir os valores em ordem crescente
	        System.out.println("Valores em ordem crescente:");
	        System.out.println(menor);
	        System.out.println(meio);
	        System.out.println(maior);
	        
	        scanner.close();
	    }
	}
