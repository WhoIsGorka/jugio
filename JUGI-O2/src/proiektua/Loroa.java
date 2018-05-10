package proiektua;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

import javax.swing.JOptionPane;


public class Loroa extends Karta {

	public Loroa(int pId,String pIzena,String pDeskr,boolean pErre,int pPuntuak,String pIrudia,String pKolorea){
		super(pId, pIzena, pDeskr, pErre, pPuntuak, pIrudia, pKolorea);
		bPortaera=new BotaBat();
	}
	public void animaladaEgin(){
		boolean ondo=false;
		do {
			try{
				String kolorea;
				if(this.getKolorea()=="Urdina" || this.getKolorea()=="Gorria"){
					kolorea= "Urdina";
				}else{
					kolorea="Berdea";
				}
				
				if(kolorea=="Urdina"){
					int zenb =  Integer.parseInt(JOptionPane.showInputDialog(null, "Sartu kalera bota nahi duzun kartaren posizioa (1-"+(Tableroa.getTableroa().getMahaiKartak().getTamaina()-1)+"):"));
					if (zenb <= 0 || zenb > (Tableroa.getTableroa().getMahaiKartak().getTamaina()-1)) {
						throw new KamaLoroException();
					}
					else {
					Karta animaliKopia= Tableroa.getTableroa().getMahaiKartak().getKarta(zenb-1);	
					bPortaera.bota(animaliKopia.getIzena(), animaliKopia.getKolorea());
					ondo=true;
					}
				}
				else if(kolorea=="Berdea"){
					int zenb = ThreadLocalRandom.current().nextInt(1, Tableroa.getTableroa().getMahaiKartak().getTamaina()+1);
					Karta animaliKopia= Tableroa.getTableroa().getMahaiKartak().getKarta(zenb-1);	
					bPortaera.bota(animaliKopia.getIzena(), animaliKopia.getKolorea());
					ondo=true;		
				}
			}catch (KamaLoroException e) {
				JOptionPane.showMessageDialog(null, e.mezua());
			}catch (NumberFormatException ex) {
				JOptionPane.showMessageDialog(null, "Zenbaki bat sartu behar da");
			}
		}while(!ondo);
	}
}
