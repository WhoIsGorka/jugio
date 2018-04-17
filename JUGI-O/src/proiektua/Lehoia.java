package proiektua;

public class Lehoia extends Karta {

	public Lehoia(int pId,String pIzena,String pDeskr,boolean pErre,int pPuntuak,String pKolorea){
		super(pId, pIzena, pDeskr, pErre, pPuntuak, pKolorea);
		
	}
	public void animaladaEgin(){
		//MahaiKartak mk = Tableroa.getTableroa().getMahaiKartak();
		
		if (Tableroa.getTableroa().getMahaiKartak().getPosizioa("Lehoia")!=-1) {
			aPortaera=new LehenaJarri(this);
			if(Tableroa.getTableroa().getMahaiKartak().getPosizioa("Tximinoa")!=-1){
				Tableroa.getTableroa().getMahaiKartak().ezabatuGuztiak("Tximinoa");
			}
		}else{
			Tableroa.getTableroa().getMahaiKartak().kenduKartaPos(Tableroa.getTableroa().getMahaiKartak().getTamaina());
		}
	}
}
