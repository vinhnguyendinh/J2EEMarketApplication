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
@Table(name = "VIPAccount")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VIPAccount.findAll", query = "SELECT v FROM VIPAccount v"),
    @NamedQuery(name = "VIPAccount.findByRuleVip", query = "SELECT v FROM VIPAccount v WHERE v.ruleVip = :ruleVip"),
    @NamedQuery(name = "VIPAccount.findByVipInformation", query = "SELECT v FROM VIPAccount v WHERE v.vipInformation = :vipInformation"),
    @NamedQuery(name = "VIPAccount.findByAccountID", query = "SELECT v FROM VIPAccount v WHERE v.accountID = :accountID")})
public class VIPAccount implements Serializable {
    private static final long serialVersionUID = 1L;
    @Size(max = 255)
    @Column(name = "RuleVip")
    private String ruleVip;
    @Size(max = 255)
    @Column(name = "VipInformation")
    private String vipInformation;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "AccountID")
    private Integer accountID;
    @JoinColumn(name = "AccountID", referencedColumnName = "ID", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Account account;

    public VIPAccount() {
    }

    public VIPAccount(Integer accountID) {
        this.accountID = accountID;
    }

    public String getRuleVip() {
        return ruleVip;
    }

    public void setRuleVip(String ruleVip) {
        this.ruleVip = ruleVip;
    }

    public String getVipInformation() {
        return vipInformation;
    }

    public void setVipInformation(String vipInformation) {
        this.vipInformation = vipInformation;
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
        if (!(object instanceof VIPAccount)) {
            return false;
        }
        VIPAccount other = (VIPAccount) object;
        if ((this.accountID == null && other.accountID != null) || (this.accountID != null && !this.accountID.equals(other.accountID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.userInfo.VIPAccount[ accountID=" + accountID + " ]";
    }
    
}
