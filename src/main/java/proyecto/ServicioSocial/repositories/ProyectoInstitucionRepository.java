package proyecto.ServicioSocial.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import proyecto.ServicioSocial.model.ProyectoInstitucion;
import proyecto.ServicioSocial.model.ProyectoInstitucionId;

public interface ProyectoInstitucionRepository extends JpaRepository<ProyectoInstitucion, ProyectoInstitucionId> {
}
