package Conditii;

import java.util.Scanner;

import java.util.ArrayList;

import Date.Trimmer;
import Date.TrimmerElectric;
import Generatoare.GeneratorTrimmere;
import Generatoare.GeneratorTrimmereElectrice;
import Conditii.*;
public class TestConditiiTrimmerElectricTrimmer {
	
		public static void main(String[] args) {
			ArrayList<Trimmer> trimere = GeneratorTrimmere.genereazaTrimmere(10);
			TrimmerElectric[] trimmerelectric = GeneratorTrimmereElectrice.genereazaTrimmerElectric(10);
			
			trimmerelectric.toString();
			
			//Scanner scanner = new Scanner(System.in);
			//String marca= scanner.nextLine();
			//System.out.println(ConditiiTrimmer.verificaBrandTrimmer(trimere,marca));
	       // System.out.println("-------------");
	        System.out.println(ConditiiTrimmer.verificaPutereTrimmer(trimere));
	        System.out.println("-------------");
	        ConditiiTrimmer.Afis(ConditiiTrimmer.verificaDiametruTaiereTrimmer(trimmerelectric));
	        System.out.println("-------------");
	        ConditiiTrimmer.Afis(ConditiiTrimmer.verificaTensiuneTrimmer(trimmerelectric));
	        
	       System.out.println("------------");
	        ConditiiTrimmer.Afis(ConditiiTrimmer.Sortare(trimmerelectric,10,"Tensiune",false));
	        System.out.println("------------");
	       // ConditiiTrimmer.Afis(ConditiiTrimmer.SortarePutereD(trimmerelectric,10));
	      //  System.out.println("------------");
	     //   ConditiiTrimmer.Afis(ConditiiTrimmer.SortareTensiuneC(trimmerelectric,10));
	     //   System.out.println("------------");
	     //   ConditiiTrimmer.Afis(ConditiiTrimmer.SortareDiametruTaiereC(trimmerelectric,10));
	     //   System.out.println("------------");
	     //   ConditiiTrimmer.Afis(ConditiiTrimmer.SortareGreutateC(trimmerelectric,10));
	        

		}



	}