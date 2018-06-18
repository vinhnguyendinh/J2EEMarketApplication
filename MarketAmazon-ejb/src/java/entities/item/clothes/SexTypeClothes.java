/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entities.item.clothes;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author vinhnguyen
 */
@Entity
@Table(name = "SexTypeClothes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SexTypeClothes.findAll", query = "SELECT s FROM SexTypeClothes s"),
    @NamedQuery(name = "SexTypeClothes.findById", query = "SELECT s FROM SexTypeClothes s WHERE s.id = :id"),
    @NamedQuery(name = "SexTypeClothes.findBySexTypeName", query = "SELECT s FROM SexTypeClothes s WHERE s.sexTypeName = :sexTypeName"),
    @NamedQuery(name = "SexTypeClothes.findByDescription", query = "SELECT s FROM SexTypeClothes s WHERE s.description = :description")})
public class SexTypeClothes implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Size(max = 255)
    @Column(name = "SexTypeName")
    private String sexTypeName;
    @Size(max = 255)
    @Column(name = "Description")
    private String description;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "sexTypeClothes")
    private ManClothes manClothes;
    @JoinColumn(name = "ClothesProductProductTypeID", referencedColumnName = "ProductTypeID")
    @ManyToOne(optional = false)
    private ClothesProduct clothesProductProductTypeID;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "sexTypeClothes")
    private WomanClothes womanClothes;

    public SexTypeClothes() {
    }

    public SexTypeClothes(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSexTypeName() {
        return sexTypeName;
    }

    public void setSexTypeName(String sexTypeName) {
        this.sexTypeName = sexTypeName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ManClothes getManClothes() {
        return manClothes;
    }

    public void setManClothes(ManClothes manClothes) {
        this.manClothes = manClothes;
    }

    public ClothesProduct getClothesProductProductTypeID() {
        return clothesProductProductTypeID;
    }

    public void setClothesProductProductTypeID(ClothesProduct clothesProductProductTypeID) {
        this.clothesProductProductTypeID = clothesProductProductTypeID;
    }

    public WomanClothes getWomanClothes() {
        return womanClothes;
    }

    public void setWomanClothes(WomanClothes womanClothes) {
        this.womanClothes = womanClothes;
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
        if (!(object instanceof SexTypeClothes)) {
            return false;
        }
        SexTypeClothes other = (SexTypeClothes) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.item.clothes.SexTypeClothes[ id=" + id + " ]";
    }
    
}
