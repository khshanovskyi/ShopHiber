package entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Entity
@Table(name = "order_product", schema = "shop")
@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class OrderProductEntity implements Serializable {

    @Id
    @Column(name = "order_id")
    private int orderId;

    @Id
    @Column(name = "product_id")
    private int productId;

    @Column(name = "amount")
    private int amount;

    @ManyToMany(mappedBy = "orderProductEntities")
    private Collection<OrderEntity> orderEntities;

    @ManyToMany(mappedBy = "productOrderEntities")
    private Collection<ProductEntity> productEntities;
}
