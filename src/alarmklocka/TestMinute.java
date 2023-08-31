package alarmklocka;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import alarmklocka.CircularCounter.Direction;

class TestMinute {

	@Test
	void test() {
		HourCounter hourC = new HourCounter();
		MinuteCounter myCounter = new MinuteCounter(Direction.INCREASING, hourC);
		 assertEquals(0,myCounter.getCount());
		 myCounter.count();
		 assertEquals(1,myCounter.getCount());
		 myCounter.count();
		 assertEquals(2,myCounter.getCount());
	}
	
	

}
