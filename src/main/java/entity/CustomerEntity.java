package entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Entity
@Table(name = "customer", schema = "shop")
@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CustomerEntity implements Serializable {

    @Id
    @Column(name = "personal_card_id")
    private long personalCardId;

    @Column(name = "phone_number")
    private long phoneNumber;

    @Column(name = "name")
    private String name;

    @Column(name = "discount")
    private short discount;

    @OneToMany(mappedBy = "customerEntity")
    private Collection<OrderEntity> orderEntity;

}
