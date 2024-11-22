package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double n1, n2, n3, n4;
		System.out.println("Digite três números em ordem crescente");
		System.out.println("digite o Primeiro Número: ");
		n1 = sc.nextDouble();
		System.out.println("digite o segundo número: ");
		n2 = sc.nextDouble();
		System.out.println("digite o Terceiro Número: ");
		n3 = sc.nextDouble();
		
		if (!(n1<n2 & n1<n3 & n2<n3)) {
			System.out.println("ERROR: Os números não estão em ordem crescente ");
			return;
		}
		System.out.println("digite o Quarto Número (fora da ordem): ");
		n4 = sc.nextDouble();
		
		if(n4>n3) {
			System.out.println("A ordem decrescente é: "+n4+" - "+n3+" - "+n2+" - "+n1);
			}
		else if(n4>n2 & n4<n3) {
			System.out.println("A ordem decrescente é: "+n3+" - "+n4+" - "+n2+" - "+n1);
		}
		else if(n4>n1 & n4<n2) {
			System.out.println("A ordem decrescente é: "+n3+" - "+n2+" - "+n4+" - "+n1);
		}
		else {
			System.out.println("A ordem decrescente é: "+n3+" - "+n2+" - "+n1+" - "+n4);
		}
	}

}
