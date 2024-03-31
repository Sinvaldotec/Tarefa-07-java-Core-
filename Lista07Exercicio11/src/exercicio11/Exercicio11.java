package exercicio11;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Leitura da quantidade de morangos e maçãs
        System.out.println("Digite a quantidade de morangos (em Kg): ");
        double kgMorangos = scanner.nextDouble();

        System.out.println("Digite a quantidade de maçãs (em Kg): ");
        double kgMaca = scanner.nextDouble();

        // Cálculo do valor a ser pago pelos morangos
        double precoMorangos;
        if (kgMorangos <= 5) {
            precoMorangos = kgMorangos * 2.50;
        } else {
            precoMorangos = kgMorangos * 2.20;
        }

        // Cálculo do valor a ser pago pelas maçãs
        double precoMaca;
        if (kgMaca <= 5) {
            precoMaca = kgMaca * 1.80;
        } else {
            precoMaca = kgMaca * 1.50;
        }

        // Cálculo do valor total sem desconto
        double valorTotalSemDesconto = precoMorangos + precoMaca;

        // Aplicação do desconto, se aplicável
        double desconto = 0.0;
        if (kgMorangos + kgMaca > 8 || valorTotalSemDesconto > 25.00) {
            desconto = valorTotalSemDesconto * 0.10;
        }

        // Cálculo do valor total a ser pago pelo cliente (com desconto)
        double valorTotalComDesconto = valorTotalSemDesconto - desconto;

        // Saída dos resultados
        System.out.println("Valor a ser pago pelos morangos: R$" + precoMorangos);
        System.out.println("Valor a ser pago pelas maçãs: R$" + precoMaca);
        System.out.println("Valor total sem desconto: R$" + valorTotalSemDesconto);
        System.out.println("Desconto aplicado: R$" + desconto);
        System.out.println("Valor total com desconto: R$" + valorTotalComDesconto);

        // Fechar o scanner
        scanner.close();
    }
}
