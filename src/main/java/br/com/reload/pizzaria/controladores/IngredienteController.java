package br.com.reload.pizzaria.controladores;

import br.com.reload.pizzaria.modelos.entidades.Ingrediente;
import br.com.reload.pizzaria.modelos.repositorios.IngredienteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Johnny on 05/06/2016.
 */

@Controller
@RequestMapping("/ingrediente")
public class IngredienteController {

    @Autowired
    private IngredienteRepositorio ingredienteRepositorio;

    @RequestMapping(method = RequestMethod.GET)
    public String listarIngredientes(Model model) {
        Iterable<Ingrediente> ingredientes = ingredienteRepositorio.findAll();

        model.addAttribute("titulo", "Listagem de Ingredientes");
        model.addAttribute("ingredientes", ingredientes);
        return "ingrediente/listagem";
    }


}
