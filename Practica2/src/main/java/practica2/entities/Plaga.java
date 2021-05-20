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
	private String uRL;
	@ManyToMany
	private List<SustanciaActiva> sustanciasActivas;
	/*@ManyToMany
	private List<Especie> listaEspecies;
	*/

	public Plaga() {
		
	}
	public Plaga(String nombreVulgar, String nombreCientifico, String uRL, List<SustanciaActiva> sustanciasActivas) {
		super();
		this.nombreVulgar = nombreVulgar;
		this.nombreCientifico = nombreCientifico;
		this.uRL = uRL;
		this.sustanciasActivas = sustanciasActivas;
	}
	
	public long getIdPlaga() {
		return idPlaga;
	}
	public void setIdPlaga(long idPlaga) {
		this.idPlaga = idPlaga;
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
	public String getuRL() {
		return uRL;
	}
	public void setuRL(String uRL) {
		uRL = uRL;
	}
	public List<SustanciaActiva> getSustanciasActivas() {
		return sustanciasActivas;
	}
	public void setSustanciasActivas(List<SustanciaActiva> sustanciasActivas) {
		this.sustanciasActivas = sustanciasActivas;
	}
	public void modifyPlaga(Plaga plaga) {
		this.nombreVulgar = plaga.getNombreVulgar();
		this.nombreCientifico = plaga.getNombreCientifico();
		this.uRL = plaga.getuRL();
		this.sustanciasActivas = plaga.getSustanciasActivas();		
	}
	
}
