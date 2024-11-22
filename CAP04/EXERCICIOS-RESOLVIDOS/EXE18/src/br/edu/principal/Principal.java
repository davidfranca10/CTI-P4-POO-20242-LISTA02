package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		double x = 0, y = 0, z = 0;
		System.out.println("Insira os valores dos lados X, Y e Z de um triângulo");
		System.out.println("X...");
		x = sc.nextDouble();
		System.out.println("Y...");
		y = sc.nextDouble();
		System.out.println("Z...");
		z = sc.nextDouble();
		
		if ((x < y + z) && (y < x + z) && (z < y + x)) {
			if ((x==y) && (x == z)) {
				System.out.println("Triângulo Equilátero");

			} else if (x == y || x == z || y == z) {
				System.out.println("Triângulo Isósceles");
			} else if (x != y || x != z || y != z) {
				System.out.println("Triângulo Escaleno");
			}
			
			
		}
		else {
			System.out.println("ESSAS MEDIDAS NÃO FORMAM UM TRIÂNGULO");
		}
		
		
		
		
		
	}

}
