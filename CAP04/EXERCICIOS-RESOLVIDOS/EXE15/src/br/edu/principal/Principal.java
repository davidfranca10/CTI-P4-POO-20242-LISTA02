package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		double sal_min, nht, ndep, nhet;
		double sal_receber, vh, smes, vdep, vhe, imp = 0;
		double sbruto, sliq, grat = 0;
		
		System.out.println("Insira o salário minimo");
		sal_min = sc.nextDouble();
		System.out.println("Insira o número de horas trabalhadas");
		nht = sc.nextDouble();
		System.out.println("Insira o número de dependentes");
		ndep = sc.nextDouble();
		System.out.println("Insira o número de horas EXTRAS trabalhadas");
		nhet = sc.nextDouble();
		
		vh = 1/5 * sal_min;
		smes = nht*vh;
		vdep = 32*ndep;
		vhe = nhet*(vh + (vh*50/100));
		sbruto = smes + vdep + vhe;
		if (sbruto < 200) {
			imp = 0;
		}
		if (sbruto >= 200 && sbruto <= 500) {
			imp = sbruto*10/100;
			
		}
		if (sbruto > 500) {
			imp = sbruto *20/100;
		}
		
		sliq = sbruto - imp;
		if (sliq <= 350) {
			grat = 100;
		}
		if (sliq > 350) {
			grat = 50;
		}
		
		sal_receber = sliq + grat;
		System.out.println("o salário a ser recebido é " + sal_receber);

	}

}
