package br.com.reload.pizzaria.modelos.repositorios;

import br.com.reload.pizzaria.modelos.entidades.Pizza;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Johnny on 05/06/2016.
 */

@Repository
public interface PizzaRepositorio extends CrudRepository<Pizza, Long> {

}
