package proyecto.ServicioSocial.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import proyecto.ServicioSocial.model.Estudiantes;

public interface EstudianteRepository extends JpaRepository<Estudiantes, Long> {
}
