package com.mowozy.Entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by moonwolfzy on 2017-12-18.
 */
@Entity
public class Users {
    private int uId;
    private String password;
    private Integer grade;
    private Integer authority;
    private Integer uaId;
    private String email;
    private String uName;

    @Id
    @Column(name = "UId", nullable = false)
    public int getuId() {
        return uId;
    }

    public void setuId(int uId) {
        this.uId = uId;
    }

    @Basic
    @Column(name = "Password", nullable = true, length = -1)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "Grade", nullable = true)
    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    @Basic
    @Column(name = "Authority", nullable = true)
    public Integer getAuthority() {
        return authority;
    }

    public void setAuthority(Integer authority) {
        this.authority = authority;
    }

    @Basic
    @Column(name = "UAId", nullable = true)
    public Integer getUaId() {
        return uaId;
    }

    public void setUaId(Integer uaId) {
        this.uaId = uaId;
    }

    @Basic
    @Column(name = "Email", nullable = true, length = -1)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "UName", nullable = true, length = -1)
    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Users users = (Users) o;

        if (uId != users.uId) return false;
        if (password != null ? !password.equals(users.password) : users.password != null) return false;
        if (grade != null ? !grade.equals(users.grade) : users.grade != null) return false;
        if (authority != null ? !authority.equals(users.authority) : users.authority != null) return false;
        if (uaId != null ? !uaId.equals(users.uaId) : users.uaId != null) return false;
        if (email != null ? !email.equals(users.email) : users.email != null) return false;
        if (uName != null ? !uName.equals(users.uName) : users.uName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = uId;
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (grade != null ? grade.hashCode() : 0);
        result = 31 * result + (authority != null ? authority.hashCode() : 0);
        result = 31 * result + (uaId != null ? uaId.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (uName != null ? uName.hashCode() : 0);
        return result;
    }
}
