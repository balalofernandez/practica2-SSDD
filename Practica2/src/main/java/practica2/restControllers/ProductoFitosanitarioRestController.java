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

import practica2.entities.ProductoFitosanitario;
import practica2.repository.ProductoFitosanitarioRepository;

@RestController
public class ProductoFitosanitarioRestController {
	@Autowired
	private ProductoFitosanitarioRepository productoFitosanitarioRep;

	@RequestMapping(value = "/productosFitosantarios", method = RequestMethod.GET)
	public List<ProductoFitosanitario> getProductosFitosanitarios() {
		return productoFitosanitarioRep.findAll();
	}

	@RequestMapping(value = "/productoFitosantario/{id}", method = RequestMethod.GET)
	public ProductoFitosanitario getProductoFitosanitario(@PathVariable("id") long id) {
		return productoFitosanitarioRep.getOne(id);
	}
	

	@RequestMapping(value = "/productosFitosantarios", method = RequestMethod.POST)
	public ResponseEntity<Boolean> addProductoFitosanitario(@RequestBody ProductoFitosanitario producto) {
		this.productoFitosanitarioRep.save(producto);
		return new ResponseEntity<Boolean>(true,HttpStatus.CREATED);
	}
	
	@RequestMapping(value = "/productoFitosantario/{id}", method = RequestMethod.PUT)
	public ResponseEntity<Boolean> modifySustanciaActiva(@PathVariable("id") long id,@RequestBody ProductoFitosanitario producto) {
		ProductoFitosanitario prod = productoFitosanitarioRep.getOne(id);
		prod.updateProductoFitosanitario(producto);
		productoFitosanitarioRep.save(prod);
		return new ResponseEntity<Boolean>(true,HttpStatus.OK);
	}
}
