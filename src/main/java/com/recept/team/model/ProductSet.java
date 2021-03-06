package com.recept.team.model;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Setter
@Getter
@EqualsAndHashCode
@NoArgsConstructor
@Entity
@IdClass(ProductSet.ProductSetPK.class)
@Table(name = "product_set")
public class ProductSet {
    @Id
    @ManyToOne
    @JoinColumn(name = "menu_id")
    private Menu menu;
    @Id
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;
    private Integer quantity;
    @Enumerated(EnumType.STRING)
    private Unit unit;

    public class ProductSetPK implements Serializable {
        private Integer menu;
        private Integer product;
    }
}
