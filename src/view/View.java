package view;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import model.logic.Comparendo;
import model.logic.Modelo;

public class View 
{
	    /**
	     * Metodo constructor
	     */
	    public View()
	    {
	    	
	    }
	    
		public void printMenu()
		{
			System.out.println("1. Crear Arreglo Dinamico de Strings");
			System.out.println("2. Agregar String");
			System.out.println("3. Buscar String");
			System.out.println("4. Eliminar String");
			System.out.println("5. Imprimir el Arreglo");
			System.out.println("6. Exit");
			System.out.println("Dar el numero de opcion a resolver, luego oprimir tecla Return: (e.g., 1):");
		}

		public void printMessage(String mensaje) {

			System.out.println(mensaje);
		}		
		/**
		 * Imprime los resultados tras haber cargado los comparendos a la lista
		 */
		public void imprimirResultadosCarga(int tamaño, Comparendo primero, Comparendo ultimo)//, double[] minimax)
		{
			System.out.println("Total comparendos: " +  tamaño);
			System.out.println();
			System.out.println("Primer comparendo:");
			System.out.println();
			System.out.println(primero);
			System.out.println();
			System.out.println("Ultimo Comparendo:");
			System.out.println();
			System.out.println(ultimo);
			System.out.println();
			//System.out.println("Zona minimax:" );
			//System.out.println("(" + minimax[0] + "," + minimax[1] + ") (" + minimax[2] + "," + minimax[3] + ")");


		}
		public void imprimirOrdenar(String metodo, double tiempo, Comparable[] arreglo)
		{
			System.out.println();
			System.out.println(metodo + ":");
			System.out.println("Tiempo Transcurrido:" + tiempo);
			System.out.println("Primeros 10:");
			System.out.println();
			for(int i = 0; i < 10;i++)
			{
				System.out.println(arreglo[i]);
				System.out.println();
			}
			System.out.println("Ultimos 10:");
			System.out.println();
			for(int i = arreglo.length -1; i > arreglo.length - 11; i--)
			{
				System.out.println(arreglo[i]);
				System.out.println();
			}
		}
		public int opcionesDeOrdenamiento()
		{
			int opc = 0;
			try 
			{
				System.out.println("Ingrese la opcion a realizar:");
				System.out.println("1. Shell Sorting");
				System.out.println("2. Merge sorting");
				System.out.println("3. Quick sorting");
				opc = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
				if(opc >3 || opc < 1)
					opcionesDeOrdenamiento();
			}
			catch(Exception e)
			{
				opcionesDeOrdenamiento();
			}
			return opc;
		}
		public void printModelo(Modelo modelo)
		{
			// TODO implementar
		}
}
