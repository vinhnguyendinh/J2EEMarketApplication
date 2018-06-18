/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sessionbean.item.electronic;

import entities.item.electronic.ElectronicProduct;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author vinhnguyen
 */
@Local
public interface ElectronicProductFacadeLocal {

    void create(ElectronicProduct electronicProduct);

    void edit(ElectronicProduct electronicProduct);

    void remove(ElectronicProduct electronicProduct);

    ElectronicProduct find(Object id);

    List<ElectronicProduct> findAll();

    List<ElectronicProduct> findRange(int[] range);

    int count();
    
}
