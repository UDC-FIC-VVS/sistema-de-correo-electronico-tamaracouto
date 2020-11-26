package gal.udc.fic.vvs.email.archivador;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import gal.udc.fic.vvs.email.archivo.Texto;
import gal.udc.fic.vvs.email.correo.Mensaje;

public class ArchivadorSimpleTest {

	@Test
	public void obtenerNombreTest() {
		ArchivadorSimple archivadorSimple = new ArchivadorSimple("GMail", 100);

		assertEquals("GMail", archivadorSimple.obtenerNombre());
	}

	@Test
	public void almacenarCorreoCorrectamenteTest() {
		ArchivadorSimple archivadorSimple = new ArchivadorSimple("GMail", 100);
		Texto texto = new Texto("Texto", "Fragmento El Quijote");
		Mensaje mensaje = new Mensaje(texto);

		assertTrue(archivadorSimple.almacenarCorreo(mensaje));
	}

	@Test
	public void almacenarCorreoFalloTest() {
		ArchivadorSimple archivadorSimple = new ArchivadorSimple("GMail", 20);
		Texto texto = new Texto("Texto", "Fragmento El Quijote");
		Mensaje mensaje = new Mensaje(texto);

		assertFalse(archivadorSimple.almacenarCorreo(mensaje));
	}

	@Test
	public void obtenerEspacioTotalTest() {
		ArchivadorSimple archivadorSimple = new ArchivadorSimple("GMail", 100);

		assertEquals(100, archivadorSimple.obtenerEspacioTotal());
	}

	@Test
	public void obtenerEspacioDisponibleTest() {
		ArchivadorSimple archivadorSimple = new ArchivadorSimple("GMail", 100);
		Texto texto = new Texto("Texto", "Fragmento El Quijote");
		Mensaje mensaje = new Mensaje(texto);

		archivadorSimple.almacenarCorreo(mensaje);
		assertEquals(80, archivadorSimple.obtenerEspacioDisponible());
	}

	@Test
	public void obtenerDelegadoTest() {
		ArchivadorSimple archivadorSimple = new ArchivadorSimple("GMail", 100);

		assertEquals(null, archivadorSimple.obtenerDelegado());
	}

//	@Test
//	public void establecerDelegadoTest() {
//		ArchivadorSimple archivadorSimple = new ArchivadorSimple("GMail", 100);
//		ArchivadorSimple archivadorSimpleDelegado = new ArchivadorSimple("Outlook", 100);
//		archivadorSimple.establecerDelegado(archivadorSimple);
//
//		assertEquals(archivadorSimpleDelegado, archivadorSimple.obtenerDelegado());
//	}

}
