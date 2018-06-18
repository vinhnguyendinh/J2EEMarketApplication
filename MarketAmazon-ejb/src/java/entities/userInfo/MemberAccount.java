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
@Table(name = "MemberAccount")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MemberAccount.findAll", query = "SELECT m FROM MemberAccount m"),
    @NamedQuery(name = "MemberAccount.findByMemberInformation", query = "SELECT m FROM MemberAccount m WHERE m.memberInformation = :memberInformation"),
    @NamedQuery(name = "MemberAccount.findByAttribute", query = "SELECT m FROM MemberAccount m WHERE m.attribute = :attribute"),
    @NamedQuery(name = "MemberAccount.findByAccountID", query = "SELECT m FROM MemberAccount m WHERE m.accountID = :accountID")})
public class MemberAccount implements Serializable {
    private static final long serialVersionUID = 1L;
    @Size(max = 255)
    @Column(name = "MemberInformation")
    private String memberInformation;
    @Column(name = "Attribute")
    private Integer attribute;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "AccountID")
    private Integer accountID;
    @JoinColumn(name = "AccountID", referencedColumnName = "ID", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Account account;

    public MemberAccount() {
    }

    public MemberAccount(Integer accountID) {
        this.accountID = accountID;
    }

    public String getMemberInformation() {
        return memberInformation;
    }

    public void setMemberInformation(String memberInformation) {
        this.memberInformation = memberInformation;
    }

    public Integer getAttribute() {
        return attribute;
    }

    public void setAttribute(Integer attribute) {
        this.attribute = attribute;
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
        if (!(object instanceof MemberAccount)) {
            return false;
        }
        MemberAccount other = (MemberAccount) object;
        if ((this.accountID == null && other.accountID != null) || (this.accountID != null && !this.accountID.equals(other.accountID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.userInfo.MemberAccount[ accountID=" + accountID + " ]";
    }
    
}
