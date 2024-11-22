package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double sal, amt, nv_sal, crg;
		System.out.println("Digite o cargo do funcionário (1, 2, 3, 4 ou 5): ");
		crg = sc.nextInt();
		System.out.println("Digite o valor do salário: ");
		sal = sc.nextInt();
		if(crg==1) {
			System.out.println("O cargo é Escriturário");
			amt = sal*50/100;
			System.out.println("O valor do aumento é: "+amt);
			nv_sal = sal+amt;
			System.out.println("O novo salário é: "+nv_sal);
		}
		else if(crg==2) {
			System.out.println("O cargo é Secretário");
			amt = sal*35/100;
			System.out.println("O valor do aumento é: "+amt);
			nv_sal = sal+amt;
			System.out.println("O novo salário é: "+nv_sal);
}
		else if(crg==3) {
			System.out.println("O cargo é Caixa");
			amt = sal*20/100;
			System.out.println("O valor do aumento é: "+amt);
			nv_sal = sal+amt;
			System.out.println("O novo salário é: "+nv_sal);
}
		else if(crg==4) {
			System.out.println("O cargo é Gerente");
			amt = sal*10/100;
			System.out.println("O valor do aumento é: "+amt);
			nv_sal = sal+amt;
			System.out.println("O novo salário é: "+nv_sal);}
		else if(crg==5) {
			System.out.println("O cargo é Diretor");
			amt = sal*0/100;
			System.out.println("O valor do aumento é: "+amt);
			nv_sal = sal+amt;
			System.out.println("O novo salário é: "+nv_sal);
			}
		else {
			System.out.println("Cargo Inexistente!");
		}
}
}