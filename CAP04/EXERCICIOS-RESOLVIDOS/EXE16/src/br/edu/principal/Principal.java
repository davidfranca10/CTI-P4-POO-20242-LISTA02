package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		double pre, venda, novo_pre = 0;
		
		System.out.println("INSIRA O PREÇO ATUAL DO PRODUTO");
		pre = sc.nextDouble();
		System.out.println("INSIRA A VENDA MÉDIA MENSAL");
		venda = sc.nextDouble();
		
		if(venda<500 || pre<30) {
			novo_pre = pre + 10.0/100.0*pre;
		} else if ((venda>=500 && venda <1200) || (pre>=30 && pre<80)) {
			novo_pre = pre + 15.0/100.0*pre;
		} else if (venda>=1200 || pre >=80) {
			novo_pre = pre - 20.0/100.0*pre;
		}
		
		System.out.println("NOVO PREÇO É " + novo_pre);
		
		
	}

}
