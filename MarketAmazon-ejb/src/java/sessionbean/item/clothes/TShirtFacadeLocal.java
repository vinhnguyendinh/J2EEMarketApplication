/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sessionbean.item.clothes;

import entities.item.clothes.TShirt;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author vinhnguyen
 */
@Local
public interface TShirtFacadeLocal {

    void create(TShirt tShirt);

    void edit(TShirt tShirt);

    void remove(TShirt tShirt);

    TShirt find(Object id);

    List<TShirt> findAll();

    List<TShirt> findRange(int[] range);

    int count();
    
}
