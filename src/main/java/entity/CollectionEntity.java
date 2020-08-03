package entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Entity
@Table(name = "collection", schema = "shop")
@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CollectionEntity implements Serializable {

    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "discount")
    private short discount = 0;

    @OneToMany(mappedBy = "collectionEntity")
    private Collection<ProductEntity> productEntities;
}
