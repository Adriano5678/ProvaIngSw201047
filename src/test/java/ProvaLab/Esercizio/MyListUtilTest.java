package ProvaLab.Esercizio;

import java.util.ArrayList;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyListUtilTest {

	private static MyListUtil mylistutil;
	
	@BeforeClass
	public static void Preparazione() {
		System.out.println("Sto preparando i test");
		mylistutil=new MyListUtil();
	}
	
	@AfterClass
	public static void Pulizia() {
		System.out.println("sto pulendo i test");
	}
	
	@Before
	public void Inizio() {
		System.out.println("Inizio Test");
	}
	
	@After
	public void Fine() {
		System.out.println("Fine Test");
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void ArgomentiCorretti() {
		ArrayList<Integer> ordinati = new ArrayList();
		String s = " ";
		mylistutil.ordinaLista(ordinati, s);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void StringaCorretta() {
		ArrayList<Integer> ordinati = new ArrayList();
		ordinati.add(5);
		ordinati.add(8);
		ordinati.add(4);
		String s = " ";
		mylistutil.ordinaLista(ordinati, s);
	}
	
	@Test
	public void Crescente() {
		ArrayList<Integer> ordinati = new ArrayList();
		ordinati.add(5);
		ordinati.add(8);
		ordinati.add(4);
		String s="Crescente";
		mylistutil.ordinaLista(ordinati, s);
	}
	
	@Test
	public void Decrescente() {
		ArrayList<Integer> ordinati = new ArrayList();
		ordinati.add(5);
		ordinati.add(8);
		ordinati.add(4);
		String s="Decrescente";
		mylistutil.ordinaLista(ordinati, s);
	}
	
	@Test (timeout = 5000)
	public void efficienza() {
		ArrayList<Integer> ordinati = new ArrayList();
		ordinati.add(5);
		ordinati.add(8);
		ordinati.add(4);
		String s="Decrescente";
		mylistutil.ordinaLista(ordinati, s);
	}
	
	@Test
	public void DataEOra() {
		mylistutil.stampaDataEOra();
	}
	
}
