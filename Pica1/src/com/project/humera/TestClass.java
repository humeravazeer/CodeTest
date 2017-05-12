package com.project.humera;

import java.util.Calendar;

public class TestClass {
	public static void main(String[] args) {

		Calendar calendar2 = Calendar.getInstance();
		calendar2.set(Calendar.DAY_OF_MONTH, 4);
		calendar2.set(Calendar.HOUR_OF_DAY, 12);
		calendar2.set(Calendar.MINUTE, 59);
		System.out.println(PicaDTO.isValid("ASDF123498978978", calendar2));
		
		


	}
}
