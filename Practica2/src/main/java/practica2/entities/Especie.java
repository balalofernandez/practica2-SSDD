package practica2.entities;

import java.util.List;

import javax.persistence.Entity;

@Entity
public class Especie {

	private String nombreVulgar;
	private String nombreCientifico;
	private List<Plaga> listaPlagas;
	
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
