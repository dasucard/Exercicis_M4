package Level2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Revisi�_Comanda {

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
				
					
				System.out.println();
					
				int	seguir=1;
				
				int i=0;
				
				System.out.println("Pedido de: ");
					
				while (seguir==1){
					
					String quiero = JOptionPane.showInputDialog("Escribe el plato que deseas, por favor: ");
					
					Cuenta.add(quiero);
					
					System.out.println(Cuenta.get(i));
					
					i++;
							
					seguir= Integer.parseInt(JOptionPane.showInputDialog("�Quieres seguir pidiendo? 1:Si / 0:No"));
					
				}
				
				System.out.println();
				 
				System.out.println("Recibo: ");
				
				try {
					
					int total=0;
					
					for (int j=0; j<Cuenta.size(); j++){
										
							for (String i1 : diccionari.keySet()){
									
								if (Cuenta.get(j).equalsIgnoreCase(i1)){
								   
								   total = total + diccionari.get(i1);	      
										
								}

									
						}
						
					} 
					
					System.out.println("El precio a pagar es de: " + total + "�");
					
					
				}catch (Exception e){
					
					System.out.println("Algo ha ido mal");
					
				}finally{
					
					System.out.println("Uno de los platos no esta en el men�");
					
				}

	}

}
