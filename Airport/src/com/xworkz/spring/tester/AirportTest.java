package com.xworkz.spring.tester;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.spring.spring_core.Airport;

public class AirportTest {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		ApplicationContext container=new ClassPathXmlApplicationContext("resource/context.xml");
		Airport air=container.getBean(Airport.class);
		//SimpleDateFormat sdf=new SimpleDateFormat("dd-mm-yyyy");
		//java.util.Date landingTime= sdf.parse("10-02-2019");
		
		java.util.Date simpleDate=new java.util.Date(System.currentTimeMillis());
		
		air.landing("madhu", simpleDate);

	}

}
