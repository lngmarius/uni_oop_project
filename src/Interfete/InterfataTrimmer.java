package Interfete;

import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import Date.TrimmerElectric;
import Generatoare.GeneratorTrimmereElectrice;
import java.awt.Window.Type;

public class InterfataTrimmer extends JFrame {

	public static JCheckBox AccDA = new JCheckBox("Da");

	public static JCheckBox AccNU = new JCheckBox("Nu");

	public static JButton btnNewButton_9 = new JButton("Genereaza!");

	/**
	 * Create the frame.
	 */
	public static JButton[] buttons = new JButton[10];
	public static JTextField CautaBM = new JTextField();
	public static JButton CautaBMBtn = new JButton("Cauta!");
	public static JButton CautaPV = new JButton("Cauta:");
	public static JCheckBox CheckST = new JCheckBox("");

	public static JPanel contentPane;
	public static JCheckBox Cresc = new JCheckBox("Crescator");
	public static JLabel Generate = new JLabel("Produse generate: 0");
	public static JLabel[] labels = new JLabel[10];
	public static JLabel LabelST = new JLabel("Sistem taiere:");
	public static JComboBox ListaPar = new JComboBox();
	public static JComboBox ListaST = new JComboBox();
	public static JComboBox ListaTipAcc = new JComboBox();
	public static JComboBox ListaVal = new JComboBox();
	public static JComboBox Sort = new JComboBox();
	public static JButton SortButton = new JButton("Sorteaza!");
	public static JSpinner spinner_1;
	public static TrimmerElectric[] trimmerelectric = GeneratorTrimmereElectrice.genereazaTrimmerElectric(10);
	
	
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}

			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					InterfataTrimmer frame = new InterfataTrimmer();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public static ImageIcon seteaza(String S) {
		ImageIcon makita = new ImageIcon("C:\\Users\\lunge\\eclipse-workspace\\POOProiect\\Icons\\makita.png");
		makita.setDescription("Makita");
		ImageIcon bosch = new ImageIcon("C:\\Users\\lunge\\eclipse-workspace\\POOProiect\\Icons\\bosch.png");
		bosch.setDescription("Bosch");
		ImageIcon ego = new ImageIcon("C:\\Users\\lunge\\eclipse-workspace\\POOProiect\\Icons\\ego.png");
		ego.setDescription("Ego");
		ImageIcon gardena = new ImageIcon("C:\\Users\\lunge\\eclipse-workspace\\POOProiect\\Icons\\gardena.png");
		gardena.setDescription("Gardena");
		ImageIcon grunman = new ImageIcon("C:\\Users\\lunge\\eclipse-workspace\\POOProiect\\Icons\\grunman.png");
		grunman.setDescription("Grunman");
		ImageIcon ikra = new ImageIcon("C:\\Users\\lunge\\eclipse-workspace\\POOProiect\\Icons\\ikra.png");
		ikra.setDescription("Ikra");
		ImageIcon ryobi = new ImageIcon("C:\\Users\\lunge\\eclipse-workspace\\POOProiect\\Icons\\ryobi.png");
		ryobi.setDescription("Ryobi");

		// am ales sa atribui fiecarei poze o descriere (efectiv numele Brandului), pe
		// care sa-l compar cu un String(care este getBrand a unui trimmer generat)
		// cand conditia este adevarata, ii se atribuie unui buton iconita specifica
		// Brandului ales.
		// pe moment n am gasit nicio metoda prin care sa compar un String cu numele
		// unui ImageIcon, si m-am pus spre versiunea cu descrierea
		// sper ca exista si o medota mai simpla :((((

		if (S == makita.getDescription())
			return makita;
		else if (S == bosch.getDescription())
			return bosch;
		else if (S == ego.getDescription())
			return ego;
		else if (S == gardena.getDescription())
			return gardena;
		else if (S == grunman.getDescription())
			return grunman;
		else if (S == ikra.getDescription())
			return ikra;
		else
			return ryobi;
	}
	private final ButtonGroup buttonGroup = new ButtonGroup();

	private final ButtonGroup buttonGroup_1 = new ButtonGroup();

	public InterfataTrimmer() {
		setResizable(false);
		setTitle("TrimmereIeftine.ro");
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setBounds(100, 100, 896, 556);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(219, 216, 227));
		contentPane.setBackground(new Color(42, 36, 56));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);

		// Cele 10 butoane invizibile(momentan) le creez

		JLabel Specs = new JLabel("");
		Specs.setBounds(462, 407, 274, 53);
		contentPane.add(Specs);

		JButton Produs0 = new JButton();
		Produs0.setBorder(new LineBorder(new Color(244, 234, 213)));
		Produs0.setBackground(new Color(53, 47, 68));
		Produs0.setBounds(310, 60, 85, 60);
		Produs0.setVisible(false);

		JButton Produs1 = new JButton();
		Produs1.setBorder(new LineBorder(new Color(244, 234, 213)));
		Produs1.setBackground(new Color(53, 47, 68));
		Produs1.setBounds(462, 60, 85, 60);
		Produs1.setVisible(false);

		JButton Produs2 = new JButton();
		Produs2.setBorder(new LineBorder(new Color(244, 234, 213)));
		Produs2.setBackground(new Color(53, 47, 68));
		Produs2.setBounds(612, 60, 85, 60);
		Produs2.setVisible(false);

		JButton Produs3 = new JButton();
		Produs3.setBorder(new LineBorder(new Color(244, 234, 213)));
		Produs3.setBackground(new Color(53, 47, 68));
		Produs3.setBounds(310, 173, 85, 60);
		Produs3.setVisible(false);

		JButton Produs4 = new JButton();
		Produs4.setBorder(new LineBorder(new Color(244, 234, 213)));
		Produs4.setBackground(new Color(53, 47, 68));
		Produs4.setBounds(462, 173, 85, 60);
		Produs4.setVisible(false);

		JButton Produs5 = new JButton();
		Produs5.setBorder(new LineBorder(new Color(244, 234, 213)));
		Produs5.setBackground(new Color(53, 47, 68));
		Produs5.setBounds(612, 173, 85, 60);
		Produs5.setVisible(false);

		JButton Produs6 = new JButton();
		Produs6.setBorder(new LineBorder(new Color(244, 234, 213)));
		Produs6.setBackground(new Color(53, 47, 68));
		Produs6.setBounds(310, 283, 85, 60);
		Produs6.setVisible(false);

		JButton Produs7 = new JButton();
		Produs7.setBorder(new LineBorder(new Color(244, 234, 213)));
		Produs7.setBackground(new Color(53, 47, 68));
		Produs7.setBounds(462, 283, 85, 60);
		Produs7.setVisible(false);

		JButton Produs8 = new JButton();
		Produs8.setBorder(new LineBorder(new Color(244, 234, 213)));
		Produs8.setBackground(new Color(53, 47, 68));
		Produs8.setBounds(612, 283, 85, 60);
		Produs8.setVisible(false);

		JButton Produs9 = new JButton();
		Produs9.setBorder(new LineBorder(new Color(244, 234, 213)));
		Produs9.setBackground(new Color(53, 47, 68));
		Produs9.setBounds(310, 407, 85, 60);
		Produs9.setVisible(false);

		// vector de cele 10 butoane
		buttons[0] = Produs0;
		buttons[1] = Produs1;
		buttons[2] = Produs2;
		buttons[3] = Produs3;
		buttons[4] = Produs4;
		buttons[5] = Produs5;
		buttons[6] = Produs6;
		buttons[7] = Produs7;
		buttons[8] = Produs8;
		buttons[9] = Produs9;

		// creez 10 labels pentru a descrie Brandul si Modelul trimmerului generat
		// (pentru aspect)
		JLabel Label0 = new JLabel("-");
		Label0.setForeground(new Color(219, 216, 227));
		Label0.setBackground(new Color(240, 240, 240));
		Label0.setBounds(310, 130, 142, 13);
		Label0.setVisible(false);
		JLabel Label1 = new JLabel("-");
		Label1.setForeground(new Color(219, 216, 227));
		Label1.setBackground(new Color(240, 240, 240));
		Label1.setBounds(462, 130, 142, 13);
		Label1.setVisible(false);
		JLabel Label2 = new JLabel("-");
		Label2.setForeground(new Color(219, 216, 227));
		Label2.setBackground(new Color(240, 240, 240));
		Label2.setBounds(612, 130, 142, 13);
		Label2.setVisible(false);
		JLabel Label3 = new JLabel("-");
		Label3.setForeground(new Color(219, 216, 227));
		Label3.setBackground(new Color(240, 240, 240));
		Label3.setBounds(310, 245, 142, 13);
		Label3.setVisible(false);
		JLabel Label4 = new JLabel("-");
		Label4.setForeground(new Color(219, 216, 227));
		Label4.setBackground(new Color(240, 240, 240));
		Label4.setBounds(460, 245, 142, 13);
		Label4.setVisible(false);
		JLabel Label5 = new JLabel("-");
		Label5.setForeground(new Color(219, 216, 227));
		Label5.setBackground(new Color(240, 240, 240));
		Label5.setBounds(612, 245, 142, 13);
		Label5.setVisible(false);
		JLabel Label6 = new JLabel("-");
		Label6.setForeground(new Color(219, 216, 227));
		Label6.setBackground(new Color(240, 240, 240));
		Label6.setBounds(310, 367, 142, 13);
		Label6.setVisible(false);
		JLabel Label7 = new JLabel("-");
		Label7.setForeground(new Color(219, 216, 227));
		Label7.setBackground(new Color(240, 240, 240));
		Label7.setBounds(462, 367, 142, 13);
		Label7.setVisible(false);
		JLabel Label8 = new JLabel("-");
		Label8.setForeground(new Color(219, 216, 227));
		Label8.setBackground(new Color(240, 240, 240));
		Label8.setBounds(612, 367, 142, 13);
		Label8.setVisible(false);
		JLabel Label9 = new JLabel("-");
		Label9.setForeground(new Color(219, 216, 227));
		Label9.setBackground(new Color(240, 240, 240));
		Label9.setBounds(310, 484, 142, 13);
		Label9.setVisible(false);

		// vector de labels
		labels[0] = Label0;
		labels[1] = Label1;
		labels[2] = Label2;
		labels[3] = Label3;
		labels[4] = Label4;
		labels[5] = Label5;
		labels[6] = Label6;
		labels[7] = Label7;
		labels[8] = Label8;
		labels[9] = Label9;
		Generate.setForeground(new Color(219, 216, 227));

		// spinnerul in care dau numarul maxim de trimmere generate (maxim 10 - din
		// "cauze logistice")
		// "cauze logistice" = pentru a imi functiona UI ul specific facut de mine. Daca
		// dadeam un numar maxim random selectat de utilizator, trebuia sa fac n
		// butoane invizibile, n labels, si pentru prezentara am ales 10, sa arate bine,
		// pe viitor o sa modific la un numar nelimitat

		Generate.setBounds(328, 10, 261, 13);
		spinner_1 = new JSpinner();
		spinner_1.setForeground(new Color(219, 216, 227));
		spinner_1.setBorder(new LineBorder(new Color(204, 214, 166)));
		spinner_1.setBackground(new Color(53, 47, 68));
		spinner_1.setBounds(20, 32, 41, 30);
		spinner_1.setModel(new SpinnerNumberModel(1, 1, 10, 1));
		btnNewButton_9.setForeground(new Color(219, 216, 227));

		btnNewButton_9.setBackground(new Color(53, 47, 68));

		btnNewButton_9.setBounds(71, 31, 124, 30);
		btnNewButton_9.setHorizontalTextPosition(SwingConstants.LEFT);
		btnNewButton_9.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		btnNewButton_9.setBorder(new LineBorder(new Color(244, 234, 213)));

		// tot ce tine de generare de trimmere, afisare produse in ui, afisare
		// specificatii este facut in "btnNewButton_9" care este butonul de "Genereaza"
		// din ui

		// 1
		GeneratorInterfata gen = new GeneratorInterfata();
		Sort.setForeground(new Color(219, 216, 227));

		
		
		Sort.setBorder(new LineBorder(new Color(244, 234, 213)));
		Sort.setBackground(new Color(53, 47, 68));
		Sort.setBounds(20, 180, 98, 21);
		contentPane.add(Sort);
		Sort.addItem("Greutate");
		Sort.addItem("Tensiune");
		Sort.addItem("DiametruTaiere");
		Sort.addItem("Putere");
		Cresc.setForeground(new Color(219, 216, 227));

		Cresc.setBorder(new LineBorder(new Color(204, 214, 166)));
		Cresc.setBackground(new Color(92, 84, 112));
		Cresc.setSelected(true);
		buttonGroup.add(Cresc);
		Cresc.setBounds(124, 180, 93, 21);
		contentPane.add(Cresc);

		JCheckBox Desc = new JCheckBox("Descrescator");
		Desc.setForeground(new Color(219, 216, 227));
		Desc.setBorder(new LineBorder(new Color(204, 214, 166)));
		Desc.setBackground(new Color(92, 84, 112));
		buttonGroup.add(Desc);
		Desc.setBounds(124, 209, 93, 21);
		contentPane.add(Desc);

		JLabel SortLabel = new JLabel("Sortare");
		SortLabel.setForeground(new Color(219, 216, 227));
		SortLabel.setAutoscrolls(true);
		SortLabel.setBounds(71, 157, 45, 13);
		contentPane.add(SortLabel);
		SortButton.setForeground(new Color(219, 216, 227));
		SortButton.setBorder(new LineBorder(new Color(244, 234, 213)));
		SortButton.setBackground(new Color(53, 47, 68));
		SortButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btnNewButton_9.setVisible(false);
				spinner_1.setVisible(false);
			}
		});

		// 2
		SortareProduse sort = new SortareProduse();

		SortButton.setBounds(20, 211, 98, 21);
		contentPane.add(SortButton);

		CautaBM.setBorder(new LineBorder(new Color(204, 214, 166)));
		CautaBM.setBackground(new Color(92, 84, 112));
		CautaBM.setBounds(20, 269, 141, 19);
		contentPane.add(CautaBM);
		CautaBM.setColumns(10);
		CautaBMBtn.setForeground(new Color(219, 216, 227));

		CautaBMBtn.setBorder(new LineBorder(new Color(244, 234, 213)));
		CautaBMBtn.setBackground(new Color(53, 47, 68));

		// 3
		CautaProduse cauta = new CautaProduse();

		CautaBMBtn.setBounds(171, 268, 85, 21);
		contentPane.add(CautaBMBtn);

		JLabel lblNewLabel = new JLabel("Cauta: (Brand & Model)");
		lblNewLabel.setForeground(new Color(219, 216, 227));
		lblNewLabel.setBounds(20, 255, 175, 13);
		contentPane.add(lblNewLabel);

		JLabel LabelAcc = new JLabel("Acumulator:");
		LabelAcc.setForeground(new Color(219, 216, 227));
		LabelAcc.setBounds(20, 298, 98, 13);
		contentPane.add(LabelAcc);
		ListaTipAcc.setForeground(new Color(219, 216, 227));

		ListaTipAcc.setBorder(new LineBorder(new Color(244, 234, 213)));
		ListaTipAcc.setBackground(new Color(53, 47, 68));

		ListaTipAcc.setBounds(181, 299, 75, 21);
		contentPane.add(ListaTipAcc);
		AccDA.setForeground(new Color(219, 216, 227));

		AccDA.setBorder(new LineBorder(new Color(204, 214, 166)));
		AccDA.setBackground(new Color(92, 84, 112));

		AccDA.setSelected(true);
		buttonGroup_1.add(AccDA);
		AccDA.setBounds(134, 295, 41, 21);
		contentPane.add(AccDA);
		AccNU.setForeground(new Color(219, 216, 227));
		AccNU.setBorder(new LineBorder(new Color(204, 214, 166)));
		AccNU.setBackground(new Color(92, 84, 112));

		AcumulatorProduse AP = new AcumulatorProduse();

		buttonGroup_1.add(AccNU);
		AccNU.setBounds(134, 318, 41, 21);
		contentPane.add(AccNU);
		LabelST.setForeground(new Color(219, 216, 227));

		LabelST.setBounds(20, 353, 116, 13);
		contentPane.add(LabelST);
		ListaST.setForeground(new Color(219, 216, 227));

		ListaST.setBorder(new LineBorder(new Color(244, 234, 213)));
		ListaST.setBackground(new Color(53, 47, 68));

		// 7
		SistemTaiereProduse SisTaiere = new SistemTaiereProduse();
		CheckST.setForeground(new Color(219, 216, 227));

		CheckST.setBorder(new LineBorder(new Color(204, 214, 166)));
		CheckST.setBackground(new Color(92, 84, 112));

		// 8

		CheckST.setBounds(134, 349, 24, 21);
		contentPane.add(CheckST);

		ListaST.setBounds(166, 349, 90, 21);
		contentPane.add(ListaST);

		JLabel LabelPar = new JLabel("Sorteaza parametrii:");
		LabelPar.setForeground(new Color(219, 216, 227));
		LabelPar.setBounds(20, 392, 155, 13);
		contentPane.add(LabelPar);
		ListaPar.setForeground(new Color(219, 216, 227));

		ListaPar.setBorder(new LineBorder(new Color(244, 234, 213)));
		ListaPar.setBackground(new Color(53, 47, 68));
		ListaVal.setForeground(new Color(219, 216, 227));
		ListaVal.setBorder(new LineBorder(new Color(244, 234, 213)));
		ListaVal.setBackground(new Color(53, 47, 68));

		// 9

		FiltreazaProduse FP = new FiltreazaProduse();

		ListaPar.addItem("Greutate");
		ListaPar.addItem("Tensiune");
		ListaPar.addItem("DiametruTaiere");
		ListaPar.addItem("Putere");
		ListaPar.setBounds(20, 415, 141, 21);
		contentPane.add(ListaPar);

		ListaVal.setBounds(171, 415, 75, 21);
		contentPane.add(ListaVal);
		CautaPV.setForeground(new Color(219, 216, 227));

		CautaPV.setBorder(new LineBorder(new Color(244, 234, 213)));
		CautaPV.setBackground(new Color(53, 47, 68));

		// 10

		CautaPV.setBounds(93, 446, 85, 21);
		contentPane.add(CautaPV);
		contentPane.setLayout(null);
		contentPane.add(spinner_1);
		contentPane.add(btnNewButton_9);
		contentPane.add(Produs6);
		contentPane.add(Produs3);
		contentPane.add(Produs0);
		contentPane.add(Produs7);
		contentPane.add(Produs4);
		contentPane.add(Produs1);
		contentPane.add(Produs8);
		contentPane.add(Produs2);
		contentPane.add(Produs5);
		contentPane.add(Produs9);
		contentPane.add(Label0);
		contentPane.add(Label1);
		contentPane.add(Label2);
		contentPane.add(Label3);
		contentPane.add(Label4);
		contentPane.add(Label5);
		contentPane.add(Label6);
		contentPane.add(Label7);
		contentPane.add(Label8);
		contentPane.add(Label9);
		contentPane.add(Generate);
	}

	public JSpinner getSpinner() {
		return spinner_1;
	}

	public void subFereastra() {

		// creez un nou frame
		JFrame frametmp = new JFrame();
		frametmp.setVisible(true);
		frametmp.setTitle("Specificatii Produs");
		frametmp.setBounds(100, 100, 1320, 150);

		// afisez un Label pe nou frame cu specificatiile produsului respectiv
		JLabel Labelspec = new JLabel("-");
		Labelspec.setVisible(true);
		Labelspec.setBounds(0, 0, 20, 20);

		Labelspec.setText(trimmerelectric.toString());
		contentPane.add(Labelspec);
		Labelspec.updateUI();
		frametmp.getContentPane().add(Labelspec);
		// frametmp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}
