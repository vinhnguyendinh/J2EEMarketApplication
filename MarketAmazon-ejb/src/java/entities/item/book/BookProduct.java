/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entities.item.book;

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
@Table(name = "BookProduct")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "BookProduct.findAll", query = "SELECT b FROM BookProduct b"),
    @NamedQuery(name = "BookProduct.findByName", query = "SELECT b FROM BookProduct b WHERE b.name = :name"),
    @NamedQuery(name = "BookProduct.findByAuthor", query = "SELECT b FROM BookProduct b WHERE b.author = :author"),
    @NamedQuery(name = "BookProduct.findByProductType", query = "SELECT b FROM BookProduct b WHERE b.productType = :productType"),
    @NamedQuery(name = "BookProduct.findByCategory", query = "SELECT b FROM BookProduct b WHERE b.category = :category"),
    @NamedQuery(name = "BookProduct.findByContent", query = "SELECT b FROM BookProduct b WHERE b.content = :content"),
    @NamedQuery(name = "BookProduct.findByPublisher", query = "SELECT b FROM BookProduct b WHERE b.publisher = :publisher"),
    @NamedQuery(name = "BookProduct.findByProductTypeID", query = "SELECT b FROM BookProduct b WHERE b.productTypeID = :productTypeID")})
public class BookProduct implements Serializable {
    private static final long serialVersionUID = 1L;
    @Size(max = 255)
    @Column(name = "Name")
    private String name;
    @Column(name = "Author")
    private Integer author;
    @Column(name = "ProductType")
    private Integer productType;
    @Column(name = "Category")
    private Integer category;
    @Size(max = 255)
    @Column(name = "Content")
    private String content;
    @Column(name = "Publisher")
    private Integer publisher;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ProductTypeID")
    private Integer productTypeID;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "bookProductProductTypeID")
    private Collection<Category> categoryCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "bookProductProductTypeID")
    private Collection<Publisher> publisherCollection;
    @JoinColumn(name = "ProductTypeID", referencedColumnName = "ID", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private ProductType productType1;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "bookProductProductTypeID")
    private Collection<Author> authorCollection;

    public BookProduct() {
    }

    public BookProduct(Integer productTypeID) {
        this.productTypeID = productTypeID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAuthor() {
        return author;
    }

    public void setAuthor(Integer author) {
        this.author = author;
    }

    public Integer getProductType() {
        return productType;
    }

    public void setProductType(Integer productType) {
        this.productType = productType;
    }

    public Integer getCategory() {
        return category;
    }

    public void setCategory(Integer category) {
        this.category = category;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getPublisher() {
        return publisher;
    }

    public void setPublisher(Integer publisher) {
        this.publisher = publisher;
    }

    public Integer getProductTypeID() {
        return productTypeID;
    }

    public void setProductTypeID(Integer productTypeID) {
        this.productTypeID = productTypeID;
    }

    @XmlTransient
    public Collection<Category> getCategoryCollection() {
        return categoryCollection;
    }

    public void setCategoryCollection(Collection<Category> categoryCollection) {
        this.categoryCollection = categoryCollection;
    }

    @XmlTransient
    public Collection<Publisher> getPublisherCollection() {
        return publisherCollection;
    }

    public void setPublisherCollection(Collection<Publisher> publisherCollection) {
        this.publisherCollection = publisherCollection;
    }

    public ProductType getProductType1() {
        return productType1;
    }

    public void setProductType1(ProductType productType1) {
        this.productType1 = productType1;
    }

    @XmlTransient
    public Collection<Author> getAuthorCollection() {
        return authorCollection;
    }

    public void setAuthorCollection(Collection<Author> authorCollection) {
        this.authorCollection = authorCollection;
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
        if (!(object instanceof BookProduct)) {
            return false;
        }
        BookProduct other = (BookProduct) object;
        if ((this.productTypeID == null && other.productTypeID != null) || (this.productTypeID != null && !this.productTypeID.equals(other.productTypeID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.item.book.BookProduct[ productTypeID=" + productTypeID + " ]";
    }
    
}
