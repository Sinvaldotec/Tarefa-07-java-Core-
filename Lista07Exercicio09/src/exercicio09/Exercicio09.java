package exercicio09;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o tipo de combustível (A-álcool, G-gasolina):");
        char tipoCombustivel = scanner.next().charAt(0);

        System.out.println("Digite a quantidade de litros vendidos:");
        double litrosVendidos = scanner.nextDouble();

        double precoLitro;
        double desconto;

        if (tipoCombustivel == 'A' || tipoCombustivel == 'a') {
            precoLitro = 2.90;
            if (litrosVendidos <= 20) {
                desconto = 0.03;
            } else {
                desconto = 0.05;
            }
        } else if (tipoCombustivel == 'G' || tipoCombustivel == 'g') {
            precoLitro = 3.30;
            if (litrosVendidos <= 20) {
                desconto = 0.04;
            } else {
                desconto = 0.06;
            }
        } else {
            System.out.println("Tipo de combustível inválido.");
            return;
        }

        double totalSemDesconto = litrosVendidos * precoLitro;
        double valorDesconto = totalSemDesconto * desconto;
        double totalComDesconto = totalSemDesconto - valorDesconto;

        System.out.println("Valor a ser pago pelo cliente: R$" + totalComDesconto);

        scanner.close();
    }
}