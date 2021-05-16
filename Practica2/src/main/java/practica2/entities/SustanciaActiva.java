package practica2.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class SustanciaActiva {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long idSustanciaActiva;
	
	private String nombre;
	@ManyToMany	
	private List<ProductoFitosanitario> productosFitosanitarios;
	@ManyToMany
	private List<Plaga> listaPlagas;
	
	
	public SustanciaActiva() {
	}
	public SustanciaActiva(long idSustanciaActiva, String nombre, List<ProductoFitosanitario> productosFitosanitarios,
			List<Plaga> listaPlagas) {
		super();
		this.idSustanciaActiva = idSustanciaActiva;
		this.nombre = nombre;
		this.productosFitosanitarios = productosFitosanitarios;
		this.listaPlagas = listaPlagas;
	}
	public long getIdSustanciaActiva() {
		return idSustanciaActiva;
	}
	public void setIdSustanciaActiva(long idSustanciaActiva) {
		this.idSustanciaActiva = idSustanciaActiva;
	}
	public List<Plaga> getListaPlagas() {
		return listaPlagas;
	}
	public void setListaPlagas(List<Plaga> listaPlagas) {
		this.listaPlagas = listaPlagas;
	}
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
	
	public void updateSustanciaActiva(SustanciaActiva s) {
		this.nombre =s.getNombre();
		this.productosFitosanitarios = s.getProductosFitosanitarios();
		this.listaPlagas = s.getListaPlagas();
	}
}
