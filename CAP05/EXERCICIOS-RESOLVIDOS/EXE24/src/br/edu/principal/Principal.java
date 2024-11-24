package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double op, sal, imp = 0, aum, novo_sal;
		
		while (true) {
			System.out.println("");
			System.out.println("MENU DE OPÇÕES");
			System.out.println("1 - Imposto");
			System.out.println("2 - Novo Salário");
			System.out.println("3 - Classificação");
			System.out.println("4 - Finalisar o Programa");
			System.out.println("Digite a opção desejada:");
			op = sc.nextDouble();
			
			if (op > 4 | op < 1) {
				System.out.println("Opção inválida");
			}
			else if (op == 1) {
				System.out.println("Digite salário:");
				sal = sc.nextDouble();
				if (sal < 500) {
					imp = sal * 5/100;
				}
				else if (sal >= 500 & sal <= 850) {
					imp = sal * 10/100;
				}
				else if (sal > 850) {
					imp = sal * 15/100;
				}
				System.out.println("Valor de imposto $"+imp);
			}
			
			else if (op == 2) {
				System.out.println("Digite salário:");
				sal = sc.nextDouble();
				if (sal < 1500) {
					aum = 75;
				}
				else if (sal >= 750 & sal <= 1500) {
					aum = 50;
				}
				else if (sal >= 450 & sal < 750) {
					aum = 75;
				}
				else {
					aum = 100;
				}
				novo_sal = sal + aum;
				System.out.println("O novo salário é de $"+novo_sal);
			}
			else if(op == 3) {
				System.out.println("Digite salário:");
				sal = sc.nextDouble();
				if (sal <= 700) {
					System.out.println("Mal Remunerado");
				}
				else {
					System.out.println("bem Remunerado");
				}
			}
			else {
				return;
			}
		}
		
	}

}
