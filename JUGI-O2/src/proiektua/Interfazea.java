package proiektua;
import javax.swing.*;

import javafx.beans.Observable;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Observer;
public class Interfazea extends JFrame implements Observer{
	
	private JPanel panel;
	private JButton mazoa;
	private JButton karta1;
	private JButton karta2;
	private JButton karta3;
	private JButton karta4;
	private JButton mahaiKarta1;
	private JButton mahaiKarta2;
	private JButton mahaiKarta3;
	private JButton mahaiKarta4;
	private JButton mahaiKarta5;
	private JButton jarraitu ;
	private JTextField txtJokalariarenPuntuazioa;
	private JButton jPuntuazioa;
	private JButton pcPuntuazioa;
	
	
	public void update(java.util.Observable o, Object arg) {
		ArrayList<String>[] lista=new ArrayList[2];
		lista = (ArrayList<String>[])arg;
		
		karta1.setIcon(null);
		karta2.setIcon(null);
		karta3.setIcon(null);
		karta4.setIcon(null);
		
		mahaiKarta1.setIcon(null);
		mahaiKarta2.setIcon(null);
		mahaiKarta3.setIcon(null);
		mahaiKarta4.setIcon(null);
		mahaiKarta5.setIcon(null);
				
		if(lista[0].size()==1){
			karta1.setIcon(resizeIcon(new ImageIcon(getClass().getResource(lista[0].get(0))),karta1.getWidth(),karta1.getHeight()));
		}else if(lista[0].size()==2){
			karta1.setIcon(resizeIcon(new ImageIcon(getClass().getResource(lista[0].get(0))),karta1.getWidth(),karta1.getHeight()));
			karta2.setIcon(resizeIcon(new ImageIcon(getClass().getResource(lista[0].get(1))),karta2.getWidth(),karta2.getHeight()));
		}else if(lista[0].size()==3){
			karta1.setIcon(resizeIcon(new ImageIcon(getClass().getResource(lista[0].get(0))),karta1.getWidth(),karta1.getHeight()));
			karta2.setIcon(resizeIcon(new ImageIcon(getClass().getResource(lista[0].get(1))),karta2.getWidth(),karta2.getHeight()));
			karta3.setIcon(resizeIcon(new ImageIcon(getClass().getResource(lista[0].get(2))),karta3.getWidth(),karta3.getHeight()));
		}else if(lista[0].size()==4){
			karta1.setIcon(resizeIcon(new ImageIcon(getClass().getResource(lista[0].get(0))),karta1.getWidth(),karta1.getHeight()));
			karta2.setIcon(resizeIcon(new ImageIcon(getClass().getResource(lista[0].get(1))),karta2.getWidth(),karta2.getHeight()));
			karta3.setIcon(resizeIcon(new ImageIcon(getClass().getResource(lista[0].get(2))),karta3.getWidth(),karta3.getHeight()));
			karta4.setIcon(resizeIcon(new ImageIcon(getClass().getResource(lista[0].get(3))),karta4.getWidth(),karta4.getHeight()));
		}

		if(lista[1].size()==1){
			mahaiKarta1.setIcon(resizeIcon(new ImageIcon(getClass().getResource(lista[1].get(0))),mahaiKarta1.getWidth(),mahaiKarta1.getHeight()));
		}else if(lista[1].size()==2){
			mahaiKarta1.setIcon(resizeIcon(new ImageIcon(getClass().getResource(lista[1].get(0))),mahaiKarta1.getWidth(),mahaiKarta1.getHeight()));
			mahaiKarta2.setIcon(resizeIcon(new ImageIcon(getClass().getResource(lista[1].get(1))),mahaiKarta2.getWidth(),mahaiKarta2.getHeight()));
		}else if(lista[1].size()==3){
			mahaiKarta1.setIcon(resizeIcon(new ImageIcon(getClass().getResource(lista[1].get(0))),mahaiKarta1.getWidth(),mahaiKarta1.getHeight()));
			mahaiKarta2.setIcon(resizeIcon(new ImageIcon(getClass().getResource(lista[1].get(1))),mahaiKarta2.getWidth(),mahaiKarta2.getHeight()));
			mahaiKarta3.setIcon(resizeIcon(new ImageIcon(getClass().getResource(lista[1].get(2))),mahaiKarta3.getWidth(),mahaiKarta3.getHeight()));
		}else if(lista[1].size()==4){
			mahaiKarta1.setIcon(resizeIcon(new ImageIcon(getClass().getResource(lista[1].get(0))),mahaiKarta1.getWidth(),mahaiKarta1.getHeight()));
			mahaiKarta2.setIcon(resizeIcon(new ImageIcon(getClass().getResource(lista[1].get(1))),mahaiKarta2.getWidth(),mahaiKarta2.getHeight()));
			mahaiKarta3.setIcon(resizeIcon(new ImageIcon(getClass().getResource(lista[1].get(2))),mahaiKarta3.getWidth(),mahaiKarta3.getHeight()));
			mahaiKarta4.setIcon(resizeIcon(new ImageIcon(getClass().getResource(lista[1].get(3))),mahaiKarta4.getWidth(),mahaiKarta4.getHeight()));
		}else if(lista[1].size()==5){
			mahaiKarta1.setIcon(resizeIcon(new ImageIcon(getClass().getResource(lista[1].get(0))),mahaiKarta1.getWidth(),mahaiKarta1.getHeight()));
			mahaiKarta2.setIcon(resizeIcon(new ImageIcon(getClass().getResource(lista[1].get(1))),mahaiKarta2.getWidth(),mahaiKarta2.getHeight()));
			mahaiKarta3.setIcon(resizeIcon(new ImageIcon(getClass().getResource(lista[1].get(2))),mahaiKarta3.getWidth(),mahaiKarta3.getHeight()));
			mahaiKarta4.setIcon(resizeIcon(new ImageIcon(getClass().getResource(lista[1].get(3))),mahaiKarta4.getWidth(),mahaiKarta4.getHeight()));
			mahaiKarta5.setIcon(resizeIcon(new ImageIcon(getClass().getResource(lista[1].get(4))),mahaiKarta5.getWidth(),mahaiKarta5.getHeight()));
		}
		jPuntuazioa.setText("Zure puntuazioa:" + Tableroa.getTableroa().getNi().getPuntuazioa());
		pcPuntuazioa.setText("Zure puntuazioa:" + Tableroa.getTableroa().getPc().getPuntuazioa());
		repaint();
		
	}

