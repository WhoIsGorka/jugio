package proiektua;

import java.util.Scanner;

public class Tableroa {
	
	private MahaiKartak ilara = new MahaiKartak();
	private Jokalaria j1;
	private Jokalaria pc;
	private EskuKartak m1;
	private EskuKartak m2;
	
	
	
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
		Karta kanguru2 = new Karta(3,"Kangurua"," ",false,4,"berdea");
		
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
	public void partidaJolastu(){
		sartuJokalariak();
		this.KartakSortu();
		j1.getMazoa().mazoaSortu(m1);
		pc.getMazoa().mazoaSortu(m2);
		
		j1.hartuLehenegoLauKartak();
		pc.hartuLehenegoLauKartak();
		
		j1.getEskuKartak().erakutsiKartak();
		pc.getEskuKartak().erakutsiKartak();
	}
	
	public void sartuJokalariak() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Sartu jokalariaren izena: ");
		String hitza = sc.nextLine();
		j1.setJokalariarenIzena(hitza);
		
		System.out.println("Sartu jokalariaren zenbakia: ");
		int zenb = sc.nextInt();
		j1.setJokalariarenId(zenb);
		
		pc.setPcIzenaId();
		
	}
}
