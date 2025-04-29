package proyecto.ServicioSocial.DTO;

public class InstitucionRequestDTO {
    private String nombre_institucion;
    private String ubicacion;

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
