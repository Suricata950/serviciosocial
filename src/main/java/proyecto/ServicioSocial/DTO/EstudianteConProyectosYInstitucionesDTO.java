package proyecto.ServicioSocial.DTO;

import proyecto.ServicioSocial.entities.Estudiante;

import java.util.List;
import java.util.stream.Collectors;

public class EstudianteConProyectosYInstitucionesDTO {
    private int idEstudiante;
    private String nombre;
    private String telefono;
    private String email;
    private List<ProyectoConInstitucionesDTO> proyectos;

    public EstudianteConProyectosYInstitucionesDTO(Estudiante estudiante) {
        this.idEstudiante = estudiante.getIdEstudiante();
        this.nombre = estudiante.getNombre();
        this.telefono = estudiante.getTelefono();
        this.email = estudiante.getEmail();
        this.proyectos = estudiante.getProyectos().stream()
                .map(rel -> new ProyectoConInstitucionesDTO(rel.getProyecto()))
                .collect(Collectors.toList());
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

    public List<ProyectoConInstitucionesDTO> getProyectos() {
        return proyectos;
    }

    public void setProyectos(List<ProyectoConInstitucionesDTO> proyectos) {
        this.proyectos = proyectos;
    }
}
