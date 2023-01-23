package Interfete;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import Interfete.InterfataTrimmer.*;

public class GeneratorInterfata {

	public GeneratorInterfata() {
		InterfataTrimmer.btnNewButton_9.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				int valueGenerat = (Integer)InterfataTrimmer.spinner_1.getValue();

				InterfataTrimmer.Generate.setText("Produse generate: " + valueGenerat);

				for (int i = valueGenerat; i < 10; i++) {
					InterfataTrimmer.buttons[i].setVisible(false);
					InterfataTrimmer.labels[i].setVisible(false);
				}

				// redau vizibilitatea celor n produse , pe restul le las invizibile (for-ul de
				// mai sus )
				for (int i = 0; i < valueGenerat; i++) {

					InterfataTrimmer.buttons[i].setVisible(true);
					InterfataTrimmer.buttons[i].setText(InterfataTrimmer.trimmerelectric[i].toString());
					InterfataTrimmer.buttons[i].setIcon(InterfataTrimmer.seteaza(InterfataTrimmer.trimmerelectric[i].getBrand()));
					// functia "seteaza" este mai sus, un produs respectiv o sa ia logo ul unui
					// trimmer generat automat.
					InterfataTrimmer.labels[i].setText(InterfataTrimmer.trimmerelectric[i].getBrand() + " " + InterfataTrimmer.trimmerelectric[i].getModel());
					// label-ul de sub produs, afiseaza Brandul si Modelul
					InterfataTrimmer.labels[i].setVisible(true);
					InterfataTrimmer.buttons[i].setText(InterfataTrimmer.trimmerelectric[i].toString());

					int j = i;
					InterfataTrimmer.buttons[j].addMouseListener(new MouseAdapter() {
						@Override
						public void mouseClicked(MouseEvent e) {
							JFrame frametmp = new JFrame();
							frametmp.setVisible(true);
							frametmp.setTitle("Specificatii Produs");
							frametmp.setBounds(100, 100, 1320, 150);

							// afisez un Label pe nou frame cu specificatiile produsului respectiv
							JLabel Labelspec = new JLabel("-");
							Labelspec.setVisible(true);
							Labelspec.setBounds(0, 0, 20, 20);

							Labelspec.setText(InterfataTrimmer.buttons[j].getText());
							InterfataTrimmer.contentPane.add(Labelspec);
							Labelspec.updateUI();
							frametmp.getContentPane().add(Labelspec);

						}

					});

				}
				for (int i = 0; i < valueGenerat; i++) {
					System.out.println(InterfataTrimmer.trimmerelectric[i]);
				}

				FisierBinar.SaveBinarGenerator(InterfataTrimmer.trimmerelectric);
				
			}
		});

		
		
		
	}

}
