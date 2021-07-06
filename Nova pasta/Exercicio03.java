package vetor_e_matriz;

import java.util.*;

public class Exercicio03 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int[][] cont = new int[4][6];
		int[][] n1 = new int[4][6];
		int[][] n2 = new int[4][6];
		int[][] m1 = new int[4][6];
		int[][] m2 = new int[4][6];

		for (int l = 0; l < cont.length; l++) {
			for (int c = 0; c < cont[l].length; c++) {

				System.out.print("Insira o valor correspondente ao bloco " + (c + 1) + "da linha " + (l + 1) + ": ");
				n1[l][c] = ler.nextInt();
				System.out.print("\n");

				System.out.print("Insira o valor correspondente ao bloco " + (c + 1) + "da linha " + (l + 1) + ": ");
				n2[l][c] = ler.nextInt();
				System.out.print("\n");

				m1[l][c] = n2[l][c] + n1[l][c];
				m2[l][c] = n1[l][c] - n2[l][c];

			}
		}

		for (int l = 0; l < m1.length; l++) {
			for (int c = 0; c < m1[l].length; c++) {

				System.out.print("\t" + m1[l][c] + "\t|");
			}
		}

		System.out.print("\n");

		for (int l = 0; l < m2.length; l++) {
			for (int c = 0; c < m2[l].length; c++) {

				System.out.print("\t" + m2[l][c] + "\t|");
			}
		}

	}

}
