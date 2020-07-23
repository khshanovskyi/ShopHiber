package entity;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "all_products", schema = "shop")
@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class AllProductsEntity {

    @Id
    @Column(name = "article")

    private int article;

    @Column(name = "product_name")
    private String productName;

    @Column(name = "category")
    private String category;

    @Column(name = "type")
    private String type;

    @Column(name = "brend")
    private String brend;

    @Column(name = "price")
    private BigDecimal price;
}