	private Icon resizeIcon(ImageIcon icon, int resizedWidth, int resizedHeight) {
			 Image img = icon.getImage();
			 Image resizedImage = img.getScaledInstance(resizedWidth, resizedHeight,  java.awt.Image.SCALE_DEFAULT);  
			 return new ImageIcon(resizedImage);
		
	}
	public Interfazea() {
		Tableroa.getTableroa().leihoaErregistratu(this);
		
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
		
		JPanel score = new JPanel();
		score.setBackground(Color.LIGHT_GRAY);
		score.setForeground(Color.WHITE);
		score.setBounds(0, 0, 171, 366);
		getContentPane().add(score);
		
		
		
		jarraitu = new JButton("");
		jarraitu.setEnabled(false);
		jarraitu.setText("JARRAITU");
		jarraitu.setBounds(10, 11, 151, 40);
		
		jarraitu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tableroa.getTableroa().getPc().txandaEgin(0);
				jarraitu.setEnabled(false);
				mazoa.setIcon(resizeIcon(new ImageIcon(getClass().getResource("geziGorria.png")),mazoa.getWidth(),mazoa.getHeight()));
				repaint();
				karta1.setEnabled(true);
				karta2.setEnabled(true);
				karta3.setEnabled(true);
				karta4.setEnabled(true);
				mazoa.setEnabled(true);
			}
		});
		score.setLayout(null);
		score.add(jarraitu);
		
		jPuntuazioa = new JButton("ZURE PUNTUAZIOA: 0");
		jPuntuazioa.setBounds(0, 105, 171, 94);
		score.add(jPuntuazioa);
		
		pcPuntuazioa = new JButton("PC PUNTUAZIOA: 0");
		pcPuntuazioa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		pcPuntuazioa.setBounds(0, 205, 171, 94);
		score.add(pcPuntuazioa);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.LIGHT_GRAY);
		panel_1.setForeground(Color.WHITE);
		panel_1.setBounds(0, 366, 171, 114);
		getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		final JButton kartak = new JButton("Kartak: 12");
		kartak.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		kartak.setBounds(0, 72, 171, 31);
		panel_1.add(kartak);
		jarraitu.setVisible(true);
		
		
		mazoa = new JButton("");
		mazoa.setBounds(22, 0, 127, 218);
		mazoa.setIcon(resizeIcon(new ImageIcon(getClass().getResource("geziGorria.png")),mazoa.getWidth(),mazoa.getHeight()));
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
				kartak.setText("Kartak: "+Tableroa.getTableroa().getNi().getMazoa().tamaina());
				mazoa.setIcon(resizeIcon(new ImageIcon(getClass().getResource("yugioReverso.png")),mazoa.getWidth(),mazoa.getHeight()));

				
			}
		});
	
		panel.setLayout(null);
		this.karta1 = new JButton("");
		karta1.setBounds(332, 0, 127, 218);
		panel.add(karta1); 
		karta1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				karta1.setEnabled(false);
				karta2.setEnabled(false);
				karta3.setEnabled(false);
				karta4.setEnabled(false);
				mazoa.setEnabled(false);
				jolastu(0);		
			}
		});
		
		this.karta2 = new JButton("");
		karta2.setBounds(559, 0, 127, 218);
		panel.add(karta2);	
		karta2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				karta1.setEnabled(false);
				karta2.setEnabled(false);
				karta3.setEnabled(false);
				karta4.setEnabled(false);
				mazoa.setEnabled(false);
				jolastu(1);	
			}
		});
		
		this.karta3 = new JButton("");
		karta3.setBounds(787, 0, 127, 218);
		panel.add(karta3);
		
		karta3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				karta1.setEnabled(false);
				karta2.setEnabled(false);
				karta3.setEnabled(false);
				karta4.setEnabled(false);
				mazoa.setEnabled(false);
				jolastu(2);
			}
		});
		
		this.karta4 = new JButton("");
		karta4.setBounds(1007, 0, 127, 218);
		panel.add(karta4);	
		
		karta4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				karta1.setEnabled(false);
				karta2.setEnabled(false);
				karta3.setEnabled(false);
				karta4.setEnabled(false);
				mazoa.setEnabled(false);
				jolastu(3);
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
		
	    mahaiKarta1 = new JButton("");
		mahaiKarta1.setBounds(207, 145, 127, 192);
		tablero.add(mahaiKarta1);
		
		
		mahaiKarta2 = new JButton("");
		mahaiKarta2.setBounds(344, 145, 127, 192);
		tablero.add(mahaiKarta2);
		
		mahaiKarta3 = new JButton("");
		mahaiKarta3.setBounds(481, 145, 127, 192);
		tablero.add(mahaiKarta3);
		
		mahaiKarta4 = new JButton("");
		mahaiKarta4.setBounds(618, 145, 127, 192);
		tablero.add(mahaiKarta4);
		
		mahaiKarta5 = new JButton("");
		mahaiKarta5.setBounds(755, 145, 127, 192);
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
	}
	
		
		
	public void jolastu(int pPos){
		if(Tableroa.getTableroa().getNi().getEskuKartak().luzera()==4 || Tableroa.getTableroa().getNi().getMazoa().hutsaDa()){
			Tableroa.getTableroa().getNi().txandaEgin(pPos);		
			Tableroa.getTableroa().notifikatuInterfazea();			
			jarraitu.setEnabled(true);

		}else{
			JOptionPane.showMessageDialog(null, 
                    "Karta bota baino lehen beste bat lapurtu!!!", 
                    "Errorea!", 
                    JOptionPane.WARNING_MESSAGE);
					karta1.setEnabled(true);
					karta2.setEnabled(true);
					karta3.setEnabled(true);
					karta4.setEnabled(true);
					mazoa.setEnabled(true);
		}
	}
}

