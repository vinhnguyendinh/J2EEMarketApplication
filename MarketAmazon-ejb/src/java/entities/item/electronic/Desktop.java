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
@Table(name = "Desktop")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Desktop.findAll", query = "SELECT d FROM Desktop d"),
    @NamedQuery(name = "Desktop.findByDescription", query = "SELECT d FROM Desktop d WHERE d.description = :description"),
    @NamedQuery(name = "Desktop.findByCardDisplay", query = "SELECT d FROM Desktop d WHERE d.cardDisplay = :cardDisplay"),
    @NamedQuery(name = "Desktop.findByComputerTypeID", query = "SELECT d FROM Desktop d WHERE d.computerTypeID = :computerTypeID")})
public class Desktop implements Serializable {
    private static final long serialVersionUID = 1L;
    @Size(max = 255)
    @Column(name = "Description")
    private String description;
    @Size(max = 255)
    @Column(name = "CardDisplay")
    private String cardDisplay;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ComputerTypeID")
    private Integer computerTypeID;
    @JoinColumn(name = "ComputerTypeID", referencedColumnName = "ID", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private ComputerType computerType;

    public Desktop() {
    }

    public Desktop(Integer computerTypeID) {
        this.computerTypeID = computerTypeID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCardDisplay() {
        return cardDisplay;
    }

    public void setCardDisplay(String cardDisplay) {
        this.cardDisplay = cardDisplay;
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
        if (!(object instanceof Desktop)) {
            return false;
        }
        Desktop other = (Desktop) object;
        if ((this.computerTypeID == null && other.computerTypeID != null) || (this.computerTypeID != null && !this.computerTypeID.equals(other.computerTypeID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.item.electronic.Desktop[ computerTypeID=" + computerTypeID + " ]";
    }
    
}
