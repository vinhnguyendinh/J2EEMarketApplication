/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entities.order;

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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author vinhnguyen
 */
@Entity
@Table(name = "Payment")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Payment.findAll", query = "SELECT p FROM Payment p"),
    @NamedQuery(name = "Payment.findById", query = "SELECT p FROM Payment p WHERE p.id = :id"),
    @NamedQuery(name = "Payment.findByCartName", query = "SELECT p FROM Payment p WHERE p.cartName = :cartName"),
    @NamedQuery(name = "Payment.findByCartNumber", query = "SELECT p FROM Payment p WHERE p.cartNumber = :cartNumber"),
    @NamedQuery(name = "Payment.findByCurrency", query = "SELECT p FROM Payment p WHERE p.currency = :currency"),
    @NamedQuery(name = "Payment.findByBank", query = "SELECT p FROM Payment p WHERE p.bank = :bank")})
public class Payment implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Size(max = 255)
    @Column(name = "CartName")
    private String cartName;
    @Size(max = 255)
    @Column(name = "CartNumber")
    private String cartNumber;
    @Column(name = "Currency")
    private Integer currency;
    @Column(name = "Bank")
    private Integer bank;
    @JoinColumn(name = "BillID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Bill billID;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "paymentID")
    private Collection<Bank> bankCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "paymentID")
    private Collection<Currency> currencyCollection;

    public Payment() {
    }

    public Payment(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCartName() {
        return cartName;
    }

    public void setCartName(String cartName) {
        this.cartName = cartName;
    }

    public String getCartNumber() {
        return cartNumber;
    }

    public void setCartNumber(String cartNumber) {
        this.cartNumber = cartNumber;
    }

    public Integer getCurrency() {
        return currency;
    }

    public void setCurrency(Integer currency) {
        this.currency = currency;
    }

    public Integer getBank() {
        return bank;
    }

    public void setBank(Integer bank) {
        this.bank = bank;
    }

    public Bill getBillID() {
        return billID;
    }

    public void setBillID(Bill billID) {
        this.billID = billID;
    }

    @XmlTransient
    public Collection<Bank> getBankCollection() {
        return bankCollection;
    }

    public void setBankCollection(Collection<Bank> bankCollection) {
        this.bankCollection = bankCollection;
    }

    @XmlTransient
    public Collection<Currency> getCurrencyCollection() {
        return currencyCollection;
    }

    public void setCurrencyCollection(Collection<Currency> currencyCollection) {
        this.currencyCollection = currencyCollection;
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
        if (!(object instanceof Payment)) {
            return false;
        }
        Payment other = (Payment) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.order.Payment[ id=" + id + " ]";
    }
    
}
