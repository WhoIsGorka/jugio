package proiektua;


public class Jokoa {
	
	private static Jokoa nireJokoa=null;
	private Tableroa t1;
	
	private Jokoa(){
		this.t1 = new Tableroa();
	}
	
	public static Jokoa getJokoa(){
		if (nireJokoa==null){
			nireJokoa= new Jokoa();
		}
		return nireJokoa;
	}
	public void jolastu(){
		this.t1.partidaJolastu();
	}
}
