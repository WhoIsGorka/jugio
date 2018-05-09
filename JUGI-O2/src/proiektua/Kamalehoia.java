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
		boolean ondo=false;
		do {
			try{
				if(this.getKolorea()=="Urdina"){
					kolorea= "Urdina";
				}else{
					kolorea="Berdea";
				}
				if (kolorea=="Urdina"){
					int aukeragarriZenbMaximoa=mk.getTamaina()-1;
					int zenb =  Integer.parseInt(JOptionPane.showInputDialog(null, "Aukeratu mahiko animali bat (1-"+aukeragarriZenbMaximoa+"):"));
					if (zenb <= 0 || zenb > (Tableroa.getTableroa().getMahaiKartak().getTamaina()-1)) {
						throw new KamaLoroException();
					}else {
						Karta animaliKopia= mk.getKarta(zenb-1);
						animaliKopia.setKolorea(kolorea);
						int pos = mk.getPosizioa(this.getIzena(),this.getKolorea());
						mk.ordezkatuKarta(pos, animaliKopia);
						animaliKopia.animaladaEgin();
						pos = mk.getPosizioa(animaliKopia.getIzena(),animaliKopia.getKolorea());		
						mk.ordezkatuKarta(pos, this);
						ondo=true;
						}
				}
				else if(kolorea=="Berdea"){
					int zenb = ThreadLocalRandom.current().nextInt(1,mk.getTamaina()+1);
					Karta animaliKopia= mk.getKarta(zenb-1);
					animaliKopia.setKolorea(kolorea);
					int pos = mk.getPosizioa(this.getIzena(),this.getKolorea());
					mk.ordezkatuKarta(pos, animaliKopia);
					animaliKopia.animaladaEgin();
					pos = mk.getPosizioa(animaliKopia.getIzena(),animaliKopia.getKolorea());		
					mk.ordezkatuKarta(pos, this);
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


