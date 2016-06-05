package br.com.reload.pizzaria.configuracoes;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * Created by Johnny on 04/06/2016.
 */
@EnableWebMvc
@Configuration
@ComponentScan(basePackages = "br.com.reload.pizzaria")
public class ConfiguracaoWeb extends WebMvcConfigurerAdapter {


}
