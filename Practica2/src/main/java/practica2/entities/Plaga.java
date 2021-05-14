package practica2.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Plaga {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long idPlaga;
	private String nombreVulgar;
	private String nombreCientifico;
	private String URL;
	@ManyToMany
	private List<SustanciaActiva> sustanciasActivas;
	@ManyToMany
	private List<Especie> listaEspecies;


	public long getIdPlaga() {
		return idPlaga;
	}
	public void setIdPlaga(long idPlaga) {
		this.idPlaga = idPlaga;
	}
	public List<Especie> getListaEspecies() {
		return listaEspecies;
	}
	public void setListaEspecies(List<Especie> listaEspecies) {
		this.listaEspecies = listaEspecies;
	}
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
	public void modifyPlaga(Plaga plaga) {
		this.nombreVulgar = plaga.getNombreVulgar();
		this.listaEspecies = plaga.getListaEspecies();
		this.nombreCientifico = plaga.getNombreCientifico();
		this.URL = plaga.getURL();
		this.sustanciasActivas = plaga.getSustanciasActivas();		
	}
	
}
