package proiektua;

public class ListaKartak {
	private static ListaKartak nListaKartak;
	private static Karta Tximinoa;
	
	
	public ListaKartak() {
		this.Tximinoa = new Tximinoa(4,"Tximinoa"," ",false,3,"4monoAzul.PNG");
	}
	
	public static ListaKartak getListaKartak() {
		if (nListaKartak==null) {
			nListaKartak=new ListaKartak();
		}
		return nListaKartak;
	}
	
	public Karta geTximinoa() {
		return this.Tximinoa;
	}
}
