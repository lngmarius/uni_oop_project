package Generatoare;
import Date.TrimmerElectric;

public class GeneratorTrimmereElectrice {

	protected static String[] brand = new String[] { "Bosch", "Ego", "Gardena", "Grunman", "Makita", "Ikra", "Ryobi" };
	protected static String[] utilizare = new String[] { "gazon", "pardoseala", "profesionala", "sol", "uz casnic" };
	protected static double[] greutate = new double[] { 1.7, 1.8, 1.9, 2.1, 2.2, 2.3, 2.7, 2.9, 3.0, 3.2, 3.85, 3.9,
			4.3, 4.64, 5.1, 22.2 };
	protected static double[] putere = new double[] { 280, 400, 450, 550, 650, 700, 1000 };
	protected static boolean[] acumulatori = new boolean[] { true, false };

	protected static String[] model = new String[] { "DUR181Z", "DUR190LZX3", "EasyGrassCut 26", "DUR192LZ",
			"RY18LT23A" };
	protected static String[] sistemTaiere = new String[] { "bobina cu fir", "lama", "cutite", "lant" };
	protected static String[] tipAcumulator = new String[] { "Li-ion", "NiMH", "NiCd" };
	protected static int[] diametruTaiere = new int[] { 10, 15, 18, 20, 22, 25, 28, 30 };
	protected static int[] tensiune = new int[] { 18, 20, 22, 25 };

	public static TrimmerElectric[] genereazaTrimmerElectric(int n) {
		if (n < 1)
			n = 1;
		TrimmerElectric trimereelectrice[] = new TrimmerElectric[n];

		for (int i = 0; i < n; i++) {
			String tmpBrand = brand[(int) (Math.random() * brand.length)];
			String tmpUtilizare = utilizare[(int) (Math.random() * utilizare.length)];
			double tmpGreutate = greutate[(int) (Math.random() * greutate.length)];
			double tmpPutere = putere[(int) (Math.random() * putere.length)];
			boolean tmpAcumulatori = acumulatori[(int) (Math.random() * acumulatori.length)];

			String tmpModel = model[(int) (Math.random() * model.length)];
			String tmpSistemTaiere = sistemTaiere[(int) (Math.random() * sistemTaiere.length)];
			int tmpDiametruTaiere = diametruTaiere[(int) (Math.random() * diametruTaiere.length)];
			int tmpTensiune = tensiune[(int) (Math.random() * tensiune.length)];

			
			String tmpTipAcumulator;
			if (tmpAcumulatori == true)
				tmpTipAcumulator = tipAcumulator[(int) (Math.random() * tipAcumulator.length)];
			else
				tmpTipAcumulator = "cu cablu";

			TrimmerElectric trimmerGenerat = new TrimmerElectric(tmpBrand, tmpUtilizare, tmpGreutate, tmpPutere,
					tmpAcumulatori, tmpModel, tmpSistemTaiere, tmpTipAcumulator, tmpDiametruTaiere, tmpTensiune);
			trimereelectrice[i] = trimmerGenerat;
		}
		return trimereelectrice;
	}
}