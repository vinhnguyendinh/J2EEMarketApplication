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
@Table(name = "ManClothesType")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ManClothesType.findAll", query = "SELECT m FROM ManClothesType m"),
    @NamedQuery(name = "ManClothesType.findById", query = "SELECT m FROM ManClothesType m WHERE m.id = :id"),
    @NamedQuery(name = "ManClothesType.findByDescription", query = "SELECT m FROM ManClothesType m WHERE m.description = :description")})
public class ManClothesType implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Size(max = 255)
    @Column(name = "Description")
    private String description;
    @JoinColumn(name = "ManClothesSexTypeClothesID", referencedColumnName = "SexTypeClothesID")
    @ManyToOne(optional = false)
    private ManClothes manClothesSexTypeClothesID;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "manClothesType")
    private Pant pant;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "manClothesType")
    private TShirt tShirt;

    public ManClothesType() {
    }

    public ManClothesType(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ManClothes getManClothesSexTypeClothesID() {
        return manClothesSexTypeClothesID;
    }

    public void setManClothesSexTypeClothesID(ManClothes manClothesSexTypeClothesID) {
        this.manClothesSexTypeClothesID = manClothesSexTypeClothesID;
    }

    public Pant getPant() {
        return pant;
    }

    public void setPant(Pant pant) {
        this.pant = pant;
    }

    public TShirt getTShirt() {
        return tShirt;
    }

    public void setTShirt(TShirt tShirt) {
        this.tShirt = tShirt;
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
        if (!(object instanceof ManClothesType)) {
            return false;
        }
        ManClothesType other = (ManClothesType) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.item.clothes.ManClothesType[ id=" + id + " ]";
    }
    
}
