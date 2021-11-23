package proiectBD;

import java.awt.BorderLayout;
import java.util.*;
import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.border.Border;

public class PaginaPrincipala {

	static int index = 0;
	static int count = 0;
	static int metodaPlata = 0;
	static int cantitateCos = 0;
	static JFrame frameCos = new JFrame();
	static JFrame frameContact = new JFrame();
	static JFrame frameProduse = new JFrame();
	static JFrame frameBranduri = new JFrame();
	static JFrame frameCreareCont = new JFrame();
	static JFrame frameButonAdresa = new JFrame();
	static JFrame frameLogIn = new JFrame();
	static JTextField total = new JTextField("0");
	static int totalComanda = 0;
	static int numarInregistrari=0;

	public static JFrame createFrame() {

		total.setEditable(false);

		Border blackLine;

		blackLine = BorderFactory.createLineBorder(Color.black);

		JFrame frame1 = new JFrame("Teo & Aura SRL");
		Container mainPanel = frame1.getContentPane();
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();

		mainPanel.setBackground(Color.cyan);

		String str = "TEO & AURA SRL";
		JLabel txt = new JLabel(str);
		txt.setFont(new Font("Brush Script MT", Font.PLAIN, 36));
		txt.setForeground(Color.cyan);
		panel1.setBackground(Color.black);
		panel1.add(txt);

		JButton meniu = new JButton("Meniu");
		meniu.setBackground(Color.black);
		meniu.setForeground(Color.cyan);
		meniu.setSize(30, 30);
		panel2.setBackground(Color.black);
		panel2.setBorder(blackLine);
		panel2.setPreferredSize(new Dimension(200, 800));
		panel2.add(meniu);

		JButton contact = new JButton("Contact magazin");
		contact.setBackground(Color.black);
		contact.setForeground(Color.cyan);

		String[] categoriiString = { "produse", "ruj", "rimel", "pudra", "fard pleoape", "fond de ten", "pensula" };

		JComboBox<String> categorii = new JComboBox<String>(categoriiString);
		categorii.setPreferredSize(new Dimension(50, 50));

		JButton creareCont = new JButton("Creare cont");
		creareCont.setBackground(Color.black);
		creareCont.setForeground(Color.cyan);
		
		JButton login = new JButton("Intra in cont");
		login.setBackground(Color.black);
		login.setForeground(Color.cyan);

		JButton branduri = new JButton("Branduri");
		branduri.setBackground(Color.black);
		branduri.setForeground(Color.cyan);

		JButton cos = new JButton("Cos de cumparaturi");
		cos.setBackground(Color.black);
		cos.setForeground(Color.cyan);

		panel2.setLayout(new BoxLayout(panel2, BoxLayout.Y_AXIS));
		panel2.setAlignmentY(Component.LEFT_ALIGNMENT);

		panel2.add(contact);
		panel2.add(categorii);
		panel2.add(creareCont);
		panel2.add(branduri);
		panel2.add(cos);

		panel3.setBackground(Color.white);

		mainPanel.add(panel1, BorderLayout.PAGE_START);
		mainPanel.add(panel2, BorderLayout.LINE_START);
		mainPanel.add(panel3, BorderLayout.CENTER);

		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame1.setSize(600, 520);
		frame1.setLocation(440, 110);
		
		frame1.setContentPane(mainPanel);
		frame1.setVisible(true);

		return frame1;

	}

