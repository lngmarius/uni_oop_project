package Interfete;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import Conditii.ConditiiTrimmer;
import Date.TrimmerElectric;
import Interfete.InterfataTrimmer.*;

public class AcumulatorProduse {

	public AcumulatorProduse()
	{
		InterfataTrimmer.ListaTipAcc.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				TrimmerElectric[] tcLista = new TrimmerElectric[(Integer) 	InterfataTrimmer.spinner_1.getValue()];
				TrimmerElectric[] tcfinalLista = new TrimmerElectric[(Integer) 	InterfataTrimmer.spinner_1.getValue()];

				tcLista = ConditiiTrimmer.selectAcc(	InterfataTrimmer.trimmerelectric, (String) 	InterfataTrimmer.ListaTipAcc.getSelectedItem());

				for (int i = 0; i < (Integer) 	InterfataTrimmer.spinner_1.getValue(); i++)
					for (int j = 0; j < (Integer) 	InterfataTrimmer.spinner_1.getValue(); j++)
						if (tcLista[i] == 	InterfataTrimmer.trimmerelectric[j])
							tcfinalLista[i] = tcLista[i];

				int j = 0;
				for (int i = 0; i < (Integer) 	InterfataTrimmer.spinner_1.getValue(); i++) {
					InterfataTrimmer.buttons[i].setVisible(false);
					InterfataTrimmer.labels[i].setVisible(false);
					if (tcfinalLista[i] != null) {
						InterfataTrimmer.buttons[j].setVisible(true);
						InterfataTrimmer.buttons[j].setIcon(	InterfataTrimmer.seteaza(tcfinalLista[i].getBrand()));
						InterfataTrimmer.buttons[i].setText(tcfinalLista[i].toString());
						InterfataTrimmer.labels[j].setText(tcfinalLista[i].getBrand() + " " + tcfinalLista[i].getModel());
						InterfataTrimmer.labels[j].setVisible(true);
						j++;
					}
					
					FisierBinar.SaveBinarFiltru(tcfinalLista);
				}
			}
		});
		
		
		InterfataTrimmer.AccDA.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				InterfataTrimmer.ListaTipAcc.removeAllItems();
				TrimmerElectric[] tc = new TrimmerElectric[(Integer)InterfataTrimmer.spinner_1.getValue()];
				String[] acc = new String[10];
				for (int i = 0; i < (Integer)	InterfataTrimmer. spinner_1.getValue(); i++) {
					if (	InterfataTrimmer.trimmerelectric[i].getAcumulatori() && InterfataTrimmer.trimmerelectric[i] != null)
						acc[i] =	InterfataTrimmer. trimmerelectric[i].getTipAcumulator();

				}

				// sterg duplicate
				for (int i = 0; i < (Integer)InterfataTrimmer. spinner_1.getValue(); i++) {
					if (acc[i] != null) {

						for (int j = i + 1; j < (Integer) InterfataTrimmer.spinner_1.getValue(); j++) {

							if (acc[i].equals(acc[j])) {
								acc[j] = null;
							}
						}
					}
				}

				if (InterfataTrimmer.AccDA.isSelected()) {
					for (String element : acc) {
						if (element != null) {
							InterfataTrimmer.ListaTipAcc.addItem(element);
						}
					}
				}

			}
		});
		
		
		
		
		InterfataTrimmer.AccNU.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				if (	InterfataTrimmer.AccNU.isSelected()) {
					TrimmerElectric[] tcListac = new TrimmerElectric[(Integer) 	InterfataTrimmer.spinner_1.getValue()];
					TrimmerElectric[] tcfinalListac = new TrimmerElectric[(Integer) 	InterfataTrimmer.spinner_1.getValue()];

					tcListac = ConditiiTrimmer.selectAccCablu(	InterfataTrimmer.trimmerelectric);

					for (int i = 0; i < (Integer)	InterfataTrimmer. spinner_1.getValue(); i++)
						for (int j = 0; j < (Integer)	InterfataTrimmer. spinner_1.getValue(); j++)
							if (tcListac[i] == 	InterfataTrimmer.trimmerelectric[j])
								tcfinalListac[i] = tcListac[i];

					for (int i = 0; i < (Integer) 	InterfataTrimmer.spinner_1.getValue(); i++) {
						InterfataTrimmer.buttons[i].setVisible(false);
						InterfataTrimmer.labels[i].setVisible(false);
						if (tcfinalListac[i] != null) {
							InterfataTrimmer.buttons[i].setVisible(true);
							InterfataTrimmer.buttons[i].setIcon(	InterfataTrimmer.seteaza(tcfinalListac[i].getBrand()));
							InterfataTrimmer.buttons[i].setText(tcfinalListac[i].toString());
							InterfataTrimmer.labels[i].setText(tcfinalListac[i].getBrand() + " " + tcfinalListac[i].getModel());
							InterfataTrimmer.labels[i].setVisible(true);
						}

					}				
					FisierBinar.SaveBinarFiltru(tcfinalListac);

				}	

			}
		});
		
	}
	
	
	
	
}
