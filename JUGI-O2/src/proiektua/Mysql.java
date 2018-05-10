package proiektua;

import java.sql.Date;
import java.sql.DriverManager;
import java.sql.SQLException;
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
		this.konexioa = (Connection) DriverManager.getConnection(zerbitzaria, erabiltzailea, pasahitza);	}
	public static Mysql getMysql() throws ClassNotFoundException, SQLException {
		if (nMysql==null) {
			nMysql=new Mysql();
		}
		return nMysql;
	}
	
	public void sartuNanIzenaAbizena(String pNan, String pIzena, String pAbizena)throws ClassNotFoundException, SQLException{
		Class.forName("com.mysql.jdbc.Driver");
		Statement s = (Statement) konexioa.createStatement();	
		s.executeUpdate("INSERT INTO jokalari VALUES('"+pNan+"','"+pIzena+"','"+pAbizena+"')");
	} 
	public void sartuIzenaJokalaria(String pIzena)throws ClassNotFoundException, SQLException{
		Class.forName("com.mysql.jdbc.Driver");
		Statement s = (Statement) konexioa.createStatement();
		s.executeUpdate("INSERT INTO partida(jokIzen) VALUES ('"+pIzena+"')");
	}
	public void erakutsiJokalariIzena()throws ClassNotFoundException, SQLException{
		Class.forName("com.mysql.jdbc.Driver");
		Statement s = (Statement) konexioa.createStatement();	
		s.executeUpdate("select 'izena' from 'jokalari'");}
	public void erregistratu(String pIzena, String pAbizena, String pEmail, String pPasahitza, String pJaiotzeData, String pErregistroData, String pMota) throws SQLException, ClassNotFoundException{
		Class.forName("com.mysql.jdbc.Driver");
		Statement s = (Statement) konexioa.createStatement();	
		s.executeUpdate("INSERT INTO jokalaria(Izena, Abizena, Email, pasahitza, JaiotzeData, ErregistroData, Mota) VALUES('"+pIzena+"','"+pAbizena+"','"+pEmail+"','"+pPasahitza+"','"+pJaiotzeData+"','"+pErregistroData+"','"+pMota+"', )");
		}

	public void konexioaZarratu()throws ClassNotFoundException, SQLException{
		Class.forName("com.mysql.jdbc.Driver");
		konexioa.close();
	}
	public void rankingErakutsi()throws ClassNotFoundException, SQLException{
		Class.forName("com.mysql.jdbc.Driver");
		Statement s = (Statement) konexioa.createStatement();	
		s.executeUpdate("select * from ranking");}
	}
	




	