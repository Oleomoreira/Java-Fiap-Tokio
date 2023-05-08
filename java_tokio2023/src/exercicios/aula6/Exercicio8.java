package exercicios.aula6;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
			
		 Scanner sc =  new Scanner (System.in);
		 
		 System.out.println("Digite a distância percorrida: ");
		 double distancia =sc.nextDouble();
		 
		 System.out.println("Digite o tanto de litros de combustivel gasto: ");
		 double Litros = sc.nextDouble();
		 
		 double consumo =  distancia/Litros;
		 
		 if (consumo <8) {
			 System.out.println("Esse carro bebe hein!");
		 }else {
			 System.out.println("Autonomia legal");
		 }

	}

}
