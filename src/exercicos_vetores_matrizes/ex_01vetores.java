package exercicos_vetores_matrizes;

import java.util.Scanner;

public class ex_01vetores {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int vetor[] = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 };
		int num, posicao = 0;
		boolean encontrado = false;

		System.out.println("Digite o número que você deseja encontrar: ");
		num = sc.nextInt();

		for (int indice = 0; indice < vetor.length; indice++) {
			if (vetor[indice] == num) {
				posicao = indice;
				encontrado = true;
			}
		}

		if (encontrado == true) {
			System.out.println("O número " + num + " está localizado na posição: " + posicao);
		} else {
			System.out.println("O número " + num + " não foi encontrado!");
		}

		sc.close();
	}

}
