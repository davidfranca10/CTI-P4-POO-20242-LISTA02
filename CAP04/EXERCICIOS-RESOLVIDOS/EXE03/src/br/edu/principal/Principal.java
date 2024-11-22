package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double n1, n2;
		
		System.out.println("digite o número: ");
		n1 = sc.nextDouble();
		
		System.out.println("digite o número: ");
		n2 = sc.nextDouble();
		
		System.out.println("Primeiro Número: "+n1);
		System.out.println("Segundo Número: "+n2);
		
		if (n1>n2) {
			System.out.println("O maior número é: "+n1);
		}
		else if(n2>n1) {
			System.out.println("O maior Número é: "+n2);
		}
		else {
			System.out.println("Os números são iguais.");
		}
	
	}

}
