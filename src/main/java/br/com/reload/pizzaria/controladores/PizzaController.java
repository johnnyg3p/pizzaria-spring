package br.com.reload.pizzaria.controladores;

import br.com.reload.pizzaria.modelos.repositorios.PizzaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Johnny on 04/06/2016.
 */

@Controller
@RequestMapping("/pizzas")
public class PizzaController {

    @Autowired private PizzaRepositorio pizzaRepositorio;

    @RequestMapping("/quantas")
    @ResponseBody
    public String quantasPizzas (){
        return "Atualmente há "+ pizzaRepositorio.count() + " Cadastradas";
    }
}
