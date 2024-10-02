package dominio;

public class Producto {

	private String nombre;
	private String descripcion;
	private int precio;

	public Producto(String nombre, int precio, String descripcion) {
			this.nombre = nombre;
			this.precio = precio;
			this.descripcion = descripcion;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	
}
