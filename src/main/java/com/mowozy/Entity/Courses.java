package com.mowozy.Entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;

/**
 * Created by moonwolfzy on 2017-12-18.
 */
@Entity
public class Courses {
    private int cId;
    private Date cStartDate;
    private Date cEndDate;
    private String cName;
    private Double cPrice;
    private String cImage;
    private String cPath;

    @Id
    @Column(name = "CId", nullable = false)
    public int getcId() {
        return cId;
    }

    public void setcId(int cId) {
        this.cId = cId;
    }

    @Basic
    @Column(name = "CStartDate", nullable = true)
    public Date getcStartDate() {
        return cStartDate;
    }

    public void setcStartDate(Date cStartDate) {
        this.cStartDate = cStartDate;
    }

    @Basic
    @Column(name = "CEndDate", nullable = true)
    public Date getcEndDate() {
        return cEndDate;
    }

    public void setcEndDate(Date cEndDate) {
        this.cEndDate = cEndDate;
    }

    @Basic
    @Column(name = "CName", nullable = true, length = -1)
    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    @Basic
    @Column(name = "CPrice", nullable = true, precision = 0)
    public Double getcPrice() {
        return cPrice;
    }

    public void setcPrice(Double cPrice) {
        this.cPrice = cPrice;
    }

    @Basic
    @Column(name = "CImage", nullable = true, length = -1)
    public String getcImage() {
        return cImage;
    }

    public void setcImage(String cImage) {
        this.cImage = cImage;
    }

    @Basic
    @Column(name = "CPath", nullable = true, length = -1)
    public String getcPath() {
        return cPath;
    }

    public void setcPath(String cPath) {
        this.cPath = cPath;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Courses courses = (Courses) o;

        if (cId != courses.cId) return false;
        if (cStartDate != null ? !cStartDate.equals(courses.cStartDate) : courses.cStartDate != null) return false;
        if (cEndDate != null ? !cEndDate.equals(courses.cEndDate) : courses.cEndDate != null) return false;
        if (cName != null ? !cName.equals(courses.cName) : courses.cName != null) return false;
        if (cPrice != null ? !cPrice.equals(courses.cPrice) : courses.cPrice != null) return false;
        if (cImage != null ? !cImage.equals(courses.cImage) : courses.cImage != null) return false;
        if (cPath != null ? !cPath.equals(courses.cPath) : courses.cPath != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = cId;
        result = 31 * result + (cStartDate != null ? cStartDate.hashCode() : 0);
        result = 31 * result + (cEndDate != null ? cEndDate.hashCode() : 0);
        result = 31 * result + (cName != null ? cName.hashCode() : 0);
        result = 31 * result + (cPrice != null ? cPrice.hashCode() : 0);
        result = 31 * result + (cImage != null ? cImage.hashCode() : 0);
        result = 31 * result + (cPath != null ? cPath.hashCode() : 0);
        return result;
    }
}
