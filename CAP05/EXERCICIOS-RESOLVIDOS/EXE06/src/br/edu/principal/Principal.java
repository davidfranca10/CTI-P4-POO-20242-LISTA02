package br.edu.principal;

import java.util.Scanner;

public class Principal {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double cod, nht, valor, sal_m, sal_i, aux, sal_f;
        String turno, categoria;
        sal_m = 450;
        for (int cont = 1; cont <= 10; cont++) {
            System.out.print("codigo: ");
            cod = sc.nextDouble();
            System.out.print("nht: ");
            nht = sc.nextDouble();
            System.out.print("turno: ");
            turno = sc.next();
            System.out.print("categoria: ");
            categoria = sc.next();
            while (turno.equalsIgnoreCase("M") & turno.equalsIgnoreCase("v") & turno.equalsIgnoreCase("N")) {
            	System.out.print("turno: ");
                turno = sc.next();
            }
            while (categoria.equalsIgnoreCase("G") & categoria.equalsIgnoreCase("O")) {
            	System.out.print("categoria: ");
                categoria = sc.next();
            }
            if (categoria == "G") {
                if (turno == "N") {
                    valor = sal_m * 18/100;
                }
                else {
                    valor = sal_m * 15/100;
                }
            }
            else {
                if (turno == "N") {
                    valor = sal_m * 13/100;
                }
                else {
                    valor = sal_m *10/100;
                }
            }
            sal_i = nht * valor;
            if (sal_i <= 300) {
                aux = sal_i * 20/100;
            }
            else {
                if (sal_i < 600) {
                    aux = sal_i * 15/100;
                }
                else {
                    aux = sal_i * 5/100;
                }
            }
            sal_f = sal_i + aux;
            System.out.println("codigo: "+cod);
            System.out.println("nht: "+nht);
            System.out.println("valor: "+valor);
            System.out.println("salário inicial: "+sal_i);
            System.out.println("auxilios: "+aux);
            System.out.println("salário final: "+sal_f);
        }
        
    }
    
}