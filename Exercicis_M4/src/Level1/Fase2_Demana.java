package Level1;

import java.util.*;

public class Fase2_Demana {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaraci�n Array de los platos.
		String Men�[] = new String[6];
				
		//Declaraci�n Array de los precios de cada plato
		int Preu[] = new int[6];
		
		//HashMap
		HashMap<String, Integer> diccionari = new HashMap<String, Integer>();
		
		//Declaraci�n de la Lista
		ArrayList<String>Cuenta=new ArrayList<String>(); 
		
		for (int i=0; i<6; i++){
			
			Scanner entrada  =new Scanner(System.in); //Lee la consola 
			
			System.out.println("Introduce plato, por favor");
			
			String plato= entrada.nextLine();
			
			System.out.println("Introduce precio, por favor");
			
			int precio= entrada.nextInt();
			
			//entrada.close();
			
			Preu[i]= precio; //Inicializaci�n del segundo Array
			
			Men�[i]= plato;//Inicializaci�n del primer Array
			
			diccionari.put(plato, precio);//Inicializaci�n del HashMap.
			
			//System.out.println("Plato de " + plato + " a�adido."); //me imprime el plato a�adido.
			
		}

		//Muestra en consola los platos del men� a�adidos por el restaurante.
		for (int i=0;i<6;i++){
			
			System.out.println("plato " + (i+1) + " : " + Men�[i] + " " + Preu[i] +"�");
			
		}
		
		System.out.println("Introduce plato que deseas comer, por favor");
		
		Scanner entrada  =new Scanner(System.in);
		
		String quiero= entrada.nextLine();
		
		/*System.out.println("�Quieres seguir pidiendo? 1:Si / 0:No");
		
		int seguir= entrada.nextInt();*/
		
		for (int i=0 ; i<Cuenta.size(); i++){
			
			while (quiero == Men�[i]){
				
				Cuenta.add(quiero);
			
			}
				
		}
		
		System.out.println(Cuenta);
		
		
				 
	}

}
