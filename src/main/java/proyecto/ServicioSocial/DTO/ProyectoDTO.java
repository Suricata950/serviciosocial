package proyecto.ServicioSocial.DTO;

import proyecto.ServicioSocial.entities.Proyecto;

import java.time.LocalDate;

public class ProyectoDTO {
    private int id_proyecto;
    private String nombre_proyecto;
    private String descripcion;
    private LocalDate fecha_inicio;
    private LocalDate fecha_fin;

    public ProyectoDTO(Proyecto proyecto) {
        this.id_proyecto = proyecto.getId_proyecto();
        this.nombre_proyecto = proyecto.getNombre_proyecto();
        this.descripcion = proyecto.getDescripcion();
        this.fecha_inicio = proyecto.getFecha_inicio();
        this.fecha_fin = proyecto.getFecha_fin();
    }

    public int getId_proyecto() {
        return id_proyecto;
    }

    public void setId_proyecto(int id_proyecto) {
        this.id_proyecto = id_proyecto;
    }

    public String getNombre_proyecto() {
        return nombre_proyecto;
    }

    public void setNombre_proyecto(String nombre_proyecto) {
        this.nombre_proyecto = nombre_proyecto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(LocalDate fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public LocalDate getFecha_fin() {
        return fecha_fin;
    }

    public void setFecha_fin(LocalDate fecha_fin) {
        this.fecha_fin = fecha_fin;
    }
}
