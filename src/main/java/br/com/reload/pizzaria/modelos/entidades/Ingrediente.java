package br.com.reload.pizzaria.modelos.entidades;

import br.com.reload.pizzaria.modelos.enumeracoes.CategoriaDeIngrediente;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by Johnny on 05/06/2016.
 */
@Entity
public class Ingrediente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @NotNull
    @NotEmpty
    private String nome;
    @NotNull
    @Enumerated(EnumType.STRING)
    private CategoriaDeIngrediente categoria;

    public CategoriaDeIngrediente getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaDeIngrediente categoria) {
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((categoria == null) ? 0 : categoria.hashCode());
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Ingrediente other = (Ingrediente) obj;
        if (categoria != other.categoria)
            return false;
        if (nome == null) {
            if (other.nome != null)
                return false;
        } else if (!nome.equals(other.nome))
            return false;
        return true;
    }
}
