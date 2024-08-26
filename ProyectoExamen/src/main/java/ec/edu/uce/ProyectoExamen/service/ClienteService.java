package ec.edu.uce.ProyectoExamen.service;

import ec.edu.uce.ProyectoExamen.model.Cliente;
import ec.edu.uce.ProyectoExamen.reposaitory.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public Cliente guardarCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public Cliente autenticarCliente(String nombre, String contrasena) {
        return clienteRepository.findByNombreAndContrasena(nombre, contrasena);
    }
}
