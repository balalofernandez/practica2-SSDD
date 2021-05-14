package practica2.restControllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import practica2.entities.*;
import practica2.repository.EspecieRepository;

@RestController
public class EspecieRestController {

	@Autowired
	private EspecieRepository especiesRep;

	@RequestMapping(value = "/especies", method = RequestMethod.GET)
	public List<Especie> getEspecie() {
		return especiesRep.findAll();
	}

	@RequestMapping(value = "/especies/{id}", method = RequestMethod.GET)
	public Especie getEspecie(@PathVariable("id") long id) {
		return especiesRep.getOne(id);
	}
	

	@RequestMapping(value = "/especies", method = RequestMethod.POST)
	public ResponseEntity<Boolean> addCultivo(@RequestBody Especie especie) {
		this.especiesRep.save(especie);
		return new ResponseEntity<Boolean>(true,HttpStatus.CREATED);
	}
	
	@RequestMapping(value = "/especies/{id}", method = RequestMethod.PUT)
	public ResponseEntity<Boolean> modifyPelicula(@PathVariable("id") long id,@RequestBody Especie especie) {
		Especie esp = especiesRep.getOne(id);
		esp.modifyEspecie(especie);
		especiesRep.save(esp);
		return new ResponseEntity<Boolean>(true,HttpStatus.OK);
	}
}
