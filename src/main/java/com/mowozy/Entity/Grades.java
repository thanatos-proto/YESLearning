package com.mowozy.Entity;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by moonwolfzy on 2017-12-13.
 */
@Entity
@Table(name = "grades")
public class Grades {
    private int gId;
    private Integer uId;
    private Integer eId;
    private Timestamp gDate;
    private Integer grade;

    @Id
    @Column(name = "GId", nullable = false)
    public int getgId() {
        return gId;
    }

    public void setgId(int gId) {
        this.gId = gId;
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
    @Column(name = "EId", nullable = true)
    public Integer geteId() {
        return eId;
    }

    public void seteId(Integer eId) {
        this.eId = eId;
    }

    @Basic
    @Column(name = "GDate", nullable = true)
    public Timestamp getgDate() {
        return gDate;
    }

    public void setgDate(Timestamp gDate) {
        this.gDate = gDate;
    }

    @Basic
    @Column(name = "Grade", nullable = true)
    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Grades grades = (Grades) o;

        if (gId != grades.gId) return false;
        if (uId != null ? !uId.equals(grades.uId) : grades.uId != null) return false;
        if (eId != null ? !eId.equals(grades.eId) : grades.eId != null) return false;
        if (gDate != null ? !gDate.equals(grades.gDate) : grades.gDate != null) return false;
        if (grade != null ? !grade.equals(grades.grade) : grades.grade != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = gId;
        result = 31 * result + (uId != null ? uId.hashCode() : 0);
        result = 31 * result + (eId != null ? eId.hashCode() : 0);
        result = 31 * result + (gDate != null ? gDate.hashCode() : 0);
        result = 31 * result + (grade != null ? grade.hashCode() : 0);
        return result;
    }
}
