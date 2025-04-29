package proyecto.ServicioSocial.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import proyecto.ServicioSocial.DTO.AsignacionEstudianteProyectoDTO;
import proyecto.ServicioSocial.DTO.AsignacionProyectoInstitucionDTO;
import proyecto.ServicioSocial.entities.Estudiante;
import proyecto.ServicioSocial.entities.Institucion;
import proyecto.ServicioSocial.entities.Proyecto;
import proyecto.ServicioSocial.model.EstudianteProyecto;
import proyecto.ServicioSocial.model.EstudianteProyectoId;
import proyecto.ServicioSocial.model.ProyectoInstitucion;
import proyecto.ServicioSocial.model.ProyectoInstitucionId;
import proyecto.ServicioSocial.repositories.*;

import java.util.Optional;

@RestController
@RequestMapping("/asignaciones")
public class AsignacionController {

    @Autowired
    private EstudianteRepository estudianteRepository;

    @Autowired
    private ProyectoRepository proyectoRepository;

    @Autowired
    private EstudianteProyectoRepository estudianteProyectoRepository;

    @Autowired
    private InstitucionRepository institucionRepository;

    @Autowired
    private ProyectoInstitucionRepository proyectoInstitucionRepository;


    @PostMapping("/estudiante-proyecto")
    public ResponseEntity<String> asignarEstudianteAProyecto(@RequestBody AsignacionEstudianteProyectoDTO dto) {
        Optional<Estudiante> estudianteOpt = estudianteRepository.findById(dto.getIdEstudiante());
        Optional<Proyecto> proyectoOpt = proyectoRepository.findById(dto.getIdProyecto());

        if (estudianteOpt.isPresent() && proyectoOpt.isPresent()) {
            EstudianteProyecto asignacion = new EstudianteProyecto();
            asignacion.setEstudiante(estudianteOpt.get());
            asignacion.setProyecto(proyectoOpt.get());
            asignacion.setFechaAsignacion(dto.getFechaAsignacion());

            EstudianteProyectoId id = new EstudianteProyectoId();
            id.setIdEstudiante(dto.getIdEstudiante());
            id.setIdProyecto(dto.getIdProyecto());

            asignacion.setId(id);

            estudianteProyectoRepository.save(asignacion);
            return ResponseEntity.ok("Estudiante asignado al proyecto exitosamente.");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Estudiante o Proyecto no encontrado.");
        }
    }

    @PostMapping("/proyecto-institucion")
    public ResponseEntity<String> asignarProyectoAInstitucion(@RequestBody AsignacionProyectoInstitucionDTO dto) {
        Optional<Proyecto> proyectoOpt = proyectoRepository.findById(dto.getIdProyecto());
        Optional<Institucion> institucionOpt = institucionRepository.findById(dto.getIdInstitucion());

        if (proyectoOpt.isPresent() && institucionOpt.isPresent()) {
            ProyectoInstitucion asignacion = new ProyectoInstitucion();
            asignacion.setProyecto(proyectoOpt.get());
            asignacion.setInstitucion(institucionOpt.get());
            asignacion.setFechaAsignacion(dto.getFechaAsignacion());

            ProyectoInstitucionId id = new ProyectoInstitucionId();
            id.setIdProyecto(dto.getIdProyecto());
            id.setIdInstitucion(dto.getIdInstitucion());

            asignacion.setId(id);

            proyectoInstitucionRepository.save(asignacion);
            return ResponseEntity.ok("Proyecto asignado a la institución exitosamente.");
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Proyecto o Institución no encontrado.");
        }
    }
}

