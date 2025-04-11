package proyecto.ServicioSocial.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class testController {
    @GetMapping
    public String testEndpoint(){
        return "La prueba funciona...";
    }
}
