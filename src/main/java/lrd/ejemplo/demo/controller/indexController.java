package lrd.ejemplo.demo.controller;
package lrd.ejemplo.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class indexController {
    @GetMapping({ "/", "", "/index" })
    public String index(Model model) {
        model.addAttribute("titulo", "Hola spring boot");
        return "index";
    }

    @GetMapping("/contactanos")
    public String contactenos(Model model) {
        model.addAttribute("Contactar", "Ahora nos puedes contactar");
        return "contactar";
    }
}
