package practica2.restControllers;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import practica2.entities.*;
import practica2.repository.*;

@RestController
public class CultivoRestController {

	@Autowired
	private CategoriaDeCultivoRepository cultivosRep;
	@Autowired
	private EspecieRepository especiesRep;
	@Autowired
	private PlagaRepository plagaRep;
	@Autowired
	private SustanciaActivaRepository sustanciaRep;
	@Autowired
	private ProductoFitosanitarioRepository productoRep;
	
	@PostConstruct
	public void init() {
		ProductoFitosanitario prod = new ProductoFitosanitario("PRODUCTAKO", "productaco.com"); 
		productoRep.save(prod);
		List productos = new ArrayList<ProductoFitosanitario>(Arrays.asList(prod));
		SustanciaActiva sa = new SustanciaActiva("Sustancia Radioactiva", productos);
		sustanciaRep.save(sa);
		List sustancias = new ArrayList<SustanciaActiva>(Arrays.asList(sa));
		Plaga p = new Plaga("Plaga de cannabis", "Plagus canabidus", "nose.com",sustancias);
		plagaRep.save(p);
		List plagas = new ArrayList<Plaga>(Arrays.asList(p));
		Especie esp = new Especie("Sativa", "Sannabis Sativa" , "sativa.com", plagas);
		Especie esp2 = new Especie("Kennebec", "Solanum tuberosum 'Kennebec'" , "kennebec.com", new ArrayList());
		Especie esp3 = new Especie("Agria", "Solanum tuberosum 'Agria'" , "agria.com", new ArrayList());
		List especiesc1 = new ArrayList<Especie>(Arrays.asList(esp));
		List especiesc2 = new ArrayList<Especie>(Arrays.asList(esp2,esp3));
		especiesRep.save(esp);
		especiesRep.save(esp2);
		especiesRep.save(esp3);
		CategoriaDeCultivo cult = new CategoriaDeCultivo("Marihuana", especiesc1);
		CategoriaDeCultivo cult2 = new CategoriaDeCultivo("Patata", especiesc2);
		this.cultivosRep.save(cult);
		this.cultivosRep.save(cult2);
	}
	
	@RequestMapping(value = "/cultivos", method = RequestMethod.GET)
	public List<CategoriaDeCultivo> getCultivos() {
		return cultivosRep.findAll();
	}

	@RequestMapping(value = "/cultivo/{id}", method = RequestMethod.GET)
	public List<Especie> getCultivo(@PathVariable("id") long id) {
		CategoriaDeCultivo c = cultivosRep.getOne(id);
		return c.getListaEspecies();
	}
	

	@RequestMapping(value = "/cultivos", method = RequestMethod.POST)
	public ResponseEntity<Boolean> addCultivo(@RequestBody CategoriaDeCultivo cultivo) {
		this.cultivosRep.save(cultivo);
		return new ResponseEntity<Boolean>(true,HttpStatus.CREATED);
	}
	
	@RequestMapping(value = "/cultivo/{id}", method = RequestMethod.PUT)
	public ResponseEntity<Boolean> modifyCultivo(@PathVariable("id") long id,@RequestBody CategoriaDeCultivo cultivo) {
		CategoriaDeCultivo cult = cultivosRep.getOne(id);
		cult.updateCultivo(cultivo);
		cultivosRep.save(cult);
		return new ResponseEntity<Boolean>(true,HttpStatus.OK);
	}
}
