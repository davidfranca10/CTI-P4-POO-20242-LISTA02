package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("digite um número: ");
		int n1 = sc.nextInt();
		
		if(n1 % 2 == 0){
			System.out.println("O número "+n1+" é par ");
		}
		else {
			System.out.println("O número "+n1+" é ímpar ");
		}
	}

}
