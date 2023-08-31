package alarmklocka;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MinuteTest {

	@Test
	void test() {
		MinuteCounter minuteC = new MinuteCounter();
		
		for(int i = 0; i < 62; i++) {
			minuteC.count();
			System.out.println(minuteC.getCount());
		}
	}

}
