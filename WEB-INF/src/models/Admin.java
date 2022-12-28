package models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Admin {
	private Integer adminId;
	private String name;
	private String email;
	private String password;
	private String gender;
	private String city;
	private String state;
	private String contact;
	
	
	/*------------------------------------------------------------------------------------------------------------------------------*/
	
	public Admin() {
		super();
	}
	

	public Admin(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}

	
	public Admin(String name, String email, String password, String gender, String city, String state,
			String contact) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.gender = gender;
		this.city = city;
		this.state = state;
		this.contact = contact;
	}
	
	/*------------------------------------------------------------------------------------------------------------------------------*/
	
	public boolean signin() {
		boolean success = false;
		
		Connection con = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vaccination?user=root&password=1234");
			
			String query = "SELECT admin_id, name, password, gender, city, state, contact FROM admin WHERE email=?";
			
			
			PreparedStatement pst = con.prepareStatement(query);
			
			pst.setString(1, email);
			
			ResultSet rs = pst.executeQuery();
			
			if(rs.next()) {
				String savedPassword = rs.getString(3);

				if(savedPassword.equals(password)) {
					adminId = rs.getInt(1);
					name = rs.getString(2);
					gender = rs.getString(4);
					city = rs.getString(5);
					state = rs.getString(6);
					contact = rs.getString(7);
					success = true;				
				}
			}
					
		}catch(ClassNotFoundException|SQLException e) {
			e.printStackTrace();
		}
		
		return success;
	}
	
	
	
	
	
	/*------------------------------------------------------------------------------------------------------------------------------*/

	public Integer getAdminId() {
		return adminId;
	}

	public void setAdminId(Integer adminId) {
		this.adminId = adminId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
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
