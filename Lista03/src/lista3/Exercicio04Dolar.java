package lista3;

import java.util.Scanner;

public class Exercicio04Dolar {

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);

		float dolar, cotacao, valor;

		System.out.println("Digite a cotação do dolar: ");
		cotacao = obj.nextFloat();

		System.out.println("Digite  a quantidade dólares: ");
		dolar = obj.nextFloat();

		valor = dolar * cotacao;

		System.out.printf("Você possui R$ %.2f" ,valor);

		obj.close();

	}

}
