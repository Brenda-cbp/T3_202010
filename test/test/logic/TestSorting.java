package test.logic;

import model.logic.Sorting;
import model.logic.Ubicacion;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestSorting <Integer>{
	
	private Sorting sort; 
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
		for (int i= 0; i<CAPACIDAD;i--) {
			descendente[i]=Math.random();
		}
	}
	/**
	 * Arreglo de números ordenados aleatoriamente 
	 */
	public void setUp4() {
		aleatorio=new Comparable[CAPACIDAD];
		for (int i= 0; i<CAPACIDAD;i++) {
			aleatorio[i]=i;
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
			assertEquals("Error con los 10 primeros elementos ordenados del arreglo ascendente", i, (int) ascendente[i]);
			assertEquals("Error con los 10 ultimos elementos ordenados del arreglo ascendente", CAPACIDAD-i, (int) ascendente[CAPACIDAD-i]);
			assertEquals("Error con los 10 primeros elementos ordenados del arreglo descendente", i, (int) descendente[i]);
			assertEquals("Error con los 10 ultimos elementos ordenados del arreglo descendente", CAPACIDAD-i, (int) descendente[CAPACIDAD-i]);
			//assertEquals("Error con los 10 primeros elementos ordenados del arreglo aleatorio", i, (int) aleatorio[i]);
			//assertEquals("Error con los 10 ultimos elementos ordenados del arreglo aleatorio", CAPACIDAD-i, (int) aleatorio[CAPACIDAD-i]);
		}
		
	}
	@Test
	public void testMergeSort()
	{
		setUp2();
		//sort.me|
		setUp3();
		//sort.shellSort(arreglo);
		setUp4();
		//sort.shellSort(arreglo);
	}
	@Test
	public void testQuickSort()
	{
		setUp2();
		sort.quickSort(ascendente);
		setUp3();
		sort.quickSort(ascendente);
		setUp4();
		sort.quickSort(ascendente);
		
	
	}
}
