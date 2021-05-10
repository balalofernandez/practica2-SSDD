package practica2.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import practica2.entities.*;
import practica2.repository.CategoriaDeCultivoRepository;

@Component
public class CultivoService {

	@Autowired
	private CategoriaDeCultivoRepository cultivosRep;

	public CultivoService() {
	}

	//Conseguimos el cultivo en base al id
	public CategoriaDeCultivo getCultivoById(long id) {
		return cultivosRep.getOne(id);
	}

	public List<CategoriaDeCultivo> getCultivos() {
		return new ArrayList<CategoriaDeCultivo>(cultivosRep.findAll());
	}

	public void addCultivo(CategoriaDeCultivo cultivo) {
		this.cultivosRep.save(cultivo);
	}
	
	public void modifyCultivo(CategoriaDeCultivo cultivo) {
		CategoriaDeCultivo cult = cultivosRep.getOne(cultivo.getIdcultivo());
		cult.updateCultivo(cultivo);
		cultivosRep.save(cult);
	}
}
