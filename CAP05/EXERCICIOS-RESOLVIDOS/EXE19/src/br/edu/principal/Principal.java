package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double m, n, soma, i;
		System.out.println("digite o valor de m ");
		m = sc.nextDouble();
		System.out.println("digite o valor de n ");
		n = sc.nextDouble();
		while(m <n) {
		soma = 0;
		for (i = m; i <=n; i++) {
			soma = soma + i;
			
		}
		System.out.println("O valor da soma é: " + soma  );
		System.out.println("digite o valor de m ");
		m = sc.nextDouble();
		System.out.println("digite o valor de n ");
		n = sc.nextDouble();
		}
	}

}
