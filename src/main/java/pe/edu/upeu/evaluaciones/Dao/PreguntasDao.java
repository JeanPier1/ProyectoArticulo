package pe.edu.upeu.evaluaciones.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import pe.edu.upeu.evaluaciones.entities.Preguntas;

public interface PreguntasDao extends JpaRepository<Preguntas, Long>{

}
