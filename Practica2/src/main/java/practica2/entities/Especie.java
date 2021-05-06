package practica2.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Especie {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long idEspecie;
	
	private String nombreVulgar;
	private String nombreCientifico;
	@ManyToMany
	private List<Plaga> listaPlagas;
	@ManyToMany
	private List<CategoriaDeCultivo> listaCategorias;
	
	public String getNombreVulgar() {
		return nombreVulgar;
	}
	public void setNombreVulgar(String nombreVulgar) {
		this.nombreVulgar = nombreVulgar;
	}
	public String getNombreCientifico() {
		return nombreCientifico;
	}
	public void setNombreCientifico(String nombreCientifico) {
		this.nombreCientifico = nombreCientifico;
	}
	public List<Plaga> getListaPlagas() {
		return listaPlagas;
	}
	public void setListaPlagas(List<Plaga> listaPlagas) {
		this.listaPlagas = listaPlagas;
	}
	
}
