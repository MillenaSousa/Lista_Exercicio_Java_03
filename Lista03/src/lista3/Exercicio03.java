package lista3;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);

		float valor1, valor2, resultado;
		double quadrado;

		System.out.println("Digite o primeiro numero: ");
		valor1 = obj.nextFloat();

		System.out.println("Digite o segundo número: ");
		valor2 = obj.nextFloat();

		resultado = valor1 - valor2;
		quadrado = Math.pow(resultado, 2);

		System.out.println("O quadrado da diferencia é: " + quadrado);
		obj.close();
		
	}
}
