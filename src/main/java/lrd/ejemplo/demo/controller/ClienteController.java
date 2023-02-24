package lrd.ejemplo.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import lrd.ejemplo.models.Cliente;
import lrd.ejemplo.models.Vendedores;

@Controller
@RequestMapping("/cliente")
public class ClienteController {

    @GetMapping({ "/", "" })
    public String indexCliente(Model model) {
        Cliente cliente = new Cliente();

        model.addAttribute("titulo", "Perfil");
        model.addAttribute("cliente", cliente);

        cliente.setNombre("Santiago");
        cliente.setApellido("Hernandez");
        cliente.setEmail("santihernandez2501@gmail.com");
        cliente.setDocumento("1005263670");

        model.addAttribute("cuerpo", "perfil del cliente: ".concat(cliente.getNombre()));

        return "cliente/index";

    }

    @ModelAttribute("vendedores")
    public List<Vendedores> poblarVendedores() {
        List<Vendedores> vendedores = Arrays.asList(new Vendedores("Pepito", "Perez", "pepito@prueba.com"),
                new Vendedores("cosme", "fulanito", "cosme@prueba.com"));
        return vendedores;
    }

}
