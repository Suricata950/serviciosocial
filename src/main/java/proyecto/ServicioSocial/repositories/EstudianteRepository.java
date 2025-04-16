package proyecto.ServicioSocial.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import proyecto.ServicioSocial.models.Estudiantes;

public interface EstudianteRepository extends JpaRepository<Estudiantes, Long> {
}
