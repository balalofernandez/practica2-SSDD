package practica2.entities;

import java.util.List;

import javax.persistence.Entity;

@Entity
public class CategoriaDeCultivo {
	
	private String nombre;
	private List<Especie> listaEspecies;
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public List<Especie> getListaEspecies() {
		return listaEspecies;
	}
	public void setListaEspecies(List<Especie> listaEspecies) {
		this.listaEspecies = listaEspecies;
	}
	
	

}
