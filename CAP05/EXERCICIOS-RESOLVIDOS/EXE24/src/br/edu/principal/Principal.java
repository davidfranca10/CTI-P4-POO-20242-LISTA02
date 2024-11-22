package br.edu.principal;

public class Principal {

    public static void main(String[] args) {
      double pre, valor_adc, imposto;
      double pre_custo, desconto, novo_pre;
      
      final char tipo, refrig;
     valor_adc = 8;
      pre = 800;
      tipo = 'V';
      refrig = 'S';
      
      if(refrig == 'S') {
    	  if(tipo == 'A') {
    		  if(pre <  15) {
    			  valor_adc = 2;
    		  } else {
    			  valor_adc = 5;
    		  }
    		  
    		  if(tipo == 'L') {
    			  if(pre < 10) {
    				  valor_adc = 1.50;
    			  } else {
    				  valor_adc = 2.50;
    			  }
    		  }
    		  
    		 if(tipo == 'V') {
    			 if(pre < 30) {
    				 valor_adc = 3;
    			 } else {
    				 valor_adc = 2.5;
    			 }
    			 
    		 }
    	  }
    	  
    	  
      } else {
    	  if(tipo == 'A') {
    		  valor_adc = 8;
    	  }
    	  
    	  if(tipo == 'L') {
    		  valor_adc = 0;
    	  }
    	  
    	  if(tipo == 'V') {
    		  valor_adc = 0;
    	  }
    	  
    	  
    			  
    	  
      }
      
      System.out.println("Valor Adicional: " + valor_adc);
      
      if(pre < 25) {
    	  imposto = 5/100 * pre;
      } else {
    	  imposto = 8/100 * pre;
      }
      
      System.out.println("Imposto: " + imposto);
      
      pre_custo = pre + imposto;
      
      System.out.println("Preço Custo: " + pre_custo );
      
      if(tipo != 'A' && refrig != 'S') {
    	  desconto = 3/100 * pre_custo;
    	  
      } else {
    	  desconto = 0;
      }
      
      System.out.println("Desconto: " + desconto);
      
      novo_pre = pre_custo + valor_adc - desconto;
      
      System.out.println("Novo Preço: " + novo_pre);
      
     if(novo_pre <= 50) {
    	 System.out.println("Barato");
    	 
     } else if(novo_pre < 100) {
		 System.out.println("Normal");
	 } else {
		 System.out.println("Caro");
	 }
    	  
    	  
      
      
    
}

}
