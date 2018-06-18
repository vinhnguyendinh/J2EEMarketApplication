/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entities.item.clothes;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author vinhnguyen
 */
@Entity
@Table(name = "WomanClothes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "WomanClothes.findAll", query = "SELECT w FROM WomanClothes w"),
    @NamedQuery(name = "WomanClothes.findByName", query = "SELECT w FROM WomanClothes w WHERE w.name = :name"),
    @NamedQuery(name = "WomanClothes.findBySize", query = "SELECT w FROM WomanClothes w WHERE w.size = :size"),
    @NamedQuery(name = "WomanClothes.findByWomenClothesType", query = "SELECT w FROM WomanClothes w WHERE w.womenClothesType = :womenClothesType"),
    @NamedQuery(name = "WomanClothes.findBySexTypeClothesID", query = "SELECT w FROM WomanClothes w WHERE w.sexTypeClothesID = :sexTypeClothesID")})
public class WomanClothes implements Serializable {
    private static final long serialVersionUID = 1L;
    @Size(max = 255)
    @Column(name = "Name")
    private String name;
    @Size(max = 255)
    @Column(name = "Size")
    private String size;
    @Column(name = "WomenClothesType")
    private Integer womenClothesType;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "SexTypeClothesID")
    private Integer sexTypeClothesID;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "womanClothesSexTypeClothesID")
    private Collection<WomenClothesType> womenClothesTypeCollection;
    @JoinColumn(name = "SexTypeClothesID", referencedColumnName = "ID", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private SexTypeClothes sexTypeClothes;

    public WomanClothes() {
    }

    public WomanClothes(Integer sexTypeClothesID) {
        this.sexTypeClothesID = sexTypeClothesID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Integer getWomenClothesType() {
        return womenClothesType;
    }

    public void setWomenClothesType(Integer womenClothesType) {
        this.womenClothesType = womenClothesType;
    }

    public Integer getSexTypeClothesID() {
        return sexTypeClothesID;
    }

    public void setSexTypeClothesID(Integer sexTypeClothesID) {
        this.sexTypeClothesID = sexTypeClothesID;
    }

    @XmlTransient
    public Collection<WomenClothesType> getWomenClothesTypeCollection() {
        return womenClothesTypeCollection;
    }

    public void setWomenClothesTypeCollection(Collection<WomenClothesType> womenClothesTypeCollection) {
        this.womenClothesTypeCollection = womenClothesTypeCollection;
    }

    public SexTypeClothes getSexTypeClothes() {
        return sexTypeClothes;
    }

    public void setSexTypeClothes(SexTypeClothes sexTypeClothes) {
        this.sexTypeClothes = sexTypeClothes;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (sexTypeClothesID != null ? sexTypeClothesID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof WomanClothes)) {
            return false;
        }
        WomanClothes other = (WomanClothes) object;
        if ((this.sexTypeClothesID == null && other.sexTypeClothesID != null) || (this.sexTypeClothesID != null && !this.sexTypeClothesID.equals(other.sexTypeClothesID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.item.clothes.WomanClothes[ sexTypeClothesID=" + sexTypeClothesID + " ]";
    }
    
}
