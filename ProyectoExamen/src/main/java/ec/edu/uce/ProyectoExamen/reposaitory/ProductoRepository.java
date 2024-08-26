package ec.edu.uce.ProyectoExamen.reposaitory;


import ec.edu.uce.ProyectoExamen.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
}
