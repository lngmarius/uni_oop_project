package Interfete;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import Conditii.ConditiiTrimmer;
import Date.TrimmerElectric;

public class FiltreazaProduse {
	
	public FiltreazaProduse()
	{
		InterfataTrimmer.ListaPar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				InterfataTrimmer.ListaVal.removeAllItems();
				String criteriu = InterfataTrimmer.ListaPar.getSelectedItem().toString();
				TrimmerElectric[] tc = new TrimmerElectric[(Integer) InterfataTrimmer.spinner_1.getValue()];
				double[] acc = new double[10];
				double[] aux = new double[10];
				for (int i = 0; i < (Integer) InterfataTrimmer.spinner_1.getValue(); i++)
					if (criteriu == "Putere")
						acc[i] =InterfataTrimmer. trimmerelectric[i].getPutere();
					else if (criteriu == "Tensiune")
						acc[i] = InterfataTrimmer.trimmerelectric[i].getTensiune();
					else if (criteriu == "DiametruTaiere")
						acc[i] = InterfataTrimmer.trimmerelectric[i].getDiametruTaiere();
					else if (criteriu == "Greutate")
						acc[i] = InterfataTrimmer.trimmerelectric[i].getGreutate();

				// sterg duplicate
				for (int i = 0; i < (Integer) InterfataTrimmer.spinner_1.getValue(); i++) {
					if (acc[i] != 0.0) {

						for (int j = i + 1; j < (Integer) InterfataTrimmer.spinner_1.getValue(); j++) {

							if (acc[i] == acc[j]) {
								acc[j] = 0.0;
							}
						}
					}
				}

				for (int i = 0; i < (Integer) InterfataTrimmer.spinner_1.getValue(); i++)
					for (int j = 0; j < (Integer) InterfataTrimmer.spinner_1.getValue(); j++) {
						if (acc[i] < acc[j]) {
							aux[0] = acc[i];
							acc[i] = acc[j];
							acc[j] = aux[0];
						}
					}

				if (InterfataTrimmer.AccDA.isSelected()) {
					for (double element : acc) {
						if (element != 0.0) {
							InterfataTrimmer.ListaVal.addItem(element);
						}
					}
				}

			}
		});
		
		InterfataTrimmer.CautaPV.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				TrimmerElectric[] tcListap = new TrimmerElectric[(Integer) InterfataTrimmer.spinner_1.getValue()];
				TrimmerElectric[] tcfinalListap = new TrimmerElectric[(Integer) InterfataTrimmer.spinner_1.getValue()];
				tcListap = ConditiiTrimmer.SortareParametrii(InterfataTrimmer.trimmerelectric, (double) InterfataTrimmer.ListaVal.getSelectedItem(),
						InterfataTrimmer.ListaPar.getSelectedItem().toString());

				for (int i = 0; i < (Integer) InterfataTrimmer.spinner_1.getValue(); i++)
					for (int j = 0; j < (Integer) InterfataTrimmer.spinner_1.getValue(); j++)
						if (tcListap[i] == InterfataTrimmer.trimmerelectric[j])
							tcfinalListap[i] = tcListap[i];

				int j = 0;
				for (int i = 0; i < (Integer) InterfataTrimmer.spinner_1.getValue(); i++) {
					InterfataTrimmer.buttons[i].setVisible(false);
					InterfataTrimmer.labels[i].setVisible(false);
					if (tcfinalListap[i] != null) {
						InterfataTrimmer.buttons[j].setVisible(true);
						InterfataTrimmer.buttons[j].setIcon(InterfataTrimmer.seteaza(tcfinalListap[i].getBrand()));
						InterfataTrimmer.buttons[i].setText(tcfinalListap[i].toString());
						InterfataTrimmer.labels[j].setText(tcfinalListap[i].getBrand() + " " + tcfinalListap[i].getModel());
						InterfataTrimmer.labels[j].setVisible(true);
						j++;
						System.out.println("+" + tcfinalListap[i].getBrand() + " " + tcfinalListap[i].getModel() + " "
								+ tcfinalListap[i].getGreutate());
					}
					FisierBinar.SaveBinarFiltru(tcfinalListap);

				}
			}
		});
		
		
		
		
	}
	
	
}
