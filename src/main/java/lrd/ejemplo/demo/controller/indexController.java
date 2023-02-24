package lrd.ejemplo.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    @GetMapping({ "/", "", "/index" })
    public String index(Model model) {
        model.addAttribute("titulo", "Hola spring boot");
        return "index";
    }

    @GetMapping("/contactenos")
    public String contactenos(Model model) {
        model.addAttribute("contactar", "Ahora nos puedes contactar");
        return "contactar";
    }
}