package lista3;

import java.util.Scanner;

public class Exercicio04Dolar {

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);

		float dolar, cotacao, valor;

		System.out.println("Digite a cota��o do dolar: ");
		cotacao = obj.nextFloat();

		System.out.println("Digite  a quantidade d�lares: ");
		dolar = obj.nextFloat();

		valor = dolar * cotacao;

		System.out.printf("Voc� possui R$ %.2f" ,valor);

		obj.close();

	}

}
