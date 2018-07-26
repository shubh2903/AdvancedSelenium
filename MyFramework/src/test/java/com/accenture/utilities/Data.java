package com.accenture.utilities;



import javax.xml.bind.annotation.XmlRootElement;



@XmlRootElement(name="data")
public class Data {
private String firstname;
private String lastname;

@javax.xml.bind.annotation.XmlElement(name="firstname")
public void setFirstname(String f) {
	this.firstname = f;
}

public String getFirstname() {
	return firstname;
}
@javax.xml.bind.annotation.XmlElement(name="lastname")
public void setLastname(String f) {
	this.lastname = f;
}

public String getLastname() {
	return lastname;
}
} 
 



