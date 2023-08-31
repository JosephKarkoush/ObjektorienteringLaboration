package alarmklocka;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestMinute {

	@Test
	void test() {
		CounterType myCounter = new MinuteCounter();
		 assertEquals(0,myCounter.getCount());
		 myCounter.count();
		 assertEquals(1,myCounter.getCount());
		 myCounter.count();
		 assertEquals(0,myCounter.getCount());
	}
	
	

}
