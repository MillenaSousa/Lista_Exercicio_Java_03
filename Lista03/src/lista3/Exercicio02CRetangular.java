package lista3;

import java.util.Scanner;

public class Exercicio02CRetangular {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);

		float comprimento, largura, altura, volume;

		System.out.println("Digite o valor do comprimento: ");
		comprimento = obj.nextFloat();

		System.out.println("Digite o valor da largura: ");
		largura = obj.nextFloat();

		System.out.println("Digite o valor da altura: ");
		altura = obj.nextFloat();

		volume = comprimento * largura * altura;

		System.out.println("O valor do volume de uma caixa retangular é: " + volume);
		obj.close();
				
	}

}
