package practica2.entities;

import javax.persistence.Entity;

@Entity
public class ProductoFitosanitario {
	
	private String nombre;
	private String URL;
	
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
