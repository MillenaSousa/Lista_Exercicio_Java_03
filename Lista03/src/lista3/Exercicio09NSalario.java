package lista3;

import java.util.Scanner;

public class Exercicio09NSalario {

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);

		float salarioM, percentuaR, novoS;

		System.out.print("Digite o salario mensal: R$ ");
		salarioM = obj.nextFloat();

		System.out.print("Digite o valor do percentual de reajuste: % ");
		percentuaR = obj.nextFloat();

		novoS = salarioM + (salarioM * percentuaR / 100);
		System.out.println("O valor do novo salario é: R$ " + novoS);
		obj.close();
	}

}
