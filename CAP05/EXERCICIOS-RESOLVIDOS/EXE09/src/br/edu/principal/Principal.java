package br.edu.principal;

public class Principal {
    
    public static void main(String[] args) {
        double cont, n1, n2, media, ta, te, tr;
        double media_class, total_class;
        total_class = 0;
        ta = 0;
        te = 0;
        tr = 0;
        for (cont=1;cont<=6;cont ++) {
            n1 = 4 + cont;
            n2 = 2 + cont;
            media = (n1+n2)/2;
            System.out.print("média: "+media+" - ");
            if (media<=3) {
                tr += 1;
                System.out.print("reprovado\n");
            }
            else if (media>3 & media<7) {
                te += 1;
                System.out.print("exame\n");
            }
            else if (media >= 7) {
                ta += 1;
                System.out.print("aprovado\n");
            }
            total_class += media;
        }
        System.out.println("tr: "+tr);
        System.out.println("te: "+te);
        System.out.println("ta: "+ta);
        media_class = total_class/6;
        System.out.println("média da classe: "+media_class);
        
    }
    
}