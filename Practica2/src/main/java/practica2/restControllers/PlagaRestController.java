package practica2.restControllers;

import java.util.ArrayList;
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
	
/*	//sirve para coger todas las plagas, pero no lo utilizamos
	@RequestMapping(value = "/plagas", method = RequestMethod.GET)
	public List<Plaga> getPlagas() {
		return plagaRep.findAll();
	}
*/
	//sirve para coger los productos fitosanitarios de una plaga en concreto
	@RequestMapping(value = "/plaga/{id}", method = RequestMethod.GET)
	public List<SustanciaActiva> getPlaga(@PathVariable("id") long id) {
		Plaga p = plagaRep.getOne(id);
		List<SustanciaActiva> aux = p.getSustanciasActivas();
		for (SustanciaActiva sa:aux) {
			sa.setProductosFitosanitarios(new ArrayList());
		}
		return aux;
	}
}
