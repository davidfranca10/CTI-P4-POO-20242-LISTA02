package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double angulo, voltas;
		System.out.println("Digite ângulo: ");
		angulo = sc.nextDouble();
		if (angulo > 360 | angulo < -360) {
			voltas = angulo/360;
			angulo = angulo%360;
		}
		else {
			voltas = 0;
		}
		if (angulo == 0 | angulo == 90 | angulo == 180 | angulo == 270 | angulo == 360 | angulo == -90 | angulo == -180 | angulo == -270 | angulo == -360) {
			System.out.println("Está em cima de algum dos eixos.");
		}
		else if ((angulo>0 & angulo <90) | (angulo<-270 & angulo>-360)) {
			System.out.println("Está no primeiro quadrante");
		}
		else if ((angulo>90 & angulo <180) | (angulo<-180 & angulo>-270)) {
			System.out.println("Está no segundo quadrante");
		}
		else if ((angulo>180 & angulo <270) | (angulo<-90 & angulo>-180)) {
			System.out.println("Está no terceiro quadrante");
		}
		else if ((angulo>270 & angulo <360) | (angulo<0 & angulo>-90)) {
			System.out.println("Está no quarto quadrante");
		}
		
		if (angulo < 0) {
			System.out.println(voltas+" volta(s) no sentido horário");
		}
		else {
			System.out.println(voltas+" volta(s) no sentido anti-horário");
		}
	}

}
