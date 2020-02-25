package test.logic;

import model.logic.Sorting;
import model.logic.Ubicacion;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TestSorting <Integer>{
	
	private Sorting sort; 
	private Comparable[] arreglo;
	private static int CAPACIDAD =100;
	
	
	@Before 
	public void setUp1 () {
		sort= new Sorting<Integer>(); 
	}
	/**
	 * Arreglo de datos ordenados ascendentemente
	 */
	public void setUp2() {
		 arreglo=new Comparable[CAPACIDAD];
		for(int i =0; i< CAPACIDAD;i++){
			arreglo[i]=i;
		}
	
	}
	/**
	 * Arreglo de datos ordenados descendentemente
	 */
	public void setUp3() {
		arreglo=new Comparable[CAPACIDAD];
		for (int i= 0; i<CAPACIDAD;i--) {
			arreglo[i]=Math.random();
		}
	}
	/**
	 * Arreglo de números ordenados aleatoriamente 
	 */
	public void setUp4() {
		arreglo=new Comparable[CAPACIDAD];
		for (int i= 0; i<CAPACIDAD;i++) {
			arreglo[i]=i;
		}
	}
	@Test
	public void testShellSort()
	{
		setUp2();
		sort.quickSort(arreglo);
		setUp3();
		sort.quickSort(arreglo);
		setUp4();
		sort.quickSort(arreglo);
		
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
		sort.shellSort(arreglo);
		setUp3();
		sort.shellSort(arreglo);
		setUp4();
		sort.shellSort(arreglo);
	}
}
