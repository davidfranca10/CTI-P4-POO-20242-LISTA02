package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double n1, n2, n3, média;
		
		System.out.println("digite a nota do Trabalho de laboratório: ");
		n1 = sc.nextDouble();
		System.out.println("digite a nota da Avaliação Semestral: ");
		n2 = sc.nextDouble();
		System.out.println("digite a nota do Exame Final: ");
		n3 = sc.nextDouble();
		
		média =(n1*2+n2*3+n3*5)/10;
		
		System.out.println("Média ponderada: "+média);
		
		if (média >= 8 & média <=10) {
			System.out.println("Obteve conceito A");
		} 
		else if(média >= 7 & média <8) {
			System.out.println("Obteve conceito B");
		}  
		else if(média >= 6 & média <7) {
			System.out.println("Obteve conceito C");
		}  
		else if(média >= 5 & média <6) {
			System.out.println("Obteve conceito D");
		}  
		else if (média >= 0 & média <5) {
			System.out.println("Obteve conceito E");
		} 
		else {
			System.out.println("digite notas válidas, entre 0 a 10.");
		}

	}

}
