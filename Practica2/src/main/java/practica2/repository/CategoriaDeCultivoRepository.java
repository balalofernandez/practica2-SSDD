package practica2.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import practica2.entities.CategoriaDeCultivo;

public interface CategoriaDeCultivoRepository extends JpaRepository<CategoriaDeCultivo, Long> {
	List<CategoriaDeCultivo> findByNombre(String nombre);
}
