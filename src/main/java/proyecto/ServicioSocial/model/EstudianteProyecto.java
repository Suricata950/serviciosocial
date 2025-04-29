package proyecto.ServicioSocial.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import proyecto.ServicioSocial.entities.Estudiante;
import proyecto.ServicioSocial.entities.Proyecto;

import java.time.LocalDate;

@Entity
@Table(name = "estudiantes_proyectos")
public class EstudianteProyecto {

    @EmbeddedId
    private EstudianteProyectoId id = new EstudianteProyectoId();

    @MapsId("idEstudiante")
    @ManyToOne
    @JoinColumn(name = "id_estudiante", insertable = false, updatable = false)
    @JsonIgnore
    private Estudiante estudiante;

    @ManyToOne
    @MapsId("idProyecto")
    @JoinColumn(name = "id_proyecto", insertable = false, updatable = false)
    @JsonIgnore
    private Proyecto proyecto;

    @Column(name = "fecha_asignacion")
    private LocalDate fechaAsignacion;



    public EstudianteProyectoId getId() {
        return id;
    }

    public void setId(EstudianteProyectoId id) {
        this.id = id;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public Proyecto getProyecto() {
        return proyecto;
    }

    public void setProyecto(Proyecto proyecto) {
        this.proyecto = proyecto;
    }

    public LocalDate getFechaAsignacion() {
        return fechaAsignacion;
    }

    public void setFechaAsignacion(LocalDate fechaAsignacion) {
        this.fechaAsignacion = fechaAsignacion;
    }


}
