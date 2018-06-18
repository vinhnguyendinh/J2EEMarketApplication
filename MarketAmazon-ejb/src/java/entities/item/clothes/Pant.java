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
@Table(name = "Pant")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pant.findAll", query = "SELECT p FROM Pant p"),
    @NamedQuery(name = "Pant.findByName", query = "SELECT p FROM Pant p WHERE p.name = :name"),
    @NamedQuery(name = "Pant.findByDescription", query = "SELECT p FROM Pant p WHERE p.description = :description"),
    @NamedQuery(name = "Pant.findByManClothesTypeID", query = "SELECT p FROM Pant p WHERE p.manClothesTypeID = :manClothesTypeID")})
public class Pant implements Serializable {
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
    @Column(name = "ManClothesTypeID")
    private Integer manClothesTypeID;
    @JoinColumn(name = "ManClothesTypeID", referencedColumnName = "ID", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private ManClothesType manClothesType;

    public Pant() {
    }

    public Pant(Integer manClothesTypeID) {
        this.manClothesTypeID = manClothesTypeID;
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

    public Integer getManClothesTypeID() {
        return manClothesTypeID;
    }

    public void setManClothesTypeID(Integer manClothesTypeID) {
        this.manClothesTypeID = manClothesTypeID;
    }

    public ManClothesType getManClothesType() {
        return manClothesType;
    }

    public void setManClothesType(ManClothesType manClothesType) {
        this.manClothesType = manClothesType;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (manClothesTypeID != null ? manClothesTypeID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pant)) {
            return false;
        }
        Pant other = (Pant) object;
        if ((this.manClothesTypeID == null && other.manClothesTypeID != null) || (this.manClothesTypeID != null && !this.manClothesTypeID.equals(other.manClothesTypeID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.item.clothes.Pant[ manClothesTypeID=" + manClothesTypeID + " ]";
    }
    
}
