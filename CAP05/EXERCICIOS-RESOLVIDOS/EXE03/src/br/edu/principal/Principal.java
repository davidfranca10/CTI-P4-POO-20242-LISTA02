package br.edu.principal;

import java.util.Scanner;

public class Principal {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double fat;
        int n, num;
        System.out.print("N: ");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print("Number"+i+": ");
            num = sc.nextInt();
            fat = 1;
            for (int j = 1; j <= num; j++) {
                fat = fat * j;
            }
            System.out.println(fat);
        }
        
        
    }
    
}