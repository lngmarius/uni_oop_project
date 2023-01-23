import java.io.*;
import java.util.*;

import Date.*;
public class TestProiect {

	public static void main(String[] args) {
 
		//4 clase test de caicula
		
		
 
	 TrimmerElectric primulTrimmer=new TrimmerElectric("Makita","gazon",2.2,400,true,"DC18RC","bobina cu fir","Li-Ion",26,18);
	
	// Trimmer t2=new Trimmer(t1);
	 System.out.println(primulTrimmer.toString());

	 
	Taietor primulTaietor=new Taietor();
	 System.out.println(primulTaietor.toString());
	 MasinaTunsIarba primaMasinaDeTuns=new MasinaTunsIarba();
	 System.out.println(primaMasinaDeTuns.toString());
	 
	// Drujba d1=new Drujba();
	 Drujba primaDrujba = new Drujba("unealta pentru taiat copaci", "dificultate medie", 6, "August", "se poate rupe lantul", "WOLFSON", "benzina", 399, 5.8f, 12);
	 Drujba d2=new Drujba(primaDrujba);
	 System.out.println(primaDrujba.toString());
	 
	// MotoSapa m1=new MotoSapa();
	 MotoSapa primaMotosapa = new MotoSapa(160,100,'a',7,"Wolfson",80,41.8f,5.2f,1,100);
	 MotoSapa m2=new MotoSapa(primaMotosapa);
	 System.out.println(primaMotosapa.toString());

     System.out.println("----------------------------------+");

	
	 
	}
}
