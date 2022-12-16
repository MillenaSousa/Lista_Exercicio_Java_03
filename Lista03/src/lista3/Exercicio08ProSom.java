package lista3;

import java.util.Scanner;

public class Exercicio08ProSom {

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);

		float valor1, valor2, valor3, valor4, soma, produto;

		System.out.println("Digite o primeiro valor: ");
		valor1 = obj.nextFloat();

		System.out.println("Digite o segundo valor: ");
		valor2 = obj.nextFloat();

		System.out.println("Digite o terceiro valor: ");
		valor3 = obj.nextFloat();

		System.out.println("Digite o quarto valor: ");
		valor4 = obj.nextFloat();

		soma = valor2 + valor4;
		produto = valor1 * valor3;

		System.out.println("A soma do valor 2 com o valor 4 é: " + soma);

		System.out.println("O produto do valor 1 com o valor 3 é: " + produto);
		obj.close();

	}
}