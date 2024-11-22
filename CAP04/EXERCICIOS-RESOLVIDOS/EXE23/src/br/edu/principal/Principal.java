package br.edu.principal;



import java.util.Scanner;



public class Principal {



	public static void main(String[] args) {

		// TODO Auto-generated method stub

		

		Scanner sc = new Scanner(System.in);

		

		double sal_min, nht, coeficiente = 0, sal_bruto;

		double imposto = 0, grat, auxilio, sal_liq;

		String turno, categoria;


		System.out.println("Salário minimo: ");

		sal_min = sc.nextDouble();

		System.out.println("Turno: ");

		turno = sc.next();

		System.out.println("Categoria: ");

		categoria = sc.next();

		System.out.println("Nº de horas trabalhadas");

		nht = sc.nextDouble();

		

		if (turno.equalsIgnoreCase("M")) {

			coeficiente = 10.0/100.0*sal_min;

		}

		if (turno.equalsIgnoreCase("V")) {

			coeficiente = 15.0/100.0*sal_min;

		}
		if (turno.equalsIgnoreCase("N")) {

			coeficiente = 12.0/100.0*sal_min;

		}

		
		System.out.println("Coef. = " + coeficiente);

		sal_bruto = nht*coeficiente;

		System.out.println("Sal. bruto = " + sal_bruto);

		

		if (categoria.equalsIgnoreCase("O")) {

			if (sal_bruto >=300) {

				imposto = 5.0/100.0*sal_bruto;

			} else {

				imposto = 3.0/10.00*sal_bruto;

			}

		} else {

			if (sal_bruto >=400) {

				imposto = 6.0/100.0*sal_bruto;

				imposto = 4.0/100.0*sal_bruto;

			}

		System.out.println("Imposto = " + imposto);

		if (turno.equalsIgnoreCase("N") && nht > 80) {
			grat = 50;
			
		} else {
			grat = 30;
		}
		System.out.println("Gratificação = " + grat);
		
	
		if (categoria.equalsIgnoreCase("O")||coeficiente <=25) {
			auxilio = sal_bruto*1.0/3.0;
			
		} else {
			auxilio = sal_bruto*1.0/2.0;
		}
		
		System.out.println("Auxilio = " + auxilio);

		sal_liq = sal_bruto - imposto + grat + auxilio;
		System.out.println("Salário Liq. = " + sal_liq);
		if (sal_liq < 350) {
			System.out.println("Mal remunerado");

		}
		if (sal_liq >= 350 && sal_liq <=600) {
			System.out.println("Normal");

		}
		if (sal_liq > 600) {
			System.out.println("Bem remunerado");
		}
		
		}

	}



}