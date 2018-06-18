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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author vinhnguyen
 */
@Entity
@Table(name = "TopProduct")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TopProduct.findAll", query = "SELECT t FROM TopProduct t"),
    @NamedQuery(name = "TopProduct.findById", query = "SELECT t FROM TopProduct t WHERE t.id = :id"),
    @NamedQuery(name = "TopProduct.findByCriteria", query = "SELECT t FROM TopProduct t WHERE t.criteria = :criteria"),
    @NamedQuery(name = "TopProduct.findByProducts", query = "SELECT t FROM TopProduct t WHERE t.products = :products")})
public class TopProduct implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "Criteria")
    private Integer criteria;
    @Column(name = "Products")
    private Integer products;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "topProductID")
    private Collection<Product> productCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "topProductID")
    private Collection<Criteria> criteriaCollection;

    public TopProduct() {
    }

    public TopProduct(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCriteria() {
        return criteria;
    }

    public void setCriteria(Integer criteria) {
        this.criteria = criteria;
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

    @XmlTransient
    public Collection<Criteria> getCriteriaCollection() {
        return criteriaCollection;
    }

    public void setCriteriaCollection(Collection<Criteria> criteriaCollection) {
        this.criteriaCollection = criteriaCollection;
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
        if (!(object instanceof TopProduct)) {
            return false;
        }
        TopProduct other = (TopProduct) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.itemManager.TopProduct[ id=" + id + " ]";
    }
    
}
