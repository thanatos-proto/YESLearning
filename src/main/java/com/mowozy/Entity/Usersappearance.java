package com.mowozy.Entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by moonwolfzy on 2017-12-25.
 */
@Entity
public class Usersappearance {
    private int uaId;
    private Integer uId;
    private Integer aId;

    @Id
    @Column(name = "UAId", nullable = false)
    public int getUaId() {
        return uaId;
    }

    public void setUaId(int uaId) {
        this.uaId = uaId;
    }

    @Basic
    @Column(name = "UId", nullable = true)
    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    @Basic
    @Column(name = "AId", nullable = true)
    public Integer getaId() {
        return aId;
    }

    public void setaId(Integer aId) {
        this.aId = aId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Usersappearance that = (Usersappearance) o;

        if (uaId != that.uaId) return false;
        if (uId != null ? !uId.equals(that.uId) : that.uId != null) return false;
        if (aId != null ? !aId.equals(that.aId) : that.aId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = uaId;
        result = 31 * result + (uId != null ? uId.hashCode() : 0);
        result = 31 * result + (aId != null ? aId.hashCode() : 0);
        return result;
    }
}
