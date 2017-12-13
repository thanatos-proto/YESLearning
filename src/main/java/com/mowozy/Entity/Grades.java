package com.mowozy.Entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

/**
 * Created by moonwolfzy on 2017-12-12.
 */
@Entity
public class Grades {
    private int gId;
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
        if (gDate != null ? !gDate.equals(grades.gDate) : grades.gDate != null) return false;
        if (grade != null ? !grade.equals(grades.grade) : grades.grade != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = gId;
        result = 31 * result + (gDate != null ? gDate.hashCode() : 0);
        result = 31 * result + (grade != null ? grade.hashCode() : 0);
        return result;
    }
}
