/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entities.itemManager;

import java.io.Serializable;
import java.util.Collection;
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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author vinhnguyen
 */
@Entity
@Table(name = "PriceList")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PriceList.findAll", query = "SELECT p FROM PriceList p"),
    @NamedQuery(name = "PriceList.findById", query = "SELECT p FROM PriceList p WHERE p.id = :id"),
    @NamedQuery(name = "PriceList.findByProducts", query = "SELECT p FROM PriceList p WHERE p.products = :products"),
    @NamedQuery(name = "PriceList.findByUpdateTime", query = "SELECT p FROM PriceList p WHERE p.updateTime = :updateTime"),
    @NamedQuery(name = "PriceList.findByInstance", query = "SELECT p FROM PriceList p WHERE p.instance = :instance")})
public class PriceList implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "Products")
    private Integer products;
    @Size(max = 255)
    @Column(name = "UpdateTime")
    private String updateTime;
    @Column(name = "Instance")
    private Integer instance;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "priceListID")
    private Collection<Product> productCollection;

    public PriceList() {
    }

    public PriceList(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getProducts() {
        return products;
    }

    public void setProducts(Integer products) {
        this.products = products;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getInstance() {
        return instance;
    }

    public void setInstance(Integer instance) {
        this.instance = instance;
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
        if (!(object instanceof PriceList)) {
            return false;
        }
        PriceList other = (PriceList) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.itemManager.PriceList[ id=" + id + " ]";
    }
    
}
