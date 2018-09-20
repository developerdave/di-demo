package guru.springframework.controllers;

import guru.springframework.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PropertyInjectedControllerTest {

	private PropertyInjectedController underTest;

	@Before
	public void setUp() {
		this.underTest = new PropertyInjectedController();
		this.underTest.greetingService = new GreetingServiceImpl();
	}

	@Test
	public void testGreeting() {
		assertEquals(GreetingServiceImpl.HELLO_GURUS, underTest.sayHello());
	}
}
