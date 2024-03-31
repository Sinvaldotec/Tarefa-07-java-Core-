package exercicio15;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        
        // Leitura dos dados do empregado
        System.out.println("Digite o número do empregado (código):");
        int codigo = scanner.nextInt();
        
        System.out.println("Digite o ano de nascimento do empregado:");
        int anoNascimento = scanner.nextInt();
        
        System.out.println("Digite o ano de ingresso na empresa:");
        int anoIngresso = scanner.nextInt();
        
        // Cálculo da idade e do tempo de trabalho
        int idade = calcularIdade(anoNascimento);
        int tempoDeTrabalho = calcularTempoDeTrabalho(anoIngresso);
        
        // Verificação se o empregado está qualificado para a aposentadoria
        if (idade >= 65 || tempoDeTrabalho >= 30 || (idade >= 60 && tempoDeTrabalho >= 25)) {
            System.out.println("Idade: " + idade);
            System.out.println("Tempo de trabalho: " + tempoDeTrabalho + " anos");
            System.out.println("Requerer aposentadoria");
        } else {
            System.out.println("Idade: " + idade);
            System.out.println("Tempo de trabalho: " + tempoDeTrabalho + " anos");
            System.out.println("Não requerer");
        }
    }
    
    // Método para calcular a idade
    public static int calcularIdade(int anoNascimento) {
        int anoAtual = 2024; // Ano atual
        return anoAtual - anoNascimento;
    }
    
    // Método para calcular o tempo de trabalho
    public static int calcularTempoDeTrabalho(int anoIngresso) {
        int anoAtual = 2024; // Ano atual
        return anoAtual - anoIngresso;
    }
}