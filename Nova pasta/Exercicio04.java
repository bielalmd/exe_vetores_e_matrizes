package vetor_e_matriz;

import java.util.*;

public class Exercicio04 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int[][] MAIN = new int[3][3];
		int soma = 0;
		int l, c;
		for (l = 0; l < MAIN.length; l++) {
			for (c = 0; c < MAIN[l].length; c++) {

				System.out.print("Insira o valor correspondente a matriz: ");
				MAIN[l][c] = ler.nextInt();

				if (l == c) {
					soma = soma + MAIN[l][c];
				}
			}
		}

		for (l = 0; l < MAIN.length; l++) {
			for (c = 0; c < MAIN[l].length; c++) {
				System.out.print("\n" + MAIN[l][c] + "\n| ");

			}
		}
		System.out.println("\nA soma da diagonal da matriz é: " + soma);
	}

}

