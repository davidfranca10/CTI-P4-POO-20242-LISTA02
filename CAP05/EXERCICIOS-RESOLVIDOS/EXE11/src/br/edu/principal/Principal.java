package br.edu.principal;

public class Principal {
    
    public static void main(String[] args) {
        double i, num, qtde;
        num = 17;
        qtde = 0;
        for (i=1;i<=num;i++) {
            if (num%i==0) {
                qtde+=1;
            }
        }
        if (qtde > 2) {
            System.out.print("O número não é primo");
        }
        else {
            System.out.print("O número é primo");
        }
        
    }
    
}