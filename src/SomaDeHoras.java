import static org.junit.Assert.assertEquals;

import org.joda.time.LocalTime;
import org.junit.Test;

public class SomaDeHoras {

	// Fixture Setup
	// Exercise SUT
	// Result Verification
	// Fixture Teardown

	@Test
	public void soma1Hora() {
		// Fixture Setup
		int h = 2, min = 14, seg = 34, ms = 739,
				somaH = 1;
		LocalTime hora = new LocalTime(h, min, seg, ms);
		LocalTime expected = new LocalTime(h+somaH, min, seg, ms);
		// Exercise SUT
		hora = hora.plusHours(somaH);
		// Result Verification
		assertEquals(expected, hora);
		// Fixture Teardown
	}

	@Test
	public void soma1Minuto() {
		// Fixture Setup
		int h = 2, min = 14, seg = 34, ms = 739,
				somaMin = 1;
		LocalTime hora = new LocalTime(h, min, seg, ms);
		LocalTime expected = new LocalTime(h, min+somaMin, seg, ms);
		// Exercise SUT
		hora = hora.plusMinutes(somaMin);
		// Result Verification
		assertEquals(expected, hora);
		// Fixture Teardown
	}

	@Test
	public void soma1Segundo() {
		// Fixture Setup
		int h = 2, min = 14, seg = 34, ms = 739,
				somaSeg = 1;
		LocalTime hora = new LocalTime(h, min, seg, ms);
		LocalTime expected = new LocalTime(h, min, seg+somaSeg, ms);
		// Exercise SUT
		hora = hora.plusSeconds(somaSeg);
		// Result Verification
		assertEquals(expected, hora);
		// Fixture Teardown
	}

	@Test
	public void soma1MiliSegundo() {
		// Fixture Setup
		int h = 2, min = 14, seg = 34, ms = 739,
				somaMs = 1;
		LocalTime hora = new LocalTime(h, min, seg, ms);
		LocalTime expected = new LocalTime(h, min, seg, ms+somaMs);
		// Exercise SUT
		hora = hora.plusMillis(somaMs);
		// Result Verification
		assertEquals(expected, hora);
		// Fixture Teardown
	}

	@Test
	public void somaHorasNoDia() {
		// Fixture Setup
		int h = 2, min = 14, seg = 34, ms = 739;
		LocalTime hora = new LocalTime(h, min, seg, ms);
		LocalTime expected = new LocalTime(h, min, seg, ms);
		// Exercise SUT
		hora = hora.plusHours(24);
		// Result Verification
		assertEquals(expected, hora);
		// Fixture Teardown
	}

	@Test
	public void somaMinutosNoDia() {
		// Fixture Setup
		int h = 2, min = 14, seg = 34, ms = 739;
		LocalTime hora = new LocalTime(h, min, seg, ms);
		LocalTime expected = new LocalTime(h, min, seg, ms);
		// Exercise SUT
		hora = hora.plusMinutes(24*60);
		// Result Verification
		assertEquals(expected, hora);
		// Fixture Teardown
	}

	@Test
	public void somaSegundosNoDia() {
		// Fixture Setup
		int h = 2, min = 14, seg = 34, ms = 739;
		LocalTime hora = new LocalTime(h, min, seg, ms);
		LocalTime expected = new LocalTime(h, min, seg, ms);
		// Exercise SUT
		hora = hora.plusSeconds(24*60*60);
		// Result Verification
		assertEquals(expected, hora);
		// Fixture Teardown
	}

	@Test
	public void somaMiliSegundosNoDia() {
		// Fixture Setup
		int h = 2, min = 14, seg = 34, ms = 739;
		LocalTime hora = new LocalTime(h, min, seg, ms);
		LocalTime expected = new LocalTime(h, min, seg, ms);
		// Exercise SUT
		hora = hora.plusMillis(24*60*60*1000);
		// Result Verification
		assertEquals(expected, hora);
		// Fixture Teardown
	}

	@Test
	public void somaMinutosNaHora() {
		// Fixture Setup
		int h = 2, min = 14, seg = 34, ms = 739;
		LocalTime hora = new LocalTime(h, min, seg, ms);
		LocalTime expected = new LocalTime(h+1, min, seg, ms);
		// Exercise SUT
		hora = hora.plusMinutes(60);
		// Result Verification
		assertEquals(expected, hora);
		// Fixture Teardown
	}

	@Test
	public void somaSegundosNoMinuto() {
		// Fixture Setup
		int h = 2, min = 14, seg = 34, ms = 739;
		LocalTime hora = new LocalTime(h, min, seg, ms);
		LocalTime expected = new LocalTime(h, min+1, seg, ms);
		// Exercise SUT
		hora = hora.plusSeconds(60);
		// Result Verification
		assertEquals(expected, hora);
		// Fixture Teardown
	}

	@Test
	public void somaMiliSegundosNoSegundo() {
		// Fixture Setup
		int h = 2, min = 14, seg = 34, ms = 739;
		LocalTime hora = new LocalTime(h, min, seg, ms);
		LocalTime expected = new LocalTime(h, min, seg+1, ms);
		// Exercise SUT
		hora = hora.plusMillis(1000);
		// Result Verification
		assertEquals(expected, hora);
		// Fixture Teardown
	}
}
