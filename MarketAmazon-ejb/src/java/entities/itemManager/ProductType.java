/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entities.itemManager;

import entities.item.electronic.ElectronicProduct;
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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author vinhnguyen
 */
@Entity
@Table(name = "ProductType")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ProductType.findAll", query = "SELECT p FROM ProductType p"),
    @NamedQuery(name = "ProductType.findById", query = "SELECT p FROM ProductType p WHERE p.id = :id"),
    @NamedQuery(name = "ProductType.findByType", query = "SELECT p FROM ProductType p WHERE p.type = :type"),
    @NamedQuery(name = "ProductType.findByNameType", query = "SELECT p FROM ProductType p WHERE p.nameType = :nameType"),
    @NamedQuery(name = "ProductType.findByDescription", query = "SELECT p FROM ProductType p WHERE p.description = :description")})
public class ProductType implements Serializable {
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "productType")
    private ElectronicProduct electronicProduct;
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Type")
    private int type;
    @Size(max = 255)
    @Column(name = "NameType")
    private String nameType;
    @Size(max = 255)
    @Column(name = "Description")
    private String description;
    @JoinColumn(name = "ProductID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Product productID;

    public ProductType() {
    }

    public ProductType(Integer id) {
        this.id = id;
    }

    public ProductType(Integer id, int type) {
        this.id = id;
        this.type = type;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getNameType() {
        return nameType;
    }

    public void setNameType(String nameType) {
        this.nameType = nameType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Product getProductID() {
        return productID;
    }

    public void setProductID(Product productID) {
        this.productID = productID;
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
        if (!(object instanceof ProductType)) {
            return false;
        }
        ProductType other = (ProductType) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.itemManager.ProductType[ id=" + id + " ]";
    }

    public ElectronicProduct getElectronicProduct() {
        return electronicProduct;
    }

    public void setElectronicProduct(ElectronicProduct electronicProduct) {
        this.electronicProduct = electronicProduct;
    }
    
}
