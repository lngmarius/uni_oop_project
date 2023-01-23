package Interfete;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Conditii.ConditiiTrimmer;
import Date.TrimmerElectric;
import Interfete.InterfataTrimmer.*;

public class SortareProduse {
	public SortareProduse() {

		InterfataTrimmer.SortButton.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			String criteriu = InterfataTrimmer.Sort.getSelectedItem().toString();
			TrimmerElectric[] tc = new TrimmerElectric[(Integer) InterfataTrimmer.spinner_1.getValue()];

			tc = ConditiiTrimmer.Sortare(InterfataTrimmer.trimmerelectric, (Integer) InterfataTrimmer.spinner_1.getValue(), criteriu,
					InterfataTrimmer.Cresc.isSelected());

			for (int i = 0; i < (Integer) InterfataTrimmer.spinner_1.getValue(); i++)
				System.out.println(tc[i]);

			// redau vizibilitatea celor n produse , pe restul le las invizibile (for-ul de
			// mai sus )
			for (int i = 0; i < (Integer) InterfataTrimmer.spinner_1.getValue(); i++) {
				InterfataTrimmer.buttons[i].setVisible(true);
				InterfataTrimmer.buttons[i].setIcon(InterfataTrimmer.seteaza(InterfataTrimmer.trimmerelectric[i].getBrand()));
				InterfataTrimmer.labels[i].setText(InterfataTrimmer.trimmerelectric[i].getBrand() + " " + InterfataTrimmer.trimmerelectric[i].getModel());
				InterfataTrimmer.labels[i].setVisible(true);
				InterfataTrimmer.buttons[i].setText(InterfataTrimmer.trimmerelectric[i].toString());

			}
			FisierBinar.SaveBinarFiltru(InterfataTrimmer.trimmerelectric);

		}
	});
}
	}
