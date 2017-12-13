package com.mowozy.Entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by moonwolfzy on 2017-12-12.
 */
public class FkUsersCoursesPK implements Serializable {
    private int cId;
    private int uId;

    @Column(name = "CId", nullable = false)
    @Id
    public int getcId() {
        return cId;
    }

    public void setcId(int cId) {
        this.cId = cId;
    }

    @Column(name = "UId", nullable = false)
    @Id
    public int getuId() {
        return uId;
    }

    public void setuId(int uId) {
        this.uId = uId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FkUsersCoursesPK that = (FkUsersCoursesPK) o;

        if (cId != that.cId) return false;
        if (uId != that.uId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = cId;
        result = 31 * result + uId;
        return result;
    }
}
