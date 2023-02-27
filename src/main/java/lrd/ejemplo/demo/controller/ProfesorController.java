package lrd.ejemplo.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import lrd.ejemplo.demo.models.Estudiante;
import lrd.ejemplo.demo.models.Profesor;

@Controller
@RequestMapping("/profesor")
public class ProfesorController {

    @GetMapping({ "/", "" })
    public String indexProfesor(Model model) {

        Profesor profesor = new Profesor("1F23DJ", "Ingeniero de Software", "Sebastian", "Grisales", 26,
                "sebastiangrisales23@gmail.com");

        model.addAttribute("profesor", profesor);

        return "profesor/index";
    }

    @ModelAttribute ("estudiantes")
    public List<Estudiante> llenarEstudiantes(){

        Estudiante estudiante1 = new Estudiante("23IJD", "Sicario", "Julian", "Arango", 19, "Julaincito@fm2.com");
        Estudiante estudiante2 = new Estudiante("23IJD", "Narcotraficante", "Juan", "Toro", 22, "juanchito@fm2.com");
        Estudiante estudiante3 = new Estudiante("23IJD", "Jefe del cartel", "Pablo", "Escobar", 54, "pablitofresa@fm2.com");

        List <Estudiante> estudiantes = Arrays.asList(estudiante1, estudiante2, estudiante3);
        
        return estudiantes;
    }
}
