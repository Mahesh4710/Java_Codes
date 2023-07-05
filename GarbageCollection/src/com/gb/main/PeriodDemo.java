package com.gb.main;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class PeriodDemo {
	public static void main(String[] args) {
		
		LocalDate curdate=LocalDate.now();
		
		LocalDate bday=LocalDate.of(2000,Month.JULY ,03);
		
		Period perd=Period.between(bday, curdate);
		
		System.out.println("My age is :"+perd);
		System.out.println("Years : "+perd.getYears());
		System.out.println("Months : "+perd.getMonths());
		System.out.println("Days : "+perd.getDays());

	}

}
