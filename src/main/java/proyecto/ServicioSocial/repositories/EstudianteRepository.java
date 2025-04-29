package proyecto.ServicioSocial.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import proyecto.ServicioSocial.entities.Estudiante;

public interface EstudianteRepository extends JpaRepository<Estudiante, Integer> {

}
