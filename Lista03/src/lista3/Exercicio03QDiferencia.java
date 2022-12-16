package lista3;

import java.util.Scanner;

public class Exercicio03QDiferencia {

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);

		float valor1, valor2, result;
		double quadrado;

		System.out.println("Digite o primeiro valor: ");
		valor1 = obj.nextFloat();

		System.out.println("Digite o segundo valor: ");
		valor2 = obj.nextFloat();

		result = (valor1 - valor2);
		quadrado = Math.pow(result, 2);

		System.out.println("O quadrado da diferencia é: " + quadrado);
		obj.close();
	}
}
