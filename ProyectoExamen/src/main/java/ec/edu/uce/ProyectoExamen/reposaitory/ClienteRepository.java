package ec.edu.uce.ProyectoExamen.reposaitory;

import ec.edu.uce.ProyectoExamen.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    Cliente findByNombreAndContrasena(String nombre, String contrasena);
}
