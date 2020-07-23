package entity;

import javax.persistence.*;

@Entity
@Table(name = "customer", schema = "shop", catalog = "")
@IdClass(CustomerEntityPK.class)
public class CustomerEntity {
    private long personalCardId;
    private long phoneNumber;
    private String name;
    private short disount;

    @Id
    @Column(name = "personal_card_id")
    public long getPersonalCardId() {
        return personalCardId;
    }

    public void setPersonalCardId(long personalCardId) {
        this.personalCardId = personalCardId;
    }

    @Id
    @Column(name = "phone_number")
    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "disount")
    public short getDisount() {
        return disount;
    }

    public void setDisount(short disount) {
        this.disount = disount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CustomerEntity that = (CustomerEntity) o;

        if (personalCardId != that.personalCardId) return false;
        if (phoneNumber != that.phoneNumber) return false;
        if (disount != that.disount) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (personalCardId ^ (personalCardId >>> 32));
        result = 31 * result + (int) (phoneNumber ^ (phoneNumber >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (int) disount;
        return result;
    }
}
