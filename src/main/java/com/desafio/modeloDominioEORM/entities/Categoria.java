package com.desafio.modeloDominioEORM.entities;
import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="tb_categoria")
public class Categoria {

    //attributes
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(columnDefinition = "TEXT")
    private String descricao;

    //relationships
    @OneToMany(mappedBy = "categoria")
    private List<Atividade> atividades = new ArrayList<>();

    //constructors
    public Categoria() {

    }

    public Categoria(Integer id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    //get and set
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    //collection method get
    public List<Atividade> getAtividades() {
        return atividades;
    }
}
