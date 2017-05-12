package com.project.humera;

import java.util.Calendar;
import java.util.Date;

public class PicaDTO {
	
	public static boolean isValid(String plateNum, Calendar calendar){

		if (calendar == null){
			calendar = Calendar.getInstance();
		}
		
		int day = calendar.get(Calendar.DAY_OF_MONTH);
		int hour = calendar.get(Calendar.HOUR_OF_DAY);

		if(!((hour >= 6 && hour < 9) || (hour >=17 && hour < 20))){
			System.out.println("off peak hour");
			return true;
		}
		
		StringBuilder strB = new StringBuilder();
		for(int i = 0; i < plateNum.length(); i++){
			if (Character.isDigit(plateNum.charAt(i))) {
				strB.append(plateNum.charAt(i));
			}
		}
		System.out.println(strB.toString());
		int plateVal = Integer.valueOf(strB.toString());
		
		if((day%2 == 0 && plateVal%2 == 0) || (day%2 ==1 && plateVal%2 == 1)){
			return true;
		} else {
			return false;
		}
	}

}
