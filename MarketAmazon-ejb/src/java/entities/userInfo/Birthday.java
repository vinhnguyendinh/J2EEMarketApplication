/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entities.userInfo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author vinhnguyen
 */
@Entity
@Table(name = "Birthday")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Birthday.findAll", query = "SELECT b FROM Birthday b"),
    @NamedQuery(name = "Birthday.findById", query = "SELECT b FROM Birthday b WHERE b.id = :id"),
    @NamedQuery(name = "Birthday.findByDay", query = "SELECT b FROM Birthday b WHERE b.day = :day"),
    @NamedQuery(name = "Birthday.findByMonth", query = "SELECT b FROM Birthday b WHERE b.month = :month"),
    @NamedQuery(name = "Birthday.findByYear", query = "SELECT b FROM Birthday b WHERE b.year = :year")})
public class Birthday implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Day")
    private int day;
    @Size(max = 255)
    @Column(name = "Month")
    private String month;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Year")
    private int year;
    @JoinColumn(name = "HumanID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Human humanID;

    public Birthday() {
    }

    public Birthday(Integer id) {
        this.id = id;
    }

    public Birthday(Integer id, int day, int year) {
        this.id = id;
        this.day = day;
        this.year = year;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Human getHumanID() {
        return humanID;
    }

    public void setHumanID(Human humanID) {
        this.humanID = humanID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Birthday)) {
            return false;
        }
        Birthday other = (Birthday) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.userInfo.Birthday[ id=" + id + " ]";
    }
    
}
