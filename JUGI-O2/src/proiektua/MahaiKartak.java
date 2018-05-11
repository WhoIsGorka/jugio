package proiektua;

 
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Observable;
import java.util.concurrent.TimeUnit;

import javax.swing.JOptionPane;


public class MahaiKartak extends Observable{
	private ArrayList<Karta> lista;
	private ArrayList<String> paths;
	
	public MahaiKartak() {			
		this.lista = new ArrayList<Karta>();
		this.paths = new ArrayList<String>();
	}
	

	
	public int getTamaina() {
		return this.lista.size();
	}
	
	public Karta getKarta(int i) {
		return this.lista.get(i);
	}
	public ArrayList<String> getPaths(){
		return this.paths;
	}
	
//	public void aurreraJoan(Karta pKarta) {
//		int i = this.getPosizioa(pKarta.getIzena());
//		Karta aux = this.kenduKarta(pKarta);
//		this.gehituKartaPos(aux, i-1);
//	}
	
	public int getPosizioa(String pI, String pK) {				// *Devuelve la posición de esa carta, y si no esta -1												
		Iterator<Karta> itr = this.getIterator();
		boolean aurkituta=false;
		Karta aux=null;
		int i=-1;
		while(!aurkituta && itr.hasNext()) {
			aux=itr.next();
			if ((aux.getIzena()==pI)&&(aux.getKolorea()==pK)) {
				aurkituta=true;
			}			
			i++;
			
		}
		if(aurkituta) {
			return i;
		}else {
			return -1;
		}
		
	}
	public void errekurtsiboakEgin() {
		Iterator<Karta> itr = this.getIterator();
		Karta k1;
		
		while(itr.hasNext()) {
			k1=itr.next();
			if(this.getTamaina()>1){
				if(k1.getErrekurtsiboa()){
					JOptionPane.showMessageDialog(null, 
							k1.getIzena() +" "+ k1.getKolorea(), 
                            "ERREKURTSIBOA", 
                            JOptionPane.DEFAULT_OPTION); 
					k1.animaladaEgin();
					Tableroa.getTableroa().notifikatuInterfazea();
				}
			}
		}
	}
	
	public int zenbatEspezieBera(String pS) { 						
		Iterator<Karta> itr = this.getIterator();
		Karta aux=null;
		int kont=0;
		while(itr.hasNext()) {
			aux=itr.next();	
			if (aux.getIzena().equals(pS)) {
				kont++;
			}
		}
		return kont;
		
	}
	public boolean hutsaDa() {
		return this.lista.isEmpty();
	}
	
	public void gehituKarta(Karta pKarta) {
		this.lista.add(pKarta);
		this.paths.add(pKarta.getIrudia());
	}
	
	public void gehituHasieran(Karta pKarta) {
		this.lista.add(0, pKarta);
		this.paths.add(0, pKarta.getIrudia());
	}
	
	public void gehituKartaPos(Karta pKarta, int i) {
		this.lista.add(i, pKarta);
		this.paths.add(i,pKarta.getIrudia());
	}
	public Karta kenduKartaPos(int i) {	
		this.paths.remove(i);
		return this.lista.remove(i);
	}
	public void ordezkatuKarta(int pPos,Karta pKarta){
		this.lista.set(pPos, pKarta);
		this.paths.set(pPos, pKarta.getIrudia());
	}

	 
	public void bueltaEman() {
		Collections.reverse(lista);
		Collections.reverse(paths);
	}
	
	public void ordenatuTxikHand() {
		ArrayList<Karta> listaaux = new ArrayList<Karta>();
		ArrayList<String> pathsaux = new ArrayList<String>();
		Karta max=null;
		int i;
		int j = lista.size()-1;
	    for (i=0; i<j; i++){  
	    	max=lista.get(0);
	        for(Karta k: lista){
	        	if ( k.getId() > max.getId() ){
	        		max=k;
	            }
	        } 
	        this.kenduKartaPos(this.getPosizioa(max.getIzena(), max.getKolorea()));
	        listaaux.add(max); 
	    } 
	    listaaux.add(this.kenduKartaPos(0));
	    for (Karta k: listaaux) {
	    	this.gehituKarta(k);
	    }
	}
	
	public void ezabatuBat(String pI, String pK){		   	//*			
		int pos = this.getPosizioa(pI, pK);
		
		if(pos !=-1) {
			this.paths.remove(pos);
			this.lista.remove(pos);
		}
	}
	
		
	public void ezabatuGuztiak(String pS){                 	            
//		Iterator<Karta> itr = this.getIterator();
//		Karta aux = null;
//		int pos = -1;
//		boolean kendu = false;
//		while(itr.hasNext()) {
//					
//			aux = itr.next();		
//			pos++;
//		
//			
//			if (aux.getIzena()==pS) {			
//					lista.remove(pos);
//					ezabatuGuztiak(pS);
//			}		
//		}
		
		this.ezabatuBat(pS, "Urdina");
		this.ezabatuBat(pS, "Berdea");
		
	}

		
	public Iterator<Karta> getIterator(){
		return this.lista.iterator();
	}
	
	/*
	public int bilatu(String pI, String pK) {									
		Iterator<Karta> itr = this.getIterator();
		boolean aurkituta=false;
		int pos = -1;
		Karta aux=null;
		while(!aurkituta && itr.hasNext()) {
			pos++;
			if ((aux.getClass().getName().equals(pI))&&(aux.getKolorea().equals(pK))) {
				aurkituta=true;
			}
			aux=itr.next();
		}
		return pos;
	}
	*/

	public void tabernanSartu() {
		
		this.kenduKartaPos(4);   // beti 4
		Karta k1 = this.kenduKartaPos(0);
		Karta k2 = this.kenduKartaPos(0);
		if (k1.getKolorea() == "Urdina") {
			int punt = Tableroa.getTableroa().getNi().getPuntuazioa();
			Tableroa.getTableroa().getNi().setPuntuazioa(punt + k1.getPuntuak());
			Tableroa.getTableroa().getNi().setKontKartak();
		}else {
			int punt = Tableroa.getTableroa().getPc().getPuntuazioa();
			Tableroa.getTableroa().getPc().setPuntuazioa(punt + k1.getPuntuak());	
			Tableroa.getTableroa().getPc().setKontKartak();
		
		}
		if (k2.getKolorea() == "Urdina") {
			int punt = Tableroa.getTableroa().getNi().getPuntuazioa();
			Tableroa.getTableroa().getNi().setPuntuazioa(punt + k2.getPuntuak());	
			Tableroa.getTableroa().getNi().setKontKartak();
		}else {
			int punt = Tableroa.getTableroa().getPc().getPuntuazioa();
			Tableroa.getTableroa().getPc().setPuntuazioa(punt + k2.getPuntuak());	
			Tableroa.getTableroa().getPc().setKontKartak();
		
		}
		
	}
	
	public void notifikatuInterfazea(){
		setChanged();
		super.notifyObservers(this.paths);
	}
	
}