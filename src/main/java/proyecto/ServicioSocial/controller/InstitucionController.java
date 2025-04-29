package proyecto.ServicioSocial.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import proyecto.ServicioSocial.DTO.InstitucionDTO;
import proyecto.ServicioSocial.DTO.InstitucionRequestDTO;
import proyecto.ServicioSocial.entities.Institucion;
import proyecto.ServicioSocial.repositories.InstitucionRepository;

import java.util.List;

@RestController
@RequestMapping("/instituciones")
public class InstitucionController {

    @Autowired
    private InstitucionRepository institucionRepository;

    @GetMapping
    public List<Institucion> obtenerTodasLasInstituciones(){
        return institucionRepository.findAll();
    }

    @PostMapping
    public InstitucionDTO crearInstitucion(@RequestBody InstitucionRequestDTO dto) {
        Institucion institucion = new Institucion();
        institucion.setNombre_institucion(dto.getNombre_institucion());
        institucion.setUbicacion(dto.getUbicacion());

        Institucion guardada = institucionRepository.save(institucion);
        return new InstitucionDTO(guardada);
    }
}