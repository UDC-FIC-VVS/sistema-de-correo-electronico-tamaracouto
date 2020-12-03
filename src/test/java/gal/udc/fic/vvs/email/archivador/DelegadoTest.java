package gal.udc.fic.vvs.email.archivador;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import gal.udc.fic.vvs.email.archivo.Texto;
import gal.udc.fic.vvs.email.correo.Mensaje;

public class DelegadoTest {

	@Test
	public void almacenarCorreoTest() {
		ArchivadorSimple decorado = new ArchivadorSimple("GMail", 100);
		Delegado delegado = new Delegado(decorado);
		Texto texto = new Texto("Texto", "Fragmento El Quijote");
		Mensaje msg = new Mensaje(texto);

		assertTrue(delegado.almacenarCorreo(msg));
	}

	@Test
	public void obtenerDelegadoIncorrectlyTest() {
		ArchivadorSimple decorado = new ArchivadorSimple("GMail", 100);
		Delegado delegado = new Delegado(decorado);
		Texto texto = new Texto("Texto", "Fragmento El Quijote");
		Mensaje msg = new Mensaje(texto);

		assertEquals(null, delegado.obtenerDelegado());
	}

	@Test
	public void obtenerDelegadoCorrectlyTest() {
		ArchivadorSimple decorado = new ArchivadorSimple("GMail", 100);
		Delegado delegado = new Delegado(decorado);

		delegado.establecerDelegado(decorado);

		assertEquals(decorado, delegado.obtenerDelegado());
	}

	@Test
	public void obtenerNombreTest() {
		ArchivadorSimple decorado = new ArchivadorSimple("GMail", 100);
		Delegado delegado = new Delegado(decorado);

		assertEquals("GMail", delegado.obtenerNombre());
	}

	@Test
	public void obtenerEspacioTotalTest() {
		ArchivadorSimple decorado = new ArchivadorSimple("GMail", 100);
		Delegado delegado = new Delegado(decorado);

		assertEquals(100, delegado.obtenerEspacioTotal());
	}

	@Test
	public void obtenerEspacioDisponibleTest() {
		ArchivadorSimple decorado = new ArchivadorSimple("GMail", 100);
		Delegado delegado = new Delegado(decorado);
		Texto texto = new Texto("Texto", "Fragmento El Quijote");
		Mensaje mensaje = new Mensaje(texto);

		delegado.almacenarCorreo(mensaje);
		assertEquals(80, delegado.obtenerEspacioDisponible());
	}

}
