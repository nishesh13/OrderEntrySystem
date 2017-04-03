package org.nishesh.restful.oes.models;

import java.util.Date;

public class Order {

	private int id;
	private float total;
	private Date date;
	private Customer customer;
	
		
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getTotal() {
		return total;
	}

	public void setTotal(float total) {
		this.total = total;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public void addLineItem(LineItem item){
		
	}
	
	public void removeLineItem(LineItem item){
		
	}
	
	public LineItem[] getLineItems(){
		return new LineItem[5]; 
	}
}
