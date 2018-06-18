/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entities.userInfo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
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
@Table(name = "SMemberAccount")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SMemberAccount.findAll", query = "SELECT s FROM SMemberAccount s"),
    @NamedQuery(name = "SMemberAccount.findBySMemberInformation", query = "SELECT s FROM SMemberAccount s WHERE s.sMemberInformation = :sMemberInformation"),
    @NamedQuery(name = "SMemberAccount.findBySaleOffPercent", query = "SELECT s FROM SMemberAccount s WHERE s.saleOffPercent = :saleOffPercent"),
    @NamedQuery(name = "SMemberAccount.findByAccountID", query = "SELECT s FROM SMemberAccount s WHERE s.accountID = :accountID")})
public class SMemberAccount implements Serializable {
    private static final long serialVersionUID = 1L;
    @Size(max = 255)
    @Column(name = "SMemberInformation")
    private String sMemberInformation;
    @Basic(optional = false)
    @NotNull
    @Column(name = "SaleOffPercent")
    private float saleOffPercent;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "AccountID")
    private Integer accountID;
    @JoinColumn(name = "AccountID", referencedColumnName = "ID", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Account account;

    public SMemberAccount() {
    }

    public SMemberAccount(Integer accountID) {
        this.accountID = accountID;
    }

    public SMemberAccount(Integer accountID, float saleOffPercent) {
        this.accountID = accountID;
        this.saleOffPercent = saleOffPercent;
    }

    public String getSMemberInformation() {
        return sMemberInformation;
    }

    public void setSMemberInformation(String sMemberInformation) {
        this.sMemberInformation = sMemberInformation;
    }

    public float getSaleOffPercent() {
        return saleOffPercent;
    }

    public void setSaleOffPercent(float saleOffPercent) {
        this.saleOffPercent = saleOffPercent;
    }

    public Integer getAccountID() {
        return accountID;
    }

    public void setAccountID(Integer accountID) {
        this.accountID = accountID;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (accountID != null ? accountID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SMemberAccount)) {
            return false;
        }
        SMemberAccount other = (SMemberAccount) object;
        if ((this.accountID == null && other.accountID != null) || (this.accountID != null && !this.accountID.equals(other.accountID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.userInfo.SMemberAccount[ accountID=" + accountID + " ]";
    }
    
}
