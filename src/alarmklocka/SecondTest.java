package alarmklocka;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import alarmklocka.CircularCounter.Direction;

class SecondTest {

	@Test
	void test() {
		SecondCounter secondC = new SecondCounter();
		
		for(int i = 0; i < 62; i++) {
			secondC.count();
			System.out.println(secondC.getCount());
		}
	}

}
