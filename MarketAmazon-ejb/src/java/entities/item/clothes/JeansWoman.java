/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entities.item.clothes;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author vinhnguyen
 */
@Entity
@Table(name = "JeansWoman")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "JeansWoman.findAll", query = "SELECT j FROM JeansWoman j"),
    @NamedQuery(name = "JeansWoman.findByName", query = "SELECT j FROM JeansWoman j WHERE j.name = :name"),
    @NamedQuery(name = "JeansWoman.findByDescription", query = "SELECT j FROM JeansWoman j WHERE j.description = :description"),
    @NamedQuery(name = "JeansWoman.findByWomenClothesTypeID", query = "SELECT j FROM JeansWoman j WHERE j.womenClothesTypeID = :womenClothesTypeID")})
public class JeansWoman implements Serializable {
    private static final long serialVersionUID = 1L;
    @Size(max = 255)
    @Column(name = "Name")
    private String name;
    @Size(max = 255)
    @Column(name = "Description")
    private String description;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "WomenClothesTypeID")
    private Integer womenClothesTypeID;
    @JoinColumn(name = "WomenClothesTypeID", referencedColumnName = "ID", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private WomenClothesType womenClothesType;

    public JeansWoman() {
    }

    public JeansWoman(Integer womenClothesTypeID) {
        this.womenClothesTypeID = womenClothesTypeID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getWomenClothesTypeID() {
        return womenClothesTypeID;
    }

    public void setWomenClothesTypeID(Integer womenClothesTypeID) {
        this.womenClothesTypeID = womenClothesTypeID;
    }

    public WomenClothesType getWomenClothesType() {
        return womenClothesType;
    }

    public void setWomenClothesType(WomenClothesType womenClothesType) {
        this.womenClothesType = womenClothesType;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (womenClothesTypeID != null ? womenClothesTypeID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof JeansWoman)) {
            return false;
        }
        JeansWoman other = (JeansWoman) object;
        if ((this.womenClothesTypeID == null && other.womenClothesTypeID != null) || (this.womenClothesTypeID != null && !this.womenClothesTypeID.equals(other.womenClothesTypeID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.item.clothes.JeansWoman[ womenClothesTypeID=" + womenClothesTypeID + " ]";
    }
    
}
