package entity.view;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Table(name = "full_products_info", schema = "shop")
@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class FullProductsInfoView implements Serializable {

    @Id
    @Column(name = "article")
    private int article;

    @Column(name = "product_name")
    private String productName;

    @Column(name = "brend")
    private String brend;

    @Column(name = "brend_discount")
    private short brendDiscount;

    @Column(name = "type")
    private String type;

    @Column(name = "type_discount")
    private short typeDiscount;

    @Column(name = "category")
    private String category;

    @Column(name = "category_discount")
    private short categoryDiscount;

    @Column(name = "collection")
    private String collection;

    @Column(name = "collection_discount")
    private short collectionDiscount;

    @Column(name = "size_uk")
    private double sizeUk;

    @Column(name = "size_eur")
    private double sizeEur;

    @Column(name = "quantity")
    private int quantity;

    @Column(name = "price")
    private BigDecimal price;

    @Column(name = "product_discount")
    private short productDiscount;
}
