package practica2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import practica2.entities.Especie;

public interface EspecieRepository extends JpaRepository<Especie, Long> {
	
}
