package proyecto.ServicioSocial.DTO;

import java.time.LocalDate;

public class EstudianteAsignadoDTO {
    private String nombreEstudiante;
    private LocalDate fechaAsignacion;

    public EstudianteAsignadoDTO(String nombreEstudiante, LocalDate fechaAsignacion) {
        this.nombreEstudiante = nombreEstudiante;
        this.fechaAsignacion = fechaAsignacion;
    }

    public String getNombreEstudiante() {
        return nombreEstudiante;
    }

    public void setNombreEstudiante(String nombreEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
    }

    public LocalDate getFechaAsignacion() {
        return fechaAsignacion;
    }

    public void setFechaAsignacion(LocalDate fechaAsignacion) {
        this.fechaAsignacion = fechaAsignacion;
    }
}
