package dominio;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class FacturacionDeProductosTest {
	
	@Test
	public void DadoQueExisteUnProductoPuedoAgregarUno() {
		//preparacion
		FacturacionDeProductos facturacionDeProductos = new FacturacionDeProductos();
		Producto producto = new Producto("abcd",50000,"zapatillas");
		//ejecucion
		Boolean agregado = facturacionDeProductos.agregar(producto);
		//verificacion
		assertTrue(agregado); 
	}

}
