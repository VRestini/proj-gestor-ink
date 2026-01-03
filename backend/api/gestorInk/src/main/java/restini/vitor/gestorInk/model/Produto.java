package restini.vitor.gestorInk.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

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
    @Column(name = "validade", nullable = false)
    private Boolean possuiValidade;
    @ManyToOne(fetch = FetchType.LAZY)
    @Column(name = "fkCategoria")
    private Categoria fkCategoria;

}
