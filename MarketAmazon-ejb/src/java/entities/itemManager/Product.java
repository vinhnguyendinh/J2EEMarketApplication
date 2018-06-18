/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entities.itemManager;

import entities.order.Cart;
import java.io.Serializable;
import java.util.Collection;
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
import javax.persistence.OneToMany;
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
@Table(name = "Product")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Product.findAll", query = "SELECT p FROM Product p"),
    @NamedQuery(name = "Product.findById", query = "SELECT p FROM Product p WHERE p.id = :id"),
    @NamedQuery(name = "Product.findByName", query = "SELECT p FROM Product p WHERE p.name = :name"),
    @NamedQuery(name = "Product.findByDescription", query = "SELECT p FROM Product p WHERE p.description = :description"),
    @NamedQuery(name = "Product.findByManufacturer", query = "SELECT p FROM Product p WHERE p.manufacturer = :manufacturer"),
    @NamedQuery(name = "Product.findByCost", query = "SELECT p FROM Product p WHERE p.cost = :cost"),
    @NamedQuery(name = "Product.findByPreview", query = "SELECT p FROM Product p WHERE p.preview = :preview"),
    @NamedQuery(name = "Product.findByProductType", query = "SELECT p FROM Product p WHERE p.productType = :productType")})
public class Product implements Serializable {
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
    @Column(name = "Description")
    private String description;
    @Column(name = "Manufacturer")
    private Integer manufacturer;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Cost")
    private float cost;
    @Column(name = "Preview")
    private Integer preview;
    @Column(name = "ProductType")
    private Integer productType;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productID")
    private Collection<Manufacturer> manufacturerCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productID")
    private Collection<ProductType> productTypeCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "productID")
    private Collection<Preview> previewCollection;
    @JoinColumn(name = "CommentID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Comment commentID;
    @JoinColumn(name = "TopProductID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private TopProduct topProductID;
    @JoinColumn(name = "CartID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Cart cartID;
    @JoinColumn(name = "PriceListID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private PriceList priceListID;
    @JoinColumn(name = "SaleProductID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private SaleProduct saleProductID;

    public Product() {
    }

    public Product(Integer id) {
        this.id = id;
    }

    public Product(Integer id, float cost) {
        this.id = id;
        this.cost = cost;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Integer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public Integer getPreview() {
        return preview;
    }

    public void setPreview(Integer preview) {
        this.preview = preview;
    }

    public Integer getProductType() {
        return productType;
    }

    public void setProductType(Integer productType) {
        this.productType = productType;
    }

    @XmlTransient
    public Collection<Manufacturer> getManufacturerCollection() {
        return manufacturerCollection;
    }

    public void setManufacturerCollection(Collection<Manufacturer> manufacturerCollection) {
        this.manufacturerCollection = manufacturerCollection;
    }

    @XmlTransient
    public Collection<ProductType> getProductTypeCollection() {
        return productTypeCollection;
    }

    public void setProductTypeCollection(Collection<ProductType> productTypeCollection) {
        this.productTypeCollection = productTypeCollection;
    }

    @XmlTransient
    public Collection<Preview> getPreviewCollection() {
        return previewCollection;
    }

    public void setPreviewCollection(Collection<Preview> previewCollection) {
        this.previewCollection = previewCollection;
    }

    public Comment getCommentID() {
        return commentID;
    }

    public void setCommentID(Comment commentID) {
        this.commentID = commentID;
    }

    public TopProduct getTopProductID() {
        return topProductID;
    }

    public void setTopProductID(TopProduct topProductID) {
        this.topProductID = topProductID;
    }

    public Cart getCartID() {
        return cartID;
    }

    public void setCartID(Cart cartID) {
        this.cartID = cartID;
    }

    public PriceList getPriceListID() {
        return priceListID;
    }

    public void setPriceListID(PriceList priceListID) {
        this.priceListID = priceListID;
    }

    public SaleProduct getSaleProductID() {
        return saleProductID;
    }

    public void setSaleProductID(SaleProduct saleProductID) {
        this.saleProductID = saleProductID;
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
        if (!(object instanceof Product)) {
            return false;
        }
        Product other = (Product) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.itemManager.Product[ id=" + id + " ]";
    }
    
}
