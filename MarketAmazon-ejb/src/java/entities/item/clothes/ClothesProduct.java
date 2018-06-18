/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entities.item.clothes;

import entities.itemManager.ProductType;
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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author vinhnguyen
 */
@Entity
@Table(name = "ClothesProduct")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ClothesProduct.findAll", query = "SELECT c FROM ClothesProduct c"),
    @NamedQuery(name = "ClothesProduct.findByColor", query = "SELECT c FROM ClothesProduct c WHERE c.color = :color"),
    @NamedQuery(name = "ClothesProduct.findByTypeClothes", query = "SELECT c FROM ClothesProduct c WHERE c.typeClothes = :typeClothes"),
    @NamedQuery(name = "ClothesProduct.findBySexTypeClothes", query = "SELECT c FROM ClothesProduct c WHERE c.sexTypeClothes = :sexTypeClothes"),
    @NamedQuery(name = "ClothesProduct.findByProductTypeID", query = "SELECT c FROM ClothesProduct c WHERE c.productTypeID = :productTypeID")})
public class ClothesProduct implements Serializable {
    private static final long serialVersionUID = 1L;
    @Column(name = "Color")
    private Integer color;
    @Column(name = "TypeClothes")
    private Integer typeClothes;
    @Column(name = "SexTypeClothes")
    private Integer sexTypeClothes;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ProductTypeID")
    private Integer productTypeID;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "clothesProductProductTypeID")
    private Collection<Color> colorCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "clothesProductProductTypeID")
    private Collection<TypeClothes> typeClothesCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "clothesProductProductTypeID")
    private Collection<SexTypeClothes> sexTypeClothesCollection;
    @JoinColumn(name = "ProductTypeID", referencedColumnName = "ID", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private ProductType productType;

    public ClothesProduct() {
    }

    public ClothesProduct(Integer productTypeID) {
        this.productTypeID = productTypeID;
    }

    public Integer getColor() {
        return color;
    }

    public void setColor(Integer color) {
        this.color = color;
    }

    public Integer getTypeClothes() {
        return typeClothes;
    }

    public void setTypeClothes(Integer typeClothes) {
        this.typeClothes = typeClothes;
    }

    public Integer getSexTypeClothes() {
        return sexTypeClothes;
    }

    public void setSexTypeClothes(Integer sexTypeClothes) {
        this.sexTypeClothes = sexTypeClothes;
    }

    public Integer getProductTypeID() {
        return productTypeID;
    }

    public void setProductTypeID(Integer productTypeID) {
        this.productTypeID = productTypeID;
    }

    @XmlTransient
    public Collection<Color> getColorCollection() {
        return colorCollection;
    }

    public void setColorCollection(Collection<Color> colorCollection) {
        this.colorCollection = colorCollection;
    }

    @XmlTransient
    public Collection<TypeClothes> getTypeClothesCollection() {
        return typeClothesCollection;
    }

    public void setTypeClothesCollection(Collection<TypeClothes> typeClothesCollection) {
        this.typeClothesCollection = typeClothesCollection;
    }

    @XmlTransient
    public Collection<SexTypeClothes> getSexTypeClothesCollection() {
        return sexTypeClothesCollection;
    }

    public void setSexTypeClothesCollection(Collection<SexTypeClothes> sexTypeClothesCollection) {
        this.sexTypeClothesCollection = sexTypeClothesCollection;
    }

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productTypeID != null ? productTypeID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ClothesProduct)) {
            return false;
        }
        ClothesProduct other = (ClothesProduct) object;
        if ((this.productTypeID == null && other.productTypeID != null) || (this.productTypeID != null && !this.productTypeID.equals(other.productTypeID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.item.clothes.ClothesProduct[ productTypeID=" + productTypeID + " ]";
    }
    
}
