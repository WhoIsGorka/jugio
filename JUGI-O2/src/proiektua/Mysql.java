package proiektua;

import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class Mysql {
	private Connection konexioa;
	private static Mysql nMysql=null;
	
	public Mysql() throws ClassNotFoundException, SQLException{
		String zerbitzaria = "jdbc:mysql://localhost:3306/barbestial";
		String erabiltzailea = "root";
		String pasahitza = "";
		this.konexioa = (Connection) DriverManager.getConnection(zerbitzaria, erabiltzailea, pasahitza);	
		Class.forName("com.mysql.jdbc.Driver");
	}
	public static Mysql getMysql() throws ClassNotFoundException, SQLException {
		if (nMysql==null) {
			nMysql=new Mysql();
		}
		return nMysql;
	}
	
	public void erregistratuJokalari(String pIzena, String pAbizena, String pEmail, String pPasahitza, String pJaiotzeData, String pErregistroData, String pMota)throws ClassNotFoundException, SQLException{
		
		Statement s = (Statement) konexioa.createStatement();	
		s.executeUpdate("INSERT INTO jokalaria VALUES('"+pIzena+"','"+pAbizena+"','"+pEmail+"','"+pPasahitza+"', '"+pJaiotzeData+"','"+pErregistroData+"','"+pMota+"')");
	} 
	public String erabiltzaileEdoAdmin(String pEmail) throws ClassNotFoundException, SQLException {
		Statement s = (Statement) konexioa.createStatement();	
		ResultSet rs = s.executeQuery("SELECT mota FROM jokalaria WHERE Email=('"+pEmail+"')");
		String arr = null;
		while (rs.next()) {
		    String em = rs.getString("Mota");
		    arr = em.replace("\n", ",");
		}
		if(arr==null) {
			return "EZ";
		}
		return arr;
	}
	public boolean pasahitzaEgokia(String pEmail, String pPasahitza) throws SQLException {
		Statement s = (Statement) konexioa.createStatement();	
		ResultSet rs = s.executeQuery("SELECT pasahitza FROM jokalaria WHERE Email=('"+pEmail+"')");
		String arr = null;
		while (rs.next()) {
		    String em = rs.getString("pasahitza");
		    arr = em.replace("\n", ",");
		}
		if (arr.equals(pPasahitza)) {
			return true;
		}
		else{
			return false;		
		}
	}
	public void erregistratuPartida(String pEmail,int pPuntuazioa,int pPcPuntuazioa,String pKolorea,String pHOrdua,String pBOrdua) throws SQLException{
		Statement s = (Statement) konexioa.createStatement();
		String t = "";
		for (int i = 0; i < pEmail.length(); ++i) {
		    char ch = pEmail.charAt(i);
		    if (!t.isEmpty()) {
		        t += " ";
		    }
		    int n = (int)ch - (int)'a' + 1;
		    t += String.valueOf(n);
		}
		String pKode = t;
		
		java.util.Date todayDate = Calendar.getInstance().getTime();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		String pData = formatter.format(todayDate);
		s.executeUpdate("INSERT INTO partida VALUES('"+pKode+"','"+pEmail+"','"+pPuntuazioa+"','"+pPcPuntuazioa+"', '"+pKolorea+"','"+pData+"','"+pHOrdua+"','"+pBOrdua+"')");
	}
	/*public ArrayList<String> jokalaririkOnenak(){
		Statement s = (Statement) konexioa.createStatement();	
		ResultSet rs = s.executeQuery("SELECT izena,puntuazioa FROM jokalaria,partida ORDER BY puntuazioa");
		
	}*/

	public void konexioaZarratu()throws ClassNotFoundException, SQLException{
		konexioa.close();
	}

}
	
//com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException


	