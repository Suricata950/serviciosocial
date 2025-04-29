package proyecto.ServicioSocial.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import proyecto.ServicioSocial.DTO.EstudianteConProyectosYInstitucionesDTO;
import proyecto.ServicioSocial.DTO.EstudianteDTO;
import proyecto.ServicioSocial.DTO.ProyectoAsignadoDTO;
import proyecto.ServicioSocial.repositories.EstudianteRepository;


import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/estudiantes")
public class EstudianteController {
    @Autowired
    private EstudianteRepository estudianteRepository;

    @GetMapping
    public List<EstudianteDTO> obtenerTodosLosEstudiantes(){
        return estudianteRepository.findAll().stream()
                .map(EstudianteDTO::new)
                .collect(Collectors.toList());
    }

    @GetMapping("/{id}/proyectos")
    public List<ProyectoAsignadoDTO> obtenerProyectosConFecha(@PathVariable int id){
        Estudiante estudiante = estudianteRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Estudiante no encontrado"));

        return estudiante.getProyectos().stream()
                .map(rel -> new ProyectoAsignadoDTO(
                        rel.getProyecto().getNombre_proyecto(),
                        rel.getFechaAsignacion()
                ))
                .collect(Collectors.toList());
    }

    @GetMapping("/proyectos")
    public List<EstudianteConProyectosYInstitucionesDTO> obtenerEstudiantesConProyectosYInstituciones() {
        return estudianteRepository.findAll().stream()
                .map(EstudianteConProyectosYInstitucionesDTO::new)
                .collect(Collectors.toList());
    }

    @PostMapping
    public Estudiante crearEstudiante(@RequestBody Estudiante estudiante) {
        return estudianteRepository.save(estudiante);
    }

}

