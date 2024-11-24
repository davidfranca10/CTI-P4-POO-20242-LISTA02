package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double sal, qtd, tipo, valor_kw, gasto, acresc = 0, total, tot_geral=0, qtd_cons=0;
		System.out.println("Salário: ");
		sal = sc.nextDouble();
		System.out.println("Quantidade de quilo watts gasta (0 para encerrar): ");
		qtd = sc.nextDouble();
		valor_kw = sal/8;
		while (qtd != 0) {
			gasto = qtd * valor_kw;
			System.out.println("Tipo de consumidor:");
			System.out.println("1 - residencial | 2 - Comercial | 3- industrial");
			tipo = sc.nextDouble();
			if (tipo  == 1) {
				acresc = gasto * 5/100;
			}
			else if (tipo == 2) {
				acresc = gasto * 10/100;
			}
			else if (tipo == 3) {
				acresc = gasto * 15/100;
			}
			total = gasto + acresc;
			tot_geral = tot_geral + total;
			if (total >= 500 & total <=1000) {
				qtd_cons += 1;
			}
			System.out.println("Gasto: "+gasto);
			System.out.println("Acrescimo: "+acresc);
			System.out.println("Total: $"+total);
			System.out.println("");
			System.out.println("Quantidade de quilo watts gasta (0 para encerrar):");
			qtd = sc.nextDouble();
		}
		System.out.println("");
		System.out.println("Total geral: $"+tot_geral);
		System.out.println("Existem "+qtd_cons+" consumidores que pagam entre R$500,00 e R$1.000,00.");
		
		}

}
