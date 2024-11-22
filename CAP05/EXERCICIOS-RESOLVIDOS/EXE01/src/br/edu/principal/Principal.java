package br.edu.principal;

public class Principal {
    
    public static void main(String[] args) {
        int ano_atual, i;
        double salario, novo_salario, percentual;
        
        ano_atual = 2024;
        salario = 300;
        percentual = 1.5/100;
        novo_salario = salario + percentual * salario;
        for (i=2007;i<=ano_atual; i++) {
            percentual = percentual * 2;
            novo_salario = novo_salario + percentual * novo_salario;
        }
        System.out.println("Salario atual: "+novo_salario);
    }
    
}