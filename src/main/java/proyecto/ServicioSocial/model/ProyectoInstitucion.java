package proyecto.ServicioSocial.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import prototipo.SS.entities.Institucion;
import prototipo.SS.entities.Proyecto;

import java.time.LocalDate;

@Entity
@Table(name = "proyectos_instituciones")
public class ProyectoInstitucion {

    @EmbeddedId
    private ProyectoInstitucionId id = new ProyectoInstitucionId();

    @ManyToOne
    @MapsId("idProyecto")
    @JoinColumn(name = "id_proyecto")
    @JsonIgnore
    private Proyecto proyecto;

    @ManyToOne
    @MapsId("idInstitucion")
    @JoinColumn(name = "id_institucion")
    @JsonIgnore
    private Institucion institucion;

    @Column(name = "fecha_asignacion")
    private LocalDate fechaAsignacion;


    public ProyectoInstitucionId getId() {
        return id;
    }

    public void setId(ProyectoInstitucionId id) {
        this.id = id;
    }

    public Proyecto getProyecto() {
        return proyecto;
    }

    public void setProyecto(Proyecto proyecto) {
        this.proyecto = proyecto;
    }

    public Institucion getInstitucion() {
        return institucion;
    }

    public void setInstitucion(Institucion institucion) {
        this.institucion = institucion;
    }

    public LocalDate getFechaAsignacion() {
        return fechaAsignacion;
    }

    public void setFechaAsignacion(LocalDate fechaAsignacion) {
        this.fechaAsignacion = fechaAsignacion;
    }


}
