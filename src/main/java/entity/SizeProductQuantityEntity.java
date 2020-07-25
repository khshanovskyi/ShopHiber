package entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Entity
@Table(name = "size_product_quantity", schema = "shop")
@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class SizeProductQuantityEntity implements Serializable {

    @Id
    @Column(name = "product_id")
    private int productId;

    @Id
    @Column(name = "size_id")
    private int sizeId;

    @Column(name = "quantity")
    private int quantity;

    @ManyToMany(mappedBy = "productSizeEntities")
    private Collection<ProductEntity> productEntities;

    @ManyToMany(mappedBy = "sizeProductEntities")
    private Collection<SizeEntity> sizeEntities;
}
