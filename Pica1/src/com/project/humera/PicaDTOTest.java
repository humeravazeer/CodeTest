package com.project.humera;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Calendar;

import org.junit.Test;

public class PicaDTOTest {

	
	@Test
	public void testIsValid() {
		
		//Even day, in peak hour even licence plate
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.DAY_OF_MONTH, 2);
		calendar.set(Calendar.HOUR_OF_DAY, 8);
		calendar.set(Calendar.MINUTE, 59);
		assertTrue(PicaDTO.isValid("ASDF1234", calendar));
		
		//Even day, in off-peak hour even licence plate
		Calendar calendar2 = Calendar.getInstance();
		calendar2.set(Calendar.DAY_OF_MONTH, 4);
		calendar2.set(Calendar.HOUR_OF_DAY, 12);
		calendar2.set(Calendar.MINUTE, 59);
		assertTrue(PicaDTO.isValid("ASDF123498978978", calendar2));

		//Odd day, in peak hour even licence plate
		Calendar calendar3 = Calendar.getInstance();
		calendar3.set(Calendar.DAY_OF_MONTH, 3);
		calendar3.set(Calendar.HOUR_OF_DAY, 6);
		calendar3.set(Calendar.MINUTE, 59);
		assertFalse(PicaDTO.isValid("1234", calendar3));

		//Odd day, in off-peak hour even licence plate
		Calendar calendar4 = Calendar.getInstance();
		calendar4.set(Calendar.DAY_OF_MONTH, 9);
		calendar4.set(Calendar.HOUR_OF_DAY, 5);
		calendar4.set(Calendar.MINUTE, 59);
		assertTrue(PicaDTO.isValid("WERWR#$568994", calendar4));
		
		//Even day, in peak hour odd licence plate
		Calendar calendar5 = Calendar.getInstance();
		calendar5.set(Calendar.DAY_OF_MONTH, 30);
		calendar5.set(Calendar.HOUR_OF_DAY, 17);
		calendar5.set(Calendar.MINUTE, 59);
		assertFalse(PicaDTO.isValid("ASDF1233", calendar5));
		
		//Even day, in off-peak hour odd licence plate
		Calendar calendar6 = Calendar.getInstance();
		calendar6.set(Calendar.DAY_OF_MONTH, 16);
		calendar6.set(Calendar.HOUR_OF_DAY, 13);
		calendar6.set(Calendar.MINUTE, 59);
		assertTrue(PicaDTO.isValid("45645689", calendar6));

		//Odd day, in peak hour odd licence plate
		Calendar calendar7 = Calendar.getInstance();
		calendar7.set(Calendar.DAY_OF_MONTH, 13);
		calendar7.set(Calendar.HOUR_OF_DAY, 18);
		calendar7.set(Calendar.MINUTE, 59);
		assertTrue(PicaDTO.isValid("1111AAAA", calendar7));

		//Odd day, in off-peak hour odd licence plate
		Calendar calendar8 = Calendar.getInstance();
		calendar8.set(Calendar.DAY_OF_MONTH, 23);
		calendar8.set(Calendar.HOUR_OF_DAY, 1);
		calendar8.set(Calendar.MINUTE, 59);
		assertTrue(PicaDTO.isValid("AAA544689AAA", calendar8));

		
	}
	
	

}
