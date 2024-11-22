package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		double sal_base, tempo, imposto, grat, sal_liq;
		
		System.out.println("INSIRA O SALÁRIO BASE");
		sal_base = sc.nextDouble();
		System.out.println("INSIRA O TEMPO DE SERVIÇO");
		tempo = sc.nextDouble();
		
		if (sal_base<200) {
			imposto = 0;
		} else if (sal_base <= 450) {
			imposto = 3.0/100.0*sal_base;
		} else if (sal_base<700) {
			imposto = 8.0/100.0*sal_base;
		} else {
			imposto = 12.0/100.0*sal_base;
		}
		
		System.out.println("IMPOSTO É " + imposto);
		if (sal_base>500) {
			if (tempo<=3) {
				grat = 20;
				
			}
			else {
				grat = 30;
			}
		}
		else {
			if(tempo<=3) {
				grat = 23;
			} else if (tempo<6) {
				grat = 35;
			} else {
				grat = 33;
			}
		}
		System.out.println("GRATIFICAÇÃO É " + grat);
		sal_liq = sal_base - imposto + grat;
		System.out.println("SALÁRIO LIQUIDO É " + sal_liq);
		if (sal_liq<=350) {
			System.out.println("CLASSIFICAÇÃO A");
		} else if (sal_liq < 600) {
			System.out.println("CLASSIFICAÇÃO B");
		} else {
			System.out.println("CLASSIFICAÇÃO C");
		}
		
		
		
	}

}
