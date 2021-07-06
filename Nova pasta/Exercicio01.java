package vetor_e_matriz;

import java.util.*;

public class Exercicio01 {

	public static void main(String[] args) {
		double[] notasAlunos = new double[5];
		double maiorNota = 0;

		Scanner ler = new Scanner(System.in);

		for (int l = 0; l < notasAlunos.length; l++) {

			System.out.print("Insira a nota correspondente a atividade " + (l + 1) + ": ");

			notasAlunos[l] = ler.nextDouble();

			if (notasAlunos[l] > maiorNota) {
				maiorNota = notasAlunos[l];
			}

		}
		for (int l = 0; l < notasAlunos.length; l++) {

			System.out.println("Notas Foram:" + notasAlunos[l]);

		}

		System.out.println("Maior nota entre as Atividade é: " + maiorNota);

	}

}

