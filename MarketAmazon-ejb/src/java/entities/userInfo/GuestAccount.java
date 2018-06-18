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
@Table(name = "GuestAccount")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "GuestAccount.findAll", query = "SELECT g FROM GuestAccount g"),
    @NamedQuery(name = "GuestAccount.findByGuestInformation", query = "SELECT g FROM GuestAccount g WHERE g.guestInformation = :guestInformation"),
    @NamedQuery(name = "GuestAccount.findByAccountID", query = "SELECT g FROM GuestAccount g WHERE g.accountID = :accountID")})
public class GuestAccount implements Serializable {
    private static final long serialVersionUID = 1L;
    @Size(max = 255)
    @Column(name = "GuestInformation")
    private String guestInformation;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "AccountID")
    private Integer accountID;
    @JoinColumn(name = "AccountID", referencedColumnName = "ID", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Account account;

    public GuestAccount() {
    }

    public GuestAccount(Integer accountID) {
        this.accountID = accountID;
    }

    public String getGuestInformation() {
        return guestInformation;
    }

    public void setGuestInformation(String guestInformation) {
        this.guestInformation = guestInformation;
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
        if (!(object instanceof GuestAccount)) {
            return false;
        }
        GuestAccount other = (GuestAccount) object;
        if ((this.accountID == null && other.accountID != null) || (this.accountID != null && !this.accountID.equals(other.accountID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.userInfo.GuestAccount[ accountID=" + accountID + " ]";
    }
    
}
