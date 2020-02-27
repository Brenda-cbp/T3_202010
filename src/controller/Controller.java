package controller;

import java.util.Scanner;

import model.logic.Cronometro;
import model.logic.Modelo;
import view.View;

public class Controller {

	/* Instancia del Modelo*/
	private Modelo modelo;
	
	/* Instancia de la Vista*/
	private View view;
	
	/**
	 * Crear la vista y el modelo del proyecto
	 * @param capacidad tamaNo  inicial del arreglo
	 */
	public Controller ()
	{
		view = new View();
		modelo = new Modelo();
		view.imprimirResultadosCarga(modelo.darTamano(), modelo.get(0), modelo.get(modelo.darTamano()-1));//,modelo.darZonaMinimax());
		
	}
	public void ordenarMerge()
	{
		Cronometro c1 = new Cronometro();
		Comparable[] arreglo = modelo.ordenarMerge(c1);
		double tiempo = c1.darTiempo();
		view.imprimirOrdenar("Merge ", tiempo, arreglo);
		System.out.println("Merge "+ tiempo);
	}
	public void ordenarQuick()
	{
		Cronometro c1 = new Cronometro();
		Comparable[] arreglo = modelo.ordenarQuick(c1);
		double tiempo = c1.darTiempo();
		view.imprimirOrdenar("Quick ", tiempo, arreglo);
		System.out.println("Quick "+ tiempo);
	}
	public void ordenarShell()
	{
		Cronometro c1 = new Cronometro();
		Comparable[] arreglo = modelo.ordenarShell(c1);
		double tiempo = c1.darTiempo();
		view.imprimirOrdenar("Quick ", tiempo, arreglo);
		System.out.println("Quick "+ tiempo);
	}
	public void run() 
	{
		Scanner lector = new Scanner(System.in);
		boolean fin = false;
		String dato = "";
		String respuesta = "";

		while( !fin ){
			view.printMenu();

			int option = lector.nextInt();
			switch(option){
				case 1:
					view.printMessage("--------- \n ordenar Shell ");
					ordenarShell();
				    break;

				case 2:
					view.printMessage("--------- \nOrdenar por Merge ");
					ordenarMerge();					
					break;

				case 3:
					view.printMessage("--------- \nOrdenar por Quick ");
					ordenarQuick();					
					break;
				case 4: 
					view.printMessage("--------- \n Hasta pronto !! \n---------"); 
					lector.close();
					fin = true;
					break;	

				default: 
					view.printMessage("--------- \n Opcion Invalida !! \n---------");
					break;
			}
		}
		
	}	
}
