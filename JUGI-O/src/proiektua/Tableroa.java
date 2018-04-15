package proiektua;

import java.awt.BorderLayout;
import java.util.Scanner;

import javax.swing.JFrame;

public class Tableroa {
	
	private MahaiKartak ilara;
	private Jokalaria j1;
	private Jokalaria pc;
	private EskuKartak m1;
	private EskuKartak m2;
	private Scanner sc;
	
	private static Tableroa nTableroa=null;
	
	
	
	public Tableroa() {
		this.ilara = new MahaiKartak();
		this.j1 =  new Ni();
		this.pc = new Pc();
	}
	
	public static Tableroa getTableroa() {
		if (nTableroa==null) {
			nTableroa=new Tableroa();
		}
		return nTableroa;
	}
	
	public Jokalaria getJokalaria(){
		return this.j1;
	}
	public MahaiKartak getMahaiKartak(){
		return this.ilara;
	}
	public void KartakSortu(){
		Karta mofeta1 = new Karta(1,"Mofeta"," ",false,4,"1mofetaAzul.PNG");
		Karta mofeta2 = new Karta(1,"Mofeta"," ",false,4,"mofeta1Berde.png");
		
		Karta loroa1 = new Karta(2,"Loroa"," ",false,4,"2loroAzul.PNG");
		Karta loroa2 = new Karta(2,"Loroa"," ",false,4,"loro2Berde.png");
		
		Karta kanguru1 = new Karta(3,"Kangurua"," ",false,4,"3canguroAzul.PNG");
		Karta kanguru2 = new Karta(3,"Kangurua"," ",false,4,"kanguro3Berde.png");
		
		Karta tximinoa1 = new Karta(4,"Tximinoa"," ",false,3,"4monoAzul.PNG");
		Karta tximinoa2 = new Karta(4,"Tximinoa"," ",false,3,"mono4Berde.png");
		
		Karta kamalehoia1 = new Karta(5,"Kamalehoia"," ",false,3,"5camaleonAzul.PNG");
		Karta kamalehoia2 = new Karta(5,"Kamalehoia"," ",false,3,"camaleon5Berde.png");
		
		Karta itsaslehoia1 = new Karta(6,"Itsaslehoia"," ",false,2,"6focaAzul.PNG");
		Karta itsaslehoia2 = new Karta(6,"Itsaslehoia"," ",false,2,"foca6Berde.png");
		
		Karta zebra1 = new Karta(7,"Zebra"," ",true,4,"7zebraAzul.PNG");
		Karta zebra2 = new Karta(7,"Zebra"," ",true,4,"zebra7Berde.png");
		
		Karta jirafa1 = new Karta(8,"Jirafa"," ",true,3,"8jirafaAzul.PNG");
		Karta jirafa2 = new Karta(8,"Jirafa"," ",true,3,"jirafa8Berde.PNG");
		
		Karta sugea1 = new Karta(9,"Sugea"," ",false,2,"9serpienteAzul.PNG");
		Karta sugea2 = new Karta(9,"Sugea"," ",false,2,"serpiente9Berde.PNG");
		
		Karta kokodriloa1 = new Karta(10,"Kokodriloa"," ",true,3,"10cocodriloAzul.PNG");
		Karta kokodriloa2 = new Karta(10,"Kokodriloa"," ",true,3,"cocodrilo10Berde.PNG");
		
		Karta hipopotamoa1 = new Karta(11,"Hipopotamoa"," ",true,2,"11hipopotamoAzul.PNG");
		Karta hipopotamoa2 = new Karta(11,"Hipopotamoa"," ",true,2,"hipopotamo11Berde.PNG");
		
		Karta lehoia1 = new Karta(12,"Lehoia"," ",false,2,"12leonAzul.PNG");
		Karta lehoia2 = new Karta(12,"Lehoia"," ",false,2,"leon12Berde.PNG");
		
		this.m1 = new EskuKartak();
		
		this.m1.gehituKarta(mofeta1);
		this.m1.gehituKarta(loroa1);
		this.m1.gehituKarta(kanguru1);
		this.m1.gehituKarta(tximinoa1);
		this.m1.gehituKarta(kamalehoia1);
		this.m1.gehituKarta(itsaslehoia1);
		this.m1.gehituKarta(zebra1);
		this.m1.gehituKarta(jirafa1);
		this.m1.gehituKarta(sugea1);
		this.m1.gehituKarta(kokodriloa1);
		this.m1.gehituKarta(hipopotamoa1);
		this.m1.gehituKarta(lehoia1);
		
		this.m2 = new EskuKartak();
		
		this.m2.gehituKarta(mofeta2);
		this.m2.gehituKarta(loroa2);
		this.m2.gehituKarta(kanguru2);
		this.m2.gehituKarta(tximinoa2);
		this.m2.gehituKarta(kamalehoia2);
		this.m2.gehituKarta(itsaslehoia2);
		this.m2.gehituKarta(zebra2);
		this.m2.gehituKarta(jirafa2);
		this.m2.gehituKarta(sugea2);
		this.m2.gehituKarta(kokodriloa2);
		this.m2.gehituKarta(hipopotamoa2);
		this.m2.gehituKarta(lehoia2);
	}
	public void hasieraketak(){
		sartuJokalariak();
		
		this.KartakSortu();
		
		j1.getMazoa().mazoaSortu(m1);
		pc.getMazoa().mazoaSortu(m2);
		
		pc.hartuLehenegoLauKartak();	
			
	}
	
	
	public void sartuJokalariak() {
		sc = new Scanner(System.in);
		System.out.println("Sartu jokalariaren izena: ");
		String hitza = sc.nextLine();
		j1.setJokalariarenIzena(hitza);
		System.out.println("Sartu jokalariaren zenbakia: ");
		int zenb = sc.nextInt();
		j1.setJokalariarenId(zenb);
		
		
	}
}
