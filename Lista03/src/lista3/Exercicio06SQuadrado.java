package lista3;

import java.util.Scanner;

public class Exercicio06SQuadrado {

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);

		float valor1, valor2, valor3;
		double quadrado;

		System.out.println("Digite o primeiro valor: ");
		valor1 = obj.nextFloat();

		System.out.println("Digite o segundo valor: ");
		valor2 = obj.nextFloat();

		System.out.println("Digite o terceiro valor: ");
		valor3 = obj.nextFloat();

		quadrado = Math.pow(valor1, 2) + Math.pow(valor2, 2) + Math.pow(valor3, 2);

		System.out.println("A soma dos quadrados dos valores digitados é : " + quadrado);
		obj.close();
	}

}
