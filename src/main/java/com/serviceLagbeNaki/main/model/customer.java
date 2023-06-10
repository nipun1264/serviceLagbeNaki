package com.serviceLagbeNaki.main.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int customer_id;
	private String customer_name;
	
	
	private String customer_mobile;
	private String customer_address;
	
	private int customer_start_hours;
	private int customer_start_minute;
	private int customer_end_hours;
	private int customer_end_minute;
	private int customer_amount;
	
	
	public customer() {
		super();
		// TODO Auto-generated constructor stub
	}


	public customer(int customer_id, String customer_name, String customer_mobile, String customer_address,
			int customer_start_hours, int customer_start_minute, int customer_end_hours, int customer_end_minute) {
		super();
		this.customer_id = customer_id;
		this.customer_name = customer_name;
		this.customer_mobile = customer_mobile;
		this.customer_address = customer_address;
		this.customer_start_hours = customer_start_hours;
		this.customer_start_minute = customer_start_minute;
		this.customer_end_hours = customer_end_hours;
		this.customer_end_minute = customer_end_minute;
		this.customer_amount = customer_amount;
	}


	public int getCustomer_id() {
		return customer_id;
	}


	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}


	public String getCustomer_name() {
		return customer_name;
	}


	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}


	public String getCustomer_mobile() {
		return customer_mobile;
	}


	public void setCustomer_mobile(String customer_mobile) {
		this.customer_mobile = customer_mobile;
	}


	public String getCustomer_address() {
		return customer_address;
	}


	public void setCustomer_address(String customer_address) {
		this.customer_address = customer_address;
	}


	public int getCustomer_start_hours() {
		return customer_start_hours;
	}


	public void setCustomer_start_hours(int customer_start_hours) {
		this.customer_start_hours = customer_start_hours;
	}


	public int getCustomer_start_minute() {
		return customer_start_minute;
	}


	public void setCustomer_start_minute(int customer_start_minute) {
		this.customer_start_minute = customer_start_minute;
	}


	public int getCustomer_end_hours() {
		return customer_end_hours;
	}


	public void setCustomer_end_hours(int customer_end_hours) {
		this.customer_end_hours = customer_end_hours;
	}


	public int getCustomer_end_minute() {
		return customer_end_minute;
	}


	public void setCustomer_end_minute(int customer_end_minute) {
		this.customer_end_minute = customer_end_minute;
	}

	
	
	
	public int getcustomer_amount() {
		return customer_amount;
	}


	public void setcustomer_amount(int customer_amount) {
		this.customer_amount = customer_amount;
	}

	@Override
	public String toString() {
		return "customer [customer_id=" + customer_id + ", customer_name=" + customer_name + ", customer_mobile="
				+ customer_mobile + ", customer_address=" + customer_address + ", customer_start_hours="
				+ customer_start_hours + ", customer_start_minute=" + customer_start_minute + ", customer_end_hours="
				+ customer_end_hours + ", customer_end_minute=" + customer_end_minute + ",customer_amount = "+customer_amount+"]";
	}
	
	
	
	
	
	
	
	
}

	