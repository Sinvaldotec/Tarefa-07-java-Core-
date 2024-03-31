package exercicio12;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		// Código do usuário e senha correta
        final int CODIGO_USUARIO_CORRETO = 1234;
        final int SENHA_CORRETA = 9999;

        // Scanner para ler entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Ler o código do usuário
        System.out.print("Digite o código do usuário: ");
        int codigoUsuario = scanner.nextInt();

        // Verificar se o código do usuário é válido
        if (codigoUsuario != CODIGO_USUARIO_CORRETO) {
            System.out.println("Usuário inválido!");
        } else {
            // Ler a senha
            System.out.print("Digite a senha: ");
            int senha = scanner.nextInt();

            // Verificar se a senha está correta
            if (senha != SENHA_CORRETA) {
                System.out.println("Senha incorreta");
            } else {
                System.out.println("Acesso permitido");
            }
        }

        // Fechar o scanner
        scanner.close();
    }
}
