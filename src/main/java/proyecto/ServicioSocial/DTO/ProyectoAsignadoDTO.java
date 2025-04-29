package proyecto.ServicioSocial.DTO;

import java.time.LocalDate;

public class ProyectoAsignadoDTO {
    private String nombreProyecto;
    private LocalDate fechaAsignacion;

    public ProyectoAsignadoDTO (String nombreProyecto, LocalDate fechaAsignacion){
        this.nombreProyecto = nombreProyecto;
        this.fechaAsignacion = fechaAsignacion;
    }

    public String getNombreProyecto() {
        return nombreProyecto;
    }

    public void setNombreProyecto(String nombreProyecto) {
        this.nombreProyecto = nombreProyecto;
    }

    public LocalDate getFechaAsignacion() {
        return fechaAsignacion;
    }

    public void setFechaAsignacion(LocalDate fechaAsignacion) {
        this.fechaAsignacion = fechaAsignacion;
    }
}
