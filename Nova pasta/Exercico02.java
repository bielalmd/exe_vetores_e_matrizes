package vetor_e_matriz;

import java.util.*;

public class Exercico02 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		int contador = 0;
		int[] Dados = new int[5];
		int maiorDado = 0;

		// Escreva os dados no vetor e Valida!

		for (int l = 0; l < Dados.length; l++) {

			System.out.print("Insira a nota do dado " + (l + 1) + ": ");
			Dados[l] = ler.nextInt();

			if (Dados[l] <= 6) {
				System.out.println("Dado Valido!!!");
				continue;
			} else {
				System.out.println("Renicie a entrada de dados!!!");
				break;
			}

		}
		// Imprime os Valores

		for (int l = 0; l < Dados.length; l++) {
			System.out.println("os dados inseridos são:" + Dados[l] + "\n");

			if (Dados[l] > maiorDado) {
				maiorDado = Dados[l];
			}
		}

		for (int l = 0; l < Dados.length; l++) {
			if (Dados[l] == maiorDado) {
				contador = contador + 1;
			}
		}

		System.out.println("O valor " + maiorDado + " epetiu-se " + contador + " vezes");

	}

}
