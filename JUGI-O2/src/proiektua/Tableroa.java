package proiektua;



import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JOptionPane;

public class Tableroa extends Observable{
	
	private MahaiKartak ilara;
	private Jokalaria j1;
	private Jokalaria pc;
	private EskuKartak m1;
	private EskuKartak m2;
	private ArrayList<String>[] eskuMahaiPaths;
	private MenuLogin menuLogin;

	private String hOrdua;
	private String email;
	
	private static Tableroa nTableroa=null;
	
	
	
	public Tableroa() {
		this.ilara = new MahaiKartak();
		this.j1 =  new Ni(0, null, m1, null, 0);
		this.pc = new Pc();
		this.eskuMahaiPaths = new ArrayList[2];
		eskuMahaiPaths[0]= new ArrayList<String>();
		eskuMahaiPaths[1]= new ArrayList<String>();
	}
	
	public static Tableroa getTableroa() {
		if (nTableroa==null) {
			nTableroa=new Tableroa();
		}
		return nTableroa;
	}
	

	public MahaiKartak getMahaiKartak(){
		return this.ilara;
	}
	public void setEmail(String pEmail){
		this.email= pEmail;
	}
	public String getEmail(){
		return this.email;
	}
	public Jokalaria getNi() {
		return this.j1;
	}
	public Jokalaria getPc() {
		return this.pc;
	}
	public String getHOrdua(){
		return this.hOrdua;
	}
	public void KartakSortu(){
		Karta mofeta1 = new Mofeta(1,"Mofeta"," ",false,4,"1mofetaAzul.PNG","Urdina");
		Karta mofeta2 = new Mofeta(1,"Mofeta"," ",false,4,"mofeta1Berde.png","Berdea");
		
		Karta loroa1 = new Loroa(2,"Loroa"," ",false,4,"2loroAzul.PNG","Urdina");
		Karta loroa2 = new Loroa(2,"Loroa"," ",false,4,"loro2Berde.png","Berdea");
		
		Karta kanguru1 = new Kangurua(3,"Kangurua"," ",false,4,"3canguroAzul.PNG","Urdina");
		Karta kanguru2 = new Kangurua(3,"Kangurua"," ",false,4,"kanguro3Berde.png","Berdea");
		
		Karta tximinoa1 = new Tximinoa(4,"Tximinoa"," ",false,3,"4monoAzul.PNG","Urdina");
		Karta tximinoa2 = new Tximinoa(4,"Tximinoa"," ",false,3,"mono4Berde.png","Berdea");
		
		Karta kamalehoia1 = new Kamalehoia(5,"Kamalehoia"," ",false,3,"5camaleonAzul.PNG","Urdina");
		Karta kamalehoia2 = new Kamalehoia(5,"Kamalehoia"," ",false,3,"camaleon5Berde.png","Berdea");
		
		Karta itsaslehoia1 = new Itsaslehoia(6,"Itsaslehoia"," ",false,2,"6focaAzul.PNG","Urdina");
		Karta itsaslehoia2 = new Itsaslehoia(6,"Itsaslehoia"," ",false,2,"foca6Berde.png","Berdea");
		
		Karta zebra1 = new Zebra(7,"Zebra"," ",true,4,"7zebraAzul.PNG","Urdina");
		Karta zebra2 = new Zebra(7,"Zebra"," ",true,4,"zebra7Berde.png","Berdea");
		
		Karta jirafa1 = new Jirafa(8,"Jirafa"," ",true,3,"8jirafaAzul.PNG","Urdina");
		Karta jirafa2 = new Jirafa(8,"Jirafa"," ",true,3,"jirafa8Berde.PNG","Berdea");
		
		Karta sugea1 = new Sugea(9,"Sugea"," ",false,2,"9serpienteAzul.PNG","Urdina");
		Karta sugea2 = new Sugea(9,"Sugea"," ",false,2,"serpiente9Berde.PNG","Berdea");
		
		Karta kokodriloa1 = new Kokodriloa(10,"Kokodriloa"," ",true,3,"10cocodriloAzul.PNG","Urdina");
		Karta kokodriloa2 = new Kokodriloa(10,"Kokodriloa"," ",true,3,"cocodrilo10Berde.PNG","Berdea");
		
		Karta hipopotamoa1 = new Hipopotamoa(11,"Hipopotamoa"," ",true,2,"11hipopotamoAzul.PNG","Urdina");
		Karta hipopotamoa2 = new Hipopotamoa(11,"Hipopotamoa"," ",true,2,"hipopotamo11Berde.PNG","Berdea");
		
		Karta lehoia1 = new Lehoia(12,"Lehoia"," ",false,2,"12leonAzul.PNG","Urdina");
		Karta lehoia2 = new Lehoia(12,"Lehoia"," ",false,2,"leon12Berde.PNG","Berdea");
		
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
		
		this.KartakSortu();
		
		j1.getMazoa().mazoaSortu(m1);
		pc.getMazoa().mazoaSortu(m2);
		
		pc.hartuLehenegoLauKartak();	
		
		hOrdua = this.orduaLortu();
			
	}
	public String orduaLortu(){
		Calendar calendario = new GregorianCalendar();
		int ordua, min, secs;
		ordua =calendario.get(Calendar.HOUR_OF_DAY);
		min = calendario.get(Calendar.MINUTE);
		secs = calendario.get(Calendar.SECOND);
		
		return (ordua + ":" + min + ":" + secs);
	}
	
	public void sartuJokalariak() {
		String hitza = JOptionPane.showInputDialog(null, "Sartu jokalariaren izena ");
		j1.setJokalariarenIzena(hitza);
		int zenb =  Integer.parseInt(JOptionPane.showInputDialog(null, "Sartu jokalariaren ID-a"));
		j1.setJokalariarenId(zenb);		
	}
	
	public void jolastu(int pPos) throws ClassNotFoundException, SQLException {
		if(this.getNi().getEskuKartak().luzera()==4 || this.getNi().getMazoa().hutsaDa()){
			this.j1.txandaEgin(pPos);
			
			this.notifikatuInterfazea();
			
			
			
			this.pc.txandaEgin(0);
		}else{
			JOptionPane.showMessageDialog(null, 
                    "Karta bota baino lehen beste bat lapurtu!!!", 
                    "Errorea!", 
                    JOptionPane.WARNING_MESSAGE);	
		}

		
	}
	public void menuaIreki(){
		menuLogin = new MenuLogin();
		menuLogin.setVisible(true);
	}
	public String norkIrabaziDu(){
		if(this.j1.getKontKartak()>this.pc.getKontKartak()){
			return "Irabazi duzu!!!";
		}else if(this.j1.getKontKartak()<this.pc.getKontKartak()){
			return  "Galdu duzu!!!";
		}else{
			if(this.j1.getPuntuazioa()>this.pc.getPuntuazioa()){
				return "Irabazi duzu!!!";
			}else{
				return  "Galdu duzu!!!";
			}
		}
	}
	
	public void leihoaErregistratu(Observer o){
		this.addObserver(o);
	}
	public void pathListaSortu(){
		this.eskuMahaiPaths[0]= this.getNi().getEskuKartak().getPaths();
		this.eskuMahaiPaths[1]= this.getMahaiKartak().getPaths();
	}
	public void notifikatuInterfazea(){
		this.pathListaSortu();
		setChanged();
		super.notifyObservers(this.eskuMahaiPaths);
	}

	
}
