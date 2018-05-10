package proiektua;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;

public class Mysql {
	public Mysql() throws ClassNotFoundException, SQLException{
		jolastu();
	}
	
	public static Connection jolastu() throws ClassNotFoundException, SQLException{
		String zerbitzaria = "jdbc:mysql://localhost:3306/barbestial";
		String erabiltzailea = "root";
		String pasahitza = "";
		Connection konexioa = (Connection) DriverManager.getConnection(zerbitzaria, erabiltzailea, pasahitza);
		return konexioa;
		}
	public void sartuNanIzenaAbizena(String pNan, String pIzena, String pAbizena)throws ClassNotFoundException, SQLException{
		Connection konexioa= jolastu();
		Class.forName("com.mysql.jdbc.Driver");
		Statement s = (Statement) konexioa.createStatement();	
		s.executeUpdate("INSERT INTO jokalari VALUES('"+pNan+"','"+pIzena+"','"+pAbizena+"')");
	} 
	public void sartuIzenaJokalaria(String pIzena)throws ClassNotFoundException, SQLException{
		Connection konexioa= jolastu();
		Class.forName("com.mysql.jdbc.Driver");
		Statement s = (Statement) konexioa.createStatement();
		s.executeUpdate("INSERT INTO partida(jokIzen) VALUES ('"+pIzena+"')");
	}
	public void erakutsiJokalariIzena()throws ClassNotFoundException, SQLException{
		Connection konexioa= jolastu();
		Class.forName("com.mysql.jdbc.Driver");
		Statement s = (Statement) konexioa.createStatement();	
		s.executeUpdate("select 'izena' from 'jokalari'");}

	public void konexioaZarratu()throws ClassNotFoundException, SQLException{
		Connection konexioa= jolastu();
		Class.forName("com.mysql.jdbc.Driver");
		konexioa.close();
	}
	public void rankingErakutsi()throws ClassNotFoundException, SQLException{
		Connection konexioa= jolastu();
		Class.forName("com.mysql.jdbc.Driver");
		Statement s = (Statement) konexioa.createStatement();	
		s.executeUpdate("select * from ranking");}
	}
	




	