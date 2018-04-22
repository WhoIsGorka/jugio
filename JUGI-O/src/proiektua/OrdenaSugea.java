package proiektua;

import java.util.ArrayList;
import java.util.Iterator;

public class OrdenaSugea implements OrdenaPortaera{
	public OrdenaSugea() {
	}
	
	public void ordenaAldatu() {
		ArrayList<Karta> lista = Tableroa.getTableroa().getMahaiKartak().getLista();
		Iterator<Karta> itr = lista.iterator();
		Karta aux=null;
		Karta aux2=itr.next();
		Karta inter=null;
		int i;
	    boolean flag = true;
	    while ( flag ){
	    	flag = false;   
	        for( i=0;  i < lista.size()-1;  i++ ){
	        	if ( aux.getId() < aux2.getId() ){
	        		inter = aux;
	                aux = aux2;
	                aux2 = inter;
	                flag = true; 
	            } 
	        	aux=itr.next();
	        	aux2=itr.next();
	        } 
	    } 
	}
}
