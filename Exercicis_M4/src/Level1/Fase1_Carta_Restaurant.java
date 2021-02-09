package Level1;

import java.util.Scanner;

public class Fase1_Carta_Restaurant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//billetes desde 5€ hasta 500€.
		int billets = 5;
		
		int billets2 = 10;
		
		int billets3 = 20;
		
		int billets4 = 50;
		
		int billets5 = 100;
		
		int billets6 = 200;
		
		int billets7 = 500;
				
		//Precio total de la comida.
		int Preu_Total = 0; 
		

		//Array de los platos.
		String Menú[] = new String[6];
		
		
		//Array de los precios de cada plato
		int Preu[] = new int[7];
		
		/*Preu[0] = 5; los comento porque son valores de prueba
		
		Preu[1] = 5;
		
		Preu[2] = 5;
		
		Preu[3] = 2;
		
		Preu[4] = 1;
		
		Preu[5] = 4;
		
		Preu[6] = 2;*/
	
	
		for (int i=0; i<Preu.length; i++){
			
			Preu_Total = Preu_Total + Preu[i];
	
		}
		
		//billets amb que el client ha de pagar.
		if (Preu_Total<=5){
			
			System.out.println("Se aceptan billetes de  " + billets + " €" );
			
			System.out.println("Cambio : " + (billets - Preu_Total));
			
			
		}
		
		else if (Preu_Total>=5 && Preu_Total<=10){
			
			System.out.println("Se aceptan billetes de  " + billets2 + " €" );
			
			System.out.println("Cambio : " + (billets2 - Preu_Total));
			
		}
		
		else if (Preu_Total>=10 && Preu_Total<=20) {
			
				
			System.out.println("Se aceptan billetes de  " + billets3 + " €" );
				
			System.out.println("Cambio : " + (billets3 - Preu_Total));
			
			
		}
		else if (Preu_Total>=20 && Preu_Total<=50) {

			System.out.println("Se aceptan billetes de  " + billets4 + " €" );
			
			System.out.println("Cambio : " + (billets4 - Preu_Total));
		}
		
		else if (Preu_Total>=50 && Preu_Total<=100) {

			System.out.println("Se aceptan billetes de  " + billets5 + " €" );
			
			System.out.println("Cambio : " + (billets5 - Preu_Total));
		}
		
		else if (Preu_Total>=100 && Preu_Total<=200) {

			System.out.println("Se aceptan billetes de  " + billets6 + " €" );
			
			System.out.println("Cambio : " + (billets6 - Preu_Total));
		}
		
		else if (Preu_Total>=200 && Preu_Total<=500) {

			System.out.println("Se aceptan billetes de  " + billets7 + " €" );
			
			System.out.println("Cambio : " + (billets7 - Preu_Total));
		}
		

	}

}
