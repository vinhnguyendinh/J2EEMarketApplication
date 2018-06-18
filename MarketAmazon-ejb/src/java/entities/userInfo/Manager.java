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
@Table(name = "Manager")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Manager.findAll", query = "SELECT m FROM Manager m"),
    @NamedQuery(name = "Manager.findByManagerRule", query = "SELECT m FROM Manager m WHERE m.managerRule = :managerRule"),
    @NamedQuery(name = "Manager.findByEmployeeTypeId", query = "SELECT m FROM Manager m WHERE m.employeeTypeId = :employeeTypeId")})
public class Manager implements Serializable {
    private static final long serialVersionUID = 1L;
    @Size(max = 255)
    @Column(name = "ManagerRule")
    private String managerRule;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "EmployeeTypeId")
    private Integer employeeTypeId;
    @JoinColumn(name = "EmployeeTypeId", referencedColumnName = "Id", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private EmployeeType employeeType;

    public Manager() {
    }

    public Manager(Integer employeeTypeId) {
        this.employeeTypeId = employeeTypeId;
    }

    public String getManagerRule() {
        return managerRule;
    }

    public void setManagerRule(String managerRule) {
        this.managerRule = managerRule;
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
        if (!(object instanceof Manager)) {
            return false;
        }
        Manager other = (Manager) object;
        if ((this.employeeTypeId == null && other.employeeTypeId != null) || (this.employeeTypeId != null && !this.employeeTypeId.equals(other.employeeTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.userInfo.Manager[ employeeTypeId=" + employeeTypeId + " ]";
    }
    
}
