package Tabel;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.Calendar;
import java.util.Date;
import javax.swing.table.DefaultTableModel;
import com.ibm.icu.text.DateFormat;
import com.ibm.icu.text.SimpleDateFormat;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Flights extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Flights frame = new Flights();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Flights() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1035, 560);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JToolBar toolBar = new JToolBar();
		contentPane.add(toolBar, BorderLayout.NORTH);
		
		// Butonul de modificare zbor;
		JButton btnModificareZbor = new JButton("Modificare Zbor");
		btnModificareZbor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// InputDialog pentru modificareZbor;
				JPanel modificareZbor = new JPanel();
				modificareZbor.setLayout(new GridLayout(10, 1));
				// JTextField-urile pentru fiecare optiune;
				JTextField txtCodSursa = new JTextField(10);
				JTextField txtNumeCompanie = new JTextField(10);
				JTextField txtTipCalatorie = new JTextField(10);
				JTextField txtClasa1 = new JTextField(10);
				JTextField txtClasa2 = new JTextField(10);
				JTextField txtPret = new JTextField(10);
				JTextField txtAeroportPlecare = new JTextField(10);
				JTextField txtAeroportSosire = new JTextField(10);
				JTextField txtTimpPlecare = new JTextField(10);
				JTextField txtTimpSosire = new JTextField(10);
				
				// Label pentru codSursa;
				modificareZbor.add(new JLabel("Cod Sursa: "));
				modificareZbor.add(txtCodSursa);
				modificareZbor.add(Box.createHorizontalStrut(15));
				
				// Label pentru numeCompanie;
				modificareZbor.add(new JLabel("Nume Companie: "));
				modificareZbor.add(txtNumeCompanie);
				modificareZbor.add(Box.createVerticalStrut(15));
				
				// Label pentru tipCalatorie;
				modificareZbor.add(new JLabel("Tip Calatorie: "));
				modificareZbor.add(txtTipCalatorie);
				modificareZbor.add(Box.createVerticalStrut(15));
				
				// Label pentru clasa1;
				modificareZbor.add(new JLabel("Clasa 1: "));
				modificareZbor.add(txtClasa1);
				modificareZbor.add(Box.createVerticalStrut(15));
				
				// Label pentru clasa2;
				modificareZbor.add(new JLabel("Clasa 2: "));
				modificareZbor.add(txtClasa2);
				modificareZbor.add(Box.createVerticalStrut(15));
				
				// Label pentru Pret;
				modificareZbor.add(new JLabel("Pret: "));
				modificareZbor.add(txtPret);
				modificareZbor.add(Box.createVerticalStrut(15));
				
				// Label pentru aeroportPlecare;
				modificareZbor.add(new JLabel("Aeroport Plecare: "));
				modificareZbor.add(txtAeroportPlecare);
				modificareZbor.add(Box.createVerticalStrut(15));
				
				// Label pentru aeroportSosire;
				modificareZbor.add(new JLabel("Aeroport Sosire: "));
				modificareZbor.add(txtAeroportSosire);
				modificareZbor.add(Box.createVerticalStrut(15));
				
				// Label pentru timpPlecare;
				modificareZbor.add(new JLabel("Timp Plecare: "));
				modificareZbor.add(txtTimpPlecare);
				modificareZbor.add(Box.createVerticalStrut(15));
				
				// Label pentru timpSosire;
				modificareZbor.add(new JLabel("Timp Sosire: "));
				modificareZbor.add(txtTimpSosire);
				modificareZbor.add(Box.createVerticalStrut(15));
				
				DefaultTableModel modelTabel = (DefaultTableModel)table.getModel();
				
				// Se verifica daca s-a selectat cel putin un zbor;
				int selectedRowIndex = table.getSelectedRow();
				if (selectedRowIndex == -1)
					JOptionPane.showMessageDialog(null, "Selectati cel putin un zbor!");
				else {
				// Variabilele din textField;
					int result = JOptionPane.showConfirmDialog(null, modificareZbor, "Modificare Zbor", JOptionPane.OK_CANCEL_OPTION);
					if (result == JOptionPane.OK_OPTION) {
						modelTabel.setValueAt(txtCodSursa.getText(), selectedRowIndex, 0);
						modelTabel.setValueAt(txtNumeCompanie.getText(), selectedRowIndex, 1);
						modelTabel.setValueAt(txtTipCalatorie.getText(), selectedRowIndex, 2);
						modelTabel.setValueAt(txtClasa1.getText(), selectedRowIndex, 3);
						modelTabel.setValueAt(txtClasa2.getText(), selectedRowIndex, 4);
						modelTabel.setValueAt(txtPret.getText(), selectedRowIndex, 5);
						modelTabel.setValueAt(txtAeroportPlecare.getText(), selectedRowIndex, 6);
						modelTabel.setValueAt(txtAeroportSosire.getText(), selectedRowIndex, 7);
						modelTabel.setValueAt(txtTimpPlecare.getText(), selectedRowIndex, 8);
						modelTabel.setValueAt(txtTimpSosire.getText(), selectedRowIndex, 9);
					}
				}
				
			}
		});
		btnModificareZbor.setFont(new Font("Georgia", Font.PLAIN, 13));
		toolBar.add(btnModificareZbor);
		
		// Butonul de stergere zbor;
		JButton btnStergereZbor = new JButton("Stergere Zbor");
		// Functia din cursul de PJ, unde se parcurge de la coada la cap;
		btnStergereZbor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel dataModel = (DefaultTableModel)table.getModel();
				int[] indexSelected = table.getSelectedRows();
				
				// Se verifica daca s-a selectat cel putin un zbor
				if (indexSelected.length == 0) {
					JOptionPane.showMessageDialog(null, "Selectati cel putin un zbor!");
				}
				else {
					for (int i = indexSelected.length - 1; i >= 0; i--)
						dataModel.removeRow(indexSelected[i]);
				}
			}
		});
		btnStergereZbor.setFont(new Font("Georgia", Font.PLAIN, 13));
		toolBar.add(btnStergereZbor);
		
		/*
		 -> Date pentru adaugare in tabel, am luat doar cateva exemple, pentru a putea face functiile de modificare si stergere
		 -> Legat de Calendar, faza cu variabila Date am luat-o de pe Google, probabil ca se putea face si cum a spus proful la PJ, insa mi se pare mult mai useful varianta asta
		 */
		/* data este pentru timpPlecare, data2 este pentru timpSosire (sunt variabile random, cred ca ia timp-ul actual din moment ce rulezi, insa poate fi schimbata);
		Intrucat datele vor fi luate din JSON, variabila timpPlecare si timpSosire va fi String, care va fi convertita probabil in variabila de tip Date, pentru a putea fi folosita ulterior in anumite cazuri (daca e nevoie)
		String dataPlecare = "23-03-2020 20:00:50";
		String dataSosire = "23-03-2020 22:00:50";
		SimpleDateFormat format = new SimpleDateFormat("dd-MMM-yyyy HH:mm:ss");
		Date dataFormatPlecare = format.parse(dataPlecare);
		Date dataFormatSosire = format.parse(dataSosire);
		
		Mai sus e codul pentru convertire din String in variabila de tip Data;
		*/
		// intrucat se pot pune doar string-uri in JTabel, aveam nevoie sa le parsez in String;
		// Data pentru timpPlecare;
		Date data = Calendar.getInstance().getTime();
		// Data pentru timpSosire;
		Date data2 = Calendar.getInstance().getTime();
		// Format-ul pe care l-am ales;
		DateFormat dataFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
		// Convertirea in String;
		String strData = dataFormat.format(data);
		String strData2 = dataFormat.format(data2);
		
		// Matricea ce contine datele din JTabel
		String[][] date = { 
				{"a1", "Lufthansa", tipAvion.Personal.toString(), Integer.toString(1), Integer.toString(0), Double.toString(23.03), "Timisoara", "Bucuresti", strData, strData2},
				{"a2", "Wizz Air", tipAvion.Comercial.toString(), Integer.toString(0), Integer.toString(1), Double.toString(10.50), "Iasi", "Craiova", strData, strData2},
				{"a3", "RyanAir", tipAvion.Personal.toString(), Integer.toString(1), Integer.toString(0), Double.toString(13.30), "Constanta", "Istanbul", strData, strData2}
		};
		
		// Vectorul ce contine coloanele din JTabel;
		String[] coloane = {"Cod Cursa", "Nume Companie", "Tip Calatorie", "Clasa 1", "Clasa 2", "Pret", "Aeroport Plecare", "Aeroport Sosire", "Timp Plecare", "Timp Sosire"};
		
		/* Panel-ul ce contine tabelul */
		JPanel panel = new JPanel();
		panel.setBorder(null);
		contentPane.add(panel, BorderLayout.CENTER);
		
		
		// Exemplul din cursul de PJ, unde am nevoie sa ma folosesc de DefaultTableModel;
		DefaultTableModel tableModel = new DefaultTableModel(date, coloane);
		panel.setLayout(null);
		table = new JTable(tableModel);
		table.setBorder(null);
		JScrollPane sp = new JScrollPane(table);
		sp.setBounds(10, 5, 989, 461);
		panel.add(sp);
		setVisible(true);
	}
}
