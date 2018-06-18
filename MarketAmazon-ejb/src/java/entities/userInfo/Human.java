/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entities.userInfo;

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
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author vinhnguyen
 */
@Entity
@Table(name = "Human")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Human.findAll", query = "SELECT h FROM Human h"),
    @NamedQuery(name = "Human.findById", query = "SELECT h FROM Human h WHERE h.id = :id"),
    @NamedQuery(name = "Human.findByName", query = "SELECT h FROM Human h WHERE h.name = :name"),
    @NamedQuery(name = "Human.findByAddress", query = "SELECT h FROM Human h WHERE h.address = :address"),
    @NamedQuery(name = "Human.findByAcc", query = "SELECT h FROM Human h WHERE h.acc = :acc"),
    @NamedQuery(name = "Human.findByBirthday", query = "SELECT h FROM Human h WHERE h.birthday = :birthday")})
public class Human implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Column(name = "Name")
    private Integer name;
    @Column(name = "Address")
    private Integer address;
    @Column(name = "Acc")
    private Integer acc;
    @Column(name = "Birthday")
    private Integer birthday;
    @JoinColumn(name = "CustomerHumanID", referencedColumnName = "HumanID")
    @ManyToOne(optional = false)
    private Customer customerHumanID;
    @JoinColumn(name = "EmployeeHumanID", referencedColumnName = "HumanID")
    @ManyToOne(optional = false)
    private Employee employeeHumanID;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "humanID")
    private Collection<Account> accountCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "humanID")
    private Collection<Address> addressCollection;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "human")
    private Customer customer;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "humanID")
    private Collection<Birthday> birthdayCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "humanID")
    private Collection<Name> nameCollection;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "human")
    private Employee employee;

    public Human() {
    }

    public Human(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getName() {
        return name;
    }

    public void setName(Integer name) {
        this.name = name;
    }

    public Integer getAddress() {
        return address;
    }

    public void setAddress(Integer address) {
        this.address = address;
    }

    public Integer getAcc() {
        return acc;
    }

    public void setAcc(Integer acc) {
        this.acc = acc;
    }

    public Integer getBirthday() {
        return birthday;
    }

    public void setBirthday(Integer birthday) {
        this.birthday = birthday;
    }

    public Customer getCustomerHumanID() {
        return customerHumanID;
    }

    public void setCustomerHumanID(Customer customerHumanID) {
        this.customerHumanID = customerHumanID;
    }

    public Employee getEmployeeHumanID() {
        return employeeHumanID;
    }

    public void setEmployeeHumanID(Employee employeeHumanID) {
        this.employeeHumanID = employeeHumanID;
    }

    @XmlTransient
    public Collection<Account> getAccountCollection() {
        return accountCollection;
    }

    public void setAccountCollection(Collection<Account> accountCollection) {
        this.accountCollection = accountCollection;
    }

    @XmlTransient
    public Collection<Address> getAddressCollection() {
        return addressCollection;
    }

    public void setAddressCollection(Collection<Address> addressCollection) {
        this.addressCollection = addressCollection;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @XmlTransient
    public Collection<Birthday> getBirthdayCollection() {
        return birthdayCollection;
    }

    public void setBirthdayCollection(Collection<Birthday> birthdayCollection) {
        this.birthdayCollection = birthdayCollection;
    }

    @XmlTransient
    public Collection<Name> getNameCollection() {
        return nameCollection;
    }

    public void setNameCollection(Collection<Name> nameCollection) {
        this.nameCollection = nameCollection;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
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
        if (!(object instanceof Human)) {
            return false;
        }
        Human other = (Human) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.userInfo.Human[ id=" + id + " ]";
    }
    
}
