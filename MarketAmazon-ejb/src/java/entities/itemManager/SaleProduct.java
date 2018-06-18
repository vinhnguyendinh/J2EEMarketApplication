/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entities.itemManager;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author vinhnguyen
 */
@Entity
@Table(name = "SaleProduct")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SaleProduct.findAll", query = "SELECT s FROM SaleProduct s"),
    @NamedQuery(name = "SaleProduct.findById", query = "SELECT s FROM SaleProduct s WHERE s.id = :id"),
    @NamedQuery(name = "SaleProduct.findByPercentSale", query = "SELECT s FROM SaleProduct s WHERE s.percentSale = :percentSale"),
    @NamedQuery(name = "SaleProduct.findByDateStart", query = "SELECT s FROM SaleProduct s WHERE s.dateStart = :dateStart"),
    @NamedQuery(name = "SaleProduct.findByDateEnd", query = "SELECT s FROM SaleProduct s WHERE s.dateEnd = :dateEnd"),
    @NamedQuery(name = "SaleProduct.findByProducts", query = "SELECT s FROM SaleProduct s WHERE s.products = :products")})
public class SaleProduct implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "PercentSale")
    private int percentSale;
    @Column(name = "DateStart")
    @Temporal(TemporalType.DATE)
    private Date dateStart;
    @Column(name = "DateEnd")
    @Temporal(TemporalType.DATE)
    private Date dateEnd;
    @Column(name = "Products")
    private Integer products;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "saleProductID")
    private Collection<Product> productCollection;

    public SaleProduct() {
    }

    public SaleProduct(Integer id) {
        this.id = id;
    }

    public SaleProduct(Integer id, int percentSale) {
        this.id = id;
        this.percentSale = percentSale;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getPercentSale() {
        return percentSale;
    }

    public void setPercentSale(int percentSale) {
        this.percentSale = percentSale;
    }

    public Date getDateStart() {
        return dateStart;
    }

    public void setDateStart(Date dateStart) {
        this.dateStart = dateStart;
    }

    public Date getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(Date dateEnd) {
        this.dateEnd = dateEnd;
    }

    public Integer getProducts() {
        return products;
    }

    public void setProducts(Integer products) {
        this.products = products;
    }

    @XmlTransient
    public Collection<Product> getProductCollection() {
        return productCollection;
    }

    public void setProductCollection(Collection<Product> productCollection) {
        this.productCollection = productCollection;
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
        if (!(object instanceof SaleProduct)) {
            return false;
        }
        SaleProduct other = (SaleProduct) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.itemManager.SaleProduct[ id=" + id + " ]";
    }
    
}
