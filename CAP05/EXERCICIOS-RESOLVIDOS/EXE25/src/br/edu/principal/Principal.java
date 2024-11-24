package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double preco, imp, transp=0, seguro, fin, total_imp=0, origem;
		char meio_t = ' ', carga = ' ';
		
		System.out.println("Preço (0 para encerrar) : ");
		preco = sc.nextDouble();
		while (preco>0) {
			System.out.println("País de origem: ");
			System.out.println("1 - EUA | 2 - México | 3 - outros");
			origem = sc.nextDouble();
			System.out.println("Meio de transporte: ");
			System.out.println("T - terrestre | F - fluvial | A - aéreo");
			meio_t = sc.next().charAt(0);
			System.out.println("Carga perigosa?: (S/N)");
			carga = sc.next().charAt(0);
			if (preco<=100) {
				imp = preco *(5/100);
			}
			else {
				imp = preco *(10/100);
			}
			if(carga == 'S') {
				if(origem == 1) {
					transp = 50;
				}
				else if(origem == 2) {
					transp = 21;
				}
				else if(origem == 3) {
					transp = 24;
				}
			}
			if (carga == 'N') {
				if(origem == 1) {
					transp = 12;
				}
				else if(origem ==2) {
					transp = 21;
				}
				else if(origem == 3) {
					transp = 60;
				}
			}
			if (origem == 2 | meio_t == 'A') {
				seguro = preco/2;
			}
			else {
				seguro = 0;
			}
			fin = preco + imp + transp + seguro;
			total_imp = total_imp + imp;
			System.out.println("impostp: "+imp);
			System.out.println("transporte : "+transp);
			System.out.println("seguro: "+seguro);
			System.out.println("final: "+fin);
			System.out.println("preço (0 para encerrar): ");
			preco = sc.nextDouble();
			}
		System.out.println("Total de impostos: "+total_imp);
	}

}
