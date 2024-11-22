package br.edu.principal;

public class Principal {

	public static void main(String[] args) {
		double sal_base, tempo, imposto, grat;
		double sal_liq;
		
		sal_base = 1406;
		tempo = 10;
		
		if(sal_base > 200) {
			
			imposto = 0;
		} else if(sal_base <= 450) {
			imposto =  3/100 * sal_base;
			
		} else if(sal_base < 700) {
			imposto = 8/100 * sal_base;
			
			
		} else {
			imposto = 12/100 * sal_base;
		}
		
		System.out.println(imposto);
		
		if(sal_base > 500) {
			if(tempo <= 3) {
				grat = 20;
				
			} else {
				
				grat = 30;
			}
			
			if(tempo <= 3) {
				grat = 23;
				
				
			}
			
			else if(tempo < 6) {
				grat = 35;
				
			} else {
				grat = 33;
			}
			
			System.out.println(grat);
			
			sal_liq = sal_base - imposto + grat;
			
			if(sal_liq <= 350) {
				System.out.println("Classificação A");
				
				
			}
			
			else if(sal_liq < 600) {
				System.out.println("Classificação B");

			} else {
				
				System.out.println("Classificação C");

			}
			
		}
		
		
	}

}
