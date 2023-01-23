package Interfete;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import Conditii.ConditiiTrimmer;
import Date.TrimmerElectric;
import Interfete.InterfataTrimmer.*;

public class CautaProduse {

		
	public CautaProduse()
	{
		InterfataTrimmer.CautaBMBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (InterfataTrimmer.CautaBM.getText() != null) {
					TrimmerElectric[] tcBrand = new TrimmerElectric[(Integer)InterfataTrimmer.spinner_1.getValue()];
					TrimmerElectric[] tcfinalBrand = new TrimmerElectric[(Integer)InterfataTrimmer.spinner_1.getValue()];
					TrimmerElectric[] tcModel = new TrimmerElectric[(Integer)InterfataTrimmer.spinner_1.getValue()];
					TrimmerElectric[] tcfinalModel = new TrimmerElectric[(Integer)InterfataTrimmer.spinner_1.getValue()];
					String s = InterfataTrimmer.CautaBM.getText();

					tcBrand = ConditiiTrimmer.verificaBrand(InterfataTrimmer.trimmerelectric, s);
					tcModel = ConditiiTrimmer.verificaModel(InterfataTrimmer.trimmerelectric, s);

					for (int i = 0; i < (Integer) InterfataTrimmer.spinner_1.getValue(); i++)
						for (int j = 0; j < (Integer) InterfataTrimmer.spinner_1.getValue(); j++)
							if (tcBrand[i] == InterfataTrimmer.trimmerelectric[j])
								tcfinalBrand[i] = tcBrand[i];

					for (int i = 0; i < (Integer)InterfataTrimmer.spinner_1.getValue(); i++)
						for (int j = 0; j < (Integer)InterfataTrimmer.spinner_1.getValue(); j++)
							if (tcModel[i] == InterfataTrimmer.trimmerelectric[j])
								tcfinalModel[i] = tcModel[i];

					int j = 0;
					for (int i = 0; i < (Integer)InterfataTrimmer.spinner_1.getValue(); i++) {
						InterfataTrimmer.buttons[i].setVisible(false);
						InterfataTrimmer.labels[i].setVisible(false);
						if (tcfinalModel[i] != null) {
							InterfataTrimmer.buttons[j].setVisible(true);
							InterfataTrimmer.buttons[j].setIcon(InterfataTrimmer.seteaza(tcModel[i].getBrand()));
							InterfataTrimmer.buttons[i].setText(tcModel[i].toString());
							InterfataTrimmer.labels[j].setText(tcModel[i].getBrand() + " " + tcModel[i].getModel());
							InterfataTrimmer.labels[j].setVisible(true);
							j++;
							FisierBinar.SaveBinarFiltru(tcModel);

						}

						if (tcfinalBrand[i] != null) {
							InterfataTrimmer.buttons[j].setVisible(true);
							InterfataTrimmer.buttons[j].setIcon(InterfataTrimmer.seteaza(tcBrand[i].getBrand()));
							InterfataTrimmer.buttons[i].setText(tcBrand[i].toString());
							InterfataTrimmer.labels[j].setText(tcBrand[i].getBrand() + " " + tcBrand[i].getModel());
							InterfataTrimmer.labels[j].setVisible(true);
							j++;
							FisierBinar.SaveBinarFiltru(tcBrand);

						}

					}
				}
			}
		});
		
		
		
		
		
	}
}
