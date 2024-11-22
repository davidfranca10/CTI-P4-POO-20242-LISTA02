package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		double op, sal, imp = 0, aum = 0, novo_sal = 0;
		System.out.println("MENU DE OPÇÕES");
		System.out.println("1 - IMPOSTO");
		System.out.println("2 - NOVO SALÁRIO");
		System.out.println("3 - CLASSIFICAÇÃO");
		System.out.println("DIGITE A OPÇÃO DESEJADA");
		op = sc.nextDouble();
		
		if (op == 1) {
			System.out.println("INSIRA O SALÁRIO");
			sal = sc.nextDouble();
			if (sal<500) {
				imp = sal*5/100;
			}
			if (sal>=500 && sal<=850) {
				imp = sal*10/100;
			}
			if (sal>850) {
				imp = sal*15/100;
			}
			System.out.println("Imposto " + imp);

		}
		
		
		if (op == 2) {
			
			System.out.println("INSIRA O SALÁRIO");
			sal = sc.nextDouble();
			if (sal>1500) {
				aum = 25;
			}
			if (sal>=750 && sal<=1500) {
				aum = 50;	
			}
			if (sal>=450 && sal<750) {
				aum = 75;			
			}
			if (sal<450) {
				aum = 100;
				
			}
			novo_sal = sal+aum;
			System.out.println("Novo salário " + novo_sal);
		}
		
		
		if (op == 3) {
			System.out.println("INSIRA O SALÁRIO");
			sal = sc.nextDouble();
			if (sal <= 700) {
				System.out.println("Mal remunerado");

			}
			if (sal > 700) {
				System.out.println("Bem remunerado");

			}
		}
		
		
		else {
			System.out.println("OPÇÃO INVÁLIDA");

		}
		
		
		
	}

}
