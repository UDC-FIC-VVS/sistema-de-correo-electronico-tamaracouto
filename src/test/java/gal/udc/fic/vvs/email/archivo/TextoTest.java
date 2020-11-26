package gal.udc.fic.vvs.email.archivo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TextoTest {

	@Test
	public void obtenerNombreTest() {
		Texto texto = new Texto("Texto", "Fragmento El Quijote");

		assertEquals("Texto", texto.obtenerNombre());
	}

	@Test
	public void obtenerContenidoTest() {
		Texto texto = new Texto("Texto", "Fragmento El Quijote");

		assertEquals("Fragmento El Quijote", texto.obtenerContenido());
	}

	@Test
	public void obtenerTamañoTest() {
		Texto texto = new Texto("Texto", "Fragmento El Quijote");

		assertEquals(20, texto.obtenerTamaño());
	}

	@Test
	public void obtenerMimeTypeTest() {
		Texto texto = new Texto("Texto", "Fragmento El Quijote");

		assertEquals("text/plain", texto.obtenerMimeType());
	}

	@Test
	public void obtenerPreVisualizaciónTest() {
		Texto texto = new Texto("Texto", "Fragmento El Quijote");

		assertEquals("Texto(20 bytes, text/plain)", texto.obtenerPreVisualizacion());
	}

}
