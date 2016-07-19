package letschaat.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Email;

@Entity
public class register {

	@NotNull
	String name;
	@Email @NotNull(message="Enter your email address")
String email;
String location;
@NotNull(message="Enter your password")
String password;
int age;
int role=1;
boolean active=true;
String basicinfo;

@Id @GeneratedValue(strategy=GenerationType.AUTO)
int id;

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

public String getLocation() {
	return location;
}

public void setLocation(String location) {
	this.location = location;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public int getRole() {
	return role;
}

public void setRole(int role) {
	this.role = role;
}

public boolean isActive() {
	return active;
}

public void setActive(boolean active) {
	this.active = active;
}

public String getBasicinfo() {
	return basicinfo;
}

public void setBasicinfo(String basicinfo) {
	this.basicinfo = basicinfo;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}



}
