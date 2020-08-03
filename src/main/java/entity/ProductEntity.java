package entity;

import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Collection;

@Entity
@Table(name = "product", schema = "shop")
@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductEntity {

    @Id
    @Column(name = "article")
    private int article;

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

    @ManyToOne
    @JoinColumn(name = "collection_id")
    private CollectionEntity collectionEntity;

    @Column(name = "price")
    private BigDecimal price;

    @Column(name = "discount")
    private short discount;

    @ManyToMany
    private Collection<OrderProductEntity> productOrderEntities;

    @ManyToMany
    private Collection<SizeProductQuantityEntity> productSizeEntities;
}
