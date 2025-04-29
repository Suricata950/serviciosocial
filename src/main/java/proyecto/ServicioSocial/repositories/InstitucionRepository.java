package proyecto.ServicioSocial.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import proyecto.ServicioSocial.entities.Institucion;

public interface InstitucionRepository extends JpaRepository<Institucion, Integer> {
}
