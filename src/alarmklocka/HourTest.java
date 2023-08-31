package alarmklocka;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HourTest {

	@Test
	void test() {
		HourCounter hourC = new HourCounter();
		
		for(int i = 0; i < 25; i++) {
			hourC.count();
			System.out.println(hourC.getCount());
		}
	}

}
