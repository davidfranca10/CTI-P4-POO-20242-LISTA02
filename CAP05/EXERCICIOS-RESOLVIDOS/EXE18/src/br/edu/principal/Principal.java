package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		double num, quad, cubo, raiz;
		
		System.out.println("digite o numero: ");
		num = sc.nextDouble();
		while (num > 0) {
			quad = num * num;
			cubo = num * num * num;
			raiz = Math.sqrt(num);
			System.out.print("quadrado do número: " + quad);
			System.out.print("  o cubo do número: " + cubo);
			System.out.println("  a raiz quadrada do número: " + raiz);
			System.out.println("digite o numero: ");
			num = sc.nextDouble();
		}
		
	}

}
