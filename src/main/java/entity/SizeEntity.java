package entity;

import lombok.*;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "size", schema = "shop")
@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class SizeEntity {

    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "size_uk")
    private double sizeUk;

    @Column(name = "size_eur")
    private double sizeEur;

    @ManyToMany
    private Collection<SizeProductQuantityEntity> sizeProductEntities;
}
