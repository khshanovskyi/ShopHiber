package entity;

import javax.persistence.*;

@Entity
@Table(name = "size_product_quantity", schema = "shop", catalog = "")
@IdClass(SizeProductQuantityEntityPK.class)
public class SizeProductQuantityEntity {
    private int productId;
    private int sizeId;
    private int quantity;

    @Id
    @Column(name = "product_id")
    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    @Id
    @Column(name = "size_id")
    public int getSizeId() {
        return sizeId;
    }

    public void setSizeId(int sizeId) {
        this.sizeId = sizeId;
    }

    @Basic
    @Column(name = "quantity")
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SizeProductQuantityEntity that = (SizeProductQuantityEntity) o;

        if (productId != that.productId) return false;
        if (sizeId != that.sizeId) return false;
        if (quantity != that.quantity) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = productId;
        result = 31 * result + sizeId;
        result = 31 * result + quantity;
        return result;
    }
}
