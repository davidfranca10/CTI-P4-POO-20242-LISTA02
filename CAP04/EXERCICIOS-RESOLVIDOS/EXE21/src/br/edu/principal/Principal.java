package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		double cod_est, cod_carga, peso_toneladas;
		double peso_quilos, pre_carga = 0, imposto =1, valor_total;
		
		do {
			  System.out.println("INSIRA O CÓDIGO DO ESTADO (entre 1 e 5)");
			  cod_est = sc.nextDouble();
			}
			while (cod_est > 5 || cod_est < 1);
		System.out.println("INSIRA O PESO DA CARGA EM TONELADAS");
		peso_toneladas = sc.nextDouble();
		do {
			  System.out.println("INSIRA O CÓDIGO DA CARGA (entre 1 e 40)");
			  cod_carga = sc.nextDouble();
			}
			while (cod_carga > 40 || cod_carga < 1);
		
		peso_quilos = peso_toneladas*1000;
		System.out.println("O PESO EM QUILOS É " + peso_quilos);
		
		if (cod_carga >= 10 && cod_carga <=20) {
			pre_carga = 100*peso_quilos;
		}
		if (cod_carga >= 21 && cod_carga <=30) {
			pre_carga = 250*peso_quilos;
		}
		if (cod_carga >= 31 && cod_carga <=40) {
			pre_carga = 340*peso_quilos;
		}
		System.out.println("O PREÇO DA CARGA É " + pre_carga);
		
		if (cod_est == 1) {
			imposto = 35.0/100.0*pre_carga;
		}
		if (cod_est == 2) {
			imposto = 25.0/100.0*pre_carga;
		}
		if (cod_est == 3) {
			imposto = 15.0/100.0*pre_carga;
		}
		if (cod_est == 4) {
			imposto = 5.0/100.0*pre_carga;
		}
		if (cod_est == 5) {
			imposto = 0;
		}
		System.out.println("O IMPOSTO É " + imposto);
		
		valor_total = pre_carga+imposto;
		System.out.println("O VALOR TOTAL É " + valor_total);
		
	}

}
