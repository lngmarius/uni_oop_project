package Interfete;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;

import Date.TrimmerElectric;

public class FisierBinar {

	public static void SaveBinarGenerator(TrimmerElectric[] t) {
		try {
			FileOutputStream f = new FileOutputStream(new File("generator.txt"));
			ObjectOutputStream o = new ObjectOutputStream(f);
			// se salveaza intrega colectie
			o.writeObject(t);
			// se salveaza cate un element din colectie pe rand
			o.close();
			f.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	public static void SaveBinarFiltru(TrimmerElectric[] t) {
		try {
			FileOutputStream f = new FileOutputStream(new File("filtru.txt"));
			ObjectOutputStream o = new ObjectOutputStream(f);
			// se salveaza intrega colectie
			o.writeObject(t);
			// se salveaza cate un element din colectie pe rand
			o.close();
			f.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
}
