package proiektua;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
public class Interfazea extends JFrame
{
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
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 479, 1264, 212);
		panel.setBackground(Color.ORANGE);
		getContentPane().add(panel);
		JButton karta4 = new JButton("");
		karta4.setBounds(1007, 0, 127, 218);
		karta4.setIcon(resizeIcon(new ImageIcon(getClass().getResource("mono4Berde.png")),karta4.getWidth(),karta4.getHeight()));
		karta4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		JButton karta2 = new JButton("");
		karta2.setBounds(559, 0, 127, 218);
		karta2.setIcon(resizeIcon(new ImageIcon(getClass().getResource("loro2Berde.png")),karta2.getWidth(),karta2.getHeight()));
		karta2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel.setLayout(null);
		panel.add(karta2);
		
		JButton karta3 = new JButton("");
		karta3.setBounds(787, 0, 127, 218);
		karta3.setIcon(resizeIcon(new ImageIcon(getClass().getResource("kanguro3Berde.png")),karta3.getWidth(),karta3.getHeight()));
		panel.add(karta3);
		panel.add(karta4);
		
		JButton karta1 = new JButton("");
		karta1.setBounds(332, 0, 127, 218);
		karta1.setIcon(resizeIcon(new ImageIcon(getClass().getResource("mofeta1Berde.png")),karta1.getWidth(),karta1.getHeight()));
		panel.add(karta1);
		
		JButton mazo1 = new JButton("");
		mazo1.setBounds(53, 11, 127, 196);
		mazo1.setIcon(resizeIcon(new ImageIcon(getClass().getResource("reverso.png")),mazo1.getWidth(),mazo1.getHeight()));
		panel.add(mazo1);
		
		JButton mazo2 = new JButton("");
		mazo2.setBounds(91, 11, 127, 196);
		mazo2.setIcon(resizeIcon(new ImageIcon(getClass().getResource("reverso.png")),mazo2.getWidth(),mazo2.getHeight()));
		panel.add(mazo2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBackground(Color.ORANGE);
		panel_3.setBounds(169, 0, 1095, 138);
		getContentPane().add(panel_3);
		
		JButton makinaKarta1 = new JButton("");
		makinaKarta1.setBounds(205, -22, 127, 160);
		makinaKarta1.setIcon(resizeIcon(new ImageIcon(getClass().getResource("reverso.png")),makinaKarta1.getWidth(),makinaKarta1.getHeight()));
		panel_3.add(makinaKarta1);
		
		JButton makinaKarta2 = new JButton("");
		makinaKarta2.setBounds(426, -22, 127, 160);
		makinaKarta2.setIcon(resizeIcon(new ImageIcon(getClass().getResource("reverso.png")),makinaKarta2.getWidth(),makinaKarta2.getHeight()));
		panel_3.add(makinaKarta2);
		
		JButton makinaKarta3 = new JButton("");
		makinaKarta3.setBounds(638, -22, 127, 160);
		makinaKarta3.setIcon(resizeIcon(new ImageIcon(getClass().getResource("reverso.png")),makinaKarta3.getWidth(),makinaKarta3.getHeight()));
		panel_3.add(makinaKarta3);
		
		JButton makinaKarta4 = new JButton("");
		makinaKarta4.setBounds(856, -22, 127, 160);
		makinaKarta4.setIcon(resizeIcon(new ImageIcon(getClass().getResource("reverso.png")),makinaKarta4.getWidth(),makinaKarta4.getHeight()));
		panel_3.add(makinaKarta4);
		
		JButton mazoMakina = new JButton("");
		mazoMakina.setBounds(23, 11, 127, 116);
		mazoMakina.setIcon(resizeIcon(new ImageIcon(getClass().getResource("reverso.png")),mazoMakina.getWidth(),mazoMakina.getHeight()));
		panel_3.add(mazoMakina);
		
		JPanel tablero = new JPanel();
		tablero.setBackground(Color.GRAY);
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
		salidaBar.setBounds(10, 11, 197, 123);
		salidaBar.setIcon(resizeIcon(new ImageIcon(getClass().getResource("salidaBar.png")),salidaBar.getWidth(),salidaBar.getHeight()));
		tablero.add(salidaBar);
		
		JButton heavenGate = new JButton("");
		heavenGate.setBounds(958, 145, 127, 192);
		heavenGate.setIcon(resizeIcon(new ImageIcon(getClass().getResource("heavenGate.png")),heavenGate.getWidth(),heavenGate.getHeight()));
		tablero.add(heavenGate);
		
		JButton entradaBar = new JButton("");
		entradaBar.setBounds(878, 11, 207, 123);
		entradaBar.setIcon(resizeIcon(new ImageIcon(getClass().getResource("entradaBar.png")),entradaBar.getWidth(),entradaBar.getHeight()));
		tablero.add(entradaBar);
		
		JButton patadaGate = new JButton("");
		patadaGate.setBounds(10, 145, 127, 192);
		patadaGate.setIcon(resizeIcon(new ImageIcon(getClass().getResource("patadaGate.png")),patadaGate.getWidth(),patadaGate.getHeight()));
		tablero.add(patadaGate);
		
		JTextArea txtrhistoriala = new JTextArea();
		txtrhistoriala.setText("***HISTORIALA***");
		txtrhistoriala.setEditable(false);
		txtrhistoriala.setBounds(0, 0, 180, 480);
		getContentPane().add(txtrhistoriala);
	}

    public static void main(String args[])
    {
    	Interfazea frame = new Interfazea();
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout());
		frame.setSize(1280, 720);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
}	
 }
