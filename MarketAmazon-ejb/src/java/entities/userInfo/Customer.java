/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entities.userInfo;

import entities.order.Cart;
import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "Customer")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Customer.findAll", query = "SELECT c FROM Customer c"),
    @NamedQuery(name = "Customer.findByType", query = "SELECT c FROM Customer c WHERE c.type = :type"),
    @NamedQuery(name = "Customer.findByDescription", query = "SELECT c FROM Customer c WHERE c.description = :description"),
    @NamedQuery(name = "Customer.findByHumanID", query = "SELECT c FROM Customer c WHERE c.humanID = :humanID")})
public class Customer implements Serializable {
    private static final long serialVersionUID = 1L;
    @Size(max = 255)
    @Column(name = "Type")
    private String type;
    @Size(max = 255)
    @Column(name = "Description")
    private String description;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "HumanID")
    private Integer humanID;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "customerHumanID")
    private Collection<Human> humanCollection;
    @JoinColumn(name = "HumanID", referencedColumnName = "ID", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Human human;
    @JoinColumn(name = "CartID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Cart cartID;

    public Customer() {
    }

    public Customer(Integer humanID) {
        this.humanID = humanID;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getHumanID() {
        return humanID;
    }

    public void setHumanID(Integer humanID) {
        this.humanID = humanID;
    }

    @XmlTransient
    public Collection<Human> getHumanCollection() {
        return humanCollection;
    }

    public void setHumanCollection(Collection<Human> humanCollection) {
        this.humanCollection = humanCollection;
    }

    public Human getHuman() {
        return human;
    }

    public void setHuman(Human human) {
        this.human = human;
    }

    public Cart getCartID() {
        return cartID;
    }

    public void setCartID(Cart cartID) {
        this.cartID = cartID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (humanID != null ? humanID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Customer)) {
            return false;
        }
        Customer other = (Customer) object;
        if ((this.humanID == null && other.humanID != null) || (this.humanID != null && !this.humanID.equals(other.humanID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.userInfo.Customer[ humanID=" + humanID + " ]";
    }
    
}
