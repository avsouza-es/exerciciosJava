/*************************************************************************
 *  2) Faça um programa que:
 *    - Leia a cotação do dólar
 *    - Leia um valor em dólares
 *    - Converta esse valor para Real
 *    - Mostre o resultado
 *
 *************************************************************************/

import java.util.Scanner;

class Exercicio002{

	public static void main(String[] args){

		Scanner entrada = new Scanner(System.in);

		// declaraçao de variaveis
		float cotacao_do_dolar, valor_do_dolar, valor_em_real;


		System.out.print("Digite cotação do dólar: ");
		cotacao_do_dolar = entrada.nextFloat();
		System.out.print("Digite o valor: ");
		valor_do_dolar = entrada.nextFloat();
		
		valor_em_real = (cotacao_do_dolar * valor_do_dolar);
		System.out.print("Valor em real R$" +valor_em_real + "\n" );


	}
}