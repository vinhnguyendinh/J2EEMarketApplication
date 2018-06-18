/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sessionbean.itemManager;

import entities.itemManager.TopProduct;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author vinhnguyen
 */
@Local
public interface TopProductFacadeLocal {

    void create(TopProduct topProduct);

    void edit(TopProduct topProduct);

    void remove(TopProduct topProduct);

    TopProduct find(Object id);

    List<TopProduct> findAll();

    List<TopProduct> findRange(int[] range);

    int count();
    
}
