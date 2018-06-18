/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sessionbean.item.clothes;

import entities.item.clothes.ManClothesType;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author vinhnguyen
 */
@Local
public interface ManClothesTypeFacadeLocal {

    void create(ManClothesType manClothesType);

    void edit(ManClothesType manClothesType);

    void remove(ManClothesType manClothesType);

    ManClothesType find(Object id);

    List<ManClothesType> findAll();

    List<ManClothesType> findRange(int[] range);

    int count();
    
}
