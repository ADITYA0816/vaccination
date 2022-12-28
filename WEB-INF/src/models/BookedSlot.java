package models;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class BookedSlot {
	Integer bookedSlotId;
	User user;
	Slot slot;
	
	
	
	public static void addSlotBooking(int id, int sid) {
		Connection con = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vaccination?user=root&password=1234");
			
			String query = "INSERT INTO booked_slots (user_id, slot_id) values (?,?)";
			
			PreparedStatement preparedStatement = con.prepareStatement(query);
			
			preparedStatement.setInt(1, id);
			preparedStatement.setInt(2, sid);
			
			preparedStatement.executeUpdate();
		}
		catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	
	public static ArrayList<BookedSlot> getAllBookings() {
		
		ArrayList<BookedSlot> allBookedSlots = new ArrayList<BookedSlot>();
		
		Connection con = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vaccination?user=root&password=1234");
			
			String query = "select u.name, u.city, u.contact, u.aadhar_number, v.name, v.city, b.booked_slot_id from booked_slots as b inner join"
					+ " users as u on b.user_id=u.user_id inner join slots as s on b.slot_id=s.slot_id inner join vaccination_centers as v"
					+ " on s.vaccination_center_id=v.vaccination_center_id";
			
			PreparedStatement pst = con.prepareStatement(query);
			
			ResultSet rs = pst.executeQuery();
			
			
			while(rs.next()) {
				User u = new User();
				u.setName(rs.getString(1));
				u.setCity(rs.getString(2));
				u.setContact(rs.getString(3));
				u.setAadharNumber(rs.getString(4));

				VaccinationCenter vc = new VaccinationCenter();
				vc.setName(rs.getString(5));
				vc.setCity(rs.getString(6));
				
				Slot s = new Slot();
				s.setVaccinationCenter(vc);
				
				BookedSlot bb = new BookedSlot(rs.getInt(7),u,s);
				
				allBookedSlots.add(bb);
			}
			
			
		}
		catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		return allBookedSlots;
	}
	
	
	
	
public static ArrayList<BookedSlot> getAllBookingsByCenterName(String name) {
		
		ArrayList<BookedSlot> allBookedSlots = new ArrayList<BookedSlot>();
		
		Connection con = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vaccination?user=root&password=1234");
			
			String query = "select u.name, u.city, u.contact, u.aadhar_number, v.name, v.city, b.booked_slot_id from booked_slots as b inner join"
					+ " users as u on b.user_id=u.user_id inner join slots as s on b.slot_id=s.slot_id inner join vaccination_centers as v"
					+ " on s.vaccination_center_id=v.vaccination_center_id where v.name=?";
			
			PreparedStatement pst = con.prepareStatement(query);
			pst.setString(1, name);
			
			ResultSet rs = pst.executeQuery();
			
			
			while(rs.next()) {
				User u = new User();
				u.setName(rs.getString(1));
				u.setCity(rs.getString(2));
				u.setContact(rs.getString(3));
				u.setAadharNumber(rs.getString(4));

				VaccinationCenter vc = new VaccinationCenter();
				vc.setName(rs.getString(5));
				vc.setCity(rs.getString(6));
				
				Slot s = new Slot();
				s.setVaccinationCenter(vc);
				
				BookedSlot bb = new BookedSlot(rs.getInt(7),u,s);
				
				allBookedSlots.add(bb);
			}
			
			
		}
		catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		return allBookedSlots;
	}
	
	
	
	
	
	
	
	public BookedSlot() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public BookedSlot(Integer bookedSlotId, User user, Slot slot) {
		super();
		this.bookedSlotId = bookedSlotId;
		this.user = user;
		this.slot = slot;
	}
	
	public BookedSlot(User user, Slot slot) {
		super();
		this.user = user;
		this.slot = slot;
	}

	public Integer getBookedSlotId() {
		return bookedSlotId;
	}

	public void setBookedSlotId(Integer bookedSlotId) {
		this.bookedSlotId = bookedSlotId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Slot getSlot() {
		return slot;
	}

	public void setSlot(Slot slot) {
		this.slot = slot;
	}
}
