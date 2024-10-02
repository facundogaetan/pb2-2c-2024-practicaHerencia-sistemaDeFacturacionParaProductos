package dominio;

import java.util.ArrayList;
import java.util.List;

public class FacturacionDeProductos {
	private List <Producto> productos;
	
	public FacturacionDeProductos() {
		this.productos = new ArrayList<>();
	}
	
	public Boolean agregar(Producto producto) {
		return this.productos.add(producto);
	}

}
