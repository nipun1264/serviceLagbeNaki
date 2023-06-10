package com.serviceLagbeNaki.main.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class serviceProvider {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int serviceProvider_id;
	private String serviceProvider_name;
	
	
	private String serviceProvider_mobile;
	private String serviceProvider_address;
	
	private int serviceProvider_start_hours;
	private int serviceProvider_start_minute;
	private int serviceProvider_end_hours;
	private int serviceProvider_end_minute;
	private int serviceProvider_expectedPayment;
	
	
	public serviceProvider() {
		super();
		// TODO Auto-generated constructor stub
	}


	public serviceProvider(int serviceProvider_id, String serviceProvider_name, String serviceProvider_mobile,
			String serviceProvider_address, int serviceProvider_start_hours, int serviceProvider_start_minute,
			int serviceProvider_end_hours, int serviceProvider_end_minute, int serviceProvider_expectedPayment) {
		super();
		this.serviceProvider_id = serviceProvider_id;
		this.serviceProvider_name = serviceProvider_name;
		this.serviceProvider_mobile = serviceProvider_mobile;
		this.serviceProvider_address = serviceProvider_address;
		this.serviceProvider_start_hours = serviceProvider_start_hours;
		this.serviceProvider_start_minute = serviceProvider_start_minute;
		this.serviceProvider_end_hours = serviceProvider_end_hours;
		this.serviceProvider_end_minute = serviceProvider_end_minute;
		this.serviceProvider_expectedPayment = serviceProvider_expectedPayment;
	}


	public int getServiceProvider_id() {
		return serviceProvider_id;
	}


	public void setServiceProvider_id(int serviceProvider_id) {
		this.serviceProvider_id = serviceProvider_id;
	}


	public String getServiceProvider_name() {
		return serviceProvider_name;
	}


	public void setServiceProvider_name(String serviceProvider_name) {
		this.serviceProvider_name = serviceProvider_name;
	}


	public String getServiceProvider_mobile() {
		return serviceProvider_mobile;
	}


	public void setServiceProvider_mobile(String serviceProvider_mobile) {
		this.serviceProvider_mobile = serviceProvider_mobile;
	}


	public String getServiceProvider_address() {
		return serviceProvider_address;
	}


	public void setServiceProvider_address(String serviceProvider_address) {
		this.serviceProvider_address = serviceProvider_address;
	}


	public int getServiceProvider_start_hours() {
		return serviceProvider_start_hours;
	}


	public void setServiceProvider_start_hours(int serviceProvider_start_hours) {
		this.serviceProvider_start_hours = serviceProvider_start_hours;
	}


	public int getServiceProvider_start_minute() {
		return serviceProvider_start_minute;
	}


	public void setServiceProvider_start_minute(int serviceProvider_start_minute) {
		this.serviceProvider_start_minute = serviceProvider_start_minute;
	}


	public int getServiceProvider_end_hours() {
		return serviceProvider_end_hours;
	}


	public void setServiceProvider_end_hours(int serviceProvider_end_hours) {
		this.serviceProvider_end_hours = serviceProvider_end_hours;
	}


	public int getServiceProvider_end_minute() {
		return serviceProvider_end_minute;
	}


	public void setServiceProvider_end_minute(int serviceProvider_end_minute) {
		this.serviceProvider_end_minute = serviceProvider_end_minute;
	}


	public int getServiceProvider_expectedPayment() {
		return serviceProvider_expectedPayment;
	}


	public void setServiceProvider_expectedPayment(int serviceProvider_expectedPayment) {
		this.serviceProvider_expectedPayment = serviceProvider_expectedPayment;
	}


	@Override
	public String toString() {
		return "serviceProvider [serviceProvider_id=" + serviceProvider_id + ", serviceProvider_name="
				+ serviceProvider_name + ", serviceProvider_mobile=" + serviceProvider_mobile
				+ ", serviceProvider_address=" + serviceProvider_address + ", serviceProvider_start_hours="
				+ serviceProvider_start_hours + ", serviceProvider_start_minute=" + serviceProvider_start_minute
				+ ", serviceProvider_end_hours=" + serviceProvider_end_hours + ", serviceProvider_end_minute="
				+ serviceProvider_end_minute + ", serviceProvider_expectedPayment=" + serviceProvider_expectedPayment
				+ "]";
	}
	
	
	
	
	
	

}
