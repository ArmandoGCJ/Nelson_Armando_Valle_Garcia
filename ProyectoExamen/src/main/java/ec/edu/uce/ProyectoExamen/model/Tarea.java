package ec.edu.uce.ProyectoExamen.model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Tarea {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;

    private String descripcion;

    @Enumerated(EnumType.STRING)
    private Estado estado;

    private LocalDate fechaCreacion;

    public Tarea() {
        this.fechaCreacion = LocalDate.now();
        this.estado = Estado.PENDIENTE;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public void setFechaCreacion(LocalDate fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Estado getEstado() {
        return estado;
    }

    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }

    public enum Estado {
        PENDIENTE, COMPLETADA
    }
}

