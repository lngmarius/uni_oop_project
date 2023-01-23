package Conditii;

import Generatoare.*;
import java.util.ArrayList;

import Date.*;

public class ConditiiTrimmer {

	// conditii fisier diferit pt fiecare

	public static ArrayList<Trimmer> verificaBrandTrimmer(ArrayList<Trimmer> t, String s) {
		ArrayList<Trimmer> listaTrimmer = new ArrayList();

		for (Trimmer trimmer : t) {
			if (trimmer.getBrand() == s)
				listaTrimmer.add(trimmer);
		}

		return listaTrimmer;

	}

	public static ArrayList<Trimmer> verificaPutereTrimmer(ArrayList<Trimmer> t) {
		ArrayList<Trimmer> listaTrimmer = new ArrayList();

		for (Trimmer trimmer : t) {
			if (trimmer.getPutere() > 100 && trimmer.getPutere() < 450)
				listaTrimmer.add(trimmer);
		}
		return listaTrimmer;

	}
	
	public static TrimmerElectric[] verificaBrand(TrimmerElectric[] t,String S) {
		TrimmerElectric listaTrimmer[] = new TrimmerElectric[10];
		int i = 0;
		for (TrimmerElectric trimmer : t) {
			if (trimmer.getBrand().equals(S))
				{listaTrimmer[i] = trimmer;
			i++;
		}
			}
		return listaTrimmer;

	}
	
	public static TrimmerElectric[] verificaModel(TrimmerElectric[] t,String S) {
		TrimmerElectric listaTrimmer[] = new TrimmerElectric[10];
		int i = 0;
		for (TrimmerElectric trimmer : t) {
			if (trimmer.getModel().equals(S))
				{listaTrimmer[i] = trimmer;
			i++;
		}
			}
		return listaTrimmer;

	}
	
	public static TrimmerElectric[] selectST(TrimmerElectric[] t,String S) {
		TrimmerElectric listaTrimmer[] = new TrimmerElectric[10];
		int i = 0;
		for (TrimmerElectric trimmer : t) {
			if (trimmer.getSistemTaiere().equals(S))
				{listaTrimmer[i] = trimmer;
			i++;
		}
			}
		return listaTrimmer;
	}
	
	
	public static TrimmerElectric[] selectAcc(TrimmerElectric[] t,String S) {
		TrimmerElectric listaTrimmer[] = new TrimmerElectric[10];
		int i = 0;
		for (TrimmerElectric trimmer : t) {
			if (trimmer.getTipAcumulator().equals(S)&&trimmer.getAcumulatori()==true)
				{listaTrimmer[i] = trimmer;
			i++;
		}
			}
		return listaTrimmer;
	}
	
	public static TrimmerElectric[] selectAccCablu(TrimmerElectric[] t) {
		TrimmerElectric listaTrimmer[] = new TrimmerElectric[10];
		int i = 0;
		for (TrimmerElectric trimmer : t) {
			if (trimmer.getAcumulatori()==false&&trimmer.getTipAcumulator().equals("cu cablu"))
				{listaTrimmer[i] = trimmer;
			i++;
		}
			}
		return listaTrimmer;
	}
	

	public static TrimmerElectric[] verificaDiametruTaiereTrimmer(TrimmerElectric[] t) {
		TrimmerElectric listaTrimmer[] = new TrimmerElectric[10];
		int i = 0;
		for (TrimmerElectric trimmer : t) {
			if (trimmer.getDiametruTaiere() > 20 && trimmer.getDiametruTaiere() < 30)
				listaTrimmer[i] = trimmer;
			i++;
		}
		return listaTrimmer;

	}

	public static TrimmerElectric[] verificaTensiuneTrimmer(TrimmerElectric[] t) {
		TrimmerElectric listaTrimmer[] = new TrimmerElectric[10];
		int i = 0;
		for (TrimmerElectric trimmer : t) {
			if (trimmer.getTensiune() > 20 && trimmer.getTensiune() < 25)
				listaTrimmer[i] = trimmer;
			i++;
		}
		return listaTrimmer;

	}

