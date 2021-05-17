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
import practica2.repository.PlagaRepository;

@RestController
public class PlagaRestController {

	@Autowired
	private PlagaRepository plagaRep;
	
	@RequestMapping(value = "/plagas", method = RequestMethod.GET)
	public List<Plaga> getPlagas() {
		return plagaRep.findAll();
	}

	@RequestMapping(value = "/plaga/{id}", method = RequestMethod.GET)
	public List<SustanciaActiva> getPlaga(@PathVariable("id") long id) {
		Plaga p = plagaRep.getOne(id);
		return p.getSustanciasActivas();
	}
	

	@RequestMapping(value = "/plagas", method = RequestMethod.POST)
	public ResponseEntity<Boolean> addPlaga(@RequestBody Plaga plaga) {
		plagaRep.save(plaga);
		return new ResponseEntity<Boolean>(true,HttpStatus.CREATED);
	}
	
	@RequestMapping(value = "/plaga/{id}", method = RequestMethod.PUT)
	public ResponseEntity<Boolean> modifyPlaga(
			@PathVariable("id") long id,
			@RequestBody Plaga plaga) {
		Plaga plagaAux = plagaRep.getOne(id);
		plagaAux.modifyPlaga(plaga);
		plagaRep.save(plagaAux);
		return new ResponseEntity<Boolean>(true,HttpStatus.OK);
	}
	
}
