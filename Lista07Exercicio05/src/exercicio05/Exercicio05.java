package exercicio05;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		 try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Digite o valor do lado A: ");
	        double ladoA = scanner.nextDouble();

	        System.out.println("Digite o valor do lado B: ");
	        double ladoB = scanner.nextDouble();

	        System.out.println("Digite o valor do lado C: ");
	        double ladoC = scanner.nextDouble();

	        if (verificarTriangulo(ladoA, ladoB, ladoC)) {
	            System.out.println("Os valores formam um triângulo.");
	        } else {
	            System.out.println("Os valores não formam um triângulo.");
	        }
		}
	    }

	    public static boolean verificarTriangulo(double ladoA, double ladoB, double ladoC) {
	        return (ladoA < ladoB + ladoC) && (ladoB < ladoA + ladoC) && (ladoC < ladoA + ladoB);
	    }
	}
