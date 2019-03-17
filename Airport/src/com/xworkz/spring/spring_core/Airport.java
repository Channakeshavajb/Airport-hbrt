package com.xworkz.spring.spring_core;

import java.util.Date;

public class Airport {
	private String name;
	private int noOfFlights;
	
	public Airport() {
		System.out.println("created\t"+this.getClass().getSimpleName());
	}
	
	public Airport(String name) {
		
		this.name=name;
		System.out.println("constructor with string param:\t"+this.name);
		
	}
	
	public Airport(int noOfFlights) {
		
		this.noOfFlights=noOfFlights;
		System.out.println("constructor with int param:\t"+this.noOfFlights);
	}
	
	public Airport(String name,int noOfFlights) {
		
		this.name=name;
		this.noOfFlights=noOfFlights;
		System.out.println("constructor with both param:\t"+this.name+"\t"+this.noOfFlights);
	}
	
	public void landing(String operator,Date date)
	{
		System.out.println("invoked landing method with params\t");
		System.out.println("palne operator is\t"+operator+"\t Landed flight at:\t"+date);
	
	}
	

}
