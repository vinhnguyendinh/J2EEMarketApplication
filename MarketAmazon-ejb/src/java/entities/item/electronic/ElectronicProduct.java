/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entities.item.electronic;

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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author vinhnguyen
 */
@Entity
@Table(name = "ElectronicProduct")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ElectronicProduct.findAll", query = "SELECT e FROM ElectronicProduct e"),
    @NamedQuery(name = "ElectronicProduct.findByCircuitType", query = "SELECT e FROM ElectronicProduct e WHERE e.circuitType = :circuitType"),
    @NamedQuery(name = "ElectronicProduct.findByIsUsePin", query = "SELECT e FROM ElectronicProduct e WHERE e.isUsePin = :isUsePin"),
    @NamedQuery(name = "ElectronicProduct.findByElectronicType", query = "SELECT e FROM ElectronicProduct e WHERE e.electronicType = :electronicType"),
    @NamedQuery(name = "ElectronicProduct.findByProductTypeID", query = "SELECT e FROM ElectronicProduct e WHERE e.productTypeID = :productTypeID")})
public class ElectronicProduct implements Serializable {
    private static final long serialVersionUID = 1L;
    @Size(max = 255)
    @Column(name = "CircuitType")
    private String circuitType;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IsUsePin")
    private boolean isUsePin;
    @Column(name = "ElectronicType")
    private Integer electronicType;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ProductTypeID")
    private Integer productTypeID;
    @JoinColumn(name = "ProductTypeID", referencedColumnName = "ID", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private ProductType productType;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "electronicProductProductTypeID")
    private Collection<ElectronicType> electronicTypeCollection;

    public ElectronicProduct() {
    }

    public ElectronicProduct(Integer productTypeID) {
        this.productTypeID = productTypeID;
    }

    public ElectronicProduct(Integer productTypeID, boolean isUsePin) {
        this.productTypeID = productTypeID;
        this.isUsePin = isUsePin;
    }

    public String getCircuitType() {
        return circuitType;
    }

    public void setCircuitType(String circuitType) {
        this.circuitType = circuitType;
    }

    public boolean getIsUsePin() {
        return isUsePin;
    }

    public void setIsUsePin(boolean isUsePin) {
        this.isUsePin = isUsePin;
    }

    public Integer getElectronicType() {
        return electronicType;
    }

    public void setElectronicType(Integer electronicType) {
        this.electronicType = electronicType;
    }

    public Integer getProductTypeID() {
        return productTypeID;
    }

    public void setProductTypeID(Integer productTypeID) {
        this.productTypeID = productTypeID;
    }

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }

    @XmlTransient
    public Collection<ElectronicType> getElectronicTypeCollection() {
        return electronicTypeCollection;
    }

    public void setElectronicTypeCollection(Collection<ElectronicType> electronicTypeCollection) {
        this.electronicTypeCollection = electronicTypeCollection;
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
        if (!(object instanceof ElectronicProduct)) {
            return false;
        }
        ElectronicProduct other = (ElectronicProduct) object;
        if ((this.productTypeID == null && other.productTypeID != null) || (this.productTypeID != null && !this.productTypeID.equals(other.productTypeID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.item.electronic.ElectronicProduct[ productTypeID=" + productTypeID + " ]";
    }
    
}
