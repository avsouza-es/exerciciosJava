/*************************************************************************
 *  1-)Faça um programa para calcular o estoque médio de uma peça, sendo que:
 *  ESTOQUE MÉDIO = (QUANTIDADE_MÍNIMA + QUANTIDADE_MÁXIMA) / 2.
 *
 *  Exercicios retirado de https://github.com/victorperin/Exercicios-Java/blob/master/Lista%20-%2064%20Exercicios/1/estoque_medio.java
 *************************************************************************/

import java.util.Scanner;

class Exercicio001{

	public static void main(String[] args){

		// declaracao de variaveis para o programa
		double estoque_medio, quantidade_maxima_estoque, quantidade_minima_estoque;
		Scanner entrada = new Scanner(System.in);

		System.out.print("Programa para calcular media estoque medio de peças\n");
		System.out.print("Digite a quantidade mínima do estoque: ");
		quantidade_minima_estoque = entrada.nextDouble();
		System.out.print("Digite a quantidade a máxima do estoque: ");
		quantidade_maxima_estoque = entrada.nextDouble();
		estoque_medio = (quantidade_minima_estoque * quantidade_maxima_estoque) / 2;
		System.out.print("a media do estoque deve ser de " +estoque_medio +"\n");

	}
	
}