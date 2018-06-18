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
@Table(name = "Color")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Color.findAll", query = "SELECT c FROM Color c"),
    @NamedQuery(name = "Color.findById", query = "SELECT c FROM Color c WHERE c.id = :id"),
    @NamedQuery(name = "Color.findByName", query = "SELECT c FROM Color c WHERE c.name = :name"),
    @NamedQuery(name = "Color.findByHexa", query = "SELECT c FROM Color c WHERE c.hexa = :hexa"),
    @NamedQuery(name = "Color.findByAlpha", query = "SELECT c FROM Color c WHERE c.alpha = :alpha")})
public class Color implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Size(max = 255)
    @Column(name = "Name")
    private String name;
    @Size(max = 255)
    @Column(name = "Hexa")
    private String hexa;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Alpha")
    private float alpha;
    @JoinColumn(name = "ClothesProductProductTypeID", referencedColumnName = "ProductTypeID")
    @ManyToOne(optional = false)
    private ClothesProduct clothesProductProductTypeID;

    public Color() {
    }

    public Color(Integer id) {
        this.id = id;
    }

    public Color(Integer id, float alpha) {
        this.id = id;
        this.alpha = alpha;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHexa() {
        return hexa;
    }

    public void setHexa(String hexa) {
        this.hexa = hexa;
    }

    public float getAlpha() {
        return alpha;
    }

    public void setAlpha(float alpha) {
        this.alpha = alpha;
    }

    public ClothesProduct getClothesProductProductTypeID() {
        return clothesProductProductTypeID;
    }

    public void setClothesProductProductTypeID(ClothesProduct clothesProductProductTypeID) {
        this.clothesProductProductTypeID = clothesProductProductTypeID;
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
        if (!(object instanceof Color)) {
            return false;
        }
        Color other = (Color) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.item.clothes.Color[ id=" + id + " ]";
    }
    
}
