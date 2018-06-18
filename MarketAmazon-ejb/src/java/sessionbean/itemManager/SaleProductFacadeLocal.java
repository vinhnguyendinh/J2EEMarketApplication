/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sessionbean.itemManager;

import entities.itemManager.SaleProduct;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author vinhnguyen
 */
@Local
public interface SaleProductFacadeLocal {

    void create(SaleProduct saleProduct);

    void edit(SaleProduct saleProduct);

    void remove(SaleProduct saleProduct);

    SaleProduct find(Object id);

    List<SaleProduct> findAll();

    List<SaleProduct> findRange(int[] range);

    int count();
    
}
