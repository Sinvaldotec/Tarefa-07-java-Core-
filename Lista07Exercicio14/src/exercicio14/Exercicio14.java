package exercicio14;

import java.util.Scanner;

public class Exercicio14 {

	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        
        // Leitura das notas e da média dos exercícios
        System.out.println("Digite a primeira nota: ");
        double n1 = scanner.nextDouble();
        
        System.out.println("Digite a segunda nota: ");
        double n2 = scanner.nextDouble();
        
        System.out.println("Digite a terceira nota: ");
        double n3 = scanner.nextDouble();
        
        System.out.println("Digite a média dos exercícios: ");
        double mediaExercicios = scanner.nextDouble();
        
        // Cálculo da média de aproveitamento
        double mediaAproveitamento = (n1 + n2 * 2 + n3 * 3 + mediaExercicios) / 7;
        
        // Atribuição do conceito
        char conceito;
        if (mediaAproveitamento >= 9.0) {
            conceito = 'A';
        } else if (mediaAproveitamento >= 7.5) {
            conceito = 'B';
        } else if (mediaAproveitamento >= 6.0) {
            conceito = 'C';
        } else {
            conceito = 'D';
        }
        
        // Exibição do resultado
        System.out.println("Média de aproveitamento: " + mediaAproveitamento);
        System.out.println("Conceito: " + conceito);
        
        scanner.close();
    }
}