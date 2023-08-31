package alarmklocka;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCounter {

	@Test
	void test() {
		
	}
		public class Counter2Test
		 {
		 @Test
		 public void test()
		 {
		 CounterType myCounter = new MinuteCounter();
		 myCounter.count();
		 assertEquals(1,myCounter.getCount());
		 myCounter.count();
		 assertEquals(0,myCounter.getCount());
	}

}
