import static org.junit.Assert.assertEquals;

import org.joda.time.LocalTime;
import org.junit.Test;

public class SubtracaoDeHoras {

	// Fixture Setup
	// Exercise SUT
	// Result Verification
	// Fixture Teardown

	@Test
	public void subtrai1Hora() {
		// Fixture Setup
		int h = 2, min = 14, seg = 34, ms = 739,
				subtraiH = 1;
		LocalTime hora = new LocalTime(h, min, seg, ms);
		LocalTime expected = new LocalTime(h-subtraiH, min, seg, ms);
		// Exercise SUT
		hora = hora.minusHours(subtraiH);
		// Result Verification
		assertEquals(expected, hora);
		// Fixture Teardown
	}

	@Test
	public void subtrai1Minuto() {
		// Fixture Setup
		int h = 2, min = 14, seg = 34, ms = 739,
				subtraiMin = 1;
		LocalTime hora = new LocalTime(h, min, seg, ms);
		LocalTime expected = new LocalTime(h, min-subtraiMin, seg, ms);
		// Exercise SUT
		hora = hora.minusMinutes(subtraiMin);
		// Result Verification
		assertEquals(expected, hora);
		// Fixture Teardown
	}

	@Test
	public void subtrai1Segundo() {
		// Fixture Setup
		int h = 2, min = 14, seg = 34, ms = 739,
				subtraiSeg = 1;
		LocalTime hora = new LocalTime(h, min, seg, ms);
		LocalTime expected = new LocalTime(h, min, seg-subtraiSeg, ms);
		// Exercise SUT
		hora = hora.minusSeconds(subtraiSeg);
		// Result Verification
		assertEquals(expected, hora);
		// Fixture Teardown
	}

	@Test
	public void subtrai1MiliSegundo() {
		// Fixture Setup
		int h = 2, min = 14, seg = 34, ms = 739,
				subtraiMs = 1;
		LocalTime hora = new LocalTime(h, min, seg, ms);
		LocalTime expected = new LocalTime(h, min, seg, ms-subtraiMs);
		// Exercise SUT
		hora = hora.minusMillis(subtraiMs);
		// Result Verification
		assertEquals(expected, hora);
		// Fixture Teardown
	}

	@Test
	public void subtraiHorasNoDia() {
		// Fixture Setup
		int h = 2, min = 14, seg = 34, ms = 739;
		LocalTime hora = new LocalTime(h, min, seg, ms);
		LocalTime expected = new LocalTime(h, min, seg, ms);
		// Exercise SUT
		hora = hora.minusHours(24);
		// Result Verification
		assertEquals(expected, hora);
		// Fixture Teardown
	}

	@Test
	public void subtraiMinutosNoDia() {
		// Fixture Setup
		int h = 2, min = 14, seg = 34, ms = 739;
		LocalTime hora = new LocalTime(h, min, seg, ms);
		LocalTime expected = new LocalTime(h, min, seg, ms);
		// Exercise SUT
		hora = hora.minusMinutes(24*60);
		// Result Verification
		assertEquals(expected, hora);
		// Fixture Teardown
	}

	@Test
	public void subtraiSegundosNoDia() {
		// Fixture Setup
		int h = 2, min = 14, seg = 34, ms = 739;
		LocalTime hora = new LocalTime(h, min, seg, ms);
		LocalTime expected = new LocalTime(h, min, seg, ms);
		// Exercise SUT
		hora = hora.minusSeconds(24*60*60);
		// Result Verification
		assertEquals(expected, hora);
		// Fixture Teardown
	}

	@Test
	public void subtraiMiliSegundosNoDia() {
		// Fixture Setup
		int h = 2, min = 14, seg = 34, ms = 739;
		LocalTime hora = new LocalTime(h, min, seg, ms);
		LocalTime expected = new LocalTime(h, min, seg, ms);
		// Exercise SUT
		hora = hora.minusMillis(24*60*60*1000);
		// Result Verification
		assertEquals(expected, hora);
		// Fixture Teardown
	}

	@Test
	public void subtraiMinutosNaHora() {
		// Fixture Setup
		int h = 2, min = 14, seg = 34, ms = 739;
		LocalTime hora = new LocalTime(h, min, seg, ms);
		LocalTime expected = new LocalTime(h-1, min, seg, ms);
		// Exercise SUT
		hora = hora.minusMinutes(60);
		// Result Verification
		assertEquals(expected, hora);
		// Fixture Teardown
	}

	@Test
	public void subtraiSegundosNoMinuto() {
		// Fixture Setup
		int h = 2, min = 14, seg = 34, ms = 739;
		LocalTime hora = new LocalTime(h, min, seg, ms);
		LocalTime expected = new LocalTime(h, min-1, seg, ms);
		// Exercise SUT
		hora = hora.minusSeconds(60);
		// Result Verification
		assertEquals(expected, hora);
		// Fixture Teardown
	}

	@Test
	public void subtraiMiliSegundosNoSegundo() {
		// Fixture Setup
		int h = 2, min = 14, seg = 34, ms = 739;
		LocalTime hora = new LocalTime(h, min, seg, ms);
		LocalTime expected = new LocalTime(h, min, seg-1, ms);
		// Exercise SUT
		hora = hora.minusMillis(1000);
		// Result Verification
		assertEquals(expected, hora);
		// Fixture Teardown
	}
}
