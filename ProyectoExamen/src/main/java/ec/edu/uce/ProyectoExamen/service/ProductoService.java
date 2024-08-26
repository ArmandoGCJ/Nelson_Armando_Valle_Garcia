package ec.edu.uce.ProyectoExamen.service;

import ec.edu.uce.ProyectoExamen.reposaitory.ProductoRepository;
import ec.edu.uce.ProyectoExamen.model.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    public Producto guardarProducto(Producto producto) {
        return productoRepository.save(producto);
    }

    public List<Producto> obtenerTodosLosProductos() {
        return productoRepository.findAll();
    }
}
