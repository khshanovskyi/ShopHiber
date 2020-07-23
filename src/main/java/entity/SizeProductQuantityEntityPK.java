package entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class SizeProductQuantityEntityPK implements Serializable {
    private int productId;
    private int sizeId;

    @Column(name = "product_id")
    @Id
    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    @Column(name = "size_id")
    @Id
    public int getSizeId() {
        return sizeId;
    }

    public void setSizeId(int sizeId) {
        this.sizeId = sizeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SizeProductQuantityEntityPK that = (SizeProductQuantityEntityPK) o;

        if (productId != that.productId) return false;
        if (sizeId != that.sizeId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = productId;
        result = 31 * result + sizeId;
        return result;
    }
}
