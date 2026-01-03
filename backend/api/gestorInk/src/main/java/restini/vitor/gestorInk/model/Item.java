package restini.vitor.gestorInk.model;

import jakarta.persistence.*;

import java.util.Date;

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
    @Column(name = "fkProduto")
    private Produto fkProduto;

}
