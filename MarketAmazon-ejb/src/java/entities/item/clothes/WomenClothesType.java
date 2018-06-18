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
@Table(name = "WomenClothesType")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "WomenClothesType.findAll", query = "SELECT w FROM WomenClothesType w"),
    @NamedQuery(name = "WomenClothesType.findById", query = "SELECT w FROM WomenClothesType w WHERE w.id = :id"),
    @NamedQuery(name = "WomenClothesType.findByDescription", query = "SELECT w FROM WomenClothesType w WHERE w.description = :description")})
public class WomenClothesType implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Size(max = 255)
    @Column(name = "Description")
    private String description;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "womenClothesType")
    private JeansWoman jeansWoman;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "womenClothesType")
    private Dress dress;
    @JoinColumn(name = "WomanClothesSexTypeClothesID", referencedColumnName = "SexTypeClothesID")
    @ManyToOne(optional = false)
    private WomanClothes womanClothesSexTypeClothesID;

    public WomenClothesType() {
    }

    public WomenClothesType(Integer id) {
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

    public JeansWoman getJeansWoman() {
        return jeansWoman;
    }

    public void setJeansWoman(JeansWoman jeansWoman) {
        this.jeansWoman = jeansWoman;
    }

    public Dress getDress() {
        return dress;
    }

    public void setDress(Dress dress) {
        this.dress = dress;
    }

    public WomanClothes getWomanClothesSexTypeClothesID() {
        return womanClothesSexTypeClothesID;
    }

    public void setWomanClothesSexTypeClothesID(WomanClothes womanClothesSexTypeClothesID) {
        this.womanClothesSexTypeClothesID = womanClothesSexTypeClothesID;
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
        if (!(object instanceof WomenClothesType)) {
            return false;
        }
        WomenClothesType other = (WomenClothesType) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.item.clothes.WomenClothesType[ id=" + id + " ]";
    }
    
}
