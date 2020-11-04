package ProvaLab.Esercizio;

import java.util.ArrayList;

import javax.swing.JDialog;

import org.joda.time.*;

public class MyListUtil {

	private ArrayList<Integer> numeri;
	
	
	public MyListUtil() {
		numeri=new ArrayList();
	}
	
	
	public ArrayList<Integer> ordinaLista(ArrayList<Integer> L,String s) {
		if(L.isEmpty()==true)
			throw  new IllegalArgumentException("Lista vuota");
		if(s!="Crescente" && s!="Decrescente") {
			throw new IllegalArgumentException("Stringa non valida" + s);
		}
		Integer min=10000;
		Integer max=0;
		ArrayList<Integer> ordinati = new ArrayList();
		
		if(s=="Crescente") {
		for(int i=0;i<L.size();i++) {
			for(Integer I:L) {
				if(I<min)
					min=I;
			}
			ordinati.add(min);
		}
		}
		
		if(s=="Decrescente") {
			for(int i=0;i<L.size();i++) {
				for(Integer I:L) {
					if(I>max)
						max=I;
				}
				ordinati.add(max);
			}
			}
		
		return ordinati;	
	}
	
	public void stampaDataEOra() {
		System.out.println(LocalDate.now().toString("YYYY-MM-DD"));
		System.out.println("Inizio Prova : 11:00");
		System.out.println(DateTime.now().toString("YYYY-MM-DD"));
		System.out.println("Fine Prova: 13:30");
	}
}

