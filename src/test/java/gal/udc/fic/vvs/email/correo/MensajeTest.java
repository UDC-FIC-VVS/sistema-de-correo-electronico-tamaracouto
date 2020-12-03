package gal.udc.fic.vvs.email.correo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import gal.udc.fic.vvs.email.archivo.Texto;

public class MensajeTest {

	@Test
	public void establecerLeidoTrueTest() {
		Texto texto = new Texto("Texto", "Fragmento El Quijote");
		Mensaje msg = new Mensaje(texto);
		boolean leido = true;

		msg.establecerLeido(leido);

		assertEquals(0, msg.obtenerNoLeidos());
	}

	@Test
	public void establecerLeidoFalseTest() {
		Texto texto = new Texto("Texto", "Fragmento El Quijote");
		Mensaje msg = new Mensaje(texto);
		boolean leido = false;

		msg.establecerLeido(leido);

		assertEquals(1, msg.obtenerNoLeidos());
	}

	@Test
	public void obtenerTamañoTest() {
		Texto texto = new Texto("Texto", "Fragmento El Quijote");
		Mensaje msg = new Mensaje(texto);

		assertEquals(20, msg.obtenerTamaño());
	}

	@Test
	public void obtenerIconoNoLeidoTest() {
		Texto texto = new Texto("Texto", "Fragmento El Quijote");
		Mensaje msg = new Mensaje(texto);
		boolean leido = false;

		msg.establecerLeido(leido);
		Integer expected = new Integer(3);

		assertEquals(expected, msg.obtenerIcono());
	}

	@Test
	public void obtenerIconoLeidoTest() {
		Texto texto = new Texto("Texto", "Fragmento El Quijote");
		Mensaje msg = new Mensaje(texto);
		boolean leido = true;

		msg.establecerLeido(leido);
		Integer expected = new Integer(2);

		assertEquals(expected, msg.obtenerIcono());
	}

	@Test
	public void obtenerPreVisualizacionCortaTest() {
		Texto texto = new Texto("Texto", "Fragmento El Quijote");
		Mensaje msg = new Mensaje(texto);
		String expected = "Fragmento El Quijote...";

		assertEquals(expected, msg.obtenerPreVisualizacion());
	}

	@Test
	public void obtenerPreVisualizacionLargaTest() {
		Texto texto = new Texto("Texto", "Fragmento Don Quijote de la Mancha de Miguel de Cervantes Saavedra");
		Mensaje msg = new Mensaje(texto);
		String expected = "Fragmento Don Quijote de la Manc...";

		assertEquals(expected, msg.obtenerPreVisualizacion());
	}

	@Test
	public void obtenerVisualizacionTest() {
		Texto texto = new Texto("Texto", "Fragmento El Quijote");
		Mensaje msg = new Mensaje(texto);
		String expected = "Fragmento El Quijote";

		assertEquals(expected, msg.obtenerVisualizacion());
	}

	@Test
	public void buscarTest() {
		Texto texto = new Texto("Texto", "Fragmento El Quijote");
		Mensaje msg = new Mensaje(texto);
		String busqueda = "Quijote";

		List<Mensaje> expected = new ArrayList<>();
		expected.add(msg);

		assertEquals(expected, msg.buscar(busqueda));
	}

	@Test
	public void buscarErroneamenteTest() {
		Texto texto = new Texto("Texto corto", "Fragmento La Celestina de Fernando de Rojas");
		Mensaje msg = new Mensaje(texto);
		String busqueda = "Quijote";

		List<Mensaje> expected = new ArrayList<>();
		expected.add(msg);

		assertNotEquals(expected, msg.buscar(busqueda));
	}
}
