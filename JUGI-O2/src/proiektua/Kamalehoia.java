package proiektua;

import java.util.concurrent.ThreadLocalRandom;

import javax.swing.JOptionPane;



public class Kamalehoia extends Karta {

	public Kamalehoia(int pId,String pIzena,String pDeskr,boolean pErre,int pPuntuak,String pIrudia,String pKolorea){
		super(pId, pIzena, pDeskr, pErre, pPuntuak, pIrudia, pKolorea);
	}
	public void animaladaEgin(){
		MahaiKartak mk = Tableroa.getTableroa().getMahaiKartak();
 		String kolorea;
 		int zenb = 0;
 		
		boolean ondo = false;
		do {
			try {	
				if(this.getKolorea()=="Urdina"){   //Jokalariak erabiltzen dauanean
					kolorea = "Urdina";
					int aukeragarriZenbMaximoa=mk.getTamaina();
					zenb =  Integer.parseInt(JOptionPane.showInputDialog(null, "Aukeratu mahiko animali bat (1-"+(aukeragarriZenbMaximoa-1)+"):"));
					if (zenb <= 0 || zenb > (Tableroa.getTableroa().getMahaiKartak().getTamaina()-1)) {
						throw new KamaLoroException();
					}else {
						ondo=true;
					}
					Karta animaliKopia= mk.getKarta(zenb-1);								// kopia	
					kolorea= animaliKopia.getKolorea();
					Karta berria = null;
					String s = animaliKopia.getIzena();
					if(!s.equals("Kamalehoia")){
						if (s.equals("Lehoia")) {
							berria = new Lehoia(12,"Lehoia"," ",false,2,"12leonAzul.PNG","Gorria");
						}else if(s.equals("Hipopotamoa")) {
							berria = new Hipopotamoa(11,"Hipopotamoa"," ",true,2,"11hipopotamoAzul.PNG","Gorria");
						}else if(s.equals("Kokodriloa")) {
							berria = new Kokodriloa(10,"Kokodriloa"," ",true,3,"10cocodriloAzul.PNG","Gorria");
						}else if(s.equals("Sugea")) {
							berria = new Sugea(9,"Sugea"," ",false,2,"9serpienteAzul.PNG","Gorria");
						}else if(s.equals("Jirafa")) {
							berria = new Jirafa(8,"Jirafa"," ",true,3,"8jirafaAzul.PNG","Gorria");
						}else if(s.equals("Zebra")) {
							berria = new Zebra(7,"Zebra"," ",true,4,"7zebraAzul.PNG","Gorria");
						}else if(s.equals("Itsaslehoia")) {
							berria = new Itsaslehoia(6,"Itsaslehoia"," ",false,2,"6focaAzul.PNG","Gorria");
						}else if(s.equals("Tximinoa")) {				
							berria = new Tximinoa(4,"Tximinoa"," ",false,3,"4monoAzul.PNG","Gorria");
						}else if(s.equals("Kangurua")) {	
							berria = new Kangurua(3,"Kangurua"," ",false,4,"3canguroAzul.PNG","Gorria");	
						}else if(s.equals("Loroa")) {
							berria = new Loroa(2,"Loroa"," ",false,4,"2loroAzul.PNG","Gorria");	
						}else if(s.equals("Mofeta")) {
							berria = new Mofeta(1,"Mofeta"," ",false,4,"1mofetaAzul.PNG","Gorria");
						}
						
						int pos = mk.getPosizioa(this.getIzena(), this.getKolorea());		
						mk.ordezkatuKarta(pos, berria);
						
						berria.setKolorea(kolorea);
						
						mk.getKarta(pos).animaladaEgin();
						
						int aux2 = mk.getPosizioa(berria.getIzena(),berria.getKolorea());	
						mk.ordezkatuKarta(aux2, this);
						
						ondo= true;
					}else{
						if(mk.getTamaina()==1){
							mk.gehituKarta(this);   //Mahian bakarrik kamalehoi bat dagoenean eta jokalariak kamaleohian transformatu nahi duenean bere kamalehoia
							ondo=true; 
						}else{
							JOptionPane.showMessageDialog(null, "Ezin da kamalehoi bat aukeratu");
							ondo=false;
						}
					}
				
						
				}else if(this.getKolorea()=="Berdea"){   //PC-ak erabiltzen dauanean
					kolorea = "Berdea";
					zenb = ThreadLocalRandom.current().nextInt(1,mk.getTamaina()+1);
					Karta animaliKopia= mk.getKarta(zenb-1);								// kopia	
					Karta berria = null;
					String s = animaliKopia.getIzena();
					if(!s.equals("Kamalehoia")){
						if (s.equals("Lehoia")) {
							berria = new Lehoia(12,"Lehoia"," ",false,2,"12leonAzul.PNG","Gorria");
						}else if(s.equals("Hipopotamoa")) {
							berria = new Hipopotamoa(11,"Hipopotamoa"," ",true,2,"11hipopotamoAzul.PNG","Gorria");
						}else if(s.equals("Kokodriloa")) {
							berria = new Kokodriloa(10,"Kokodriloa"," ",true,3,"10cocodriloAzul.PNG","Gorria");
						}else if(s.equals("Sugea")) {
							berria = new Sugea(9,"Sugea"," ",false,2,"9serpienteAzul.PNG","Gorria");
						}else if(s.equals("Jirafa")) {
							berria = new Jirafa(8,"Jirafa"," ",true,3,"8jirafaAzul.PNG","Gorria");
						}else if(s.equals("Zebra")) {
							berria = new Zebra(7,"Zebra"," ",true,4,"7zebraAzul.PNG","Gorria");
						}else if(s.equals("Itsaslehoia")) {
							berria = new Itsaslehoia(6,"Itsaslehoia"," ",false,2,"6focaAzul.PNG","Gorria");
						}else if(s.equals("Tximinoa")) {				
							berria = new Tximinoa(4,"Tximinoa"," ",false,3,"4monoAzul.PNG","Gorria");
						}else if(s.equals("Kangurua")) {	
							berria = new Kangurua(3,"Kangurua"," ",false,4,"3canguroAzul.PNG","Gorria");	
						}else if(s.equals("Loroa")) {
							berria = new Loroa(2,"Loroa"," ",false,4,"2loroAzul.PNG","Gorria");	
						}else if(s.equals("Mofeta")) {
							berria = new Mofeta(1,"Mofeta"," ",false,4,"1mofetaAzul.PNG","Gorria");
						}
						int pos = mk.getPosizioa(this.getIzena(), this.getKolorea());		
						mk.ordezkatuKarta(pos, berria);
						
						berria.setKolorea(kolorea);
						
						mk.getKarta(pos).animaladaEgin();
						
						int aux2 = mk.getPosizioa(berria.getIzena(),berria.getKolorea());	
						mk.ordezkatuKarta(aux2, this);
						
						ondo=true;
					}else{
						if(mk.getTamaina()==1){
							mk.gehituKarta(this);   //Mahian bakarrik kamalehoi bat dagoenean eta PC-ak kamaleohian transformatu nahi duenean bere kamalehoia
							ondo=true; 
						}else{
							ondo= false;
						}
					}
						
						
				}
				
			}catch(KamaLoroException e) {
				JOptionPane.showMessageDialog(null, e.mezua());
			}catch (NumberFormatException ex) {
				JOptionPane.showMessageDialog(null, "Zenbaki bat sartu behar da");
			}
		}while(!ondo);
 		
 		
	
 	}	
 }