
package models;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Slot {
	Integer slotId;
	VaccinationCenter vaccinationCenter;
	Date date;
		
	
	public Slot() {
		super();
	}


	public Slot(Integer slotId, VaccinationCenter vaccinationCenter, Date date) {
		super();
		this.slotId = slotId;
		this.vaccinationCenter = vaccinationCenter;
		this.date = date;
	}


	public Slot(VaccinationCenter vaccinationCenter, Date date) {
		super();
		this.vaccinationCenter = vaccinationCenter;
		this.date = date;
	}


	public static void addSlot(int id, Date date) {
		Connection con = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vaccination?user=root&password=1234");
			
			String query = "INSERT INTO slots (vaccination_center_id, date) values (?,?)";
			
			PreparedStatement preparedStatement = con.prepareStatement(query);
			
			preparedStatement.setInt(1, id);
			preparedStatement.setDate(2, date);
			
			preparedStatement.executeUpdate();
		}
		catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	public static ArrayList<Slot> getAllSlotsByCity(String cityName){
		ArrayList<Slot> slots = new ArrayList<Slot>();
		
		Connection con = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vaccination?user=root&password=1234");
			
			String query = "SELECT s.slot_id,v.vaccination_center_id,v.name,v.city,v.state,v.contact,s.date FROM vaccination_centers as v inner join"
					+ " slots as s ON s.vaccination_center_id=v.vaccination_center_id where status_id=1 and slot>0 and v.city=?";
			
			PreparedStatement pst = con.prepareStatement(query);
			pst.setString(1, cityName);
			
			ResultSet rs = pst.executeQuery();
			
			while(rs.next()) {
				Slot slot = new Slot(rs.getInt(1),new VaccinationCenter(rs.getInt(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6)), rs.getDate(7));
				slots.add(slot);
			}
			
			con.close();
		}catch (SQLException|ClassNotFoundException e){
			e.printStackTrace();
		}
		
		return slots;
	}
	
	
	
	public static void decrementSlotCount(int id) {
		Connection con = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vaccination?user=root&password=1234");
			
			String query = "update slots set slot=slot-1 where slot_id=?";
			
			PreparedStatement preparedStatement = con.prepareStatement(query);
			
			preparedStatement.setInt(1, id);
			
			preparedStatement.executeUpdate();
		}
		catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	public Integer getSlotId() {
		return slotId;
	}
	public void setSlotId(Integer slotId) {
		this.slotId = slotId;
	}
	public VaccinationCenter getVaccinationCenter() {
		return vaccinationCenter;
	}
	public void setVaccinationCenter(VaccinationCenter vaccinationCenter) {
		this.vaccinationCenter = vaccinationCenter;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	
	
}
