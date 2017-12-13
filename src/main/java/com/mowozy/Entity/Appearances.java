package com.mowozy.Entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by moonwolfzy on 2017-12-12.
 */
@Entity
public class Appearances {
    private Integer aId;
    private Integer need;

    @Id
    @Column(name = "AId", nullable = false)
    public int getaId() {
        return aId;
    }

    public void setaId(int aId) {
        this.aId = aId;
    }

    @Basic
    @Column(name = "Need", nullable = true)
    public Integer getNeed() {
        return need;
    }

    public void setNeed(Integer need) {
        this.need = need;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Appearances that = (Appearances) o;

        if (aId != that.aId) return false;
        if (need != null ? !need.equals(that.need) : that.need != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = aId;
        result = 31 * result + (need != null ? need.hashCode() : 0);
        return result;
    }
}
