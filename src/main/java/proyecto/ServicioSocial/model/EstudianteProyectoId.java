package proyecto.ServicioSocial.model;

import jakarta.persistence.Column;

import java.io.Serializable;
import java.util.Objects;

public class EstudianteProyectoId implements Serializable {

    @Column(name = "id_estudiante")
    private int idEstudiante;

    @Column(name = "id_proyecto")
    private int idProyecto;

    public int getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public int getIdProyecto() {
        return idProyecto;
    }

    public void setIdProyecto(int idProyecto) {
        this.idProyecto = idProyecto;
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        EstudianteProyectoId that = (EstudianteProyectoId) o;
        return idEstudiante == that.idEstudiante && idProyecto == that.idProyecto;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idEstudiante, idProyecto);
    }
}
