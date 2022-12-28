create DATABASE vaccination;

use vaccination;

create TABLE users
(
	user_id INT AUTO_INCREMENT PRIMARY KEY,
	name VARCHAR(20) NOT NULL,
	email VARCHAR(50) NOT NULL 	UNIQUE,
	password VARCHAR(100) NOT NULL,
	gender VARCHAR(10),
	city VARCHAR(100),
	state VARCHAR(100),
	contact VARCHAR(10) NOT NULL UNIQUE,
	aadhar_number VARCHAR(20) NOT NULL UNIQUE
);


create TABLE admin
(
	admin_id INT AUTO_INCREMENT PRIMARY KEY,
	name VARCHAR(20) NOT NULL,
	email VARCHAR(50) NOT NULL 	UNIQUE,
	password VARCHAR(100) NOT NULL,
	gender VARCHAR(10),
	city VARCHAR(100),
	state VARCHAR(100),
	contact VARCHAR(10) NOT NULL UNIQUE
);

INSERT INTO admin (name,email,password,gender,city,state,contact) values ("ankit","ankit@gmail.com","123456","male","jabalpur","MP","8767364635");


create TABLE vaccination_centers
(
	vaccination_center_id INT AUTO_INCREMENT PRIMARY KEY,
	name VARCHAR(20) NOT NULL,
	city VARCHAR(100),
	state VARCHAR(100),
	contact VARCHAR(10) NOT NULL UNIQUE,
	status_id int NOT NULL DEFAULT 1
);


create TABLE slots
(
	slot_id INT AUTO_INCREMENT PRIMARY KEY,
	vaccination_center_id INT NOT NULL,
	slot int NOT NULL DEFAULT 10,
	date Date NOT NULL,
	constraint FK_slots_vaccination_centers FOREIGN KEY (vaccination_center_id) REFERENCES vaccination_centers (vaccination_center_id)
);
 

create TABLE booked_slots
(
	booked_slot_id INT AUTO_INCREMENT PRIMARY KEY,
	user_id int NOT Null,
	slot_id int NOT Null,
	constraint FK_booked_slots_users FOREIGN KEY (user_id) REFERENCES users (user_id),
	constraint FK_booked_slots_slots FOREIGN KEY (slot_id) REFERENCES slots (slot_id)
);





 