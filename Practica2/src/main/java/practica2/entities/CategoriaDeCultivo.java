package practica2.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CategoriaDeCultivo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long idcultivo;
	
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
