package com.ericsson.datetimeapi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DateTimeDemo {
	
	public static void testme() {
		
LocalTime time = LocalTime.of(9,00, 00);
		
		System.out.println(" -->"+time );
		
		LocalDate lotimeDt = LocalDate.of(2018, Month.SEPTEMBER,17);
		
		System.out.println("lotimeDt -->"+lotimeDt );
		
		
		LocalDateTime lDtTime = LocalDateTime.of(lotimeDt,time);
		
		System.out.println("lDtTime -->"+lDtTime );
		
		
		ZonedDateTime ZonedDtTime = ZonedDateTime.of(lDtTime,ZoneId.of("Europe/London"));
		
		System.out.println("ZonedDtTime -->"+ZonedDtTime );
		
		
		
       ZonedDateTime ZonedDtTimeInd = ZonedDtTime.withZoneSameInstant(ZoneId.of("Asia/Kolkata"));
		
		System.out.println("ZonedDtTimeInd -->"+ZonedDtTimeInd );
	}

	public static void main(String[] args) {

		testme();
		

	}

}
