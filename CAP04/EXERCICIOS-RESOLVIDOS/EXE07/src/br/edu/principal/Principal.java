package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double A, B, C;
		System.out.println("digite um valor para A: ");
		A = sc.nextDouble();
		System.out.println("digite um valor para B: ");
		B = sc.nextDouble();
		System.out.println("digite um valor para C: ");
		C = sc.nextDouble();
		System.out.println("digite um valor para I (1, 2 ou 3): ");
		int I = sc.nextInt();
		
		if (I==1) {
			if (A<B & A<C & B<C) {
				System.out.println("A ordem crescente é: "+A+" - "+B+" - "+C);
			}
			else if(A<B & A<C & C<B) {
				System.out.println("A ordem crescente é: "+A+" - "+C+" - "+B);
				}
			else if(B<A & B<C & A<C) {
				System.out.println("A ordem crescente é: "+B+" - "+A+" - "+B);
			}
			else if(B<A & B<C & C<A) {
				System.out.println("A ordem crescente é: "+B+" - "+C+" - "+A);
			}
			else if(C<A & C<B & A<B) {
				System.out.println("A ordem crescente é: "+C+" - "+A+" - "+B);
			}
			else {
				System.out.println("A ordem crescente é: "+C+" - "+B+" - "+A);
			}
		}
		else if(I==2) {
			if (A>B & A>C & B>C) {
				System.out.println("A ordem decrescente é: "+A+" - "+B+" - "+C);
			}
			else if(A>B & A>C & C>B) {
				System.out.println("A ordem decrescente é: "+A+" - "+C+" - "+B);
				}
			else if(B>A & B>C & A>C) {
				System.out.println("A ordem decrescente é: "+B+" - "+A+" - "+B);
			}
			else if(B>A & B>C & C>A) {
				System.out.println("A ordem decrescente é: "+B+" - "+C+" - "+A);
			}
			else if(C>A & C>B & A>B) {
				System.out.println("A ordem decrescente é: "+C+" - "+A+" - "+B);
			}
			else {
				System.out.println("A ordem decrescente é: "+C+" - "+B+" - "+A);
			}
		}
		else if(I==3) {
			if(A>B & A>C) {
				System.out.println("A ordem desejada é: "+B+" - "+A+" - "+C);
			}
			else if(B>A & B>C) {
				System.out.println("A ordem desejada é: "+A+" - "+B+" - "+C);
				}
			else if(C>A & C>B) {
				System.out.println("A ordem desejada é: "+A+" - "+C+" - "+B);}
		}
		else {
			System.out.println("Opção inválida, tente novamente (1, 2 e 3)!!");
		}
	}

}
