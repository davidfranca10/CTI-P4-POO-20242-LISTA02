package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double cod, num_h, sal_b, sal_l = 0, media_m = 0, media_f = 0, cont_m, cont_f;
		String sexo;
		System.out.println("digite o código: ");
		cod = sc.nextDouble();
		cont_m = 0;
		cont_f = 0;
		while(cod != 99999999) {
			System.out.println("digite o sexo: ");
			sexo = sc.next();
			System.out.println("digite o numero de horas");
			num_h = sc.nextDouble();
			sal_b = num_h * 30;
			if(sexo.equalsIgnoreCase("M")) {
				sal_l = sal_b - (sal_b * 10 / 100);
				media_m = media_m + sal_l;
				cont_m = cont_m + 1;
			}
			else if(sexo.equalsIgnoreCase("F")) {
				sal_l = sal_b - (sal_b * 5 / 100);
				media_f = media_f + sal_l;
				cont_f = cont_f + 1;
				
			}
			System.out.println("O código é: " + cod);
			System.out.println("O salário bruto: "+ sal_b);
			System.out.println("o salario liquido é: "+ sal_l);
			
		}
		if (cont_m == 0) {
			System.out.println("Nenhum professor do sexo masculino");
			
		}
		else {
			media_m = media_m / cont_m;
			System.out.println(media_m);
		}
		if (cont_f == 0) {
			System.out.println("Nenhum professor do sexo feminino");
		}
		else {
			media_f = media_f / cont_f;
			System.out.println(media_f);
			
		}

	}

}
