import static org.junit.Assert.*;

import org.joda.time.DateTime;
import org.joda.time.Interval;
import org.junit.Test;

public class CriacaoDeIntervalos {

	// Fixture Setup
	// Exercise SUT
	// Result Verification
	// Fixture Teardown

	@Test
	public void criaIntervalo() {
		// Fixture Setup
		int anoI = 2017, mesI = 8, diaI = 16,
				HoraI = 15, MinI = 39, SegI = 54;
		DateTime dataInicio = new DateTime(anoI, mesI, diaI, HoraI, MinI, SegI);
		DateTime dataFim = dataInicio.plusDays(1);
		// Exercise SUT
		Interval intervalo = new Interval(dataInicio, dataFim);
		// Result Verification
		assertEquals(dataInicio,	intervalo.getStart());
		assertEquals(dataFim,		intervalo.getEnd());
		assertEquals(24*60*60*1000,	intervalo.toDurationMillis());
		// Fixture Teardown
	}

	@Test(expected=IllegalArgumentException.class)
	public void criaIntervaloNegativo() {
		// Fixture Setup
		int anoI = 2017, mesI = 8, diaI = 16,
				HoraI = 15, MinI = 39, SegI = 54;
		DateTime dataInicio = new DateTime(anoI, mesI, diaI, HoraI, MinI, SegI);
		DateTime dataFim = dataInicio.minusDays(1);
		// Exercise SUT
		new Interval(dataInicio, dataFim);
		// Result Verification
		// Fixture Teardown
	}
}
