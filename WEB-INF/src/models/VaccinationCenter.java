package models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Date;


public class VaccinationCenter {
	private Integer vaccinationCenterId;
	private String name;
	private String city;
	private String state;
	private String contact;
	public Integer Status;
	
	
	
	//------------------------------------------------------------------------------------------------------------------------
	public VaccinationCenter() {
		super();
	}
	
	
	
	
	public VaccinationCenter(String name) {
		super();
		this.name = name;
	}




	public VaccinationCenter(String name, String city, String state, String contact) {
		super();
		this.name = name;
		this.city = city;
		this.state = state;
		this.contact = contact;
	}
	
	
	public VaccinationCenter(Integer vaccinationCenterId, String name, String city, String state, String contact) {
		super();
		this.vaccinationCenterId = vaccinationCenterId;
		this.name = name;
		this.city = city;
		this.state = state;
		this.contact = contact;
	}


	//------------------------------------------------------------------------------------------------------------------------
	
	
	public void addCenter() {
		Connection con = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vaccination?user=root&password=1234");
			
			String query = "INSERT INTO vaccination_centers (name,city,state,contact) values (?,?,?,?)";
			
			PreparedStatement preparedStatement = con.prepareStatement(query);
			
			preparedStatement.setString(1, name);
			preparedStatement.setString(2, city);
			preparedStatement.setString(3, state);
			preparedStatement.setString(4, contact);
			
			preparedStatement.executeUpdate();
		}
		catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	public static ArrayList<VaccinationCenter> getAllVaccinationCenter(){
		ArrayList<VaccinationCenter> centers = new ArrayList<VaccinationCenter>();
		
		Connection con = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vaccination?user=root&password=1234");
			
			String query = "SELECT vaccination_center_id,name,city,state,contact FROM vaccination_centers where status_id=1";
			
			PreparedStatement pst = con.prepareStatement(query);
			
			ResultSet rs = pst.executeQuery();
			
			while(rs.next()) {
				VaccinationCenter center = new VaccinationCenter(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
				centers.add(center);
			}
			
			con.close();
		}catch (SQLException|ClassNotFoundException e){
			e.printStackTrace();
		}
		
		return centers;
	}
	
	
	
	public static boolean remove(int id) {
		boolean removed = false;
		Connection con = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vaccination?user=root&password=1234");
			
			String query = "UPDATE vaccination_centers SET status_id=0 WHERE vaccination_center_id=?";
			
			PreparedStatement preparedStatement = con.prepareStatement(query);
			preparedStatement.setInt(1, id);
			
			int rows = preparedStatement.executeUpdate();
			
			if(rows==1) {
				removed = true;
			}
			
		} catch (SQLException | ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		return removed;
	}
	
	
	
	public static ArrayList<VaccinationCenter> getAllCenterNames(){
		ArrayList<VaccinationCenter> centerNames = new ArrayList<>();
		
		Connection con = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vaccination?user=root&password=1234");
			
			String query = "SELECT distinct name from vaccination_centers";
			
			PreparedStatement pst = con.prepareStatement(query);
			
			ResultSet rs = pst.executeQuery();
			
			while(rs.next()) {
				String center = new String(rs.getString(1));
				centerNames.add(new VaccinationCenter(center));
			}
			
			con.close();
		}catch (SQLException|ClassNotFoundException e){
			e.printStackTrace();
		}
		
		return centerNames;
	}
	
	
	
	
	
	//------------------------------------------------------------------------------------------------------------------------
	public Integer getVaccinationCenterId() {
		return vaccinationCenterId;
	}
	public void setVaccinationCenterId(Integer vaccinationCenterId) {
		this.vaccinationCenterId = vaccinationCenterId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	
	
	
	
}
	