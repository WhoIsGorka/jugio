package proiektua;

import java.awt.GridLayout;
import java.sql.ResultSet;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;

import javax.swing.JTable;

public class PuntuazioInterfazea extends JFrame {
	private JPanel contentPane;
	private JTable table;
	public PuntuazioInterfazea() {
		setTitle("         PUNTUAZIOAK");
		
		setBounds(500, 200, 500, 471);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		contentPane.setLayout(new GridLayout(1, 0, 0, 0));
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1);
		
		table = new JTable();
		table.setBounds(82, 28, 216, 139);
		
		JScrollPane js=new JScrollPane(table);
        js.setVisible(true);
        
        panel_1.add(js);
		
	}
	public void displayJokalariOnenak(ResultSet rs){		
		DefaultTableModel modelo = new DefaultTableModel();
		modelo.setColumnIdentifiers(new Object[]{"Posizioa","Izena","Batazbestekoa"});
		try{
			int pos=1;
			while(rs.next()){	
				modelo.addRow(new Object[]{pos,rs.getString("Izena"),rs.getString("avg(NirePuntuak)")});
				pos++;	
			}
			table.setModel(modelo);
		}catch(Exception e){
			System.out.println(e); 
		}
	}
	public void displayPuntuazioOnenak(ResultSet rs){		
		DefaultTableModel modelo = new DefaultTableModel();
		modelo.setColumnIdentifiers(new Object[]{"Jokalaria","Puntuazioa"});
		try{
			while(rs.next()){
				modelo.addRow(new Object[]{rs.getString("Izena"),rs.getString("NirePuntuak")});
			}
			table.setModel(modelo);
		}catch(Exception e){
			System.out.println(e);
		}
		
	}
	public void displayPartidaOnenak(ResultSet rs){		
		DefaultTableModel modelo = new DefaultTableModel();
		modelo.setColumnIdentifiers(new Object[]{"Kode","Izena","NirePuntuak","HOrdua","BOrdua","Data"});
		try{
			while(rs.next()){	
				modelo.addRow(new Object[]{rs.getInt("Kode"),rs.getString("Izena"),rs.getString("NirePuntuak"),rs.getTime("HOrdua"),rs.getTime("BOrdua"),rs.getDate("Data")});
			}
			table.setModel(modelo);
		}catch(Exception e){
			System.out.println(e); 
		}
		
	}
	public void displayGaurkoPartidaOnenak(ResultSet rs){		
		DefaultTableModel modelo = new DefaultTableModel();
		modelo.setColumnIdentifiers(new Object[]{"Kode","Izena","NirePuntuak","HOrdua","BOrdua","Data"});
		try{
			while(rs.next()){
				modelo.addRow(new Object[]{rs.getInt("Kode"),rs.getString("Izena"),rs.getString("NirePuntuak"),rs.getTime("HOrdua"),rs.getTime("BOrdua"),rs.getDate("Data")});
			}
			table.setModel(modelo);
		}catch(Exception e){
			System.out.println(e); 
		}
		
	}
}



