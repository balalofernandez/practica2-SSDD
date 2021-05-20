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
import practica2.repository.*;

@RestController
public class SustanciaActivaRestController {
	
	@Autowired
	private SustanciaActivaRepository sustanciaRep;

/*	//sirve para coger todas las sustancias, pero no lo utilizamos
	@RequestMapping(value = "/sustanciasActivas", method = RequestMethod.GET)
	public List<SustanciaActiva> getSustanciasActivas() {
		return sustanciaRep.findAll();
	}
*/
	//sirve para tomar los productos asociados a una sustancia
	@RequestMapping(value = "/sustanciaActiva/{id}", method = RequestMethod.GET)
	public List<ProductoFitosanitario> getProductoDeSA(@PathVariable("id") long id) {
		SustanciaActiva s = sustanciaRep.getOne(id);
		List<ProductoFitosanitario> aux = s.getProductosFitosanitarios();
		return aux;
	}
}
