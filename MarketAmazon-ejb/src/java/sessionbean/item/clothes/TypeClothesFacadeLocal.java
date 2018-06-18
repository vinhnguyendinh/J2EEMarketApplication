/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sessionbean.item.clothes;

import entities.item.clothes.TypeClothes;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author vinhnguyen
 */
@Local
public interface TypeClothesFacadeLocal {

    void create(TypeClothes typeClothes);

    void edit(TypeClothes typeClothes);

    void remove(TypeClothes typeClothes);

    TypeClothes find(Object id);

    List<TypeClothes> findAll();

    List<TypeClothes> findRange(int[] range);

    int count();
    
}
