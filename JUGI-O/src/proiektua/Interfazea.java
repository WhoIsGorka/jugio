package proiektua;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
public class Interfazea extends JFrame{
	
	private JPanel panel;
	private JButton mazoa;
	private JButton karta1;
	private JButton karta2;
	private JButton karta3;
	private JButton karta4;
	
	private static Icon resizeIcon(ImageIcon icon, int resizedWidth, int resizedHeight) {
	    Image img = icon.getImage();
	    Image resizedImage = img.getScaledInstance(resizedWidth, resizedHeight,  java.awt.Image.SCALE_DEFAULT);  
	    return new ImageIcon(resizedImage);
	}
	public Interfazea() {
		setResizable(false);
		getContentPane().setBackground(Color.GRAY);
		getContentPane().setForeground(Color.WHITE);
		setBackground(Color.WHITE);
		setTitle("BAR BESTIAL");
		getContentPane().setLayout(null);
		
		this.panel = new JPanel();
		
		panel.setBounds(0, 479, 1264, 212);
		panel.setBackground(new Color(139, 69, 19));
		getContentPane().add(this.panel);
		
		
		mazoa = new JButton("");
		mazoa.setBounds(53, 0, 127, 218);
		mazoa.setIcon(resizeIcon(new ImageIcon(getClass().getResource("mazo.png")),mazoa.getWidth(),mazoa.getHeight()));
		panel.setLayout(null);
		panel.add(mazoa);
		
		mazoa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Tableroa.getTableroa().getJokalaria().getEskuKartak().luzera()==4){
					JOptionPane.showMessageDialog(null, 
                            "Jada lau karta dauzkazu eskuan", 
                            "Errorea!", 
                            JOptionPane.WARNING_MESSAGE);				}
				Tableroa.getTableroa().getJokalaria().hartuKarta();			
			}
		});
	
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBackground(new Color(139, 69, 19));
		panel_3.setBounds(169, 0, 1095, 138);
		getContentPane().add(panel_3);
		
		JButton makinaKarta1 = new JButton("");
		makinaKarta1.setBounds(205, -22, 127, 160);
		makinaKarta1.setIcon(resizeIcon(new ImageIcon(getClass().getResource("yugioReverso.png")),makinaKarta1.getWidth(),makinaKarta1.getHeight()));
		panel_3.add(makinaKarta1);
		
		JButton makinaKarta2 = new JButton("");
		makinaKarta2.setBounds(426, -22, 127, 160);
		makinaKarta2.setIcon(resizeIcon(new ImageIcon(getClass().getResource("yugioReverso.png")),makinaKarta2.getWidth(),makinaKarta2.getHeight()));
		panel_3.add(makinaKarta2);
		
		JButton makinaKarta3 = new JButton("");
		makinaKarta3.setBounds(638, -22, 127, 160);
		makinaKarta3.setIcon(resizeIcon(new ImageIcon(getClass().getResource("yugioReverso.png")),makinaKarta3.getWidth(),makinaKarta3.getHeight()));
		panel_3.add(makinaKarta3);
		
		JButton makinaKarta4 = new JButton("");
		makinaKarta4.setBounds(856, -22, 127, 160);
		makinaKarta4.setIcon(resizeIcon(new ImageIcon(getClass().getResource("yugioReverso.png")),makinaKarta4.getWidth(),makinaKarta4.getHeight()));
		panel_3.add(makinaKarta4);
		
		JButton mazoMakina = new JButton("");
		mazoMakina.setBounds(23, 11, 127, 116);
		mazoMakina.setIcon(resizeIcon(new ImageIcon(getClass().getResource("mazo.png")),mazoMakina.getWidth(),mazoMakina.getHeight()));
		panel_3.add(mazoMakina);
		
		JPanel tablero = new JPanel();
		tablero.setBackground(new Color(139, 69, 19));
		tablero.setBounds(169, 137, 1095, 343);
		getContentPane().add(tablero);
		tablero.setLayout(null);
		
		JButton mahaiKarta1 = new JButton("");
		mahaiKarta1.setBounds(207, 155, 127, 182);
		tablero.add(mahaiKarta1);
		
		JButton mahaiKarta2 = new JButton("");
		mahaiKarta2.setBounds(344, 155, 127, 182);
		tablero.add(mahaiKarta2);
		
		JButton mahaiKarta3 = new JButton("");
		mahaiKarta3.setBounds(481, 155, 127, 182);
		tablero.add(mahaiKarta3);
		
		JButton mahaiKarta4 = new JButton("");
		mahaiKarta4.setBounds(618, 155, 127, 182);
		tablero.add(mahaiKarta4);
		
		JButton mahaiKarta5 = new JButton("");
		mahaiKarta5.setBounds(755, 155, 127, 182);
		tablero.add(mahaiKarta5);
		
		JButton salidaBar = new JButton("");
		salidaBar.setBounds(878, 11, 207, 123);
		salidaBar.setIcon(resizeIcon(new ImageIcon(getClass().getResource("salidaBar.png")),salidaBar.getWidth(),salidaBar.getHeight()));
		tablero.add(salidaBar);
		
		JButton heavenGate = new JButton("");
		heavenGate.setBounds(10, 145, 127, 192);
		heavenGate.setIcon(resizeIcon(new ImageIcon(getClass().getResource("heavenGate.png")),heavenGate.getWidth(),heavenGate.getHeight()));
		tablero.add(heavenGate);
		
		JButton entradaBar = new JButton("");
		entradaBar.setBounds(10, 11, 207, 123);
		entradaBar.setIcon(resizeIcon(new ImageIcon(getClass().getResource("entradaBar.png")),entradaBar.getWidth(),entradaBar.getHeight()));
		tablero.add(entradaBar);
		
		JButton patadaGate = new JButton("");
		patadaGate.setBounds(958, 145, 127, 192);
		patadaGate.setIcon(resizeIcon(new ImageIcon(getClass().getResource("patadaGate.png")),patadaGate.getWidth(),patadaGate.getHeight()));
		tablero.add(patadaGate);
		
		JTextArea txtrhistoriala = new JTextArea();
		txtrhistoriala.setBackground(new Color(189, 183, 107));
		txtrhistoriala.setText("***HISTORIALA***");
		
		
		txtrhistoriala.setEditable(false);
		txtrhistoriala.setBounds(0, 0, 180, 480);
		
		getContentPane().add(txtrhistoriala);
	}
	
	public void eskuKartakPantailaratu(){
		
		if(Tableroa.getTableroa().getJokalaria().getEskuKartak().luzera()>0){
			panel.setLayout(null);
			this.karta1 = new JButton("");
			karta1.setBounds(332, 0, 127, 218);
			karta1.setIcon(resizeIcon(new ImageIcon(getClass().getResource(Tableroa.getTableroa().getJokalaria().getEskuKartak().getKarta(0).getIrudia())),karta1.getWidth(),karta1.getHeight()));
			panel.add(karta1); 
			
			karta1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					System.out.println("karta1");
				}
			});
			if(Tableroa.getTableroa().getJokalaria().getEskuKartak().luzera()>1){
				this.karta2 = new JButton("");
				karta2.setBounds(559, 0, 127, 218);
				karta2.setIcon(resizeIcon(new ImageIcon(getClass().getResource(Tableroa.getTableroa().getJokalaria().getEskuKartak().getKarta(1).getIrudia())),karta2.getWidth(),karta2.getHeight()));
				panel.add(karta2);
				
				karta2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						System.out.println("karta2");
					}
				});
				if(Tableroa.getTableroa().getJokalaria().getEskuKartak().luzera()>2){
					this.karta3 = new JButton("");
					karta3.setBounds(787, 0, 127, 218);
					karta3.setIcon(resizeIcon(new ImageIcon(getClass().getResource(Tableroa.getTableroa().getJokalaria().getEskuKartak().getKarta(2).getIrudia())),karta3.getWidth(),karta3.getHeight()));
					panel.add(karta3);
					
					karta3.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							System.out.println("karta3");
						}
					});
					if(Tableroa.getTableroa().getJokalaria().getEskuKartak().luzera()>3){
						this.karta4 = new JButton("");
						karta4.setBounds(1007, 0, 127, 218);
						karta4.setIcon(resizeIcon(new ImageIcon(getClass().getResource(Tableroa.getTableroa().getJokalaria().getEskuKartak().getKarta(3).getIrudia())),karta4.getWidth(),karta4.getHeight()));
						panel.add(karta4);	
						
						karta4.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								System.out.println("karta4");
							}
						});
					}
				}
			}
		}

		this.repaint();
	}
		
	
	public static void main(String[] args) {
			
			Tableroa.getTableroa().hasieraketak();
			Interfazea frame = new Interfazea();
	    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.getContentPane().setLayout(new BorderLayout());
			frame.setSize(1280, 720);
			frame.setLocationRelativeTo(null);
			frame.setVisible(true);
			
			boolean amaitu = false;
			
			while(!amaitu){
				frame.eskuKartakPantailaratu();
				
				// TODO EL JUEGO HASTA QUE ACABE
				
			}
		}
	}

