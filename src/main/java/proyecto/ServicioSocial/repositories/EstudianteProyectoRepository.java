package proyecto.ServicioSocial.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import proyecto.ServicioSocial.model.EstudianteProyecto;
import proyecto.ServicioSocial.model.EstudianteProyectoId;

public interface EstudianteProyectoRepository extends JpaRepository<EstudianteProyecto, EstudianteProyectoId> {
}
