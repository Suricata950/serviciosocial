package proyecto.ServicioSocial.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import proyecto.ServicioSocial.entities.Proyecto;

public interface ProyectoRepository extends JpaRepository<Proyecto, Integer> {
}
