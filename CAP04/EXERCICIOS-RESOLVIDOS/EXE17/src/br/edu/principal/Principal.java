package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		double a, b, c, delta, x1, x2;
		System.out.println("INSIRA O VALOR DE A");
		a = sc.nextDouble();
		System.out.println("INSIRA O VALOR DE B");
		b = sc.nextDouble();
		System.out.println("INSIRA O VALOR DE C");
		c = sc.nextDouble();
		
		if (a == 0) {
			System.out.println("ESTES VALORES NÃO FORMAM UMA EQUAÇÃO DE 2º GRAU");
			
		}
		else {
			delta = (b*b) - (4*a*c);
			if (delta < 0) {
				System.out.println("NÃO EXISTE RAIZ REAL");
			}
			if (delta == 0) {
				System.out.println("EXISTE UMA RAIZ REAL");
				x1 = (-b)/(2*a);
				System.out.println("A RAIZ É " + x1);
				
			}
			if (delta > 0) {
				System.out.println("EXISTEM DUAS RAÍZES REAIS");
				x1 = (-b + Math.sqrt(delta))/(2*a);
				x2 = (-b - Math.sqrt(delta))/(2*a);
				System.out.println("A 1ª RAIZ É " + x1);
				System.out.println("A 2ª RAIZ É " + x2);
				
			}
			
			
			
		}
		
		
	}

}
