/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package entities.item.electronic;

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
@Table(name = "ElectronicType")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ElectronicType.findAll", query = "SELECT e FROM ElectronicType e"),
    @NamedQuery(name = "ElectronicType.findById", query = "SELECT e FROM ElectronicType e WHERE e.id = :id"),
    @NamedQuery(name = "ElectronicType.findByName", query = "SELECT e FROM ElectronicType e WHERE e.name = :name"),
    @NamedQuery(name = "ElectronicType.findByDescription", query = "SELECT e FROM ElectronicType e WHERE e.description = :description"),
    @NamedQuery(name = "ElectronicType.findByCpu", query = "SELECT e FROM ElectronicType e WHERE e.cpu = :cpu"),
    @NamedQuery(name = "ElectronicType.findByTypeKeyboard", query = "SELECT e FROM ElectronicType e WHERE e.typeKeyboard = :typeKeyboard"),
    @NamedQuery(name = "ElectronicType.findByComputerType", query = "SELECT e FROM ElectronicType e WHERE e.computerType = :computerType"),
    @NamedQuery(name = "ElectronicType.findByScreenSize", query = "SELECT e FROM ElectronicType e WHERE e.screenSize = :screenSize"),
    @NamedQuery(name = "ElectronicType.findByIsTouch", query = "SELECT e FROM ElectronicType e WHERE e.isTouch = :isTouch"),
    @NamedQuery(name = "ElectronicType.findByDiscriminator", query = "SELECT e FROM ElectronicType e WHERE e.discriminator = :discriminator")})
public class ElectronicType implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Size(max = 255)
    @Column(name = "Name")
    private String name;
    @Size(max = 255)
    @Column(name = "Description")
    private String description;
    @Size(max = 255)
    @Column(name = "CPU")
    private String cpu;
    @Size(max = 255)
    @Column(name = "TypeKeyboard")
    private String typeKeyboard;
    @Column(name = "ComputerType")
    private Integer computerType;
    @Size(max = 255)
    @Column(name = "ScreenSize")
    private String screenSize;
    @Column(name = "IsTouch")
    private Boolean isTouch;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "Discriminator")
    private String discriminator;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "electronicTypeID")
    private Collection<ComputerType> computerTypeCollection;
    @JoinColumn(name = "ElectronicProductProductTypeID", referencedColumnName = "ProductTypeID")
    @ManyToOne(optional = false)
    private ElectronicProduct electronicProductProductTypeID;

    public ElectronicType() {
    }

    public ElectronicType(Integer id) {
        this.id = id;
    }

    public ElectronicType(Integer id, String discriminator) {
        this.id = id;
        this.discriminator = discriminator;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getTypeKeyboard() {
        return typeKeyboard;
    }

    public void setTypeKeyboard(String typeKeyboard) {
        this.typeKeyboard = typeKeyboard;
    }

    public Integer getComputerType() {
        return computerType;
    }

    public void setComputerType(Integer computerType) {
        this.computerType = computerType;
    }

    public String getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(String screenSize) {
        this.screenSize = screenSize;
    }

    public Boolean getIsTouch() {
        return isTouch;
    }

    public void setIsTouch(Boolean isTouch) {
        this.isTouch = isTouch;
    }

    public String getDiscriminator() {
        return discriminator;
    }

    public void setDiscriminator(String discriminator) {
        this.discriminator = discriminator;
    }

    @XmlTransient
    public Collection<ComputerType> getComputerTypeCollection() {
        return computerTypeCollection;
    }

    public void setComputerTypeCollection(Collection<ComputerType> computerTypeCollection) {
        this.computerTypeCollection = computerTypeCollection;
    }

    public ElectronicProduct getElectronicProductProductTypeID() {
        return electronicProductProductTypeID;
    }

    public void setElectronicProductProductTypeID(ElectronicProduct electronicProductProductTypeID) {
        this.electronicProductProductTypeID = electronicProductProductTypeID;
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
        if (!(object instanceof ElectronicType)) {
            return false;
        }
        ElectronicType other = (ElectronicType) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.item.electronic.ElectronicType[ id=" + id + " ]";
    }
    
}
