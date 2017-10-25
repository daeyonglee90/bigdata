package com.pjt.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;


public class DateTest {

	@Test
	public void dateTest() throws ParseException
	{
		String str = "2017-10-12";
		
		Date original_date = new SimpleDateFormat("yyyy-MM-dd").parse(str);
		
		System.out.println(new SimpleDateFormat("yyyy-MM-dd").format(original_date));
		
	}
	
}
