package restini.vitor.gestorInk.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "tbl_categoria")
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "nome", nullable = false,length = 50)
    private String nome;

    public Categoria(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
    }
}
