package br.edu.pricipal;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double n, n2, sm, raiz, op;
		System.out.println("_____________MENU_____________");
		System.out.println("1- Somar dois números");
		System.out.println("2- Raiz quadrada de um número");
		System.out.println("Digite sua opção:");
		op = sc.nextDouble();
		System.out.println("______________________________");
		if (op == 1) {
			System.out.println("digite o primeiro número: ");
			n = sc.nextDouble();
			System.out.println("digite o segundo número: ");
			n2 = sc.nextDouble();
			sm = n+n2;
			System.out.println("A soma de "+n+" e "+n2+" é "+sm);
		}
		else if(op==2) {
			System.out.println("digite o número: ");
			n = sc.nextDouble();
			raiz = Math.sqrt(n);
			System.out.println("A raiz quadrada de "+n+" é "+raiz);
		}
		else {
			System.out.println("Opção inválida!!");
		}
	}

}
