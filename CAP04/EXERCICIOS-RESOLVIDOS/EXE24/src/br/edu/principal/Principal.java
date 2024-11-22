package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		double pre, valor_adic = 0, imposto;
		double pre_custo, desconto, novo_pre;
		String tipo, refrig;
		
		System.out.println("Preço:");
		pre = sc.nextDouble();
		System.out.println("Tipo(A/L/V):");
		tipo = sc.next();
		System.out.println("Refrigeração? (N/S)");
		refrig = sc.next();
		
		if (refrig.equalsIgnoreCase("N")) {
			if (tipo.equalsIgnoreCase("A")) {
				if (pre < 15) {
					valor_adic = 2;
				} else {
					valor_adic = 5;
				}
			}	
			if (tipo.equalsIgnoreCase("L")) {
				if (pre < 10) {
					valor_adic = 1.5;
				} else {
					valor_adic = 2.5;
				}	
			}
			if (tipo.equalsIgnoreCase("V")) {
				if (pre < 30) {
					valor_adic = 3;
				} else {
					valor_adic = 2.5;
				}
			}
		
		} else {
			if (tipo.equalsIgnoreCase("A")) {
				valor_adic = 8;
			}
			if (tipo.equalsIgnoreCase("L")) {
				valor_adic = 0;
			}
			if (tipo.equalsIgnoreCase("V")) {
				valor_adic = 0;
			}
		}
		
		System.out.println("Valor adicional: " + valor_adic);
		if (pre <25) {
			imposto = 5.0/100*pre;
		} else {
			imposto = 8.0/100*pre;
		}
		System.out.println("Imposto: " + imposto);
		
		pre_custo = pre + imposto;
		System.out.println("Preço de custo " + pre_custo);
		
		if ((!tipo.equalsIgnoreCase("A"))&&(!refrig.equalsIgnoreCase("S"))) {
			desconto = 3.0/100*pre_custo;
		} else {
			desconto = 0;
		}
		System.out.println("Desconto: " + desconto);

		novo_pre = pre_custo + valor_adic - desconto;
		System.out.println("Novo preço: " +novo_pre);
		if (novo_pre <= 50) {
			System.out.println(" Barato ");
			
		} else if (novo_pre < 100) {
			System.out.println("Normal");

		} else {
			System.out.println("Caro");

		}
		

	}

}
