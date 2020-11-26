package gal.udc.fic.vvs.email.archivo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ImagenTest {

	@Test
	public void obtenerNombreTest() {
		Imagen imagen = new Imagen("Imagen", "Imagen de paisajes europeos");

		assertEquals("Imagen", imagen.obtenerNombre());
	}

	@Test
	public void obtenerContenidoTest() {
		Imagen imagen = new Imagen("Imagen", "Imagen de paisajes europeos");

		assertEquals("Imagen de paisajes europeos", imagen.obtenerContenido());
	}

	@Test
	public void obtenerTamañoTest() {
		Imagen imagen = new Imagen("Imagen", "Imagen de paisajes europeos");

		assertEquals(27, imagen.obtenerTamaño());
	}

	@Test
	public void obtenerMimeTypeTest() {
		Imagen imagen = new Imagen("Imagen", "Imagen de paisajes europeos");

		assertEquals("image/png", imagen.obtenerMimeType());
	}

	@Test
	public void obtenerPreVisualizaciónTest() {
		Imagen imagen = new Imagen("Imagen", "Imagen de paisajes europeos");

		assertEquals("Imagen(27 bytes, image/png)", imagen.obtenerPreVisualizacion());
	}

}
