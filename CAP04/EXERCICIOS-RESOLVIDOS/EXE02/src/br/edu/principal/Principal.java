package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double n1, n2, n3, media, nt_exa;
		
		System.out.println("digite a primeira nota: ");
		n1 = sc.nextDouble();
		System.out.println("digite a segunda nota: ");
		n2 = sc.nextDouble();
		System.out.println("Digite a terceira nota: ");
		n3 = sc.nextDouble();
		
		media = (n1+n2+n3)/3;
		
		System.out.println("Média aritmética: "+media);
		
		if(media >= 0 & media < 3) {
			System.out.println("Reprovado");
		} 
		else if(media >=3 & media<7) {
			System.out.println("Exame");
			nt_exa = 12 - media;
			System.out.println("Deve tirar nota "+nt_exa+" para ser aprovado.");
		}
		else if(media >=7 & media<=10) {
			System.out.println("Aprovado");
		}
		else {
			System.out.println("digite notas válidas, entre 0 a 10.");}
		
	}

}
