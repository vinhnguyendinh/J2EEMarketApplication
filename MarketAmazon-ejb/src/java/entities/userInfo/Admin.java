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
@Table(name = "Admin")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Admin.findAll", query = "SELECT a FROM Admin a"),
    @NamedQuery(name = "Admin.findByAdminRule", query = "SELECT a FROM Admin a WHERE a.adminRule = :adminRule"),
    @NamedQuery(name = "Admin.findByRaw", query = "SELECT a FROM Admin a WHERE a.raw = :raw"),
    @NamedQuery(name = "Admin.findByEmployeeTypeId", query = "SELECT a FROM Admin a WHERE a.employeeTypeId = :employeeTypeId")})
public class Admin implements Serializable {
    private static final long serialVersionUID = 1L;
    @Size(max = 255)
    @Column(name = "AdminRule")
    private String adminRule;
    @Size(max = 255)
    @Column(name = "Raw")
    private String raw;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "EmployeeTypeId")
    private Integer employeeTypeId;
    @JoinColumn(name = "EmployeeTypeId", referencedColumnName = "Id", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private EmployeeType employeeType;

    public Admin() {
    }

    public Admin(Integer employeeTypeId) {
        this.employeeTypeId = employeeTypeId;
    }

    public String getAdminRule() {
        return adminRule;
    }

    public void setAdminRule(String adminRule) {
        this.adminRule = adminRule;
    }

    public String getRaw() {
        return raw;
    }

    public void setRaw(String raw) {
        this.raw = raw;
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
        if (!(object instanceof Admin)) {
            return false;
        }
        Admin other = (Admin) object;
        if ((this.employeeTypeId == null && other.employeeTypeId != null) || (this.employeeTypeId != null && !this.employeeTypeId.equals(other.employeeTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.userInfo.Admin[ employeeTypeId=" + employeeTypeId + " ]";
    }
    
}
