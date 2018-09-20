package guru.springframework.controllers;

import guru.springframework.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SetterInjectedControllerTest {

	private SetterInjectedController underTest;

	@Before
	public void setUp() {
		this.underTest = new SetterInjectedController();
		this.underTest.setGreetingService(new GreetingServiceImpl());
	}

	@Test
	public void testGreeting() {
		assertEquals(GreetingServiceImpl.HELLO_GURUS, underTest.sayHello());
	}
}
