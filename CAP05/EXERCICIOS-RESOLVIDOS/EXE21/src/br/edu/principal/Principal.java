package br.edu.principal;

public class Principal {

	public static void main(String[] args) {
		double cod_est, cod_carga, peso_toneladas, peso_quilos, pre_carga, imposto, valor_total;
		cod_est = 3;
		peso_toneladas = 77;
		cod_carga = 90;
		pre_carga = 8;
		imposto = 100;
		
		peso_quilos = peso_toneladas * 1000;
		
		System.out.println("Peso Quilos:" + peso_quilos);
		
		if(cod_carga >= 10 && cod_carga <= 20) {
			pre_carga = 100 * peso_quilos;
		}
		
		
		if(cod_carga >= 21 && cod_carga <= 30) {
			pre_carga = 250 * peso_quilos;
		}
		
		
		if(cod_carga >= 31 && cod_carga <= 40) {
			pre_carga = 340 * peso_quilos;
		}
		
		System.out.println(pre_carga);
		
		
		if(cod_est == 1) {
			imposto = 35/100 * pre_carga;
			
			
		}
		
		
		if(cod_est == 2) {
			imposto = 25/100 * pre_carga;
			
			
		}
		
		
		if(cod_est == 3) {
			imposto = 15/100 * pre_carga;
			
			
		}
		
		
		if(cod_est == 4) {
			imposto = 5/100 * pre_carga;
			
			
		}
		
		
		if(cod_est == 5) {
			imposto = 0;
			
			
		}
		
		System.out.println(imposto);
		
		valor_total = pre_carga + imposto;
		
		
	}

}
