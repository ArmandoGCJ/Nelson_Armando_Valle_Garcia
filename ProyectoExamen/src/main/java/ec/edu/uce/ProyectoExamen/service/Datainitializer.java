package ec.edu.uce.ProyectoExamen.service;

import ec.edu.uce.ProyectoExamen.model.Tarea;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class Datainitializer implements CommandLineRunner {

    @Autowired
    private TareaService tareaService;


    @Override
    public void run(String... args) throws Exception {

        Tarea tarea = new Tarea();
        tarea.setTitulo("Proyecto 01");
        tarea.setDescripcion("Galaga");
        tarea.setEstado(Tarea.Estado.COMPLETADA);
        tarea.setFechaCreacion(LocalDate.now());

        Tarea tarea2 = new Tarea();
        tarea2.setTitulo("Proyecto 02");
        tarea2.setDescripcion("DDBB");
        tarea2.setEstado(Tarea.Estado.PENDIENTE);
        tarea2.setFechaCreacion(LocalDate.now());

        Tarea tarea3 = new Tarea();
        tarea3.setTitulo("Proyecto 03");
        tarea3.setDescripcion("APINASA");
        tarea3.setEstado(Tarea.Estado.COMPLETADA);
        tarea3.setFechaCreacion(LocalDate.now());

        Tarea tarea4 = new Tarea();
        tarea4.setTitulo("Proyecto 04");
        tarea4.setDescripcion("Relaciones" );
        tarea4.setEstado(Tarea.Estado.PENDIENTE);
        tarea4.setFechaCreacion(LocalDate.now());

        tareaService.crearTarea(tarea);
        tareaService.crearTarea(tarea2);
        tareaService.crearTarea(tarea3);
        tareaService.crearTarea(tarea4);

    }
}
