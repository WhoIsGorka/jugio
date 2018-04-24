package proiektua;

import java.util.ArrayList;
import java.util.Iterator;



public class OrdenaSugea implements OrdenaPortaera{
	public OrdenaSugea() {
	}
	
	public void ordenaAldatu() {
		MahaiKartak lista = Tableroa.getTableroa().getMahaiKartak();
		Iterator<Karta> itr = lista.getIterator();
		Karta aux=null;
		Karta aux2=itr.next();
		Karta inter=null;
		int i;
	    boolean flag = true;
	    while ( flag ){
	    	flag = false;   
	        for( i=0;  i < lista.getTamaina()-1;  i++ ){
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
