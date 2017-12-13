package com.mowozy.Entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by moonwolfzy on 2017-12-13.
 */
@Entity
public class Userscourses {
    private int ucId;
    private Integer uId;
    private Integer cId;

    @Id
    @Column(name = "UCId", nullable = false)
    public int getUcId() {
        return ucId;
    }

    public void setUcId(int ucId) {
        this.ucId = ucId;
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
    @Column(name = "CId", nullable = true)
    public Integer getcId() {
        return cId;
    }

    public void setcId(Integer cId) {
        this.cId = cId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Userscourses that = (Userscourses) o;

        if (ucId != that.ucId) return false;
        if (uId != null ? !uId.equals(that.uId) : that.uId != null) return false;
        if (cId != null ? !cId.equals(that.cId) : that.cId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = ucId;
        result = 31 * result + (uId != null ? uId.hashCode() : 0);
        result = 31 * result + (cId != null ? cId.hashCode() : 0);
        return result;
    }
}
