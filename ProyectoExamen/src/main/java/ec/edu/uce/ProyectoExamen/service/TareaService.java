package ec.edu.uce.ProyectoExamen.service;

import ec.edu.uce.ProyectoExamen.model.Tarea;
import ec.edu.uce.ProyectoExamen.repository.TareaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class TareaService {

    private final TareaRepository tareaRepository;

    @Autowired
    public TareaService(TareaRepository tareaRepository) {
        this.tareaRepository = tareaRepository;
    }

    public List<Tarea> listarTareas() {
        return tareaRepository.findAll().stream().collect(Collectors.toList());
    }

    public List<Tarea> listarTareasPorEstado(Tarea.Estado estado) {
        return tareaRepository.findByEstado(estado).stream().collect(Collectors.toList());
    }

    public Optional<Tarea> obtenerTareaPorId(Long id) {
        return tareaRepository.findById(id);
    }

    public Tarea crearTarea(Tarea tarea) {
        return tareaRepository.save(tarea);
    }

    public Tarea actualizarTarea(Long id, Tarea tareaActualizada) {
        return tareaRepository.findById(id)
                .map(tarea -> {
                    tarea.setTitulo(tareaActualizada.getTitulo());
                    tarea.setDescripcion(tareaActualizada.getDescripcion());
                    tarea.setEstado(tareaActualizada.getEstado());
                    return tareaRepository.save(tarea);
                })
                .orElseThrow(() -> new RuntimeException("Tarea no encontrada"));
    }

    public void eliminarTarea(Long id) {
        tareaRepository.deleteById(id);
    }
}
