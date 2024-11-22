package br.edu.principal;

public class Principal {
    
    public static void main(String[] args) {
        int i, n_t, n1, n2, n3;
        n_t = 17;
        n1 = 2;
        n2 = 7;
        n3 = 3;
        System.out.print(n1+" ");
        System.out.print(n2+" ");
        System.out.print(n3+" ");
        i = 4;
        while (i!=n_t) {
            n1 *= 2;
            System.out.print(n1+" ");
            i ++;
            if (i!=n_t) {
                n2 *= 3;
                System.out.print(n2+" ");
                i ++;
                if (i!=n_t) {
                    n3 *= 4;
                    System.out.print(n3+" ");
                    i ++;
                }
            }
        }
        
    }
    
}