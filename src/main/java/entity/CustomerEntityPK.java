package entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

public class CustomerEntityPK implements Serializable {
    private long personalCardId;
    private long phoneNumber;

    @Column(name = "personal_card_id")
    @Id
    public long getPersonalCardId() {
        return personalCardId;
    }

    public void setPersonalCardId(long personalCardId) {
        this.personalCardId = personalCardId;
    }

    @Column(name = "phone_number")
    @Id
    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CustomerEntityPK that = (CustomerEntityPK) o;

        if (personalCardId != that.personalCardId) return false;
        if (phoneNumber != that.phoneNumber) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (personalCardId ^ (personalCardId >>> 32));
        result = 31 * result + (int) (phoneNumber ^ (phoneNumber >>> 32));
        return result;
    }
}
