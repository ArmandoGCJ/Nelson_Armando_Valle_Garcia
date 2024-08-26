package ec.edu.uce.ProyectoExamen.repository;


import ec.edu.uce.ProyectoExamen.model.Tarea;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TareaRepository extends JpaRepository<Tarea, Long> {
    List<Tarea> findByEstado(Tarea.Estado estado);
}
