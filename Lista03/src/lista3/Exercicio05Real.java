package lista3;

import java.util.Scanner;

public class Exercicio05Real {

	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		
		float real, cotacao, valor;
		
		System.out.println("Digite o valor da cotação do dolar: ");
		cotacao = obj.nextFloat();
		
		System.out.println("Digite a quantidade de Real que você possui: R$ ");
		real = obj.nextFloat();
		
		valor = real /cotacao;
		
		System.out.printf("O valor convertido em dolar é: $ %.2f" , valor);
		obj.close();
	}
	
}
