package proyecto.ServicioSocial.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import proyecto.ServicioSocial.model.EstudianteProyecto;
import proyecto.ServicioSocial.repositories.EstudianteProyectoRepository;

@RestController
@RequestMapping("/estudiante-proyecto")
public class EstudianteProyectoController {

    @Autowired
    private EstudianteProyectoRepository estudianteProyectoRepository;



}
