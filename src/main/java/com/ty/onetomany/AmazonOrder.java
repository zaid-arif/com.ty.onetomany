package com.ty.onetomany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class AmazonOrder {
	@Id
private int id;
private String address;
@OneToMany(cascade = CascadeType.ALL)
private List<Itemc> items;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public List<Itemc> getItems() {
	return items;
}
public void setItems(List<Itemc> items) {
	this.items = items;
}

}
