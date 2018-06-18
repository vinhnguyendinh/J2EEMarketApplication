/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sessionbean.item.clothes;

import entities.item.clothes.WomenClothesType;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author vinhnguyen
 */
@Local
public interface WomenClothesTypeFacadeLocal {

    void create(WomenClothesType womenClothesType);

    void edit(WomenClothesType womenClothesType);

    void remove(WomenClothesType womenClothesType);

    WomenClothesType find(Object id);

    List<WomenClothesType> findAll();

    List<WomenClothesType> findRange(int[] range);

    int count();
    
}
