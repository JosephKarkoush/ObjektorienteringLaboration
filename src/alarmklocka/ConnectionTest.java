package alarmklocka;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import alarmklocka.CircularCounter.Direction;

class ConnectionTest {

	@Test
	void test() {
		HourCounter hourC = new HourCounter();
		MinuteCounter myCounter = new MinuteCounter(Direction.INCREASING, hourC);
		SecondCounter secondC = new SecondCounter(Direction.INCREASING, myCounter);
		
		for(int i = 0; i < 3700; i++ ) {
			secondC.count();
		
			
		}

		 System.out.println("It has passed: " + hourC.getCount() + ":" + myCounter.getCount() + ":" + secondC.getCount());
	}
	
	

}
