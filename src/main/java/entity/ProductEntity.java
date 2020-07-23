package entity;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "product", schema = "shop")
@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class ProductEntity {

    @Id
    @Column(name = "article")
    private int article;

    @Basic
    @Column(name = "product_name")
    private String productName;

    @ManyToOne
    @JoinColumn(name = "brend_id")
    private BrendEntity brendEntity;

    @ManyToOne
    @JoinColumn(name = "type_id")
    private TypeEntity typeEntity;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private CategoryEntity categoryEntity;

    @Basic
    @Column(name = "price")
    private BigDecimal price;
}
