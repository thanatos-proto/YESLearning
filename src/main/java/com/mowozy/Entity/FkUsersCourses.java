package com.mowozy.Entity;

import javax.persistence.*;

/**
 * Created by moonwolfzy on 2017-12-12.
 */
@Entity
@Table(name = "fk_users_courses", schema = "yes", catalog = "")
@IdClass(FkUsersCoursesPK.class)
public class FkUsersCourses {
    private int cId;
    private int uId;

    @Id
    @Column(name = "CId", nullable = false)
    public int getcId() {
        return cId;
    }

    public void setcId(int cId) {
        this.cId = cId;
    }

    @Id
    @Column(name = "UId", nullable = false)
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

        FkUsersCourses that = (FkUsersCourses) o;

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
