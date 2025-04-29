package proyecto.ServicioSocial.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import prototipo.SS.model.ProyectoInstitucion;
import prototipo.SS.model.ProyectoInstitucionId;

public interface ProyectoInstitucionRepository extends JpaRepository<ProyectoInstitucion, ProyectoInstitucionId> {
}
