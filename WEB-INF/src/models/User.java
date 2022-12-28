package models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class User {
	private Integer userId;
	private String name;
	private String email;
	private String password;
	private String gender;
	private String city;
	private String state;
	private String contact;
	private String aadharNumber;
	

	/*------------------------------------------------------------------------------------------------------------------------------*/
	
	public User() {
		super();
	}
	
	

	public User(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}



	public User(String name, String email, String password, String gender, String city, String state,
			String contact, String aadharNumber) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.gender = gender;
		this.city = city;
		this.state = state;
		this.contact = contact;
		this.aadharNumber = aadharNumber;
	}

	/*------------------------------------------------------------------------------------------------------------------------------*/

	public void signUp() {
		Connection con = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vaccination?user=root&password=1234");
			
			String query = "INSERT INTO users (name,email,password,gender,city,state,contact,aadhar_number) values (?,?,?,?,?,?,?,?)";
			
			PreparedStatement preparedStatement = con.prepareStatement(query);
			
			preparedStatement.setString(1, name);
			preparedStatement.setString(2, email);
			preparedStatement.setString(3, password);
			preparedStatement.setString(4, gender);
			preparedStatement.setString(5, city);
			preparedStatement.setString(6, state);
			preparedStatement.setString(7, contact);
			preparedStatement.setString(8, aadharNumber);
			
			preparedStatement.executeUpdate();
		}
		catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	
	public boolean signin() {
		boolean success = false;
		
		Connection con = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vaccination?user=root&password=1234");
			
			String query = "SELECT user_id, name, password, gender, city, state, contact, aadhar_number FROM users WHERE email=?";
			
			
			PreparedStatement pst = con.prepareStatement(query);
			
			pst.setString(1, email);
			
			ResultSet rs = pst.executeQuery();
			
			if(rs.next()) {
				String savedPassword = rs.getString(3);

				if(savedPassword.equals(password)) {
					userId = rs.getInt(1);
					name = rs.getString(2);
					gender = rs.getString(4);
					city = rs.getString(5);
					state = rs.getString(6);
					contact = rs.getString(7);
					aadharNumber = rs.getString(8);
					success = true;				
				}
			}
					
		}catch(ClassNotFoundException|SQLException e) {
			e.printStackTrace();
		}
		
		return success;
	}
	
	
	
	
	
	/*------------------------------------------------------------------------------------------------------------------------------*/
	public Integer getUserId() {
		return userId;
	}


	public void setUserId(Integer userId) {
		this.userId = userId;
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


	public String getAadharNumber() {
		return aadharNumber;
	}


	public void setAadharNumber(String aadharNumber) {
		this.aadharNumber = aadharNumber;
	}


	
}
