package proiektua;

import java.util.Scanner;

public class Tableroa {
	
	private MahaiKartak ilara = new MahaiKartak();
	private Jokalaria j1;
	private Jokalaria pc;
	private EskuKartak kartaGuztiak;
	
	
	public Tableroa() {
		this.ilara = new MahaiKartak();
		this.j1 =  new Jokalaria();
		this.pc = new Jokalaria();
		
	}
	public void KartakSortu(){
		Karta mofeta1 = new Karta(1,"Mofeta"," ",false,4,"urdina");
		Karta mofeta2 = new Karta(1,"Mofeta"," ",false,4,"berdea");
		
		Karta loroa1 = new Karta(2,"Loroa"," ",false,4,"urdina");
		Karta loroa2 = new Karta(2,"Loroa"," ",false,4,"berdea");
		
		Karta kanguru1 = new Karta(3,"Kangurua"," ",false,4,"urdina");
		Karta Kanguru2 = new Karta(3,"Kangurua"," ",false,4,"berdea");
		
		Karta tximinoa1 = new Karta(4,"Tximinoa"," ",false,3,"urdina");
		Karta tximinoa2 = new Karta(4,"Tximinoa"," ",false,3,"berdea");
		
		Karta kamalehoia1 = new Karta(5,"Kamalehoia"," ",false,3,"urdina");
		Karta kamalehoia2 = new Karta(5,"Kamalehoia"," ",false,3,"berdea");
		
		Karta itsaslehoia1 = new Karta(6,"Itsaslehoia"," ",false,2,"urdina");
		Karta itsaslehoia2 = new Karta(6,"Itsaslehoia"," ",false,2,"berdea");
		
		Karta zebra1 = new Karta(7,"Zebra"," ",true,4,"urdina");
		Karta zebra2 = new Karta(7,"Zebra"," ",true,4,"berdea");
		
		Karta jirafa1 = new Karta(8,"Jirafa"," ",true,3,"urdina");
		Karta jirafa2 = new Karta(8,"Jirafa"," ",true,3,"berdea");
		
		Karta sugea1 = new Karta(9,"Sugea"," ",false,2,"urdina");
		Karta sugea2 = new Karta(9,"Sugea"," ",false,2,"berdea");
		
		Karta kokodriloa1 = new Karta(10,"Kokodriloa"," ",true,3,"urdina");
		Karta kokodriloa2 = new Karta(10,"Kokodriloa"," ",true,3,"berdea");
		
		Karta hipopotamoa1 = new Karta(11,"Hipopotamoa"," ",true,2,"urdina");
		Karta hipopotamoa2 = new Karta(11,"Hipopotamoa"," ",true,2,"berdea");
		
		Karta lehoia1 = new Karta(12,"Lehoia"," ",false,2,"urdina");
		Karta lehoia2 = new Karta(12,"Lehoia"," ",false,2,"berdea");
	}
	public void partidaJolastu(){
		System.out.println("Sartu jokalariaren izena: ");
		j1.setJokalariarenIzena();
		System.out.println("Sartu jokalariaren zenbakia: ");
		j1.setJokalariarenId();

		pc.setPcIzenaId();
		
	}
}
