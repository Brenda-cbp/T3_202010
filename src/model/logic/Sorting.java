package model.logic;
/**
 * Clase que organiza un arreglo de objetos Comparables que llega por parametro
 * @author andre
 *
 */
public class Sorting 
{
	/**
	 * Arreglo auxiliar para ordenamiento
	 */
	private static Comparable[] aux;
	public Sorting()
	{
	}
	/**
	 * Organiza el arreglo que llega por parametro usando merge sorting, es el que llama
	 * la clase principal
	 * @param principal arreglo a ordenar
	 */
	public static void mergeSort(Comparable[] principal)
	{
		aux = new Comparable[principal.length];
		mergeSort(0, principal .length-1, principal);
	}
	/**
	 * Organiza el arreglo que llega por parametro de manera recursiva (MergeSorting)
	 * @param lo indice del elemento donde inicia el ordenamiento
	 * @param hi indice del elemento donde termina el ordenamiento
	 * @param arr arreglo a terminar
	 */
	public  static void mergeSort(int low, int hi, Comparable[] arr)
	{
		if(low >= hi)
			return;
		int mid = (low + hi)/2;
		mergeSort(low, mid, arr);
		mergeSort(mid + 1, hi, arr);
		merge(arr, low, hi, mid);
	}
	/**
	 * Combina de manera ordenada dos subarreglos ordenados disyuntos
	 * @param arr arreglo que contiene los arreglos disyuntos
	 * @param lo primer elemento del subarreglo 1
	 * @param hi ultimo elemento del sub arreglo 2
	 * @param mid donde termina el subarreglo 1 
	 */
	public  static void merge(Comparable[] arr, int low, int hi, int mid)
	{
		//Tomado de las presentaciones en sicua (Slides clase 9)
		int i = low;
		int j = mid + 1;
		for (int k = low; k <= hi; k++) {
			aux[k] = arr[k];
		}
		for (int k = low; k <= hi; k++) {
			if (i > mid)
				arr[k] = aux[j++];
			else if (j > hi)
				arr[k] = aux[i++];
			else if ((aux[j].compareTo(aux[i])) <= 0)
				arr[k] = aux[j++];
			else
				arr[k] = aux[i++]; 	
		}
	}
	/**
	 * Organiza el arreglo que llega por parametro usando quick sorting
	 * @param principal arreglo a ordenar
	 */
	public static void quickSort(Comparable[] principal)
	{

	}
	/**
	 * Organiza el arreglo que llega por parametro usando shell sorting
	 * @param principal arreglo a ordenar
	 */
	public static void shellSort(Comparable[] principal)
	{

	}
	/**
	 * Intercambia la posicion en el arreglo de los dos elementos que entran por parametro
	 * @param arr arreglo en el que estan los elementos
	 * @param a indice del primer elemento
	 * @param b indice del segundo elemento
	 */
	public static void exchange(Comparable[] arr, int a, int b)
	{
		Comparable E = arr[a];
		arr[a] = arr[b];
		arr[b] = E;
	}
}
