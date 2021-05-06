package practica2.entities;

import java.util.List;

import javax.persistence.Entity;

@Entity
public class SustanciaActiva {

	private String nombre;	
	private List<ProductoFitosanitario> productosFitosanitarios;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public List<ProductoFitosanitario> getProductosFitosanitarios() {
		return productosFitosanitarios;
	}
	public void setProductosFitosanitarios(List<ProductoFitosanitario> productosFitosanitarios) {
		this.productosFitosanitarios = productosFitosanitarios;
	}
}
