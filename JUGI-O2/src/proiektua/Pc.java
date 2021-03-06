package proiektua;


import java.sql.SQLException;
import java.util.concurrent.ThreadLocalRandom;
import javax.swing.JOptionPane;

public class Pc extends Jokalaria {

	public Pc() {
		super();
		super.izena = "Ordenagailua";
		super.id = 0;
	}
	
	public int txandaEgin(int kartazenb) throws ClassNotFoundException, SQLException{
		
		int randomNum = ThreadLocalRandom.current().nextInt(0,this.getEskuKartak().luzera());
		Tableroa.getTableroa().getMahaiKartak().gehituKarta(this.getEskuKartak().kenduKarta(randomNum));
	
	
		Tableroa.getTableroa().notifikatuInterfazea();
	
		int tamaina = Tableroa.getTableroa().getMahaiKartak().getTamaina();
		if(tamaina!=1){
			Tableroa.getTableroa().getMahaiKartak().getKarta(tamaina-1).animaladaEgin();
			Tableroa.getTableroa().notifikatuInterfazea();
		}
		
		Tableroa.getTableroa().getMahaiKartak().errekurtsiboakEgin();
		
		if(Tableroa.getTableroa().getMahaiKartak().getTamaina()==5){
			Tableroa.getTableroa().getMahaiKartak().tabernanSartu();
			Tableroa.getTableroa().notifikatuInterfazea();
		}
		
		if (this.getEskuKartak().luzera()==0){
			String pBOrdua = Tableroa.getTableroa().orduaLortu();
			Mysql.getMysql().erregistratuPartida(Tableroa.getTableroa().getEmail(), Tableroa.getTableroa().getNi().getKontKartak(), this.getKontKartak(), "Urdina", Tableroa.getTableroa().getHOrdua(), pBOrdua);
			JOptionPane.showMessageDialog(null, 
					Tableroa.getTableroa().norkIrabaziDu(), 
                    "AMAIERA", 
                    JOptionPane.DEFAULT_OPTION); 
			int result = JOptionPane.showConfirmDialog(null, "Atzera bueltatu?", "JOKOA AMAITU DA",
                    JOptionPane.OK_OPTION);
            if (result == JOptionPane.OK_OPTION){
            	   if(Mysql.getMysql().erabiltzaileEdoAdmin(Tableroa.getTableroa().getEmail())=="Erabiltzaile"){
            		   MenuNagusiaErab menu = new MenuNagusiaErab();
            		   menu.setVisible(true);
            	   }else{
            		   MenuNagusiaAdmin menu = new MenuNagusiaAdmin();
            		   menu.setVisible(true);
            	   }
            	   return 1;
            }
               
            
        }
		this.hartuKarta();
		return 0;
	}
	
}
