package br.com.reload.pizzaria.controladores;

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

    public PizzaController(){
        System.out.print("Criou a pizza controller");
    }

    @RequestMapping("/ola/{nome}")
    @ResponseBody
    public String ola (@PathVariable String nome){
        return "olá " +nome;
    }
}
