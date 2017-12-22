package com.mowozy.Entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

/**
 * Created by moonwolfzy on 2017-12-18.
 */
@Entity
public class Exams {
    private int eId;
    private Integer q1;
    private Integer q2;
    private Integer q3;
    private Integer q4;
    private Integer q5;
    private Integer q6;
    private Integer q7;
    private Integer q8;
    private Integer q9;
    private Integer q10;
    private Integer total;
    private Timestamp eStartDate;
    private Timestamp eEndDate;

    @Id
    @Column(name = "EId", nullable = false)
    public int geteId() {
        return eId;
    }

    public void seteId(int eId) {
        this.eId = eId;
    }

    @Basic
    @Column(name = "Q1", nullable = true)
    public Integer getQ1() {
        return q1;
    }

    public void setQ1(Integer q1) {
        this.q1 = q1;
    }

    @Basic
    @Column(name = "Q2", nullable = true)
    public Integer getQ2() {
        return q2;
    }

    public void setQ2(Integer q2) {
        this.q2 = q2;
    }

    @Basic
    @Column(name = "Q3", nullable = true)
    public Integer getQ3() {
        return q3;
    }

    public void setQ3(Integer q3) {
        this.q3 = q3;
    }

    @Basic
    @Column(name = "Q4", nullable = true)
    public Integer getQ4() {
        return q4;
    }

    public void setQ4(Integer q4) {
        this.q4 = q4;
    }

    @Basic
    @Column(name = "Q5", nullable = true)
    public Integer getQ5() {
        return q5;
    }

    public void setQ5(Integer q5) {
        this.q5 = q5;
    }

    @Basic
    @Column(name = "Q6", nullable = true)
    public Integer getQ6() {
        return q6;
    }

    public void setQ6(Integer q6) {
        this.q6 = q6;
    }

    @Basic
    @Column(name = "Q7", nullable = true)
    public Integer getQ7() {
        return q7;
    }

    public void setQ7(Integer q7) {
        this.q7 = q7;
    }

    @Basic
    @Column(name = "Q8", nullable = true)
    public Integer getQ8() {
        return q8;
    }

    public void setQ8(Integer q8) {
        this.q8 = q8;
    }

    @Basic
    @Column(name = "Q9", nullable = true)
    public Integer getQ9() {
        return q9;
    }

    public void setQ9(Integer q9) {
        this.q9 = q9;
    }

    @Basic
    @Column(name = "Q10", nullable = true)
    public Integer getQ10() {
        return q10;
    }

    public void setQ10(Integer q10) {
        this.q10 = q10;
    }

    @Basic
    @Column(name = "Total", nullable = true)
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    @Basic
    @Column(name = "EStartDate", nullable = true)
    public Timestamp geteStartDate() {
        return eStartDate;
    }

    public void seteStartDate(Timestamp eStartDate) {
        this.eStartDate = eStartDate;
    }

    @Basic
    @Column(name = "EEndDate", nullable = true)
    public Timestamp geteEndDate() {
        return eEndDate;
    }

    public void seteEndDate(Timestamp eEndDate) {
        this.eEndDate = eEndDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Exams exams = (Exams) o;

        if (eId != exams.eId) return false;
        if (q1 != null ? !q1.equals(exams.q1) : exams.q1 != null) return false;
        if (q2 != null ? !q2.equals(exams.q2) : exams.q2 != null) return false;
        if (q3 != null ? !q3.equals(exams.q3) : exams.q3 != null) return false;
        if (q4 != null ? !q4.equals(exams.q4) : exams.q4 != null) return false;
        if (q5 != null ? !q5.equals(exams.q5) : exams.q5 != null) return false;
        if (q6 != null ? !q6.equals(exams.q6) : exams.q6 != null) return false;
        if (q7 != null ? !q7.equals(exams.q7) : exams.q7 != null) return false;
        if (q8 != null ? !q8.equals(exams.q8) : exams.q8 != null) return false;
        if (q9 != null ? !q9.equals(exams.q9) : exams.q9 != null) return false;
        if (q10 != null ? !q10.equals(exams.q10) : exams.q10 != null) return false;
        if (total != null ? !total.equals(exams.total) : exams.total != null) return false;
        if (eStartDate != null ? !eStartDate.equals(exams.eStartDate) : exams.eStartDate != null) return false;
        if (eEndDate != null ? !eEndDate.equals(exams.eEndDate) : exams.eEndDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = eId;
        result = 31 * result + (q1 != null ? q1.hashCode() : 0);
        result = 31 * result + (q2 != null ? q2.hashCode() : 0);
        result = 31 * result + (q3 != null ? q3.hashCode() : 0);
        result = 31 * result + (q4 != null ? q4.hashCode() : 0);
        result = 31 * result + (q5 != null ? q5.hashCode() : 0);
        result = 31 * result + (q6 != null ? q6.hashCode() : 0);
        result = 31 * result + (q7 != null ? q7.hashCode() : 0);
        result = 31 * result + (q8 != null ? q8.hashCode() : 0);
        result = 31 * result + (q9 != null ? q9.hashCode() : 0);
        result = 31 * result + (q10 != null ? q10.hashCode() : 0);
        result = 31 * result + (total != null ? total.hashCode() : 0);
        result = 31 * result + (eStartDate != null ? eStartDate.hashCode() : 0);
        result = 31 * result + (eEndDate != null ? eEndDate.hashCode() : 0);
        return result;
    }
}
