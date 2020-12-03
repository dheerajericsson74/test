package com.ericsson.datetimeapi;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class AgeCalculation {

	public static void main(String[] args) {

		
		
		LocalDate bDay = LocalDate.of(1979, Month.SEPTEMBER, 20);
		
		LocalDate now = LocalDate.now();
		
		Period age = bDay.until(now);
		
		System.out.println(" Age is "+age.toString());
		
		System.out.println(" Age is years "+age.getYears());
		System.out.println(" Age is Month "+age.getMonths());
		System.out.println(" Age is Days "+age.getDays());
		
		
		Instant statTime = Instant.now();
		DateTimeDemo.testme();
		
		Instant endTime = Instant.now();
		
		Duration timeTaken = Duration.between(statTime, endTime);
		
		System.out.println(" timeTaken --> "+timeTaken);
		System.out.println(" timeTaken --> "+timeTaken.toMillis());
		
	}

}
