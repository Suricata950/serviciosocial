package proyecto.ServicioSocial.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import proyecto.ServicioSocial.DTO.EstudianteAsignadoDTO;
import proyecto.ServicioSocial.DTO.InstitucionAsignadaDTO;
import proyecto.ServicioSocial.DTO.ProyectoDTO;
import proyecto.ServicioSocial.DTO.ProyectoRequestDTO;
import proyecto.ServicioSocial.entities.Proyecto;
import proyecto.ServicioSocial.repositories.ProyectoRepository;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/proyectos")
public class ProyectoController {

    @Autowired
    private ProyectoRepository proyectoRepository;

    @GetMapping
    public List<ProyectoDTO> obtenerTodosLosProyectos() {
        return proyectoRepository.findAll().stream()
                .map(ProyectoDTO::new)
                .collect(Collectors.toList());
    }

    @GetMapping("/{id}/estudiantes")
    public List<EstudianteAsignadoDTO> obtenerEstudiantesConFecha(@PathVariable int id) {
        Proyecto proyecto = proyectoRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Proyecto no encontrado"));

        return proyecto.getEstudiantes().stream()
                .map(rel -> new EstudianteAsignadoDTO(
                        rel.getEstudiante().getNombre(),
                        rel.getFechaAsignacion()
                ))
                .collect(Collectors.toList());
    }

    @GetMapping("/{id}/instituciones")
    public List<InstitucionAsignadaDTO> obtenerInstitucionesConFecha(@PathVariable int id) {
        Proyecto proyecto = proyectoRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Proyecto no encontrado"));

        return proyecto.getInstituciones().stream()
                .map(rel -> new InstitucionAsignadaDTO(
                        rel.getInstitucion().getNombre_institucion(),
                        rel.getFechaAsignacion()
                ))
                .collect(Collectors.toList());
    }

    @PostMapping
    public ProyectoDTO crearProyecto(@RequestBody ProyectoRequestDTO dto) {
        Proyecto proyecto = new Proyecto();
        proyecto.setNombre_proyecto(dto.getNombre_proyecto());
        proyecto.setDescripcion(dto.getDescripcion());
        proyecto.setFecha_inicio(dto.getFecha_inicio());
        proyecto.setFecha_fin(dto.getFecha_fin());

        Proyecto guardado = proyectoRepository.save(proyecto);
        return new ProyectoDTO(guardado);
    }
}