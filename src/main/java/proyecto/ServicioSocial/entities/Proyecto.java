package proyecto.ServicioSocial.entities;

import jakarta.persistence.*;
import prototipo.SS.model.EstudianteProyecto;
import prototipo.SS.model.ProyectoInstitucion;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "proyectos")
public class Proyecto {

    @OneToMany(mappedBy = "proyecto")
    private List<EstudianteProyecto> estudiantes;

    @OneToMany(mappedBy = "proyecto")
    private List<ProyectoInstitucion> instituciones;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_proyecto")
    private int id_proyecto;

    private String nombre_proyecto;
    private String descripcion;
    private LocalDate fecha_inicio;
    private LocalDate fecha_fin;

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

    public List<EstudianteProyecto> getEstudiantes() {
        return estudiantes;
    }

    public List<ProyectoInstitucion> getInstituciones() {
        return instituciones;
    }

}
