package exercicio13;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        // Leitura dos dados do produto
	        System.out.print("Digite a descrição do produto: ");
	        String descricao = scanner.nextLine();

	        System.out.print("Digite a quantidade adquirida: ");
	        int quantidade = scanner.nextInt();

	        System.out.print("Digite o preço unitário: ");
	        double precoUnitario = scanner.nextDouble();

	        // Cálculo do total
	        double total = quantidade * precoUnitario;

	        // Cálculo do desconto
	        double desconto;
	        if (quantidade <= 5) {
	            desconto = total * 0.02;
	        } else if (quantidade <= 10) {
	            desconto = total * 0.03;
	        } else {
	            desconto = total * 0.05;
	        }

	        // Cálculo do total a pagar
	        double totalPagar = total - desconto;

	        // Exibição dos resultados
	        System.out.println("\nResumo da compra:");
	        System.out.println("Produto: " + descricao);
	        System.out.println("Quantidade: " + quantidade);
	        System.out.println("Preço unitário: R$" + precoUnitario);
	        System.out.println("Total: R$" + total);
	        System.out.println("Desconto: R$" + desconto);
	        System.out.println("Total a pagar: R$" + totalPagar);

	        scanner.close();
	    }
	}
