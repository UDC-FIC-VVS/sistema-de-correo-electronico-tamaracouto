package gal.udc.fic.vvs.email.archivo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AudioTest {

	@Test
	public void obtenerNombreTest() {
		Audio audio = new Audio("Cancion", "Cancion triste");

		assertEquals("Cancion", audio.obtenerNombre());
	}

	@Test
	public void obtenerContenidoTest() {
		Audio audio = new Audio("Cancion", "Cancion triste");

		assertEquals("Cancion triste", audio.obtenerContenido());
	}

	@Test
	public void obtenerTamañoTest() {
		Audio audio = new Audio("Cancion", "Cancion triste");

		assertEquals(14, audio.obtenerTamaño());
	}

	@Test
	public void obtenerMimeTypeTest() {
		Audio audio = new Audio("Cancion", "Cancion triste");

		assertEquals("audio/ogg", audio.obtenerMimeType());
	}

	@Test
	public void obtenerPreVisualizaciónTest() {
		Audio audio = new Audio("Cancion", "Cancion triste");

		assertEquals("Cancion(14 bytes, audio/ogg)", audio.obtenerPreVisualizacion());
	}
}
