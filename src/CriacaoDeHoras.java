import static org.junit.Assert.*;

import org.joda.time.IllegalFieldValueException;
import org.joda.time.LocalTime;
import org.junit.Test;

public class CriacaoDeHoras {
	// Fixture Setup
	// Exercise SUT
	// Result Verification
	// Fixture Teardown
	
	@Test
	public void criaHorarioValido() {
		// Fixture Setup
		int h = 13, min = 7, seg = 54, ms = 342;
		// Exercise SUT
		LocalTime hora = new LocalTime(h, min, seg, ms);
		// Result Verification
		assertEquals(hora.getHourOfDay(), h);
		assertEquals(hora.getMinuteOfHour(), min);
		assertEquals(hora.getSecondOfMinute(), seg);
		assertEquals(hora.getMillisOfSecond(), ms);
		// Fixture Teardown
	}

	@Test(expected=IllegalFieldValueException.class)
	public void criaHoraNegativa() {
		// Fixture Setup
		// Exercise SUT
		new LocalTime(-1, 0, 0);
		// Result Verification
		// Fixture Teardown
	}

	@Test(expected=IllegalFieldValueException.class)
	public void criaHoraInvalida() {
		// Fixture Setup
		// Exercise SUT
		new LocalTime(24, 0, 0);
		// Result Verification
		// Fixture Teardown
	}
	
	@Test(expected=IllegalFieldValueException.class)
	public void criaMinutoNegativo() {
		// Fixture Setup
		// Exercise SUT
		new LocalTime(0, -1, 0);
		// Result Verification
		// Fixture Teardown
	}

	@Test(expected=IllegalFieldValueException.class)
	public void criaMinutoInvalido() {
		// Fixture Setup
		// Exercise SUT
		new LocalTime(0, 60, 0);
		// Result Verification
		// Fixture Teardown
	}
	
	@Test(expected=IllegalFieldValueException.class)
	public void criaSegundoNegativo() {
		// Fixture Setup
		// Exercise SUT
		new LocalTime(0, 0, -1);
		// Result Verification
		// Fixture Teardown
	}

	@Test(expected=IllegalFieldValueException.class)
	public void criaSegundoInvalido() {
		// Fixture Setup
		// Exercise SUT
		new LocalTime(0, 0, 60);
		// Result Verification
		// Fixture Teardown
	}
	
	@Test(expected=IllegalFieldValueException.class)
	public void criaMiliSegundoNegativo() {
		// Fixture Setup
		// Exercise SUT
		new LocalTime(0, 0, 0, -1);
		// Result Verification
		// Fixture Teardown
	}

	@Test(expected=IllegalFieldValueException.class)
	public void criaMiliSegundoInvalido() {
		// Fixture Setup
		// Exercise SUT
		new LocalTime(0, 0, 0, 1000);
		// Result Verification
		// Fixture Teardown
	}
}
