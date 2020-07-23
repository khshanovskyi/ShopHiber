package entity;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "category", schema = "shop")
@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class CategoryEntity {

    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "discount")
    private byte discount;

    @Column(name = "alias_name")
    private String aliasName;

    @OneToMany(mappedBy = "categoryEntity")
    private List<ProductEntity> productEntities = new ArrayList<ProductEntity>();
}

