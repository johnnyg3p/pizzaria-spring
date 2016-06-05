package br.com.reload.pizzaria.modelos.entidades;

import br.com.reload.pizzaria.modelos.enumeracoes.CategoriaDePizza;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Set;

/**
 * Created by Johnny on 05/06/2016.
 */

@Entity
public class Pizza {

    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @NotNull
    @NotEmpty
    private String nome;
    @NotNull
    private Double preco;
    @NotNull
    @Enumerated(EnumType.STRING)
    private CategoriaDePizza categoria;
    @ManyToMany
    private Set<Ingrediente> ingredientes;



    public long getId() {

        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public CategoriaDePizza getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaDePizza categoria) {
        this.categoria = categoria;
    }

    public Set<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(Set<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pizza)) return false;

        Pizza pizza = (Pizza) o;

        if (getId() != pizza.getId()) return false;
        if (!getNome().equals(pizza.getNome())) return false;
        return getCategoria() == pizza.getCategoria();

    }

    @Override
    public int hashCode() {
        int result = (int) (getId() ^ (getId() >>> 32));
        result = 31 * result + getNome().hashCode();
        result = 31 * result + getCategoria().hashCode();
        return result;
    }
}
