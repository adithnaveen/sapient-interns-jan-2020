package com.company.java8features;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;



public class DateEx {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance(); 
		
		System.out.println("Time is " + cal.getTime());
		
		cal.add(Calendar.HOUR, 5);
		System.out.println("Time is " + cal.getTime());

		// java 8 

		LocalTime now = LocalTime.now(); 
		System.out.println(now.getHour()); // concatenate with what you need
		
		LocalTime nowPlusSevenHrs =  now.plus(7, ChronoUnit.HOURS); 
		System.out.println(nowPlusSevenHrs.getHour());

		// add 30, 12, 45, 23 
		
		System.out.println("----------------------------------------------");
		ZoneId.getAvailableZoneIds().forEach(System.out :: println);
		
	// America/Chicago
		
		
		ZoneId chicagoZone = ZoneId.of("America/Chicago");
		LocalTime time1 = LocalTime.now(chicagoZone); 
		System.out.println("time in chicago " + time1);
		
		
	
	}
}























