package proyecto.ServicioSocial.entities;

import jakarta.persistence.*;
import proyecto.ServicioSocial.model.ProyectoInstitucion;

import java.util.List;

@Entity
@Table(name = "instituciones")
public class Institucion {

    @OneToMany(mappedBy = "institucion")
    private List<ProyectoInstitucion> proyectos;


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_institucion")
    private int id_institucion;

    private String nombre_institucion;
    private String ubicacion;

    public int getId_institucion() {
        return id_institucion;
    }

    public void setId_institucion(int id_institucion) {
        this.id_institucion = id_institucion;
    }

    public String getNombre_institucion() {
        return nombre_institucion;
    }

    public void setNombre_institucion(String nombre_institucion) {
        this.nombre_institucion = nombre_institucion;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
}
