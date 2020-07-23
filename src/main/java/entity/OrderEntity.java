package entity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "order", schema = "shop", catalog = "")
public class OrderEntity {
    private int id;
    private Timestamp datetime;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "datetime")
    public Timestamp getDatetime() {
        return datetime;
    }

    public void setDatetime(Timestamp datetime) {
        this.datetime = datetime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OrderEntity that = (OrderEntity) o;

        if (id != that.id) return false;
        if (datetime != null ? !datetime.equals(that.datetime) : that.datetime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (datetime != null ? datetime.hashCode() : 0);
        return result;
    }
}
