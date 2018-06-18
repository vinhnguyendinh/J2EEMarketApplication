/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entities.item.electronic;

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
@Table(name = "Laptop")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Laptop.findAll", query = "SELECT l FROM Laptop l"),
    @NamedQuery(name = "Laptop.findByIsTouch", query = "SELECT l FROM Laptop l WHERE l.isTouch = :isTouch"),
    @NamedQuery(name = "Laptop.findByDescription", query = "SELECT l FROM Laptop l WHERE l.description = :description"),
    @NamedQuery(name = "Laptop.findByComputerTypeID", query = "SELECT l FROM Laptop l WHERE l.computerTypeID = :computerTypeID")})
public class Laptop implements Serializable {
    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "IsTouch")
    private boolean isTouch;
    @Size(max = 255)
    @Column(name = "Description")
    private String description;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ComputerTypeID")
    private Integer computerTypeID;
    @JoinColumn(name = "ComputerTypeID", referencedColumnName = "ID", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private ComputerType computerType;

    public Laptop() {
    }

    public Laptop(Integer computerTypeID) {
        this.computerTypeID = computerTypeID;
    }

    public Laptop(Integer computerTypeID, boolean isTouch) {
        this.computerTypeID = computerTypeID;
        this.isTouch = isTouch;
    }

    public boolean getIsTouch() {
        return isTouch;
    }

    public void setIsTouch(boolean isTouch) {
        this.isTouch = isTouch;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getComputerTypeID() {
        return computerTypeID;
    }

    public void setComputerTypeID(Integer computerTypeID) {
        this.computerTypeID = computerTypeID;
    }

    public ComputerType getComputerType() {
        return computerType;
    }

    public void setComputerType(ComputerType computerType) {
        this.computerType = computerType;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (computerTypeID != null ? computerTypeID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Laptop)) {
            return false;
        }
        Laptop other = (Laptop) object;
        if ((this.computerTypeID == null && other.computerTypeID != null) || (this.computerTypeID != null && !this.computerTypeID.equals(other.computerTypeID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.item.electronic.Laptop[ computerTypeID=" + computerTypeID + " ]";
    }
    
}
