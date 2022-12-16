package lista3;

import java.util.Scanner;

public class Exercicio04CDolar {

	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		
		float dolar, cotacao, valor;
		
		System.out.println("Digite o valor cotação: ");
		cotacao = obj.nextFloat();
		
		System.out.println("Digite a quantidade de dolares que você possui: $ ");
		dolar = obj.nextFloat();
		
		valor = dolar * cotacao;
		
		System.out.println("O valor convertido em real é : R$ " + valor);
		obj.close();
		
	}
	
}
