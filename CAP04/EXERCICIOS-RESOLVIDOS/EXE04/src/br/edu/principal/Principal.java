package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double n1, n2, n3;
		
		System.out.println("digite o Primeiro Número: ");
		n1 = sc.nextDouble();
		System.out.println("digite o segundo número: ");
		n2 = sc.nextDouble();
		System.out.println("digite o Terceiro Número: ");
		n3 = sc.nextDouble();
		
		if (n1<n2 & n1<n3 & n2<n3) {
			System.out.println("A ordem crescente é: "+n1+" - "+n2+" - "+n3);
		}
		else if(n1<n2 & n1<n3 & n3<n2) {
			System.out.println("A ordem crescente é: "+n1+" - "+n3+" - "+n2);
			}
		else if(n2<n1 & n2<n3 & n1<n3) {
			System.out.println("A ordem crescente é: "+n2+" - "+n1+" - "+n3);
		}
		else if(n2<n1 & n2<n3 & n3<n1) {
			System.out.println("A ordem crescente é: "+n2+" - "+n3+" - "+n1);
		}
		else if(n3<n1 & n3<n2 & n1<n2) {
			System.out.println("A ordem crescente é: "+n3+" - "+n1+" - "+n2);
		}
		else {
			System.out.println("A ordem crescente é: "+n3+" - "+n2+" - "+n1);
		}
	}

}
