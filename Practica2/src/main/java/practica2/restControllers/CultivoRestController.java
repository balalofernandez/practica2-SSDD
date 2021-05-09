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

import practica2.services.CultivoService;
import practica2.entities.*;

@RestController
public class CultivoRestController {

		@Autowired
		private CultivoService cultivoService;


		@RequestMapping(value = "/cultivos", method = RequestMethod.GET)
		public List<CategoriaDeCultivo> getCultivos() {
			return cultivoService.getCultivos();
		}

		@RequestMapping(value = "/cultivo/{id}", method = RequestMethod.GET)
		public CategoriaDeCultivo getCultivo(@PathVariable("id") long id) {
			return cultivoService.getCultivoById(id);
		}
		

		@RequestMapping(value = "/cultivos", method = RequestMethod.POST)
		public ResponseEntity<Boolean> addCultivo(@RequestBody CategoriaDeCultivo cultivo) {
			cultivoService.addCultivo(cultivo);
			return new ResponseEntity<Boolean>(true,HttpStatus.CREATED);
		}
		
		@RequestMapping(value = "/cultivo/{id}", method = RequestMethod.PUT)
		public ResponseEntity<Boolean> modifyPelicula(@PathVariable("id") String id,@RequestBody CategoriaDeCultivo cultivo) {
			cultivoService.modifyCultivo(cultivo);
			return new ResponseEntity<Boolean>(true,HttpStatus.OK);
		}
}
