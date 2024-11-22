package br.edu.principal;

public class Principal {
    
    public static void main(String[] args) {
        double fim, x, exp, num, den, deno, fat, s;
        num = 4;
        x = 2;
        s = 0;
        den = 0;
        deno = 1;
        for (int i = 1;i <= num;i++) {
            fim = deno;
            fat = 1;
            for (int j = 1;j<=fim;j++) {
                fat *= j;
            }
            exp = i + 1;
            if (exp%2 == 0) {
                s = s - Math.pow(x,exp)/fat;
            }
            else {
                s = s + Math.pow(x,exp)/fat;
            }
            if (deno == 4) {
                den = -1;
            }
            if (deno == 1) {
                den = 1;
            }
            if (den == 1) {
                deno += 1;
            }
            else {
                deno -= 1;
            }
        }
        System.out.println(s);
        
    }
    
}