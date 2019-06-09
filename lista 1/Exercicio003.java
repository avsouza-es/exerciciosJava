/*************************************************************************
 * 3) Faça um programa para pagamento de comissão de vendedores de peças,
 *		levando-se em consideração que sua comissão será de 5% do total da venda 
 *		e que você tem os seguintes dados:
 * 		- Identificação do vendedor
 * 		- Código da peça
 * 		- Preço unitário da peça
 * 		- Quantidade vendida
*************************************************************************/

import java.util.Scanner;

class Exercicio003{
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		//declaracao de variaveis
		int idVendedor, idPeca;
		float totalVenda, precoUnitarioPeca, quantidadeVendida, comissao=0.5f;
		double valorPagarComissao; 
		
		System.out.print("Digite o código do vendedor: ");
		idVendedor = entrada.nextInt();
		System.out.print("Digite o código da Peça: ");
		idPeca = entrada.nextInt();
		System.out.print("Digite o preço unitário da peça: ");
		precoUnitarioPeca = entrada.nextFloat();
		System.out.print("Digite o quantidade de peças vendidas: ");
		quantidadeVendida = entrada.nextFloat();
		
		valorPagarComissao = (precoUnitarioPeca * quantidadeVendida) * comissao;
		totalVenda = (precoUnitarioPeca * quantidadeVendida);
		System.out.print("Total da venda e de R$" +totalVenda +"\n");
		System.out.print("A comissa a ser paga é de  R$" +valorPagarComissao +"\n");
	}
}