	public static TrimmerElectric[] Sortare(TrimmerElectric[] t, int n, String criteriu,boolean C) {
		TrimmerElectric aux[] = new TrimmerElectric[2];
		if(C==true)
		{if (criteriu == "Putere") {
			for (int i = 0; i < n; i++)
				for (int j = 0; j < n; j++)
					if (t[i].getPutere() < t[j].getPutere()) {
						aux[0] = t[i];
						t[i] = t[j];
						t[j] = aux[0];
					}
			
		} else if (criteriu == "Greutate") {
			for (int i = 0; i < n; i++)
				for (int j = 0; j < n; j++)
					if (t[i].getGreutate() < t[j].getGreutate()) {
						aux[0] = t[i];
						t[i] = t[j];
						t[j] = aux[0];
					}

		} else if (criteriu == "Tensiune") {
			for (int i = 0; i < n; i++)
				for (int j = 0; j < n; j++)
					if (t[i].getTensiune() < t[j].getTensiune()) {
						aux[0] = t[i];
						t[i] = t[j];
						t[j] = aux[0];
					}
		} else if (criteriu == "DiametruTaiere") {
			for (int i = 0; i < n; i++)
				for (int j = 0; j < n; j++)
					if (t[i].getDiametruTaiere() < t[j].getDiametruTaiere()) {
						aux[0] = t[i];
						t[i] = t[j];
						t[j] = aux[0];
					}
		}
		}
		else if(C==false)
		{
			if (criteriu == "Putere") {
				for (int i = 0; i < n; i++)
					for (int j = 0; j < n; j++)
						if (t[i].getPutere() > t[j].getPutere()) {
							aux[0] = t[i];
							t[i] = t[j];
							t[j] = aux[0];
						}

			} else if (criteriu == "Greutate") {
				for (int i = 0; i < n; i++)
					for (int j = 0; j < n; j++)
						if (t[i].getGreutate() > t[j].getGreutate()) {
							aux[0] = t[i];
							t[i] = t[j];
							t[j] = aux[0];
						}

			} else if (criteriu == "Tensiune") {
				for (int i = 0; i < n; i++)
					for (int j = 0; j < n; j++)
						if (t[i].getTensiune() > t[j].getTensiune()) {
							aux[0] = t[i];
							t[i] = t[j];
							t[j] = aux[0];
						}
			} else if (criteriu == "DiametruTaiere") {
				for (int i = 0; i < n; i++)
					for (int j = 0; j < n; j++)
						if (t[i].getDiametruTaiere() > t[j].getDiametruTaiere()) {
							aux[0] = t[i];
							t[i] = t[j];
							t[j] = aux[0];
						}
			}
			
		}
		return t;
	}

	
	
	public static TrimmerElectric[] SortareParametrii(TrimmerElectric[] t, double n, String criteriu) {
		TrimmerElectric listaTrimmer[] = new TrimmerElectric[10];
		if (criteriu == "Putere") {
			int i = 0;
			for (TrimmerElectric trimmer : t) {
				if (trimmer.getPutere()==n)
					listaTrimmer[i] = trimmer;
				i++;
			}

		} else if (criteriu == "Greutate") {
			int i = 0;
			for (TrimmerElectric trimmer : t) {
				if (trimmer.getGreutate()==n)
					listaTrimmer[i] = trimmer;
				i++;
			}
					

		} else if (criteriu == "Tensiune") {
			int i = 0;
			for (TrimmerElectric trimmer : t) {
				if (trimmer.getTensiune() == n)
					listaTrimmer[i] = trimmer;
				i++;
			}
					
		} else if (criteriu == "DiametruTaiere") {
			int i = 0;
			for (TrimmerElectric trimmer : t) {
				if (trimmer.getDiametruTaiere() == n)
					listaTrimmer[i] = trimmer;
				i++;
			}
					
		}
		
		return listaTrimmer;
		}
	
	
	
	public static void Afis(TrimmerElectric[] t) {
		for (int i = 0; i < t.length; i++)
			if (t[i] != null)
				System.out.println(t[i]);

	}

}
