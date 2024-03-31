package Exercicio10;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        
        // Leitura das idades dos homens
        System.out.println("Digite a idade do primeiro homem:");
        int idadeHomem1 = scanner.nextInt();
        
        System.out.println("Digite a idade do segundo homem:");
        int idadeHomem2 = scanner.nextInt();
        
        // Leitura das idades das mulheres
        System.out.println("Digite a idade da primeira mulher:");
        int idadeMulher1 = scanner.nextInt();
        
        System.out.println("Digite a idade da segunda mulher:");
        int idadeMulher2 = scanner.nextInt();
        
        // Calcula a soma da idade do homem mais velho com a mulher mais nova
        int somaIdades = Math.max(idadeHomem1, idadeHomem2) + Math.min(idadeMulher1, idadeMulher2);
        
        // Calcula o produto da idade do homem mais novo com a mulher mais velha
        int produtoIdades = Math.min(idadeHomem1, idadeHomem2) * Math.max(idadeMulher1, idadeMulher2);
        
        // Exibe os resultados
        System.out.println("Soma das idades do homem mais velho com a mulher mais nova: " + somaIdades);
        System.out.println("Produto das idades do homem mais novo com a mulher mais velha: " + produtoIdades);
        
        scanner.close();
    }
}