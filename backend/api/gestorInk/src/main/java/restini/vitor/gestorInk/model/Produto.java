package restini.vitor.gestorInk.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "tbl_produto")
public class Produto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "nome", nullable = false, length = 60)
    private String nome;
    @Column(name = "descricao")
    private String descricao;
    @Column(name = "se_validade", nullable = false)
    private Boolean possuiValidade;
    @Column(name = "se_ativo", nullable = false)
    private Boolean estaAtivo;
    @Column(name = "dt_criacao", nullable = false)
    private Date dtCriacao;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "fk_categoria")
    private Categoria categoria;

    @OneToMany(mappedBy = "produto",cascade = CascadeType.ALL)
    private List<Item> itens = new ArrayList<>();

    public Produto(Integer id, String nome, String descricao, Boolean possuiValidade) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.possuiValidade = possuiValidade;
    }


}
