package alarmklocka;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import alarmklocka.CircularCounter.Direction;

class ConnectionTest {

	@Test
	void test() {
		HourCounter hourC = new HourCounter(Direction.DECREASING);
		MinuteCounter minCounter = new MinuteCounter(Direction.DECREASING, hourC);
		SecondCounter secondC = new SecondCounter(Direction.DECREASING, minCounter);
		
		for(int i = 0; i < 86300; i++ ) {
			secondC.count();
		
			
		}

		 System.out.println("It has passed: " + hourC.getCount() + ":" + minCounter.getCount() + ":" + secondC.getCount());
	}
	
	

	
}
