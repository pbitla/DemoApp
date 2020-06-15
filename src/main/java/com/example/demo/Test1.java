package com.example.demo;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Test1 {

	public static void main(String args[]) {

		List<Test2> studentlist = new ArrayList<Test2>();

		Test2 obj1 = new Test2(" 06/04/20 09:50 AM", "bitla");
		Test2 obj2 = new Test2(" 06/04/20 08:00 AM", "bitla1");
		Test2 obj3 = new Test2("05/04/20 11:00 AM ", "bitla2");

		studentlist.add(obj1);
		studentlist.add(obj2);
		studentlist.add(obj3);
		
		studentlist.sort((o1,o2) -> {
			try {
				return main1(o2.getDate()).compareTo(main1(o1.getDate()));
			} catch (Exception e) {
				return 0;
			}
		});
		

	//	studentlist.sort((Test2 s1, Test2 s2) -> s1.getDate().compareTo(s2.getDate()));
		studentlist.forEach((s) -> System.out.println(s.toString()));

	}
	
	
	public static Date main1(String sDate1)throws Exception {  
	    return new SimpleDateFormat("MM/dd/yyyy HH:mm a").parse(sDate1);  
	    
	}  

}
