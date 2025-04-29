package proyecto.ServicioSocial.DTO;

import java.time.LocalDate;

public class InstitucionAsignadaDTO {
    private String nombreInstitucion;
    private LocalDate fechaAsignacion;

    public InstitucionAsignadaDTO(String nombreInstitucion, LocalDate fechaAsignacion) {
        this.nombreInstitucion = nombreInstitucion;
        this.fechaAsignacion = fechaAsignacion;
    }

    public String getNombreInstitucion() {
        return nombreInstitucion;
    }

    public void setNombreInstitucion(String nombreInstitucion) {
        this.nombreInstitucion = nombreInstitucion;
    }

    public LocalDate getFechaAsignacion() {
        return fechaAsignacion;
    }

    public void setFechaAsignacion(LocalDate fechaAsignacion) {
        this.fechaAsignacion = fechaAsignacion;
    }
}
