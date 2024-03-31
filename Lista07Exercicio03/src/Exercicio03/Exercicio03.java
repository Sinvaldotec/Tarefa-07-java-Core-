package Exercicio03;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        
        // Lendo os três valores
        System.out.println("Digite o primeiro valor:");
        double valor1 = scanner.nextDouble();
        
        System.out.println("Digite o segundo valor:");
        double valor2 = scanner.nextDouble();
        
        System.out.println("Digite o terceiro valor:");
        double valor3 = scanner.nextDouble();
        
        // Calculando a soma dos dois maiores valores
        double somaDosMaiores = somaDosMaiores(valor1, valor2, valor3);
        
        // Exibindo o resultado
        System.out.println("A soma dos dois maiores valores é: " + somaDosMaiores);
        
        scanner.close();
    }
    
    // Método para calcular a soma dos dois maiores valores
    public static double somaDosMaiores(double a, double b, double c) {
        double menor;
        
        // Encontrando o menor valor
        if (a < b && a < c) {
            menor = a;
        } else if (b < c) {
            menor = b;
        } else {
            menor = c;
        }
        
        // Calculando a soma dos dois maiores valores
        return a + b + c - menor;
    }
}
