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
		
		/*Menú[0]= "Bandeja Paisa";
		
		Menú[1]= "Callos a la gallega";
		
		Menú[2]= "Fondue";
		
		Menú[3]= "Pizza";
		
		Menú[4]= "Raviolis de carne";
		
		Menú[5]= "Caracoles a la gormanda";*/
		
		
		//Array de los precios de cada plato
		int Preu[] = new int[6];
		
		/*Preu[0] = 12;
		
		Preu[1] = 7;
		
		Preu[2] = 15;
		
		Preu[3] = 8;
		
		Preu[4] = 10;
		
		Preu[5] = 20;*/
		
		System.out.println("Elíge plato: " );
		
		for (int i=1; i<Menú.length; i++){
			
			System.out.println(i + ". " + Menú[i]); //Platos para comer 
			
		}
		
		Scanner entrada=new Scanner(System.in); //Lee la consola 
		
		int plato=entrada.nextInt();//Guarda en la variable plato, el numero del plato escogido por el usuario.
		
		System.out.println("Has elegido : " + Menú[plato]); //me imprime el plato escogido.
		
      
		

	}

}
