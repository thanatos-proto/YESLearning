package com.mowozy.Entity;

import javax.persistence.*;

/**
 * Created by moonwolfzy on 2017-12-12.
 */
@Entity
@Table(name = "fk_users_appearances", schema = "yes", catalog = "")
@IdClass(FkUsersAppearancesPK.class)
public class FkUsersAppearances {
    private int uId;
    private int aId;

    @Id
    @Column(name = "UId", nullable = false)
    public int getuId() {
        return uId;
    }

    public void setuId(int uId) {
        this.uId = uId;
    }

    @Id
    @Column(name = "AId", nullable = false)
    public int getaId() {
        return aId;
    }

    public void setaId(int aId) {
        this.aId = aId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FkUsersAppearances that = (FkUsersAppearances) o;

        if (uId != that.uId) return false;
        if (aId != that.aId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = uId;
        result = 31 * result + aId;
        return result;
    }
}
