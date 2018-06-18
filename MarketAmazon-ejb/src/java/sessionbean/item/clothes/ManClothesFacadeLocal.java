/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sessionbean.item.clothes;

import entities.item.clothes.ManClothes;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author vinhnguyen
 */
@Local
public interface ManClothesFacadeLocal {

    void create(ManClothes manClothes);

    void edit(ManClothes manClothes);

    void remove(ManClothes manClothes);

    ManClothes find(Object id);

    List<ManClothes> findAll();

    List<ManClothes> findRange(int[] range);

    int count();
    
}
