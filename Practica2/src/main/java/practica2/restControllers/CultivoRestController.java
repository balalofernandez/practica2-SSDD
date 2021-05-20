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
		ProductoFitosanitario prod1 = new ProductoFitosanitario("Fitosanitario Mayor", "mayor.com");
		ProductoFitosanitario prod2 = new ProductoFitosanitario("RLS", "rls.com");
		ProductoFitosanitario prod3 = new ProductoFitosanitario("Kriptonita", "kriptonita.com");
		ProductoFitosanitario prod4 = new ProductoFitosanitario("Gelsin", "gelsin.com");
		ProductoFitosanitario prod5 = new ProductoFitosanitario("Minimal", "minimal.com");
		ProductoFitosanitario prod6 = new ProductoFitosanitario("Marea", "marea.com");
		ProductoFitosanitario prod7 = new ProductoFitosanitario("Alma", "alma.com");
		ProductoFitosanitario prod8 = new ProductoFitosanitario("Berretine", "berretine.com");
		ProductoFitosanitario prod9 = new ProductoFitosanitario("Longo", "longo.com");
		ProductoFitosanitario prod10 = new ProductoFitosanitario("Mermo", "mermo.com");
		ProductoFitosanitario prod11 = new ProductoFitosanitario("Lorren", "lorren.com");
		ProductoFitosanitario prod12 = new ProductoFitosanitario("Sapia", "sapia.com");
		ProductoFitosanitario prod13 = new ProductoFitosanitario("Custo", "custo.com");
		ProductoFitosanitario prod14 = new ProductoFitosanitario("Tesue", "tesue.com");
		ProductoFitosanitario prod15 = new ProductoFitosanitario("Zukalo","zucalo.com");
		ProductoFitosanitario prod16 = new ProductoFitosanitario("Queste", "queste.com");
		ProductoFitosanitario prod17 = new ProductoFitosanitario("Niclo", "niclo.com");
		ProductoFitosanitario prod18 = new ProductoFitosanitario("Timli", "timli.com");
		ProductoFitosanitario prod19 = new ProductoFitosanitario("Asdfino", "asdfino.com");
		ProductoFitosanitario prod20 = new ProductoFitosanitario("Ruculi", "ruculi.com");
		ProductoFitosanitario prod21 = new ProductoFitosanitario("Binesa", "binesa.com");
		ProductoFitosanitario prod22 = new ProductoFitosanitario("Zimbawo", "zimbawo.com");
		ProductoFitosanitario prod23 = new ProductoFitosanitario("Ilious", "ilious.com");
		ProductoFitosanitario prod24 = new ProductoFitosanitario("Ambar", "ambar.com");
		ProductoFitosanitario prod25 = new ProductoFitosanitario("Desgo", "desgo.com");
		ProductoFitosanitario prod26 = new ProductoFitosanitario("Longanizus", "longanizus.com");
		ProductoFitosanitario prod27 = new ProductoFitosanitario("Troums", "troums.com");
		ProductoFitosanitario prod28 = new ProductoFitosanitario("Judo", "judo.com");
		ProductoFitosanitario prod29 = new ProductoFitosanitario("Voxa", "voxa.com");

		productoRep.save(prod);
		productoRep.save(prod1);
		productoRep.save(prod2);
		productoRep.save(prod3);
		productoRep.save(prod4);
		productoRep.save(prod5);
		productoRep.save(prod6);
		productoRep.save(prod7);
		productoRep.save(prod8);
		productoRep.save(prod9);
		productoRep.save(prod10);
		productoRep.save(prod11);
		productoRep.save(prod12);
		productoRep.save(prod13);
		productoRep.save(prod14);
		productoRep.save(prod15);
		productoRep.save(prod16);
		productoRep.save(prod17);
		productoRep.save(prod18);
		productoRep.save(prod19);
		productoRep.save(prod20);
		productoRep.save(prod21);
		productoRep.save(prod22);
		productoRep.save(prod23);
		productoRep.save(prod24);
		productoRep.save(prod25);
		productoRep.save(prod26);
		productoRep.save(prod27);
		productoRep.save(prod28);
		productoRep.save(prod29);


		List productos = new ArrayList<ProductoFitosanitario>(Arrays.asList(prod));
		List productos1 = new ArrayList<ProductoFitosanitario>(Arrays.asList(prod2, prod3));
		List productos2 = new ArrayList<ProductoFitosanitario>(Arrays.asList(prod, prod4));
		List productos3 = new ArrayList<ProductoFitosanitario>(Arrays.asList(prod4));
		List productos4 = new ArrayList<ProductoFitosanitario>(Arrays.asList(prod2, prod5));
		List productos5 = new ArrayList<ProductoFitosanitario>(Arrays.asList(prod17, prod21, prod15));
		List productos6 = new ArrayList<ProductoFitosanitario>(Arrays.asList(prod9, prod5, prod29, prod13));
		List productos7 = new ArrayList<ProductoFitosanitario>(Arrays.asList(prod));
		List productos8 = new ArrayList<ProductoFitosanitario>(Arrays.asList(prod));
		List productos9 = new ArrayList<ProductoFitosanitario>(Arrays.asList(prod));
		List productos10 = new ArrayList<ProductoFitosanitario>(Arrays.asList(prod));
		List productos11 = new ArrayList<ProductoFitosanitario>(Arrays.asList(prod));
		List productos12 = new ArrayList<ProductoFitosanitario>(Arrays.asList(prod));
		List productos13 = new ArrayList<ProductoFitosanitario>(Arrays.asList(prod));
		List productos14 = new ArrayList<ProductoFitosanitario>(Arrays.asList(prod));
		List productos15 = new ArrayList<ProductoFitosanitario>(Arrays.asList(prod18, prod7, prod19));
		List productos16 = new ArrayList<ProductoFitosanitario>(Arrays.asList(prod2, prod6));
		List productos17 = new ArrayList<ProductoFitosanitario>(Arrays.asList(prod, prod18, prod11));
		List productos18 = new ArrayList<ProductoFitosanitario>(Arrays.asList(prod7, prod9, prod28, prod4));
		List productos19 = new ArrayList<ProductoFitosanitario>(Arrays.asList(prod13));



		SustanciaActiva sa = new SustanciaActiva("Sustancia Radioactiva", productos);
		SustanciaActiva sa1 = new SustanciaActiva("Sustancia Proactiva", productos1);
		SustanciaActiva sa2 = new SustanciaActiva("Sustancia Especial", productos2);
		SustanciaActiva sa3 = new SustanciaActiva("Sustancia Retroactiva", productos3);
		SustanciaActiva sa4 = new SustanciaActiva("Sustancia Reaccionante", productos4);
		SustanciaActiva sa5 = new SustanciaActiva("Sustancia Fuerte", productos5);
		SustanciaActiva sa6 = new SustanciaActiva("Sustancia Americana", productos6);
		SustanciaActiva sa7 = new SustanciaActiva("Sustancia Primaria", productos7);
		SustanciaActiva sa8 = new SustanciaActiva("Sustancia Principal", productos8);
		SustanciaActiva sa9 = new SustanciaActiva("Sustancia Mínima", productos9);
		SustanciaActiva sa10 = new SustanciaActiva("Sustancia Maxima", productos10);
		SustanciaActiva sa11 = new SustanciaActiva("Sustancia Total", productos11);
		SustanciaActiva sa12 = new SustanciaActiva("Sustancia Clave", productos12);
		SustanciaActiva sa13 = new SustanciaActiva("Sustancia Perfecta", productos13);
		SustanciaActiva sa14 = new SustanciaActiva("Sustancia Central", productos14);
		SustanciaActiva sa15 = new SustanciaActiva("Sustancia Reversa", productos15);
		SustanciaActiva sa16 = new SustanciaActiva("Sustancia Restrictiva", productos16);
		SustanciaActiva sa17 = new SustanciaActiva("Sustancia Aditiva", productos17);
		SustanciaActiva sa18 = new SustanciaActiva("Sustancia Inversa", productos18);
		SustanciaActiva sa19 = new SustanciaActiva("Sustancia Secundaria", productos19);


		sustanciaRep.save(sa);
		sustanciaRep.save(sa1);
		sustanciaRep.save(sa2);
		sustanciaRep.save(sa3);
		sustanciaRep.save(sa4);
		sustanciaRep.save(sa5);
		sustanciaRep.save(sa6);
		sustanciaRep.save(sa7);
		sustanciaRep.save(sa8);
		sustanciaRep.save(sa9);
		sustanciaRep.save(sa10);
		sustanciaRep.save(sa11);
		sustanciaRep.save(sa12);
		sustanciaRep.save(sa13);
		sustanciaRep.save(sa14);
		sustanciaRep.save(sa15);
		sustanciaRep.save(sa16);
		sustanciaRep.save(sa17);
		sustanciaRep.save(sa18);
		sustanciaRep.save(sa19);

		List sustancias = new ArrayList<SustanciaActiva>(Arrays.asList(sa));
		List sustancias1 = new ArrayList<SustanciaActiva>(Arrays.asList(sa2, sa15, sa13));
		List sustancias2 = new ArrayList<SustanciaActiva>(Arrays.asList(sa, sa3));
		List sustancias3 = new ArrayList<SustanciaActiva>(Arrays.asList(sa2, sa5, sa14));
		List sustancias4 = new ArrayList<SustanciaActiva>(Arrays.asList(sa19, sa17));
		List sustancias5 = new ArrayList<SustanciaActiva>(Arrays.asList(sa, sa14, sa13, sa9));
		List sustancias6 = new ArrayList<SustanciaActiva>(Arrays.asList(sa7, sa10));
		List sustancias7 = new ArrayList<SustanciaActiva>(Arrays.asList(sa8, sa13));
		List sustancias8 = new ArrayList<SustanciaActiva>(Arrays.asList(sa19, sa18));
		List sustancias9 = new ArrayList<SustanciaActiva>(Arrays.asList(sa11, sa5));
		List sustancias10 = new ArrayList<SustanciaActiva>(Arrays.asList(sa12, sa17, sa16));
		List sustancias11 = new ArrayList<SustanciaActiva>(Arrays.asList(sa9));
		List sustancias12 = new ArrayList<SustanciaActiva>(Arrays.asList(sa12, sa18));
		List sustancias13 = new ArrayList<SustanciaActiva>(Arrays.asList(sa3));
		List sustancias14 = new ArrayList<SustanciaActiva>(Arrays.asList());
		List sustancias15 = new ArrayList<SustanciaActiva>(Arrays.asList(sa, sa2));

		Plaga p = new Plaga("Langosta", "Crustaceous Maximus", "langosta.com",sustancias);
		Plaga p1 = new Plaga("Mosca blanca", "Volatus Apestosus", "mosca.com",sustancias1);
		Plaga p2 = new Plaga("Cochinilla", "Cucho Cochinillus", "cochinilla.com",sustancias2);
		Plaga p3 = new Plaga("Procesionaria", "Orugus Asquerosus", "procesionaria.com",sustancias3);
		Plaga p4 = new Plaga("Sapo asesino", "Croacus Babosus", "sapoasesino.com",sustancias4);
		Plaga p5 = new Plaga("Lombriz picante", "Lombrizus Picantus", "lombriz.com",sustancias5);
		Plaga p6 = new Plaga("Libelula Alcachofera", "Volate Ascendere", "libelula.com",sustancias6);
		Plaga p7 = new Plaga("Emperador Cesar", "Pijus Magnificus", "emperador.com",sustancias7);
		Plaga p8 = new Plaga("Centurion Brian", "Traviesus Maximus", "lavidadebrian.com",sustancias8);
		Plaga p9 = new Plaga("Plaga de cannabis", "Plagus canabidus", "nose.com",sustancias9);
		Plaga p10 = new Plaga("Plaga de cannabis", "Plagus canabidus", "nose.com",sustancias10);
		Plaga p11 = new Plaga("Plaga de cannabis", "Plagus canabidus", "nose.com",sustancias11);
		Plaga p12 = new Plaga("Plaga de cannabis", "Plagus canabidus", "nose.com",sustancias12);
		Plaga p13 = new Plaga("Plaga de cannabis", "Plagus canabidus", "nose.com",sustancias13);
		Plaga p14 = new Plaga("Plaga de cannabis", "Plagus canabidus", "nose.com",sustancias14);
		Plaga p15 = new Plaga("Plaga de cannabis", "Plagus canabidus", "nose.com",sustancias15);


		plagaRep.save(p);
		plagaRep.save(p1);
		plagaRep.save(p2);
		plagaRep.save(p3);
		plagaRep.save(p4);
		plagaRep.save(p5);
		plagaRep.save(p6);
		plagaRep.save(p7);
		plagaRep.save(p8);
		plagaRep.save(p9);
		plagaRep.save(p10);
		plagaRep.save(p11);
		plagaRep.save(p12);
		plagaRep.save(p13);
		plagaRep.save(p14);
		plagaRep.save(p15);


		List plagas = new ArrayList<Plaga>(Arrays.asList(p));
		List plagas1 = new ArrayList<Plaga>(Arrays.asList(p2, p5));
		List plagas2 = new ArrayList<Plaga>(Arrays.asList(p13, p12, p15));
		List plagas3 = new ArrayList<Plaga>(Arrays.asList(p11, p9));
		List plagas4 = new ArrayList<Plaga>(Arrays.asList(p3, p4, p7));
		List plagas5 = new ArrayList<Plaga>(Arrays.asList(p2));
		List plagas6 = new ArrayList<Plaga>(Arrays.asList(p, p13));
		List plagas7 = new ArrayList<Plaga>(Arrays.asList(p14, p));

		Especie esp = new Especie("Sativa", "Sannabis Sativa" , "sativa.com", plagas);
		Especie esp1 = new Especie("Kennebec", "Solanum tuberosum 'Kennebec'" , "kennebec.com", plagas1);
		Especie esp2 = new Especie("Agria", "Solanum tuberosum 'Agria'" , "agria.com", plagas2);
		Especie esp3 = new Especie("Agria", "Solanum tuberosum 'Agria'" , "agria.com", plagas3);
		Especie esp4 = new Especie("Agria", "Solanum tuberosum 'Agria'" , "agria.com", plagas4);
		Especie esp5 = new Especie("Agria", "Solanum tuberosum 'Agria'" , "agria.com", plagas5);
		Especie esp6= new Especie("Agria", "Solanum tuberosum 'Agria'" , "agria.com", plagas6);
		Especie esp7 = new Especie("Agria", "Solanum tuberosum 'Agria'" , "agria.com", plagas7);

		especiesRep.save(esp);
		especiesRep.save(esp1);
		especiesRep.save(esp2);
		especiesRep.save(esp3);
		especiesRep.save(esp4);
		especiesRep.save(esp5);
		especiesRep.save(esp6);
		especiesRep.save(esp7);


		List especies = new ArrayList<Especie>(Arrays.asList(esp));
		List especies1 = new ArrayList<Especie>(Arrays.asList(esp2,esp3));
		List especies2 = new ArrayList<Especie>(Arrays.asList(esp,esp5, esp6));
		List especies3 = new ArrayList<Especie>(Arrays.asList(esp7,esp4));


		CategoriaDeCultivo cult = new CategoriaDeCultivo("Marihuana", especies);
		CategoriaDeCultivo cult1 = new CategoriaDeCultivo("Patata", especies1);
		CategoriaDeCultivo cult2 = new CategoriaDeCultivo("Hortaliza", especies2);
		CategoriaDeCultivo cult3 = new CategoriaDeCultivo("Transgénicos", especies3);

		this.cultivosRep.save(cult);

		this.cultivosRep.save(cult1);
		this.cultivosRep.save(cult2);
		this.cultivosRep.save(cult3);

	}

	

	@RequestMapping(value = "/cultivos", method = RequestMethod.GET)

	public List<CategoriaDeCultivo> getCultivos() {
		List<CategoriaDeCultivo> cultivos = cultivosRep.findAll();
		List<CategoriaDeCultivo> aux = new ArrayList<>();
		for (CategoriaDeCultivo c:cultivos) {
			c.setListaEspecies(new ArrayList());;
			aux.add(c);
		}
		return aux;
	}
	

	@RequestMapping(value = "/cultivo/{id}", method = RequestMethod.GET)
	public List<Especie> getCultivo(@PathVariable("id") long id) {
		CategoriaDeCultivo c = cultivosRep.getOne(id);
		List<Especie> aux = c.getListaEspecies();
		for (Especie e:aux) {
			e.setListaPlagas(new ArrayList());
		}
		return aux;
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
