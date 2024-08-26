package ec.edu.uce.ProyectoExamen.service;

import ec.edu.uce.ProyectoExamen.model.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataInizializater implements CommandLineRunner {

    @Autowired
    private ProductoService productoService;


    @Override
    public void run(String... args) throws Exception {


        Producto producto = new Producto();
        producto.setNombre("llaves");
        producto.setPrecio(10.50);
        producto.setDescripcion("llaves de casa");

        productoService.guardarProducto(producto);


        Producto producto2 = new Producto();
        producto2.setNombre("Pan");
        producto2.setPrecio(5.00);
        producto2.setDescripcion("Pan integral");

        productoService.guardarProducto(producto2);
    }
}