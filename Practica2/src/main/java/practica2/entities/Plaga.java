package practica2.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Plaga {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long idPlaga;
	private String nombreVulgar;
	private String nombreCientifico;
	private String URL;
	private List<SustanciaActiva> sustanciasActivas;
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
	public String getURL() {
		return URL;
	}
	public void setURL(String uRL) {
		URL = uRL;
	}
	public List<SustanciaActiva> getSustanciasActivas() {
		return sustanciasActivas;
	}
	public void setSustanciasActivas(List<SustanciaActiva> sustanciasActivas) {
		this.sustanciasActivas = sustanciasActivas;
	}
	
	
}
