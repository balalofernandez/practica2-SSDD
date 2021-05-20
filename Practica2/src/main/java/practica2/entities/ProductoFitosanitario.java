package practica2.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class ProductoFitosanitario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long idProductoFitosanitario;
	private String nombre;
	private String uRL;
	/*
	@ManyToMany
	private List<SustanciaActiva> listaSustanciasActivas;
	*/
	
	public ProductoFitosanitario() {
	}
	public ProductoFitosanitario( String nombre, String uRL) {
		this.nombre = nombre;
		uRL = uRL;
	}
	public long getIdProductoFitosanitario() {
		return idProductoFitosanitario;
	}
	public void setIdProductoFitosanitario(long idProductoFitosanitario) {
		this.idProductoFitosanitario = idProductoFitosanitario;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getuRL() {
		return uRL;
	}
	public void setuRL(String uRL) {
		uRL = uRL;
	}
	public void updateProductoFitosanitario(ProductoFitosanitario prod) {
		this.nombre = prod.getNombre();
		this.uRL = prod.getuRL();
	}

}
