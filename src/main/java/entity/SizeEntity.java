package entity;

import javax.persistence.*;

@Entity
@Table(name = "size", schema = "shop", catalog = "")
public class SizeEntity {
    private int id;
    private double sizeUk;
    private double sizeEur;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "size_uk")
    public double getSizeUk() {
        return sizeUk;
    }

    public void setSizeUk(double sizeUk) {
        this.sizeUk = sizeUk;
    }

    @Basic
    @Column(name = "size_eur")
    public double getSizeEur() {
        return sizeEur;
    }

    public void setSizeEur(double sizeEur) {
        this.sizeEur = sizeEur;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SizeEntity that = (SizeEntity) o;

        if (id != that.id) return false;
        if (Double.compare(that.sizeUk, sizeUk) != 0) return false;
        if (Double.compare(that.sizeEur, sizeEur) != 0) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = id;
        temp = Double.doubleToLongBits(sizeUk);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(sizeEur);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
