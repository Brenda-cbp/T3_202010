package test.logic;

import model.logic.Sorting;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestSorting {

	private Sorting <Integer>sort; 
	private Comparable[] ascendente;
	private Comparable[] descendente;
	private Comparable[] aleatorio;
	private static int CAPACIDAD =100;


	@Before 
	public void setUp1 () {
		sort= new Sorting<Integer>(); 
	}
	/**
	 * Arreglo de datos ordenados ascendentemente
	 */
	public void setUp2() {
		ascendente=new Comparable[CAPACIDAD];
		for(int i =0; i< CAPACIDAD;i++){
			ascendente[i]=i;
		}

	}
	/**
	 * Arreglo de datos ordenados descendentemente
	 */
	public void setUp3() {
		descendente=new Comparable[CAPACIDAD];
		for (int i= CAPACIDAD-1; i>=0;i--) {
			descendente[i]=i;
		}
	}
	/**
	 * Arreglo de n�meros ordenados aleatoriamente 
	 */
	public void setUp4() {
		aleatorio=new Comparable[CAPACIDAD];
		for (int i= 0; i<CAPACIDAD;i++) {
			aleatorio[i]=(int)(Math.random()*100);
			for(int j=0; j<i;j++) 
				if( aleatorio[i]==aleatorio[j])i--;

		}
	}
	@Test
	public void testShellSort()
	{
		setUp2();
		sort.shellSort(ascendente);
		setUp3();
		sort.shellSort(descendente);
		setUp4();
		sort.shellSort(aleatorio);
		for (int i= 0 ; i<=10;i++) {
			
			assertEquals("Error con los 10 primeros elementos ordenados por shellsort del arreglo ascendente", i, (int) ascendente[i]);
			assertEquals("Error con los 10 ultimos elementos ordenados por shellsort  del arreglo ascendente", CAPACIDAD-1-i, (int) ascendente[CAPACIDAD-1-i]);
			assertEquals("Error con los 10 primeros elementos ordenados por shellsort del arreglo descendente", i, (int) descendente[i]);
			assertEquals("Error con los 10 ultimos elementos ordenados por shellsort del arreglo descendente", CAPACIDAD-1-i, (int) descendente[CAPACIDAD-1-i]);
			assertEquals("Error con los 10 primeros elementos ordenados por shellsort del arreglo aleatorio", i, (int) aleatorio[i]);
			assertEquals("Error con los 10 ultimos elementos ordenados por shellsort del arreglo aleatorio", CAPACIDAD-1-i, (int) aleatorio[CAPACIDAD-1-i]);
		}

	}
	@Test
	public void testMergeSort()
	{
		setUp2();
		sort.mergeSort(ascendente);
		setUp3();
		sort.mergeSort(descendente);
		setUp4();
		sort.mergeSort(aleatorio);
		for (int i= 0 ; i<=10;i++) {
			assertEquals("Error con los 10 primeros elementos ordenados por mergesort  del arreglo ascendente", i, (int) ascendente[i]);
			assertEquals("Error con los 10 ultimos elementos ordenados por mergesort del arreglo ascendente", CAPACIDAD-i-1, (int) ascendente[CAPACIDAD-1-i]);
			assertEquals("Error con los 10 primeros elementos ordenados por mergesort del arreglo descendente", i, (int) descendente[i]);
			assertEquals("Error con los 10 ultimos elementos ordenados por mergesort del arreglo descendente", CAPACIDAD-i-1, (int) descendente[CAPACIDAD-1-i]);
			assertEquals("Error con los 10 primeros elementos ordenados por mergesort del arreglo aleatorio", i, (int) aleatorio[i]);
			assertEquals("Error con los 10 ultimos elementos ordenados por mergesort del arreglo aleatorio", CAPACIDAD-i-1, (int) aleatorio[CAPACIDAD-1-i]);
		}
	}
	@Test
	public void testQuickSort()
	{
		setUp2();
		sort.quickSort(ascendente);
		setUp3();
		sort.quickSort(descendente);
		setUp4();
		sort.quickSort(aleatorio);
		for (int i= 0 ; i<=10;i++) {
			assertEquals("Error con los 10 primeros elementos ordenados por quicksort del arreglo ascendente", i, (int) ascendente[i]);
			assertEquals("Error con los 10 ultimos elementos ordenados por quicksort del arreglo ascendente", CAPACIDAD-i-1, (int) ascendente[CAPACIDAD-i-1]);
			assertEquals("Error con los 10 primeros elementos ordenados por quicksort del arreglo descendente", i, (int) descendente[i]);
			assertEquals("Error con los 10 ultimos elementos ordenados por quicksort del arreglo descendente", CAPACIDAD-i-1, (int) descendente[CAPACIDAD-i-1]);
			assertEquals("Error con los 10 primeros elementos ordenados por quicksort del arreglo aleatorio", i, (int) aleatorio[i]);
			assertEquals("Error con los 10 ultimos elementos ordenados por quicksort del arreglo aleatorio", CAPACIDAD-i-1, (int) aleatorio[CAPACIDAD-i-1]);
		}

	}
}
