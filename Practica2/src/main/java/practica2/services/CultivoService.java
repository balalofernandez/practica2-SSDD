package practica2.services;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import practica2.entities.*;

@Component
public class CultivoService {

	private Map<Long, CategoriaDeCultivo> cultivoMap = new HashMap<Long, CategoriaDeCultivo>();

	public CultivoService() {
	}

	//Conseguimos el cultivo en base al id
	public CategoriaDeCultivo getCultivoById(long id) {
		return cultivoMap.get(id);
	}

	public List<CategoriaDeCultivo> getCultivos() {
		return new ArrayList<CategoriaDeCultivo>(cultivoMap.values());
	}

	public void addCultivo(CategoriaDeCultivo cultivo) {
		this.cultivoMap.put(cultivo.getIdcultivo(), cultivo);
	}
	
	public void modifyCultivo(CategoriaDeCultivo cultivo) {
		this.cultivoMap.remove(cultivo.getIdcultivo());
		this.cultivoMap.put(cultivo.getIdcultivo(), cultivo);
	}
}
