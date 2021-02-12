package Level2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Revisió_Comanda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaración Array de los platos.
		String Menú[] = new String[6];
						
		//Declaración Array de los precios de cada plato
		int Preu[] = new int[6];
				
		//HashMap
		HashMap<String, Integer> diccionari = new HashMap<String, Integer>();
				
		//Declaración de la Lista
		ArrayList<String>Cuenta=new ArrayList<String>(); 
				
		//Dades que el restaurant ha d'entrar per disenyar el menú.
		for (int i=0; i<6; i++){
					
			Scanner entrada  =new Scanner(System.in); //Lee la consola 
					
			System.out.println("Introduce plato, por favor");
					
			String plato= entrada.nextLine();
					
			System.out.println("Introduce precio, por favor");
					
			int precio= entrada.nextInt();
					
			//entrada.close();
					
			Preu[i]= precio; //Inicialización del segundo Array
					
			Menú[i]= plato;//Inicialización del primer Array
					
			diccionari.put(plato, precio);//Inicialización del HashMap.
					
			//System.out.println("Plato de " + plato + " añadido."); //me imprime el plato añadido.
					
		}

		//Mostra per consola els plats del menú afegits pel restaurant.
		for (int i=0;i<6;i++){
					
			System.out.println("plato " + (i+1) + " : " + Menú[i] + " " + Preu[i] +"€");
					
		}
				
					
		System.out.println();
				
		//El client ha d'escriure els plats que desitja consumir
		int	seguir=1; //Inicialitzo la variable a 1 per que entri en el bucle while.
				
		int total=0;
				
		System.out.println("Pedido de: ");
		
		//Cada cop que escrigui 1 surt una finestra per que continui amb la comanda, si escriu 0 surt del bucle. 										
		
		try{
			
			int j=0;
			
			
			while (seguir==1){	
											
								
				String quiero = JOptionPane.showInputDialog("Escribe el plato que deseas, por favor: ");
								
				Cuenta.add(quiero);
								
				
				for (String i1 : diccionari.keySet()){
											
					if (Cuenta.get(j).equalsIgnoreCase(i1)){
								
						total = total + diccionari.get(i1);	
						
						System.out.println(Cuenta.get(j));
									
											
					}

											
				}
								
				j++;
				
					
						
					seguir= Integer.parseInt(JOptionPane.showInputDialog("¿Quieres seguir pidiendo? 1:Si / 0:No"));

					
				
					if (seguir == 0){
						
						System.out.println("Fin del pedido");
					}
					
					else if (seguir !=0 && seguir !=1){
						
						throw new ArithmeticException("Numero mal tecleado.");
					}
				
						
			} 
					
			
		}catch (Exception e){
			
			System.out.println("Algo ha ido mal, vuelve a intentarlo");
		}finally {
			
			System.out.println();
		}
		

						 
		System.out.println("Recibo: ");		
				
		System.out.println("El precio a pagar es de: " + total + "€");
				



	}

}
