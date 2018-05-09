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
	
	public static void jolastu() throws ClassNotFoundException, SQLException{
		String zerbitzaria = "jdbc:mysql://localhost:3306/barbestial";
		String erabiltzailea = "root";
		String pasahitza = "";
		Connection konexioa = (Connection) DriverManager.getConnection(zerbitzaria, erabiltzailea, pasahitza);
		
		Scanner sc = null;
		int zenb=0;
		Class.forName("com.mysql.jdbc.Driver");
		Statement s = (Statement) konexioa.createStatement();
		
		zenb = sc.nextInt();
		switch (zenb) {
		case 1:
			System.out.println("Sartu jokalariaren izena: ");
			String izena = sc.nextLine();
			System.out.println("Sartu jokalariaren abizena:");
			String abizena = sc.nextLine();
			System.out.println("Sartu jokalariaren NAN:");
			String nan = sc.nextLine(); 
			s.executeUpdate("INSERT INTO jokalari VALUES('"+nan+"','"+izena+"','"+abizena+"')");
			break;
		case 2:
			System.out.println("Sartu jokalariaren izena: ");
			izena = sc.nextLine();
			s.executeUpdate("INSERT INTO partida(jokIzen) VALUES ('"+izena+"')"); 
			break;
		case 3:
			s.executeUpdate("select 'izena' from 'jokalari'");
			break;
		case 4:
			konexioa.close();
			break;
		}
	}
}




	