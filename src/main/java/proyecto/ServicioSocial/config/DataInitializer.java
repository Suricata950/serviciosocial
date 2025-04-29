package proyecto.ServicioSocial.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import proyecto.ServicioSocial.entities.Estudiante;
import proyecto.ServicioSocial.entities.Institucion;
import proyecto.ServicioSocial.entities.Proyecto;
import proyecto.ServicioSocial.repositories.EstudianteRepository;
import proyecto.ServicioSocial.repositories.InstitucionRepository;
import proyecto.ServicioSocial.repositories.ProyectoRepository;

import java.time.LocalDate;

@Configuration
public class DataInitializer {
    @Bean
    CommandLineRunner initData(EstudianteRepository estudiantesRepo, ProyectoRepository proyectosRepo, InstitucionRepository institucionesRepo){
        return args -> {
            if (estudiantesRepo.count()==0 && proyectosRepo.count()==0 && institucionesRepo.count()==0){
                System.out.println("Insertando datos iniciales...");

                Estudiante est = new Estudiante();
                est.setNombre("Juan Pérez");
                est.setTelefono("551234567");
                est.setEmail("juan.perez@hotmail.com");
                est.setFechaIngreso(LocalDate.of(2022, 1,10));
                estudiantesRepo.save(est);

                Proyecto proy = new Proyecto();
                proy.setNombre_proyecto("Mejoramiento de Biblioteca");
                proy.setDescripcion("Organización y digitalización de archivos");
                proy.setFecha_inicio(LocalDate.of(2023, 3, 1));
                proy.setFecha_fin(LocalDate.of(2023, 6, 30));
                proyectosRepo.save(proy);

                Institucion inst = new Institucion();
                inst.setNombre_institucion("Biblioteca Central UAM");
                inst.setUbicacion("Ciudad de México");
                institucionesRepo.save(inst);

                System.out.println("Datos insertados correctamente.");
            }else {
                System.out.println("Datos ya existentes. No se insertó nada.");
            }
        };
    }
}
