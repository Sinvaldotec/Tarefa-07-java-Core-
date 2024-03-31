package exercicio06;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        // Leitura dos nomes dos times e dos gols marcados
	        System.out.println("Digite o nome do primeiro time:");
	        String time1 = scanner.nextLine();
	        System.out.println("Digite o número de gols marcados pelo " + time1 + ":");
	        int golsTime1 = scanner.nextInt();

	        System.out.println("Digite o nome do segundo time:");
	        scanner.nextLine(); // Consumir a nova linha pendente
	        String time2 = scanner.nextLine();
	        System.out.println("Digite o número de gols marcados pelo " + time2 + ":");
	        int golsTime2 = scanner.nextInt();

	        // Verificar o vencedor ou se houve empate
	        if (golsTime1 > golsTime2) {
	            System.out.println("O vencedor é: " + time1);
	        } else if (golsTime2 > golsTime1) {
	            System.out.println("O vencedor é: " + time2);
	        } else {
	            System.out.println("EMPATE");
	        }

	        scanner.close();
	    }
	}
