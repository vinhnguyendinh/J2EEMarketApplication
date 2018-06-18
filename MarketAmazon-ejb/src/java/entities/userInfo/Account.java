/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entities.userInfo;

import entities.itemManager.Comment;
import java.io.Serializable;
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
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author vinhnguyen
 */
@Entity
@Table(name = "Account")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Account.findAll", query = "SELECT a FROM Account a"),
    @NamedQuery(name = "Account.findById", query = "SELECT a FROM Account a WHERE a.id = :id"),
    @NamedQuery(name = "Account.findByUsername", query = "SELECT a FROM Account a WHERE a.username = :username"),
    @NamedQuery(name = "Account.findByPassword", query = "SELECT a FROM Account a WHERE a.password = :password")})
public class Account implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Size(max = 255)
    @Column(name = "Username")
    private String username;
    @Size(max = 255)
    @Column(name = "Password")
    private String password;
    @JoinColumn(name = "HumanID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Human humanID;
    @JoinColumn(name = "CommentID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Comment commentID;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "account")
    private GuestAccount guestAccount;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "account")
    private VIPAccount vIPAccount;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "account")
    private SMemberAccount sMemberAccount;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "account")
    private MemberAccount memberAccount;

    public Account() {
    }

    public Account(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Human getHumanID() {
        return humanID;
    }

    public void setHumanID(Human humanID) {
        this.humanID = humanID;
    }

    public Comment getCommentID() {
        return commentID;
    }

    public void setCommentID(Comment commentID) {
        this.commentID = commentID;
    }

    public GuestAccount getGuestAccount() {
        return guestAccount;
    }

    public void setGuestAccount(GuestAccount guestAccount) {
        this.guestAccount = guestAccount;
    }

    public VIPAccount getVIPAccount() {
        return vIPAccount;
    }

    public void setVIPAccount(VIPAccount vIPAccount) {
        this.vIPAccount = vIPAccount;
    }

    public SMemberAccount getSMemberAccount() {
        return sMemberAccount;
    }

    public void setSMemberAccount(SMemberAccount sMemberAccount) {
        this.sMemberAccount = sMemberAccount;
    }

    public MemberAccount getMemberAccount() {
        return memberAccount;
    }

    public void setMemberAccount(MemberAccount memberAccount) {
        this.memberAccount = memberAccount;
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
        if (!(object instanceof Account)) {
            return false;
        }
        Account other = (Account) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.userInfo.Account[ id=" + id + " ]";
    }
    
}
