package proiektua;

public class Lehoia extends Karta {

	public Lehoia(int pId,String pIzena,String pDeskr,boolean pErre,int pPuntuak,String pKolorea){
		super(pId, pIzena, pDeskr, pErre, pPuntuak, pKolorea);
		
	}
	public void animaladaEgin(){
		if (Tableroa.getTableroa().getMahaiKartak().badago(ListaKartak.getListaKartak().geTximinoa())) {//TENEMOS QUE TENER LA POSIBILIDAD DE ACCEDER A CUALQUIER KARTA, ES DECIR HACES UNA LISTA KARTAK DONDE ESTEN TODAS
		aPortaera=new LehenaJarri(this);
		}
	}
}
