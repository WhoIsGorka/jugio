package proiektua;

import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

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
		
		Random r = new Random();
		int randomNum = r.nextInt(1000)+1;
		int pKode = randomNum;
		
		java.util.Date todayDate = Calendar.getInstance().getTime();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		String pData = formatter.format(todayDate);
		s.executeUpdate("INSERT INTO partida VALUES('"+pKode+"','"+pEmail+"','"+pPuntuazioa+"','"+pPcPuntuazioa+"', '"+pKolorea+"','"+pData+"','"+pHOrdua+"','"+pBOrdua+"')");
	}
	public ResultSet jokalariOnenak() throws SQLException{
		Statement s = (Statement) konexioa.createStatement();	
		ResultSet rs = s.executeQuery("SELECT distinct Izena,avg(NirePuntuak) FROM jokalaria as J INNER JOIN partida as P on J.Email=P.ErabiltzaileEmail GROUP BY Izena ORDER BY avg(NirePuntuak) DESC");
		return rs;
		}
	public ResultSet partidaOnenak() throws SQLException{
		Statement s = (Statement) konexioa.createStatement();	
		ResultSet rs = s.executeQuery("SELECT Kode,Izena,NirePuntuak,HOrdua,BOrdua,Data FROM jokalaria as J INNER JOIN partida as P on J.Email=P.ErabiltzaileEmail ORDER BY NirePuntuak DESC");
	    return rs;
		}
	public ResultSet puntuazioOnenak() throws SQLException{
		Statement s = (Statement) konexioa.createStatement();	
		ResultSet rs = s.executeQuery("SELECT Izena,NirePuntuak FROM jokalaria as J INNER JOIN partida as P on J.Email=P.ErabiltzaileEmail ORDER BY NirePuntuak DESC");
		return rs;
	}
	public ResultSet gaurkoPartidaOnenak() throws SQLException{
		java.util.Date todayDate = Calendar.getInstance().getTime();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		String pData = formatter.format(todayDate);
		
		Statement s = (Statement) konexioa.createStatement();	
		ResultSet rs = s.executeQuery("SELECT Kode,Izena,NirePuntuak,HOrdua,BOrdua,Data FROM jokalaria as J INNER JOIN partida as P on J.Email=P.ErabiltzaileEmail WHERE P.Data=('"+pData+"') ORDER BY NirePuntuak DESC ");
	    return rs;
	}
	public void erregistratuAnimalia(String pIzena, int pZenbakia, String pAnimalada, int pPuntuak, String pOriginala)throws ClassNotFoundException, SQLException{
		
		Statement s = (Statement) konexioa.createStatement();	
		s.executeUpdate("INSERT INTO animalia VALUES('"+pIzena+"','"+pZenbakia+"','"+pAnimalada+"','"+pPuntuak+"', '"+pOriginala+"')");
	} 
	public ResultSet getJokalariak(String pMota) throws SQLException{
		Statement s = (Statement) konexioa.createStatement();	
		ResultSet rs = s.executeQuery("SELECT Email FROM jokalaria WHERE Mota=('"+pMota+"')");
		
		return rs;
	}
	public void baimenakEman(String pEmail) throws SQLException{
		Statement s = (Statement) konexioa.createStatement();	
		s.executeUpdate("UPDATE jokalaria SET Mota='Administratzaile' WHERE Email=('"+pEmail+"')");
	}
	public void baimenakKendu(String pEmail) throws SQLException{
		Statement s = (Statement) konexioa.createStatement();	
		s.executeUpdate("UPDATE jokalaria SET Mota='Erabiltzaile' WHERE Email=('"+pEmail+"')");
	}
	public void konexioaZarratu()throws ClassNotFoundException, SQLException{
		konexioa.close();
	}

}
	



	