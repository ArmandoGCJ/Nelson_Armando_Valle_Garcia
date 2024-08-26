package ec.edu.uce.ProyectoExamen.controller;

import ec.edu.uce.ProyectoExamen.model.Cliente;
import ec.edu.uce.ProyectoExamen.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @PostMapping("/registrar")
    public ResponseEntity<Cliente> registrarCliente(@RequestBody Cliente cliente) {
        Cliente nuevoCliente = clienteService.guardarCliente(cliente);
        return ResponseEntity.ok(nuevoCliente);
    }

    @PostMapping("/login")
    public ResponseEntity<Cliente> login(@RequestBody Map<String, String> loginData) {
        String nombre = loginData.get("nombre");
        String contrasena = loginData.get("contrasena");

        Cliente cliente = clienteService.autenticarCliente(nombre, contrasena);
        if (cliente != null) {
            return ResponseEntity.ok(cliente);
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).build();
        }
    }
}