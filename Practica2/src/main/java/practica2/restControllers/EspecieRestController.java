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
import practica2.repository.EspecieRepository;

@RestController
public class EspecieRestController {

	@Autowired
	private EspecieRepository especiesRep;
	
/*  //sirve para coger todas las especies, pero no lo utilizamos
	@RequestMapping(value = "/especies", method = RequestMethod.GET)
	public List<Especie> getEspecie() {
		return especiesRep.findAll();
	}
*/
	//coge de una especie en particular las plagas
	@RequestMapping(value = "/especie/{id}", method = RequestMethod.GET)
	public List<Plaga> getEspecie(@PathVariable("id") long id) {
		Especie esp = especiesRep.getOne(id);
		List<Plaga> aux = esp.getListaPlagas();
		for (Plaga c:aux) {
			c.setSustanciasActivas(new ArrayList());
		}
		return aux;
	}
}
