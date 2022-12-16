package lista3;

import java.util.Scanner;

public class Exercicio10Eleitores {

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);

		int candidatoA, candidatoB, candidatoC, votoBranco, votoNulo, eleitores, validos;
		float perc_a, perc_b, perc_c, branco, nulos;

		System.out.println("Digite a quantidades de votos para o candidato A: ");
		candidatoA = obj.nextInt();

		System.out.println("Digite a quantidades de votos para o candidato B: ");
		candidatoB = obj.nextInt();

		System.out.println("Digite a quantidades de votos para o candidato C: ");
		candidatoC = obj.nextInt();

		System.out.println("Digite a quantidades de votos em brancos: ");
		votoBranco = obj.nextInt();

		System.out.println("Digite a quantidades de votos nulos: ");
		votoNulo = obj.nextInt();

		validos = candidatoA + candidatoB + candidatoC;
		eleitores = validos + votoBranco + votoNulo;

		perc_a = (candidatoA * 100) / eleitores;

		perc_b = (candidatoB * 100) / eleitores;

		perc_c = (candidatoC * 100) / eleitores;

		branco = (votoBranco * 100) / eleitores;

		nulos = (votoNulo * 100) / eleitores;

		System.out.println("A QUANTIDADE DE ELEITORES É : " + eleitores);
		System.out.println("A PORCENTAGEM DE VOTOS VALIDO PARA O CANDIDATO A É DE : " + perc_a + "%");
		System.out.println("A PORCENTAGEM DE VOTOS VALIDO PARA O CANDIDATO B É DE : " + perc_b + "%");
		System.out.println("A PORCENTAGEM DE VOTOS VALIDO PARA O CANDIDATO C É DE : " + perc_c + "%");
		System.out.println("A PORCENTAGEM DE VOTOS NULOS EM RELAÇÃO AOs ELEITORES É DE : " + nulos + "%");
		System.out.println("A PORCENTAGEM DE VOTOS EM BRANCO EM RELAÇÃO AOS ELEITORES  É DE : " + branco + "%");
		obj.close();
	}
}
