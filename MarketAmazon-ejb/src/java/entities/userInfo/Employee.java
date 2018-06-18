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
@Table(name = "Employee")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Employee.findAll", query = "SELECT e FROM Employee e"),
    @NamedQuery(name = "Employee.findByPosition", query = "SELECT e FROM Employee e WHERE e.position = :position"),
    @NamedQuery(name = "Employee.findByTitle", query = "SELECT e FROM Employee e WHERE e.title = :title"),
    @NamedQuery(name = "Employee.findByWebsite", query = "SELECT e FROM Employee e WHERE e.website = :website"),
    @NamedQuery(name = "Employee.findByCompany", query = "SELECT e FROM Employee e WHERE e.company = :company"),
    @NamedQuery(name = "Employee.findByEmployeeType", query = "SELECT e FROM Employee e WHERE e.employeeType = :employeeType"),
    @NamedQuery(name = "Employee.findByHumanID", query = "SELECT e FROM Employee e WHERE e.humanID = :humanID")})
public class Employee implements Serializable {
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "employeeHumanID")
    private Collection<Company> companyCollection;
    private static final long serialVersionUID = 1L;
    @Size(max = 255)
    @Column(name = "Position")
    private String position;
    @Size(max = 255)
    @Column(name = "Title")
    private String title;
    @Size(max = 255)
    @Column(name = "Website")
    private String website;
    @Column(name = "Company")
    private Integer company;
    @Column(name = "EmployeeType")
    private Integer employeeType;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "HumanID")
    private Integer humanID;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "employeeHumanID")
    private Collection<Human> humanCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "employeeHumanID")
    private Collection<EmployeeType> employeeTypeCollection;
    @JoinColumn(name = "CartID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Cart cartID;
    @JoinColumn(name = "HumanID", referencedColumnName = "ID", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Human human;

    public Employee() {
    }

    public Employee(Integer humanID) {
        this.humanID = humanID;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public Integer getCompany() {
        return company;
    }

    public void setCompany(Integer company) {
        this.company = company;
    }

    public Integer getEmployeeType() {
        return employeeType;
    }

    public void setEmployeeType(Integer employeeType) {
        this.employeeType = employeeType;
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

    @XmlTransient
    public Collection<EmployeeType> getEmployeeTypeCollection() {
        return employeeTypeCollection;
    }

    public void setEmployeeTypeCollection(Collection<EmployeeType> employeeTypeCollection) {
        this.employeeTypeCollection = employeeTypeCollection;
    }

    public Cart getCartID() {
        return cartID;
    }

    public void setCartID(Cart cartID) {
        this.cartID = cartID;
    }

    public Human getHuman() {
        return human;
    }

    public void setHuman(Human human) {
        this.human = human;
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
        if (!(object instanceof Employee)) {
            return false;
        }
        Employee other = (Employee) object;
        if ((this.humanID == null && other.humanID != null) || (this.humanID != null && !this.humanID.equals(other.humanID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.userInfo.Employee[ humanID=" + humanID + " ]";
    }

    @XmlTransient
    public Collection<Company> getCompanyCollection() {
        return companyCollection;
    }

    public void setCompanyCollection(Collection<Company> companyCollection) {
        this.companyCollection = companyCollection;
    }
    
}
