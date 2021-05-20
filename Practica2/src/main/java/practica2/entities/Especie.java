package practica2.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Especie {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="idCultivo",updatable = false, nullable = false)
	private long idEspecie;
	
	private String nombreVulgar;
	private String nombreCientifico;
	private String uRL;
	@ManyToMany
	private List<Plaga> listaPlagas;
	/*@ManyToMany
	private List<CategoriaDeCultivo> listaCategorias;
	*/
	public Especie () {
		
	}
	
	public Especie(String nombreVulgar, String nombreCientifico, String uRL, List<Plaga> listaPlagas) {
		this.nombreVulgar = nombreVulgar;
		this.nombreCientifico = nombreCientifico;
		this.uRL = uRL;
		this.listaPlagas = listaPlagas;
	}
	
	public long getIdEspecie() {
		return idEspecie;
	}

	public void setIdEspecie(long idEspecie) {
		this.idEspecie = idEspecie;
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
	public List<Plaga> getListaPlagas() {
		return listaPlagas;
	}
	
	public void setListaPlagas(List<Plaga> listaPlagas) {
		this.listaPlagas = listaPlagas;
	}
	
	public void modifyEspecie(Especie especie) {
		this.nombreVulgar = especie.getNombreVulgar();
		this.listaPlagas = especie.getListaPlagas();
		this.nombreCientifico = especie.getNombreCientifico();
		this.uRL = especie.getuRL();		
	}
}
