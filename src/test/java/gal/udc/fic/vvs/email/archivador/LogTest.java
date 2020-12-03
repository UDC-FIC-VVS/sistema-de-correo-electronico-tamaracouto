package gal.udc.fic.vvs.email.archivador;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import gal.udc.fic.vvs.email.archivo.Texto;
import gal.udc.fic.vvs.email.correo.Mensaje;

public class LogTest {

	@Test
	public void almacenarCorreoTest() {
		ArchivadorSimple decorado = new ArchivadorSimple("GMail", 100);
		Log log = new Log(decorado);
		Texto texto = new Texto("Texto", "Fragmento El Quijote");
		Mensaje msg = new Mensaje(texto);

		assertTrue(log.almacenarCorreo(msg));
	}

	@Test
	public void obtenerDelegadoIncorrectlyTest() {
		ArchivadorSimple decorado = new ArchivadorSimple("GMail", 100);
		Log log = new Log(decorado);
		Texto texto = new Texto("Texto", "Fragmento El Quijote");
		Mensaje msg = new Mensaje(texto);

		assertEquals(null, log.obtenerDelegado());
	}

//	@Test
//	public void obtenerDelegadoCorrectlyTest() {
//		ArchivadorSimple decorado = new ArchivadorSimple("GMail", 100);
//		Log log = new Log(decorado);
//
//		log.establecerDelegado(decorado);
//
//		assertEquals(decorado, log.obtenerDelegado());
//	}

	@Test
	public void obtenerNombreTest() {
		ArchivadorSimple decorado = new ArchivadorSimple("GMail", 100);
		Log log = new Log(decorado);

		assertEquals("GMail", log.obtenerNombre());
	}

	@Test
	public void obtenerEspacioTotalTest() {
		ArchivadorSimple decorado = new ArchivadorSimple("GMail", 100);
		Log log = new Log(decorado);

		assertEquals(100, log.obtenerEspacioTotal());
	}

	@Test
	public void obtenerEspacioDisponibleTest() {
		ArchivadorSimple decorado = new ArchivadorSimple("GMail", 100);
		Log log = new Log(decorado);
		Texto texto = new Texto("Texto", "Fragmento El Quijote");
		Mensaje mensaje = new Mensaje(texto);

		log.almacenarCorreo(mensaje);
		assertEquals(80, log.obtenerEspacioDisponible());
	}
}
