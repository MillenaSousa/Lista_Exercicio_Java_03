package lista3;

import java.util.Scanner;

public class Exercicio07QSoma {
	
	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		
		float valor1, valor2, valor3, soma;
		double quadrado;
		
		System.out.println("Digite o primeiro valor: ");
		valor1 = obj.nextFloat();
		
		System.out.println("Digite o segundo valor: ");
		valor2 = obj.nextFloat();
		
		System.out.println("Digite o terceiro valor: ");
		valor3 = obj.nextFloat();
		
		soma = valor1 + valor2 + valor3;
		quadrado = Math.pow(soma, 2);
		
		System.out.println("O quadrado da soma dos valores é: " + quadrado);
		obj.close();
	}
}
