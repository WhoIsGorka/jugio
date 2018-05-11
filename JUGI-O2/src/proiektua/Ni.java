package proiektua;


import java.sql.SQLException;
import java.util.concurrent.TimeUnit;

import javax.swing.JOptionPane;

public class Ni extends Jokalaria {

	public Ni(int pId, String pIzena, EskuKartak pEskuKartak, MazoKartak pMazoKartak, int pPuntuazioa) {
		super();
	}
	
	public void txandaEgin(int kartazenb) throws ClassNotFoundException, SQLException{
		
		Tableroa.getTableroa().getMahaiKartak().gehituKarta(this.getEskuKartak().kenduKarta(kartazenb));
		int tamaina = Tableroa.getTableroa().getMahaiKartak().getTamaina();
		if(tamaina!=1){
			Tableroa.getTableroa().getMahaiKartak().getKarta(tamaina-1).animaladaEgin();
			Tableroa.getTableroa().notifikatuInterfazea();
		}
	
		
		Tableroa.getTableroa().getMahaiKartak().errekurtsiboakEgin();
				
		
		if(Tableroa.getTableroa().getMahaiKartak().getTamaina()==5){
			Tableroa.getTableroa().getMahaiKartak().tabernanSartu();
		}
		
		if (this.getEskuKartak().luzera()==0){
			String pBOrdua = Tableroa.getTableroa().orduaLortu();
			Mysql.getMysql().erregistratuPartida(Tableroa.getTableroa().getEmail(), this.getKontKartak(), Tableroa.getTableroa().getPc().getKontKartak(), "Urdina", Tableroa.getTableroa().getHOrdua(), pBOrdua);
			JOptionPane.showMessageDialog(null, 
					Tableroa.getTableroa().norkIrabaziDu(), 
                    "AMAIERA", 
                    JOptionPane.DEFAULT_OPTION); 
			int result = JOptionPane.showConfirmDialog(null, "IRTEN?", "JOKOA AMAITU DA",
                    JOptionPane.OK_OPTION);
            if (result == JOptionPane.OK_OPTION)
                System.exit(0);		}
		
	}
	}