	public static void main(String[] args) {
		Cos c = new Cos();
		Demo d = new Demo();
		d.conectare();

		JFrame frame = new JFrame("Adresa URL");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(800, 600);
		frame.setLocationRelativeTo(null);

		JPanel panel = new JPanel();
		panel.setBackground(Color.white);
		ImageIcon img = new ImageIcon("img.png");
		JLabel imgLabel = new JLabel();
		imgLabel.setPreferredSize(new Dimension(800, 300));
		JLabel searchImg = new JLabel();
		ImageIcon imgSearch = new ImageIcon("src1.png");
		searchImg.setPreferredSize(new Dimension(50, 90));
		JTextField url = new JTextField("Introducere adresa URL", 30);
		JButton b = new JButton("Acceseaza");
		b.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String adresaUrl = "www.beautySRL.ro";
				if (adresaUrl.equals(url.getText())) {
					Border blackLine;

					blackLine = BorderFactory.createLineBorder(Color.black);

					JFrame frame1 = new JFrame("Teo & Aura SRL");
					
					Container mainPanel = frame1.getContentPane();
					JPanel panel1 = new JPanel();
					JPanel panel2 = new JPanel();
					JPanel panel3 = new JPanel();

					mainPanel.setBackground(Color.cyan);

					String str = "TEO & AURA SRL";
					JLabel txt = new JLabel(str);
					txt.setFont(new Font("Brush Script MT", Font.PLAIN, 36));
					txt.setForeground(Color.cyan);
					panel1.setBackground(Color.black);
					panel1.add(txt);

					JButton meniu = new JButton("Meniu");
					meniu.setBackground(Color.black);
					meniu.setForeground(Color.cyan);
					meniu.setSize(30, 30);
					panel2.setBackground(Color.black);
					panel2.setBorder(blackLine);
					panel2.setPreferredSize(new Dimension(200, 800));
					panel2.add(meniu);

					meniu.addActionListener(new ActionListener() {

						@Override
						public void actionPerformed(ActionEvent arg0) {

							JButton contact = new JButton("Contact magazin");
							contact.setBackground(Color.black);
							contact.setForeground(Color.cyan);

							String[] categoriiString = { "produse", "ruj", "rimel", "pudra", "fard pleoape",
									"fond de ten", "pensula" };

							JComboBox<String> categorii = new JComboBox<String>(categoriiString);
							categorii.setPreferredSize(new Dimension(50, 50));

							JButton creareCont = new JButton("Creare cont");
							creareCont.setBackground(Color.black);
							creareCont.setForeground(Color.cyan);
							
							JButton login = new JButton("Intra in cont");
							login.setBackground(Color.black);
							login.setForeground(Color.cyan);

							JButton branduri = new JButton("Branduri");
							branduri.setBackground(Color.black);
							branduri.setForeground(Color.cyan);

							JButton cos = new JButton("Cos de cumparaturi");
							cos.setBackground(Color.black);
							cos.setForeground(Color.cyan);

							panel2.setLayout(new BoxLayout(panel2, BoxLayout.Y_AXIS));
							panel2.setAlignmentY(Component.LEFT_ALIGNMENT);

							panel2.add(contact);
							panel2.add(categorii);
							panel2.add(branduri);
							panel2.add(cos);
							panel2.add(creareCont);
							panel2.add(login);

							contact.addActionListener(new ActionListener() {

								@Override
								public void actionPerformed(ActionEvent arg0) {

									JPanel panelContact = new JPanel();

									panelContact.setLayout(new GridLayout(4, 1));

									Obiect o = new Obiect("SELECT nume_magazin FROM contact_magazin", "nume_magazin");
									o = d.statements(o);
									Obiect o1 = new Obiect("SELECT numar_telefon FROM contact_magazin",
											"numar_telefon");
									o1 = d.statements(o1);
									Obiect o2 = new Obiect("SELECT adresa_email FROM contact_magazin", "adresa_email");
									o2 = d.statements(o2);
									Obiect o3 = new Obiect("SELECT adresa_URL FROM contact_magazin", "adresa_URL");
									o3 = d.statements(o3);

									JLabel numeMagazin = new JLabel("Numele magazinului este: " + o.getReturnat());
									numeMagazin.setHorizontalAlignment(numeMagazin.CENTER);
									JLabel numarTelefon = new JLabel("Numarul de telefon este: " + o1.getReturnat());
									numarTelefon.setHorizontalAlignment(numeMagazin.CENTER);
									JLabel adresaEmail = new JLabel("Adresa de email este: " + o2.getReturnat());
									JLabel adresaUrl = new JLabel("Adresa URL este: " + o3.getReturnat());

									panelContact.add(numeMagazin);
									panelContact.add(numarTelefon);
									adresaEmail.setHorizontalAlignment(numeMagazin.CENTER);
									panelContact.add(adresaEmail);
									adresaUrl.setHorizontalAlignment(numeMagazin.CENTER);
									panelContact.add(adresaUrl);
									panelContact.setBackground(Color.white);

									/*
									 * JFrame contact = new JFrame("Contact");
									 * 
									 * contact.setContentPane(panel3); contact.setVisible(true);
									 */

									frameContact = createFrame();

									frameContact.setContentPane(panelContact);

									frame.setVisible(false);
									frameProduse.setVisible(false);
									frameCos.setVisible(false);

								}
							});
							frame1.setContentPane(panel2);

							categorii.addItemListener(new ItemListener() {

								public void itemStateChanged(ItemEvent event) {

									JComboBox comboBox = (JComboBox) event.getSource();
									JPanel panelProduse = new JPanel();

									Object item = event.getItem();
									String s = item.toString();

									if (s.equals("ruj")) {

										Produs p = new Produs("SELECT * FROM produs WHERE (nume_categorie = 'ruj');");
										p = d.statements1(p);

										int disponibilitate = p.cantitate;

										for (int i = 0; i < p.pret.size(); i++) {

											String prod = p.produse.get(i);
											int pret = p.pret.get(i);
											int idProdus = p.idProdus.get(i);

											panelProduse.setLayout(new GridLayout(8, 1));

											JPanel panel4 = new JPanel();
											panel4.setLayout(new FlowLayout());
											JButton adauga = new JButton("+");
											adauga.setPreferredSize(new Dimension(50, 50));
											JButton adaugaCos = new JButton("Adauga in cos");
											adaugaCos.setPreferredSize(new Dimension(200, 50));
											JTextField cantitate = new JTextField("0");
											cantitate.setPreferredSize(new Dimension(30, 30));
											JButton sterge = new JButton("-");
											sterge.setPreferredSize(new Dimension(50, 50));

											panel4.add(adauga);
											panel4.add(cantitate);
											panel4.add(sterge);
											panel4.add(adaugaCos);

											adauga.addActionListener(new ActionListener() {

												@Override
												public void actionPerformed(ActionEvent arg0) {

													if (count < disponibilitate) {

														count++;
														cantitateCos = count;
														cantitate.setText(Integer.toString(count));

													} else {
														JOptionPane.showMessageDialog(url, "Cantitatea maxima!");
													}

												}
											});

											sterge.addActionListener(new ActionListener() {

												@Override
												public void actionPerformed(ActionEvent arg0) {

													if (count > 0) {

														count--;
														cantitateCos = count;
														cantitate.setText(Integer.toString(count));

													}

												}
											});

											adaugaCos.addActionListener(new ActionListener() {

												@Override
												public void actionPerformed(ActionEvent arg0) {

													c.produse.add(prod);
													c.cantitate.add(cantitateCos);
													c.pret.add(pret);
													c.idProdus.add(idProdus);
													count = 0;
													// System.out.println(c.idProdus);

//													    System.out.println("Produsul este " +c.produse);
//														System.out.println("Pretul este " +c.cantitate);

												}
											});

											JLabel l1 = new JLabel("Numele produsului este: " + p.produse.get(i));
											l1.setPreferredSize(new Dimension(5, 5));
											JLabel l2 = new JLabel("Pretul produsului este: " + p.pret.get(i));
											l2.setPreferredSize(new Dimension(10, 10));
											JLabel l3 = new JLabel("Firma produsului este: " + p.firma.get(i));
											l3.setPreferredSize(new Dimension(10, 10));

											panelProduse.add(l1);
											panelProduse.add(l2);
											panelProduse.add(l3);
											panelProduse.add(panel4);
											panelProduse.setBackground(Color.white);

										}

										frameProduse = createFrame();

										frameProduse.setContentPane(panelProduse);

										frame.setVisible(false);
										frameCos.setVisible(false);
										frameContact.setVisible(false);

									}

									if (s.equals("rimel")) {

										JPanel panelProduse1 = new JPanel();

										Produs p = new Produs("SELECT * FROM produs WHERE (nume_categorie = 'rimel');");
										p = d.statements1(p);

										int disponibilitate = p.cantitate;

										for (int i = 0; i < p.pret.size(); i++) {

											String prod = p.produse.get(i);
											int pret = p.pret.get(i);
											int idProdus = p.idProdus.get(i);

											panelProduse1.setLayout(new GridLayout(12, 1));

											JPanel panel4 = new JPanel();
											panel4.setLayout(new FlowLayout());
											panel4.setPreferredSize(new Dimension(50, 50));
											JButton adauga = new JButton("+");
											adauga.setPreferredSize(new Dimension(50, 50));
											JButton adaugaCos = new JButton("Adauga in cos");
											adaugaCos.setPreferredSize(new Dimension(200, 40));
											JTextField cantitate = new JTextField("0");
											cantitate.setPreferredSize(new Dimension(30, 30));
											JButton sterge = new JButton("-");
											sterge.setPreferredSize(new Dimension(50, 50));

											panel4.add(adauga);
											panel4.add(cantitate);
											panel4.add(sterge);
											panel4.add(adaugaCos);

											adauga.addActionListener(new ActionListener() {

												@Override
												public void actionPerformed(ActionEvent arg0) {

													if (count < disponibilitate) {

														count++;
														cantitateCos = count;
														cantitate.setText(Integer.toString(count));

													} else {
														JOptionPane.showMessageDialog(url, "Cantitatea maxima!");
													}

												}
											});

											sterge.addActionListener(new ActionListener() {

												@Override
												public void actionPerformed(ActionEvent arg0) {

													if (count > 0) {

														count--;
														cantitateCos = count;
														cantitate.setText(Integer.toString(count));

													}

												}
											});

											adaugaCos.addActionListener(new ActionListener() {

												@Override
												public void actionPerformed(ActionEvent arg0) {

													c.produse.add(prod);
													c.cantitate.add(cantitateCos);
													c.pret.add(pret);
													c.idProdus.add(idProdus);
													count = 0;

													// System.out.println("Produsul este " +c.produse);
													// System.out.println("Pretul este " +c.cantitate);
												}
											});

											JLabel l1 = new JLabel("Numele produsului este: " + p.produse.get(i));
											l1.setPreferredSize(new Dimension(5, 5));
											JLabel l2 = new JLabel("Pretul produsului este: " + p.pret.get(i));
											l2.setPreferredSize(new Dimension(10, 10));
											JLabel l3 = new JLabel("Firma produsului este: " + p.firma.get(i));
											l3.setPreferredSize(new Dimension(10, 10));

											panelProduse1.add(l1);
											panelProduse1.add(l2);
											panelProduse1.add(l3);
											panelProduse1.add(panel4);
											panelProduse1.setBackground(Color.white);

										}

										frameProduse = createFrame();

										frameProduse.setContentPane(panelProduse1);

										frame.setVisible(false);
										frameCos.setVisible(false);
										frameContact.setVisible(false);

									}

									if (s.equals("pudra")) {

										JPanel panelProduse2 = new JPanel();
										Produs p = new Produs("SELECT * FROM produs WHERE (nume_categorie = 'pudra');");
										p = d.statements1(p);

										int disponibilitate = p.cantitate;

										for (int i = 0; i < p.pret.size(); i++) {

											String prod = p.produse.get(i);
											int pret = p.pret.get(i);
											int idProdus = p.idProdus.get(i);

											panelProduse2.setLayout(new GridLayout(8, 1));

											JPanel panel4 = new JPanel();
											panel4.setLayout(new FlowLayout());
											panel4.setPreferredSize(new Dimension(50, 50));
											JButton adauga = new JButton("+");
											adauga.setPreferredSize(new Dimension(50, 50));
											JButton adaugaCos = new JButton("Adauga in cos");
											adaugaCos.setPreferredSize(new Dimension(200, 40));
											JTextField cantitate = new JTextField("0");
											cantitate.setPreferredSize(new Dimension(30, 30));
											JButton sterge = new JButton("-");
											sterge.setPreferredSize(new Dimension(50, 50));

											panel4.add(adauga);
											panel4.add(cantitate);
											panel4.add(sterge);
											panel4.add(adaugaCos);

											adauga.addActionListener(new ActionListener() {

												@Override
												public void actionPerformed(ActionEvent arg0) {

													if (count < disponibilitate) {

														count++;
														cantitateCos = count;
														cantitate.setText(Integer.toString(count));

													} else {
														JOptionPane.showMessageDialog(url, "Cantitatea maxima!");
													}

												}
											});

											sterge.addActionListener(new ActionListener() {

												@Override
												public void actionPerformed(ActionEvent arg0) {

													if (count > 0) {

														count--;
														cantitateCos = count;
														cantitate.setText(Integer.toString(count));

													}

												}
											});

											adaugaCos.addActionListener(new ActionListener() {

												@Override
												public void actionPerformed(ActionEvent arg0) {

													c.produse.add(prod);
													c.cantitate.add(cantitateCos);
													c.pret.add(pret);
													c.idProdus.add(idProdus);
													count = 0;

													// System.out.println("Produsul este " +c.produse);
													// System.out.println("Pretul este " +c.cantitate);
												}
											});

											JLabel l1 = new JLabel("Numele produsului este: " + p.produse.get(i));
											l1.setPreferredSize(new Dimension(5, 5));
											JLabel l2 = new JLabel("Pretul produsului este: " + p.pret.get(i));
											l2.setPreferredSize(new Dimension(10, 10));
											JLabel l3 = new JLabel("Firma produsului este: " + p.firma.get(i));
											l3.setPreferredSize(new Dimension(10, 10));

											panelProduse2.add(l1);
											panelProduse2.add(l2);
											panelProduse2.add(l3);
											panelProduse2.add(panel4);
											panelProduse2.setBackground(Color.white);

										}

										frameProduse = createFrame();

										frameProduse.setContentPane(panelProduse2);

										frame.setVisible(false);
										frameCos.setVisible(false);
										frameContact.setVisible(false);

									}

									if (s.equals("fard pleoape")) {

										JPanel panelProduse3 = new JPanel();
										Produs p = new Produs(
												"SELECT * FROM produs WHERE (nume_categorie = 'fard pleoape');");
										p = d.statements1(p);

										int disponibilitate = p.cantitate;

										for (int i = 0; i < p.pret.size(); i++) {

											String prod = p.produse.get(i);
											int pret = p.pret.get(i);
											int idProdus = p.idProdus.get(i);

											panelProduse3.setLayout(new GridLayout(8, 1));

											JPanel panel4 = new JPanel();
											panel4.setLayout(new FlowLayout());
											panel4.setPreferredSize(new Dimension(50, 50));
											JButton adauga = new JButton("+");
											adauga.setPreferredSize(new Dimension(50, 50));
											JButton adaugaCos = new JButton("Adauga in cos");
											adaugaCos.setPreferredSize(new Dimension(200, 40));
											JTextField cantitate = new JTextField("0");
											cantitate.setPreferredSize(new Dimension(30, 30));
											JButton sterge = new JButton("-");
											sterge.setPreferredSize(new Dimension(50, 50));

											panel4.add(adauga);
											panel4.add(cantitate);
											panel4.add(sterge);
											panel4.add(adaugaCos);

											adauga.addActionListener(new ActionListener() {

												@Override
												public void actionPerformed(ActionEvent arg0) {

													if (count < disponibilitate) {

														count++;
														cantitateCos = count;
														cantitate.setText(Integer.toString(count));

													} else {
														JOptionPane.showMessageDialog(url, "Cantitatea maxima!");
													}

												}
											});

											sterge.addActionListener(new ActionListener() {

												@Override
												public void actionPerformed(ActionEvent arg0) {

													if (count > 0) {

														count--;
														cantitateCos = count;
														cantitate.setText(Integer.toString(count));

													}

												}
											});

											adaugaCos.addActionListener(new ActionListener() {

												@Override
												public void actionPerformed(ActionEvent arg0) {

													c.produse.add(prod);
													c.cantitate.add(cantitateCos);
													c.pret.add(pret);
													c.idProdus.add(idProdus);
													count = 0;

													// System.out.println("Produsul este " +c.produse);
													// System.out.println("Pretul este " +c.cantitate);
												}
											});

											JLabel l1 = new JLabel("Numele produsului este: " + p.produse.get(i));
											l1.setPreferredSize(new Dimension(5, 5));
											JLabel l2 = new JLabel("Pretul produsului este: " + p.pret.get(i));
											l2.setPreferredSize(new Dimension(10, 10));
											JLabel l3 = new JLabel("Firma produsului este: " + p.firma.get(i));
											l3.setPreferredSize(new Dimension(10, 10));

											panelProduse3.add(l1);
											panelProduse3.add(l2);
											panelProduse3.add(l3);
											panelProduse3.add(panel4);

											panelProduse3.setBackground(Color.white);
										}

										frameProduse = createFrame();

										frameProduse.setContentPane(panelProduse3);

										frame.setVisible(false);
										frameCos.setVisible(false);
										frameContact.setVisible(false);

									}

									if (s.equals("fond de ten")) {

										JPanel panelProduse4 = new JPanel();
										Produs p = new Produs(
												"SELECT * FROM produs WHERE (nume_categorie = 'fond de ten');");
										p = d.statements1(p);

										int disponibilitate = p.cantitate;

										for (int i = 0; i < p.pret.size(); i++) {

											String prod = p.produse.get(i);
											int pret = p.pret.get(i);
											int idProdus = p.idProdus.get(i);

											panelProduse4.setLayout(new GridLayout(8, 1));

											JPanel panel4 = new JPanel();
											panel4.setLayout(new FlowLayout());
											panel4.setPreferredSize(new Dimension(50, 50));
											JButton adauga = new JButton("+");
											adauga.setPreferredSize(new Dimension(50, 50));
											JButton adaugaCos = new JButton("Adauga in cos");
											adaugaCos.setPreferredSize(new Dimension(200, 40));
											JTextField cantitate = new JTextField("0");
											cantitate.setPreferredSize(new Dimension(30, 30));
											JButton sterge = new JButton("-");
											sterge.setPreferredSize(new Dimension(50, 50));

											panel4.add(adauga);
											panel4.add(cantitate);
											panel4.add(sterge);
											panel4.add(adaugaCos);

											adauga.addActionListener(new ActionListener() {

												@Override
												public void actionPerformed(ActionEvent arg0) {

													if (count < disponibilitate) {

														count++;
														cantitateCos = count;
														cantitate.setText(Integer.toString(count));

													} else
														JOptionPane.showMessageDialog(url, "Cantitatea maxima!");

												}
											});

											sterge.addActionListener(new ActionListener() {

												@Override
												public void actionPerformed(ActionEvent arg0) {

													if (count > 0) {

														count--;
														cantitateCos = count;
														cantitate.setText(Integer.toString(count));

													}

												}
											});

											adaugaCos.addActionListener(new ActionListener() {

												@Override
												public void actionPerformed(ActionEvent arg0) {

													c.produse.add(prod);
													c.cantitate.add(cantitateCos);
													c.pret.add(pret);
													c.idProdus.add(idProdus);
													count = 0;

													// System.out.println("Produsul este " +c.produse);
													// System.out.println("Pretul este " +c.cantitate);
												}
											});

											JLabel l1 = new JLabel("Numele produsului este: " + p.produse.get(i));
											l1.setPreferredSize(new Dimension(5, 5));
											JLabel l2 = new JLabel("Pretul produsului este: " + p.pret.get(i));
											l2.setPreferredSize(new Dimension(10, 10));
											JLabel l3 = new JLabel("Firma produsului este: " + p.firma.get(i));
											l3.setPreferredSize(new Dimension(10, 10));

											panelProduse4.add(l1);
											panelProduse4.add(l2);
											panelProduse4.add(l3);
											panelProduse4.add(panel4);
											panelProduse.setBackground(Color.white);

										}

										frameProduse = createFrame();

										frameProduse.setContentPane(panelProduse4);

										frame.setVisible(false);
										frameCos.setVisible(false);
										frameContact.setVisible(false);

									}

									if (s.equals("pensula")) {

										JPanel panelProduse5 = new JPanel();
										Produs p = new Produs(
												"SELECT * FROM produs WHERE (nume_categorie = 'pensula');");
										p = d.statements1(p);

										int disponibilitate = p.cantitate;

										for (int i = 0; i < p.pret.size(); i++) {

											String prod = p.produse.get(i);
											int pret = p.pret.get(i);
											int idProdus = p.idProdus.get(i);

											panelProduse5.setLayout(new GridLayout(8, 1));

											JPanel panel4 = new JPanel();
											panel4.setLayout(new FlowLayout());
											panel4.setPreferredSize(new Dimension(50, 50));
											JButton adauga = new JButton("+");
											adauga.setPreferredSize(new Dimension(50, 50));
											JButton adaugaCos = new JButton("Adauga in cos");
											adaugaCos.setPreferredSize(new Dimension(200, 40));
											JTextField cantitate = new JTextField("0");
											cantitate.setPreferredSize(new Dimension(30, 30));
											JButton sterge = new JButton("-");
											sterge.setPreferredSize(new Dimension(50, 50));

											panel4.add(adauga);
											panel4.add(cantitate);
											panel4.add(sterge);
											panel4.add(adaugaCos);

											adauga.addActionListener(new ActionListener() {

												@Override
												public void actionPerformed(ActionEvent arg0) {

													if (count < disponibilitate) {

														count++;
														cantitateCos = count;
														cantitate.setText(Integer.toString(count));

													} else {
														JOptionPane.showMessageDialog(url, "Cantitatea maxima!");
													}

												}
											});

											sterge.addActionListener(new ActionListener() {

												@Override
												public void actionPerformed(ActionEvent arg0) {

													if (count > 0) {

														count--;
														cantitateCos = count;
														cantitate.setText(Integer.toString(count));

													}

												}
											});

											adaugaCos.addActionListener(new ActionListener() {

												@Override
												public void actionPerformed(ActionEvent arg0) {

													c.produse.add(prod);
													c.cantitate.add(cantitateCos);
													c.pret.add(pret);
													c.idProdus.add(idProdus);
													count = 0;

													// System.out.println("Produsul este " +c.produse);
													// System.out.println("Pretul este " +c.cantitate);
												}
											});

											JLabel l1 = new JLabel("Numele produsului este: " + p.produse.get(i));
											l1.setPreferredSize(new Dimension(5, 5));
											JLabel l2 = new JLabel("Pretul produsului este: " + p.pret.get(i));
											l2.setPreferredSize(new Dimension(10, 10));
											JLabel l3 = new JLabel("Firma produsului este: " + p.firma.get(i));
											l3.setPreferredSize(new Dimension(10, 10));

											panelProduse5.add(l1);
											panelProduse5.add(l2);
											panelProduse5.add(l3);
											panelProduse5.add(panel4);
											panelProduse5.setBackground(Color.white);

										}

										frameProduse = createFrame();

										frameProduse.setContentPane(panelProduse5);

										frame.setVisible(false);
										frameCos.setVisible(false);
										frameContact.setVisible(false);

									}

								}

							});


							branduri.addActionListener(new ActionListener() {
								
								@Override
								public void actionPerformed(ActionEvent e) {
									
									JPanel panelBranduri = new JPanel();
									JLabel jl = new JLabel("Brandurile gasite la noi sunt: ");
									panelBranduri.add(jl, new FlowLayout());
									Produs p = new Produs("SELECT distinct firma FROM produs;");
									p = d.statements2(p);
									for(int i = 0 ; i < p.firma.size(); i ++) {
										JPanel pa = new JPanel();
										JLabel l3 = new JLabel(p.firma.get(i));
										
										pa.add(l3);
										panelBranduri.add(l3);
										panelBranduri.add(pa);
										panelBranduri.setLayout(new BoxLayout(panelBranduri, BoxLayout.Y_AXIS));
										
							
									}
									
									frameBranduri = createFrame();
									
									frameBranduri.setContentPane(panelBranduri);
									
									frame.setVisible(false);
									frameProduse.setVisible(false);
									frameCos.setVisible(false);
								}
							});	        			
							
							
							creareCont.addActionListener(new ActionListener() {
								
								@Override
								public void actionPerformed(ActionEvent e) {
									JPanel nume = new JPanel();
									nume.setLayout(new FlowLayout());
									JLabel nL = new JLabel("Nume");
									JTextField numeT = new JTextField("",20);
									nume.add(nL, Component.LEFT_ALIGNMENT);
									nume.add(numeT);
									
									
									
									JPanel prenume = new JPanel();
									prenume.setLayout(new FlowLayout());
									JLabel pL = new JLabel("Prenume");
									JTextField prenumeT = new JTextField("",20);
									prenume.add(pL);
									prenume.add(prenumeT);
									
									JPanel adresa = new JPanel();
									adresa.setLayout(new FlowLayout());
									JLabel aL = new JLabel("Introduceti adresa");
					
									JLabel lL = new JLabel("Localitate");
									JTextField localitate = new JTextField("",10);
									
									JLabel strL = new JLabel("Strada");
									JTextField strada = new JTextField("",10);
									JLabel nLL = new JLabel("Numar");
									JTextField nr = new JTextField("",10);
									JLabel jud = new JLabel("Judet");
									JTextField judet = new JTextField("",10);
									JLabel cp = new JLabel("Cod Postal");
									JTextField codPostal = new JTextField("",10);
									JLabel t = new JLabel("Tara");
									JTextField tara = new JTextField("",10);
									adresa.add(aL);
									
									adresa.add(lL);
									adresa.add(localitate);
									
									adresa.add(strL);
									adresa.add(strada);
									adresa.add(nLL);
									adresa.add(nr);
									adresa.add(jud);
									adresa.add(judet);
									adresa.add(cp);
									adresa.add(codPostal);
									adresa.add(t);
									adresa.add(tara);
									
			
									
									JPanel dataNasterii = new JPanel();
									dataNasterii.setLayout(new FlowLayout());
									JLabel dNL = new JLabel("Data nasterii");
									JTextField dNT = new JTextField("",10);
									dataNasterii.add(dNL);
									dataNasterii.add(dNT);
								
									JPanel nrTelefon = new JPanel();
									nrTelefon.setLayout(new FlowLayout());
									JLabel nrL = new JLabel("Numarul de telefon");
									JTextField nrT = new JTextField("",10);
									nrTelefon.add(nrL);
									nrTelefon.add(nrT);
									
									JPanel card = new JPanel();
									card.setLayout(new FlowLayout());
									JLabel cardL = new JLabel("Date despre card");
									
									JLabel nrC = new JLabel("Numar card");
									JTextField numarCard = new JTextField("",16);
									JLabel datC = new JLabel("Data expirare card");
									JTextField dataCard = new JTextField("",16);
									
									card.add(cardL);
									card.add(nrC);
									card.add(numarCard);
									card.add(datC);
									card.add(dataCard);
									
									
									JPanel email = new JPanel();
									email.setLayout(new FlowLayout());
									JLabel emailL=new JLabel("E-mail");
									JTextField emailT = new JTextField("Introduceti o adresa de e-mail valida",30);
									emailL.setSize(100, 10);
									email.add(emailL);
									email.add(emailT);
									
									JPanel parola=new JPanel();
									parola.setLayout(new FlowLayout());
									parola.setSize(100,10);
									JLabel parolaL = new JLabel("Parola"); 
									JTextField parolaT = new JTextField("Introduceti parola",30);
									parola.add(parolaL);
									parola.add(parolaT);
									
									JButton bc = new JButton("Creare cont");									
									JPanel creareContP=new JPanel();
									creareContP.setLayout(new BoxLayout(creareContP, BoxLayout.Y_AXIS));
									
									creareContP.setSize(100, 100);
									creareContP.add(nume, Component.LEFT_ALIGNMENT);   ///nu merge alinierea la stanga
									creareContP.add(prenume,Component.LEFT_ALIGNMENT);
									creareContP.add(adresa,Component.LEFT_ALIGNMENT);
									creareContP.add(dataNasterii);
									creareContP.add(nrTelefon);
									creareContP.add(card);
									creareContP.add(email);
									creareContP.add(parola);
									creareContP.add(bc);
								
									
									
									bc.addActionListener(new ActionListener() {
										
										@Override
										public void actionPerformed(ActionEvent e) {
											boolean ok=true;
											numarInregistrari=d.adrese();
											System.out.println(numarInregistrari);
											Client c = new Client("SELECT adresa_email,parola_client FROM client_magazin;");
											d.statements3(c);
											for(String s:c.emails) {
												if(emailT.getText().equals(s)) {
													ok=false;
													break;
													
												}
											}
											
											
											if(ok==false  ) {
												frame1.setVisible(true);
												JOptionPane.showMessageDialog(url, "Utilizator deja inregistrat!");
												
											}
											else {
												if(parolaT.getText().equals("")){
													JOptionPane.showMessageDialog(url, "Campul 'parola' este necompletat!");

												}
												else {
												frame1.setVisible(true);
												frame.setVisible(false);
												JOptionPane.showMessageDialog(url, "Contul a fost creat cu succes!");
												numarInregistrari++;
												
												int s=0;
												String instructiuneAdresa="INSERT INTO adresa_client (id_adresa_client,localitate,strada,numar,judet,cod_postal,tara)";
												String valoriAdresa = "VALUES(" +numarInregistrari+ ",'" +localitate.getText()+ "','" +strada.getText()+ "'," +Integer.parseInt(nr.getText())+ ",'" +judet.getText()+ "','" +codPostal.getText()+ "','" +tara.getText()+"');";
												d.inserare(instructiuneAdresa+valoriAdresa);

												String instructiuneCard = "INSERT INTO card_credit (id_card, numar_card, data_expirarii, suma_card)";
												String valoriCard = "VALUES(" +numarInregistrari+ ",'" + numarCard.getText()+ "','" +dataCard.getText()+ "'," +s+");";
												d.inserare(instructiuneCard+valoriCard);
												
												String instructiuneClient = "INSERT INTO client_magazin (id_client, nume_client, prenume_client, id_adresa_client, data_nasterii, numar_telefon, adresa_email, id_card,parola_client)";
												String valoriClient ="VALUES(" +numarInregistrari+ ",'" +numeT.getText()+ "','" +prenumeT.getText()+ "'," +numarInregistrari+ ",'" +dNT.getText()+ "','" +nrT.getText()+ "','" +emailT.getText()+ "'," +numarInregistrari+ ",'" +parolaT.getText()+"');";
														
												d.inserare(instructiuneClient+valoriClient);
												
												}
												
											}
											
											
								
										
										}
										
									});
									
									

									
									frameCreareCont=createFrame();
									frameCreareCont.setContentPane(creareContP);
									
									//frame1.setVisible(false);
									frameProduse.setVisible(false);
									frameCos.setVisible(false);
									frameBranduri.setVisible(false);
									
									
								}
							});
							
							
							
							login.addActionListener(new ActionListener() {
								
								@Override
								public void actionPerformed(ActionEvent e) {
									numarInregistrari=d.adrese();
									JPanel email = new JPanel();
									email.setLayout(new FlowLayout());
									JLabel emailL=new JLabel("E-mail");
									JTextField emailT = new JTextField("Introduceti adresa de e-mail",30);
									emailL.setSize(100, 10);
									email.add(emailL);
									email.add(emailT);
									
									JPanel parola=new JPanel();
									parola.setLayout(new FlowLayout());
									parola.setSize(100,10);
									JLabel parolaL = new JLabel("Parola"); 
									JTextField parolaText = new JTextField("Introduceti parola",30);
									parola.add(parolaL);
									parola.add(parolaText);
									
									JButton ic = new JButton("Intra in cont");									
									JPanel loginP=new JPanel();
									loginP.setLayout(new BoxLayout(loginP, BoxLayout.Y_AXIS));
									loginP.setSize(100, 100);
									loginP.add(email);
									loginP.add(parola);
									loginP.add(ic);
									
									
									frameLogIn=createFrame();
									frameLogIn.setContentPane(loginP);
									
									ic.addActionListener(new ActionListener() {
										
										
										@Override
										public void actionPerformed(ActionEvent e) {
											Client c = new Client("SELECT adresa_email, parola_client FROM client_magazin;");
											d.statements3(c);
											System.out.println(c.parola);
											boolean ok1=false;
											for(String s:c.emails) {
												if(emailT.getText().equals(s)) {	
														if(parolaText.getText().equals(c.parola.get(c.emails.indexOf(s)))) {
															ok1=true;
															break;
														}
												}
												
											}
											
										
											
											if(ok1==true) {
												frameLogIn.setVisible(false);
												frame1.setVisible(true);
												JOptionPane.showMessageDialog(url, "Spor la cumparaturi!");

											}
											else {
											
												JOptionPane.showMessageDialog(url, "Adresa de e-mail sau parola nu corespunde!");
											
											}
											
										}
									});
									
									
								}
							});
							
							cos.addActionListener(new ActionListener() {

								@Override
								public void actionPerformed(ActionEvent arg0) {

									JPanel panelCos = new JPanel();
									JPanel t = new JPanel();
									JLabel comanda = new JLabel("Selectati o metoda de plata");
									t.setLayout(new FlowLayout());
									panelCos.setLayout(new BoxLayout(panelCos, BoxLayout.Y_AXIS));
									panelCos.setAlignmentY(Component.LEFT_ALIGNMENT);

									if (c.produse.size() == 0) {
										JLabel jl = new JLabel("Cosul este gol! Adaugati produse.");
										JLabel jl1 = new JLabel();
										ImageIcon i = new ImageIcon("shoppingcart.png");
										jl1.setPreferredSize(new Dimension(500, 500));
										jl1.setIcon(i);

										panelCos.add(jl);
										panelCos.add(jl1);
									} else {

										JPanel plata = new JPanel();
										plata.setLayout(new FlowLayout());
										JLabel totalLabel = new JLabel("Total: ");
										JButton trimiteComanda = new JButton("Trimite comanda");
										JButton plata1 = new JButton("Plata cu cardul");
										JButton plata2 = new JButton("Plata la livrare");

										for (int i = 0; i < c.produse.size(); i++) {

											JLabel l1 = new JLabel("Numele produsului este: " + c.produse.get(i));
											l1.setPreferredSize(new Dimension(10, 300));
											JLabel l2 = new JLabel("Cantitatea produsului este: " + c.cantitate.get(i));
											l2.setPreferredSize(new Dimension(10, 300));
											JLabel l3 = new JLabel(
													"Pretul produsului pe bucata este: " + c.pret.get(i));
											l3.setPreferredSize(new Dimension(10, 300));

											total.setPreferredSize(new Dimension(150, 30));
											totalComanda = totalComanda + c.cantitate.get(i) * c.pret.get(i);

											total.setText(Integer.toString(totalComanda));

											// System.out.println("Produsul este: " +c.produse.get(i));
											// System.out.println("Cantitatea este: " +c.cantitate.get(i));

											plata.add(comanda);
											plata.add(plata1);
											plata.add(plata2);

											panelCos.add(l1);
											panelCos.add(l2);
											panelCos.add(l3);
											t.add(totalLabel);
											t.add(total);
											t.add(trimiteComanda);

											panelCos.add(t);
											panelCos.add(plata);
											panelCos.setBackground(Color.white);

										}

										trimiteComanda.addActionListener(new ActionListener() {

											@Override
											public void actionPerformed(ActionEvent arg0) {

												if (metodaPlata == 0) {

													JOptionPane.showMessageDialog(panelCos,
															"Nu ati selectat metoda de plata!");
												}

												else {

													for (int i = 0; i < c.produse.size(); i++) {

														index = d.statements4();
														index++;
														// System.out.println(index);

														DateTimeFormatter dtf = DateTimeFormatter
																.ofPattern("yyyy-MM-dd");
														LocalDateTime now = LocalDateTime.now();
														// System.out.println(dtf.format(now));

														String instructiune = "INSERT INTO factura (id_factura, id_client, pret_total, id_produs)";
														int pretTotal = c.cantitate.get(i) * c.pret.get(i);
														String valori = "VALUES(" + index + "," +numarInregistrari+ "," + pretTotal + ","
																+ c.idProdus.get(i) + ");";
														instructiune = instructiune + valori;

														d.statements2(instructiune);

														String instructiune1 = "INSERT INTO comanda_inregistrata (id_comanda, id_client, id_produs,cantitate_produs, id_metoda_plata,id_factura,data_comenzii)";
														String valori1 = "VALUES(NULL," +numarInregistrari+ "," + c.idProdus.get(i) + ","
																+ c.cantitate.get(i) + "," + metodaPlata + "," + index
																+ ",'" + dtf.format(now) + "');";
														instructiune1 = instructiune1 + valori1;

														d.statements2(instructiune1);

													}

												}

											}
										});

										plata1.addActionListener(new ActionListener() {

											@Override
											public void actionPerformed(ActionEvent arg0) {

												metodaPlata = 2;

											}
										});

										plata2.addActionListener(new ActionListener() {

											@Override
											public void actionPerformed(ActionEvent arg0) {

												metodaPlata = 1;

											}
										});

									}

									/*
									 * JFrame cos = new JFrame("Cos");
									 * 
									 * cos.setContentPane(panel3); cos.setVisible(true);
									 */
									frameCos = createFrame();
									frameCos.setContentPane(panelCos);

									frameContact.setVisible(false);
									frameProduse.setVisible(false);
									frame.setVisible(false);

								}
							});
						}

					});

					panel3.setBackground(Color.white);

					mainPanel.add(panel1, BorderLayout.PAGE_START);
					mainPanel.add(panel2, BorderLayout.LINE_START);
					mainPanel.add(panel3, BorderLayout.CENTER);

					frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					frame1.setSize(800, 600);
					frame1.setLocationRelativeTo(null);
					frame1.setContentPane(mainPanel);
					frame.setVisible(false);
					frame1.setVisible(true);

				} else {
					JOptionPane.showMessageDialog(url, "Adresa URL incorecta!");
				}
			}
		});

		imgLabel.setIcon(img);
		searchImg.setIcon(imgSearch);
		panel.add(imgLabel);
		panel.add(searchImg);
		panel.add(url);
		panel.add(b);
		frame.setContentPane(panel);
		frame.setVisible(true);

	}

}