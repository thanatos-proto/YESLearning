package com.mowozy.Entity;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by moonwolfzy on 2017-12-13.
 */
@Entity
@Table(name = "trans")
public class Trans {
    private int tId;
    private Integer uId;
    private Timestamp tStartDate;
    private Integer tuId;
    private Integer tPrice;
    private Timestamp tEndDate;
    private Integer tState;

    @Id
    @Column(name = "TId", nullable = false)
    public int gettId() {
        return tId;
    }

    public void settId(int tId) {
        this.tId = tId;
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
    @Column(name = "TStartDate", nullable = true)
    public Timestamp gettStartDate() {
        return tStartDate;
    }

    public void settStartDate(Timestamp tStartDate) {
        this.tStartDate = tStartDate;
    }

    @Basic
    @Column(name = "TUId", nullable = true)
    public Integer getTuId() {
        return tuId;
    }

    public void setTuId(Integer tuId) {
        this.tuId = tuId;
    }

    @Basic
    @Column(name = "TPrice", nullable = true)
    public Integer gettPrice() {
        return tPrice;
    }

    public void settPrice(Integer tPrice) {
        this.tPrice = tPrice;
    }

    @Basic
    @Column(name = "TEndDate", nullable = true)
    public Timestamp gettEndDate() {
        return tEndDate;
    }

    public void settEndDate(Timestamp tEndDate) {
        this.tEndDate = tEndDate;
    }

    @Basic
    @Column(name = "TState", nullable = true)
    public Integer gettState() {
        return tState;
    }

    public void settState(Integer tState) {
        this.tState = tState;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Trans trans = (Trans) o;

        if (tId != trans.tId) return false;
        if (uId != null ? !uId.equals(trans.uId) : trans.uId != null) return false;
        if (tStartDate != null ? !tStartDate.equals(trans.tStartDate) : trans.tStartDate != null) return false;
        if (tuId != null ? !tuId.equals(trans.tuId) : trans.tuId != null) return false;
        if (tPrice != null ? !tPrice.equals(trans.tPrice) : trans.tPrice != null) return false;
        if (tEndDate != null ? !tEndDate.equals(trans.tEndDate) : trans.tEndDate != null) return false;
        if (tState != null ? !tState.equals(trans.tState) : trans.tState != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = tId;
        result = 31 * result + (uId != null ? uId.hashCode() : 0);
        result = 31 * result + (tStartDate != null ? tStartDate.hashCode() : 0);
        result = 31 * result + (tuId != null ? tuId.hashCode() : 0);
        result = 31 * result + (tPrice != null ? tPrice.hashCode() : 0);
        result = 31 * result + (tEndDate != null ? tEndDate.hashCode() : 0);
        result = 31 * result + (tState != null ? tState.hashCode() : 0);
        return result;
    }
}
