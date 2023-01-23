package Generatoare;
import java.util.ArrayList;
import Date.Trimmer;
public class GeneratorTrimmere {
//g mare
	
	
	protected static String[] brand = new String[] {"Bosch","Ego","Gardena","Grunman","Makita","Ikra","Ryobi"};
	protected static String[] utilizare = new String[] {"gazon","pardoseala","profesionala","sol","uz casnic"};
	protected static double[] greutate = new double[] {1.7,1.8,1.9,2.1,2.2,2.3,2.7,2.9,3.0,3.2,3.85,3.9,4.3,4.64,5.1,22.2};
	protected static double[] putere = new double[] {280,400,450,550,650,700,1000};
	protected static boolean[] acumulatori = new boolean[] {true,false};
	public static ArrayList<Trimmer> genereazaTrimmere (int n){
		if (n<1)
			n=1;
		
		ArrayList<Trimmer> trimere = new ArrayList<Trimmer>();
		for (int i=0;i<n;i++) {
			String tmpBrand = brand[(int)(Math.random()*brand.length)];
			String tmpUtilizare = utilizare[(int)(Math.random()*utilizare.length)];
			double tmpGreutate = greutate[(int)(Math.random()*greutate.length)];
			double tmpPutere = putere[(int)(Math.random()*putere.length)];
			boolean tmpAcumulatori = acumulatori[(int)(Math.random()*acumulatori.length)];
			Trimmer trimmerGenerat = new Trimmer(tmpBrand,tmpUtilizare,tmpGreutate,tmpPutere,tmpAcumulatori);
			trimere.add(trimmerGenerat);
			
		}
		return trimere;
	}
}