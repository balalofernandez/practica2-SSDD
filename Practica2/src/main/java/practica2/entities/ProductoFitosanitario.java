package practica2.entities;

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
	private String URL;
	@ManyToMany
	private List<SustanciaActiva> listaSustanciasActivas;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getURL() {
		return URL;
	}
	public void setURL(String uRL) {
		URL = uRL;
	}

}
