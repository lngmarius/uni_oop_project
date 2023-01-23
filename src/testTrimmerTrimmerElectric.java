
import java.util.ArrayList;

import Date.Trimmer;
import Date.TrimmerElectric;
import Generatoare.GeneratorTrimmere;
import Generatoare.GeneratorTrimmereElectrice;
import Conditii.*;
public class testTrimmerTrimmerElectric {
	
		public static void main(String[] args) {
			ArrayList<Trimmer> trimere = GeneratorTrimmere.genereazaTrimmere(10);
			for (Trimmer trimmer: trimere)
				System.out.println(trimmer);
			//merge si cu aparat
			
			System.out.println("--------------------");
			TrimmerElectric[] trimmerelectric = GeneratorTrimmereElectrice.genereazaTrimmerElectric(10);
			for (TrimmerElectric trimmerelectricc: trimmerelectric)
			System.out.println(trimmerelectricc);
			
			
		}
	}