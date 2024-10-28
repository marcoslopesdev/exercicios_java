package exercicios;

import java.util.Scanner;

public class Media {

	public static void main(String[] args) {

		float nota1, nota2, nota3, nota4, media;
		String nome;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("--- CALCULA A MÉDIA DE NTOAS ---\n");
		
		System.out.printf("Nome do(a) aluno(a): ");
		nome = scanner.nextLine();
		
		System.out.printf("Digite a nota 1: ");
		nota1 = scanner.nextFloat();
		
		System.out.printf("Digite a nota 2: ");
		nota2 = scanner.nextFloat();
		
		System.out.printf("Digite a nota 3: ");
		nota3 = scanner.nextFloat();
		
		System.out.printf("Digite a nota 4: ");
		nota4 = scanner.nextFloat();
		
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		System.out.printf("\nA média de %s é %.1f", nome, media);

	}

}
