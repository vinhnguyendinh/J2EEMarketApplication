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
@Table(name = "ManClothes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ManClothes.findAll", query = "SELECT m FROM ManClothes m"),
    @NamedQuery(name = "ManClothes.findByName", query = "SELECT m FROM ManClothes m WHERE m.name = :name"),
    @NamedQuery(name = "ManClothes.findBySize", query = "SELECT m FROM ManClothes m WHERE m.size = :size"),
    @NamedQuery(name = "ManClothes.findByManClothesType", query = "SELECT m FROM ManClothes m WHERE m.manClothesType = :manClothesType"),
    @NamedQuery(name = "ManClothes.findBySexTypeClothesID", query = "SELECT m FROM ManClothes m WHERE m.sexTypeClothesID = :sexTypeClothesID")})
public class ManClothes implements Serializable {
    private static final long serialVersionUID = 1L;
    @Size(max = 255)
    @Column(name = "Name")
    private String name;
    @Size(max = 255)
    @Column(name = "Size")
    private String size;
    @Column(name = "ManClothesType")
    private Integer manClothesType;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "SexTypeClothesID")
    private Integer sexTypeClothesID;
    @JoinColumn(name = "SexTypeClothesID", referencedColumnName = "ID", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private SexTypeClothes sexTypeClothes;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "manClothesSexTypeClothesID")
    private Collection<ManClothesType> manClothesTypeCollection;

    public ManClothes() {
    }

    public ManClothes(Integer sexTypeClothesID) {
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

    public Integer getManClothesType() {
        return manClothesType;
    }

    public void setManClothesType(Integer manClothesType) {
        this.manClothesType = manClothesType;
    }

    public Integer getSexTypeClothesID() {
        return sexTypeClothesID;
    }

    public void setSexTypeClothesID(Integer sexTypeClothesID) {
        this.sexTypeClothesID = sexTypeClothesID;
    }

    public SexTypeClothes getSexTypeClothes() {
        return sexTypeClothes;
    }

    public void setSexTypeClothes(SexTypeClothes sexTypeClothes) {
        this.sexTypeClothes = sexTypeClothes;
    }

    @XmlTransient
    public Collection<ManClothesType> getManClothesTypeCollection() {
        return manClothesTypeCollection;
    }

    public void setManClothesTypeCollection(Collection<ManClothesType> manClothesTypeCollection) {
        this.manClothesTypeCollection = manClothesTypeCollection;
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
        if (!(object instanceof ManClothes)) {
            return false;
        }
        ManClothes other = (ManClothes) object;
        if ((this.sexTypeClothesID == null && other.sexTypeClothesID != null) || (this.sexTypeClothesID != null && !this.sexTypeClothesID.equals(other.sexTypeClothesID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.item.clothes.ManClothes[ sexTypeClothesID=" + sexTypeClothesID + " ]";
    }
    
}
