package proiektua;

import java.util.concurrent.ThreadLocalRandom;

import javax.swing.JOptionPane;

public class Kangurua extends Karta {

	public Kangurua(int pId,String pIzena,String pDeskr,boolean pErre,int pPuntuak,String pIrudia,String pKolorea){
		super(pId, pIzena, pDeskr, pErre, pPuntuak, pIrudia, pKolorea);
		aPortaera=new AurreratuSinple();
	}
	public void animaladaEgin(){
		boolean ondo=false;
		do {
			try{	
				String kolorea;
				if(this.getKolorea()=="Urdina"){
					kolorea= "Urdina";
				}else{
					kolorea="Berdea";
				}
				if(kolorea=="Urdina"){
					int pos = Tableroa.getTableroa().getMahaiKartak().getPosizioa(this.getIzena(),this.getKolorea());
					int zenb =  Integer.parseInt(JOptionPane.showInputDialog(null, "Zenbat salto egin nahi dituzu, 1 edo 2?"));
					if (zenb <= 0 || zenb > 2) {
						throw new KanguroException();
					}else {
						if (((zenb==1)&&(pos>0))||((zenb==2)&&(pos==1))) {
							aPortaera.aurreratu(pos-1, pos);
							ondo=true;
						}else if ((zenb==2)&&(pos>1)){	
							aPortaera.aurreratu(pos-2, pos);
							ondo=true;
						}
					}
				}
				else if(kolorea=="Berdea"){
					int pos = Tableroa.getTableroa().getMahaiKartak().getPosizioa(this.getIzena(),this.getKolorea());
					int zenb =  ThreadLocalRandom.current().nextInt(1,3);
					if (((zenb==1)&&(pos>0))||((zenb==2)&&(pos==1))) {
						aPortaera.aurreratu(pos-1, pos);
					}else if ((zenb==2)&&(pos>1)){	
						aPortaera.aurreratu(pos-2, pos);
					}
					ondo=true;
				}
			}catch (KanguroException e) {
				JOptionPane.showMessageDialog(null, e.mezua());
			}catch (NumberFormatException ex) {
				JOptionPane.showMessageDialog(null, "Zenbaki bat sartu behar da");
			}
		}while(!ondo);
	}
}



