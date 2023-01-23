package Interfete;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import Conditii.ConditiiTrimmer;
import Date.TrimmerElectric;

public class SistemTaiereProduse {

	public SistemTaiereProduse()
	{
		InterfataTrimmer.ListaST.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				TrimmerElectric[] tcListaST = new TrimmerElectric[(Integer) InterfataTrimmer.spinner_1.getValue()];
				TrimmerElectric[] tcfinalListaST = new TrimmerElectric[(Integer) InterfataTrimmer.spinner_1.getValue()];

				tcListaST = ConditiiTrimmer.selectST(InterfataTrimmer.trimmerelectric, (String) InterfataTrimmer.ListaST.getSelectedItem());

				for (int i = 0; i < (Integer) InterfataTrimmer.spinner_1.getValue(); i++)
					for (int j = 0; j < (Integer) InterfataTrimmer.spinner_1.getValue(); j++)
						if (tcListaST[i] == InterfataTrimmer.trimmerelectric[j])
							tcfinalListaST[i] = tcListaST[i];

				int j = 0;
				for (int i = 0; i < (Integer) InterfataTrimmer.spinner_1.getValue(); i++) {
					InterfataTrimmer.buttons[i].setVisible(false);
					InterfataTrimmer.labels[i].setVisible(false);
					if (tcfinalListaST[i] != null) {
						InterfataTrimmer.buttons[j].setVisible(true);
						InterfataTrimmer.buttons[j].setIcon(InterfataTrimmer.seteaza(tcfinalListaST[i].getBrand()));
						InterfataTrimmer.buttons[i].setText(tcfinalListaST[i].toString());
						InterfataTrimmer.labels[j].setText(tcfinalListaST[i].getBrand() + " " + tcfinalListaST[i].getModel());
						InterfataTrimmer.labels[j].setVisible(true);
						j++;
					}
					FisierBinar.SaveBinarFiltru(tcfinalListaST);

				}
			}
		});
		
		InterfataTrimmer.CheckST.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				InterfataTrimmer.ListaST.removeAllItems();

				TrimmerElectric[] tc = new TrimmerElectric[(Integer) InterfataTrimmer.spinner_1.getValue()];
				String[] acc = new String[10];
				for (int i = 0; i < (Integer) InterfataTrimmer.spinner_1.getValue(); i++) {
					acc[i] = InterfataTrimmer.trimmerelectric[i].getSistemTaiere();

				}

				// sterg duplicate
				for (int i = 0; i < (Integer) InterfataTrimmer.spinner_1.getValue(); i++) {
					if (acc[i] != null) {

						for (int j = i + 1; j < (Integer) InterfataTrimmer.spinner_1.getValue(); j++) {

							if (acc[i].equals(acc[j])) {
								acc[j] = null;
							}
						}
					}
				}
				if (InterfataTrimmer.CheckST.isSelected())
					for (String element : acc)
						if (element != null)
							InterfataTrimmer.ListaST.addItem(element);

			}
		});
		
		
	}
	
}
