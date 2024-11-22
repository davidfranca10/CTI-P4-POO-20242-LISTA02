package br.edu.principal;

import java.util.Scanner;

public class Principal {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cod, num_vei, num_acid;
        int maior, cid_maior, menor, cid_menor;
        int media_vei, soma_vei, media_acid;
        int soma_acid, cont_acid;
        soma_vei = 0;
        soma_acid = 0;
        cont_acid = 0;
        maior = 0;
        menor = 0;
        cid_maior = 0;
        cid_menor = 0;
        
        for (int cont = 1; cont <= 5; cont ++) {
            System.out.print("codigo da cidade: ");
            cod = sc.nextInt();
            System.out.print("número de veiculos: ");
            num_vei = sc.nextInt();
            System.out.print("número de acidentes: ");
            num_acid = sc.nextInt();
            System.out.println();
            if (cont == 1) {
                maior = num_acid;
                cid_maior = cod;
                menor = num_acid;
                cid_menor = cod;
            }
            else {
                if (num_acid > maior) {
                    maior = num_acid;
                    cid_maior = cod;
                }
                else if (num_acid < menor) {
                    menor = num_acid;
                    cid_menor = cod;
                }
            }
            soma_vei += num_vei;
            if (num_vei < 2000) {
                soma_acid += num_acid;
                cont_acid += 1;
            }
        }
        System.out.println("maior número de acidentes: "+maior +"\ncodigo da cidade: "+cid_maior);
        System.out.println("menor número de acidentes: "+menor +"\ncodigo da cidade: "+cid_menor);
        media_vei = soma_vei/5;
        System.out.println("média de veiculos: "+media_vei);
        if (cont_acid == 0) {
            System.out.println("não foi digitado nenhuma cidade com menos de 2000 veiculos");
        }
        else {
            media_acid = soma_acid/cont_acid;
            System.out.println("média de acidentes "+media_acid);
        }
        
    }
    
}