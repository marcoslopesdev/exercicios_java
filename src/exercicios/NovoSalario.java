package exercicios;

import java.util.Scanner;

public class NovoSalario {

	public static void main(String[] args) {

		float salario, abono, novoSalario;
		String nome;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("--- CALCULA O NOVO SALÁRIO ---\n");
		
		System.out.printf("Nome do(a) funcionário(a): ");
		nome = scanner.nextLine();
				
		System.out.println("Digite o salário: ");
		salario = scanner.nextFloat();
		
		System.out.println("Digite o abono: ");
		abono = scanner.nextFloat();
		
		novoSalario = salario + abono;
		
		System.out.printf("O novo salário de %s é R$%.0f", nome, novoSalario);

	}

}
