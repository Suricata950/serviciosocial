package proyecto.ServicioSocial.entities;

import jakarta.persistence.*;
import proyecto.ServicioSocial.model.EstudianteProyecto;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "estudiantes")

public class Estudiante {

    @OneToMany(mappedBy = "estudiante")
    private List<EstudianteProyecto> proyectos;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_estudiante")
    private int idEstudiante;

    private String nombre;
    private String telefono;
    private String email;
    @Column(name = "fecha_ingreso")
    private LocalDate fechaIngreso;

    public List<EstudianteProyecto> getProyectos() {
        return proyectos;
    }

    public void setProyectos(List<EstudianteProyecto> proyectos) {
        this.proyectos = proyectos;
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
