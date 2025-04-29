package proyecto.ServicioSocial.DTO;

import proyecto.ServicioSocial.entities.Estudiante;

import java.time.LocalDate;

public class EstudianteDTO {
    private int idEstudiante;
    private String nombre;
    private String telefono;
    private String email;
    private LocalDate fechaIngreso;

    public EstudianteDTO(Estudiante estudiante) {
        this.idEstudiante = estudiante.getIdEstudiante();
        this.nombre = estudiante.getNombre();
        this.telefono = estudiante.getTelefono();
        this.email = estudiante.getEmail();
        this.fechaIngreso = estudiante.getFechaIngreso();
    }

    public int getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(LocalDate fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }
}
