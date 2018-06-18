/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sessionbean.item.clothes;

import entities.item.clothes.ClothesProduct;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author vinhnguyen
 */
@Local
public interface ClothesProductFacadeLocal {

    void create(ClothesProduct clothesProduct);

    void edit(ClothesProduct clothesProduct);

    void remove(ClothesProduct clothesProduct);

    ClothesProduct find(Object id);

    List<ClothesProduct> findAll();

    List<ClothesProduct> findRange(int[] range);

    int count();
    
}
