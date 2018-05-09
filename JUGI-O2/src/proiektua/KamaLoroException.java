package proiektua;

public class KamaLoroException  extends Exception{

	public KamaLoroException(){
		super();
	}
	
	public String mezua() {
		String mezua="Zebakia (1-"+(Tableroa.getTableroa().getMahaiKartak().getTamaina()-1)+") tartean egon behar da";
		return mezua;
	}
}
