package exercicios;

import java.util.Scanner;

public class SalarioLiquido {

	public static void main(String[] args) {

		float salarioBruto, adicionalNoturno, horasExtras, descontos, salarioLiquido;
		String nome;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("--- CALCULA O SALÁRIO LÍQUIDO ---\n");
		
		System.out.printf("Nome do(a) funcionário(a): ");
		nome = scanner.nextLine();
		
		System.out.printf("Digite o salário bruto: ");
		salarioBruto = scanner.nextFloat();
		
		System.out.printf("Digite o adicional noturno: ");
		adicionalNoturno = scanner.nextFloat();
		
		System.out.printf("Digite as horas extras: ");
		horasExtras = scanner.nextFloat();
		
		System.out.printf("Digite os descontos: ");
		descontos = scanner.nextFloat();
		
		salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras * 5) - descontos;
		
		System.out.printf("\nO salário líquido de %s é R$%.2f", nome, salarioLiquido);

	}

}
