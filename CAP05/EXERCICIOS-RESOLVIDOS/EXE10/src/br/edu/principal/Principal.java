package br.edu.principal;

public class Principal {
    
    public static void main(String[] args) {
        double cont_t, cont_j, idade;
        double peso, alt, qtde, media_i, media_alt, porc, tot80;
        qtde = 0;
        tot80 = 0;
        media_alt = 0;
        for (cont_t = 1;cont_t<= 5; cont_t ++) {
            media_i = 0;
            for (cont_j = 1;cont_j<= 11;cont_j ++) {
                idade = 17;
                peso = cont_j*cont_t + 50;
                alt = (160 + 4 * cont_j)/100;
                if (idade<18) {
                    qtde += 1;
                    media_i += idade;
                    media_alt += alt;
                }
                if (peso > 80) {
                    tot80 += 1;
                }
                
            }
            media_i = media_i/11;
            System.out.println("média idade: "+media_i);
        }
        System.out.println("qtde: "+qtde);
        media_alt = media_alt/55;
        System.out.println("média altura: "+media_alt);
        porc = tot80 * 100/55;
        System.out.println("porc: "+porc);
        
    }
    
}