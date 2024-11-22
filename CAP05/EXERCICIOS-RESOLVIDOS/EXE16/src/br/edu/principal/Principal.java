package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double base=0, altura=0, área=0;
		while(base<=0) {
			System.out.println("digite a base: ");
			base = sc.nextDouble();		
			
		}
		while(altura<=0) {
			System.out.println("digite a altura: ");
			altura = sc.nextDouble();
			
		}
	
		área = base * altura/2;
		System.out.println("A área total é: "+ área);
		
	}

}
