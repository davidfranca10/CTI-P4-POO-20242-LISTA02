package br.edu.principal;

public class Principal {

    public static void main(String[] args) {
      double angulo, voltas;
      
      
      angulo = 17;
      
      if(angulo > 360 || angulo < -360) {
    	  voltas = (int) (angulo/360);
    	  angulo = angulo % 360;
      } else {
    	  voltas = 0;
      }
      
      if (angulo == 0 || angulo == 90 || angulo == 180 || angulo == 270 || angulo == 360 || angulo == -90 || angulo == -180 || angulo == -270 || angulo == -360) {
    	    
    	  System.out.println("Está em cima de algum dos eixos");
    	}
      
      if((angulo > 0 && angulo < 90) || (angulo < -270 && angulo > -360)) {
	  System.out.println("1º Quadrante");
      }
      
	 if((angulo > 90 && angulo < 180) || (angulo < -180 && angulo > -270)) {
		  System.out.println("2º Quadrante");
	      }
	 if((angulo > 180 && angulo < 270) || (angulo < -90 && angulo > -180)) {
		  System.out.println("3º Quadrante");
     }
	 
	 if((angulo > 270 && angulo < 360) || (angulo < 0 && angulo > -900)) {
		  System.out.println("4º Quadrante");
     }
	 
	 
	  System.out.println(voltas + ":  volta(s) no sentido");
	  
	  if(angulo < 0) {
		  System.out.print("horário");
		 
	  } else {
		  System.out.print("anti-horário");
	  }

      
      
    
 }

}
