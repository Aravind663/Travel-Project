package com.example.TravelModel;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Travel")
public class Travel_model {
	@Id
	@GeneratedValue
private long id;
private String Source;
private String Destination;
private String Passengers_name;
private String Cost;
public long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getSource() {
	return Source;
}
public void setSource(String source) {
	Source = source;
}
public String getDestination() {
	return Destination;
}
public void setDestination(String destination) {
	Destination = destination;
}
public String getPassengers_name() {
	return Passengers_name;
}
public void setPassengers_name(String passengers_name) {
	Passengers_name = passengers_name;
}
public String getCost() {
	return Cost;
}
public void setCost(String cost) {
	Cost = cost;
}

}
