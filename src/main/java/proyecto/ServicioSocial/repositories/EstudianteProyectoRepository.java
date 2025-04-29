package proyecto.ServicioSocial.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import prototipo.SS.model.EstudianteProyecto;
import prototipo.SS.model.EstudianteProyectoId;

public interface EstudianteProyectoRepository extends JpaRepository<EstudianteProyecto, EstudianteProyectoId> {
}
