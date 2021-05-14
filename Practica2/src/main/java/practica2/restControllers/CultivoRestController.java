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
import practica2.repository.CategoriaDeCultivoRepository;

@RestController
public class CultivoRestController {

	@Autowired
	private CategoriaDeCultivoRepository cultivosRep;

	@RequestMapping(value = "/cultivos", method = RequestMethod.GET)
	public List<CategoriaDeCultivo> getCultivos() {
		return cultivosRep.findAll();
	}

	@RequestMapping(value = "/cultivo/{id}", method = RequestMethod.GET)
	public CategoriaDeCultivo getCultivo(@PathVariable("id") long id) {
		return cultivosRep.getOne(id);
	}
	

	@RequestMapping(value = "/cultivos", method = RequestMethod.POST)
	public ResponseEntity<Boolean> addCultivo(@RequestBody CategoriaDeCultivo cultivo) {
		this.cultivosRep.save(cultivo);
		return new ResponseEntity<Boolean>(true,HttpStatus.CREATED);
	}
	
	@RequestMapping(value = "/cultivo/{id}", method = RequestMethod.PUT)
	public ResponseEntity<Boolean> modifyPelicula(@PathVariable("id") long id,@RequestBody CategoriaDeCultivo cultivo) {
		CategoriaDeCultivo cult = cultivosRep.getOne(id);
		cult.updateCultivo(cultivo);
		cultivosRep.save(cult);
		return new ResponseEntity<Boolean>(true,HttpStatus.OK);
	}
}
