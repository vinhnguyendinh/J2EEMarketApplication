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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author vinhnguyen
 */
@Entity
@Table(name = "Seller")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Seller.findAll", query = "SELECT s FROM Seller s"),
    @NamedQuery(name = "Seller.findBySalary", query = "SELECT s FROM Seller s WHERE s.salary = :salary"),
    @NamedQuery(name = "Seller.findByGrantedAccess", query = "SELECT s FROM Seller s WHERE s.grantedAccess = :grantedAccess"),
    @NamedQuery(name = "Seller.findByEmployeeTypeId", query = "SELECT s FROM Seller s WHERE s.employeeTypeId = :employeeTypeId")})
public class Seller implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Salary")
    private float salary;
    @Basic(optional = false)
    @NotNull
    @Column(name = "GrantedAccess")
    private boolean grantedAccess;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "EmployeeTypeId")
    private Integer employeeTypeId;
    @JoinColumn(name = "EmployeeTypeId", referencedColumnName = "Id", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private EmployeeType employeeType;

    public Seller() {
    }

    public Seller(Integer employeeTypeId) {
        this.employeeTypeId = employeeTypeId;
    }

    public Seller(Integer employeeTypeId, float salary, boolean grantedAccess) {
        this.employeeTypeId = employeeTypeId;
        this.salary = salary;
        this.grantedAccess = grantedAccess;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public boolean getGrantedAccess() {
        return grantedAccess;
    }

    public void setGrantedAccess(boolean grantedAccess) {
        this.grantedAccess = grantedAccess;
    }

    public Integer getEmployeeTypeId() {
        return employeeTypeId;
    }

    public void setEmployeeTypeId(Integer employeeTypeId) {
        this.employeeTypeId = employeeTypeId;
    }

    public EmployeeType getEmployeeType() {
        return employeeType;
    }

    public void setEmployeeType(EmployeeType employeeType) {
        this.employeeType = employeeType;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (employeeTypeId != null ? employeeTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Seller)) {
            return false;
        }
        Seller other = (Seller) object;
        if ((this.employeeTypeId == null && other.employeeTypeId != null) || (this.employeeTypeId != null && !this.employeeTypeId.equals(other.employeeTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.userInfo.Seller[ employeeTypeId=" + employeeTypeId + " ]";
    }
    
}
