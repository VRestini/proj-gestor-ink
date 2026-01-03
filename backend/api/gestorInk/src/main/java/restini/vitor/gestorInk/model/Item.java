package restini.vitor.gestorInk.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "tbl_item")
public class Item {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "dtEntrada", nullable = false)
    private Date dtEntrada;
    @Column(name = "dtSaida", nullable = false)
    private Date dtSaida;
    @Column(name = "dtEntrada")
    private Date dtValidade;
    @Column(name = "valor", nullable = false)
    private Float valor;
    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn(name = "fkProduto")
    private Produto produto;

    public Item(Integer id, Date dtEntrada, Date dtSaida, Date dtValidade, Float valor) {
        this.id = id;
        this.dtEntrada = dtEntrada;
        this.dtSaida = dtSaida;
        this.dtValidade = dtValidade;
        this.valor = valor;
    }
}
