package exercicios;

import java.util.Scanner;

public class DiferencaProduto {

	public static void main(String[] args) {

		float n1, n2, n3, n4, diferenca;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("--- MOSTRA A DIFERENÇA DO PRODUTO ---\n");
		
		System.out.printf("Digite o primeiro número: ");
		n1 = scanner.nextFloat();
		
		System.out.printf("Digite o segundo número: ");
		n2 = scanner.nextFloat();
		
		System.out.printf("Digite o terceiro número: ");
		n3 = scanner.nextFloat();
		
		System.out.printf("Digite o quarto número: ");
		n4 = scanner.nextFloat();
		
		diferenca = (n1 * n2) - (n3 * n4);
		
		System.out.printf("\nA diferença do produto entre o n1 e n2 pelo produto entre o n3 e o n4 é %.1f", diferenca);

	}

}
