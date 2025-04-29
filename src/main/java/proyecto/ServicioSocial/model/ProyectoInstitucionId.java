package proyecto.ServicioSocial.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class ProyectoInstitucionId implements Serializable {

    @Column(name = "id_proyecto")
    private int idProyecto;

    @Column(name = "id_institucion")
    private int idInstitucion;


    public int getIdProyecto() {
        return idProyecto;
    }

    public void setIdProyecto(int idProyecto) {
        this.idProyecto = idProyecto;
    }

    public int getIdInstitucion() {
        return idInstitucion;
    }

    public void setIdInstitucion(int idInstitucion) {
        this.idInstitucion = idInstitucion;
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ProyectoInstitucionId that = (ProyectoInstitucionId) o;
        return idProyecto == that.idProyecto && idInstitucion == that.idInstitucion;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idProyecto, idInstitucion);
    }
}
