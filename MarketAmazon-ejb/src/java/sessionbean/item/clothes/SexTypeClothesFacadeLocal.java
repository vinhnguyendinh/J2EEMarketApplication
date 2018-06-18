/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sessionbean.item.clothes;

import entities.item.clothes.SexTypeClothes;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author vinhnguyen
 */
@Local
public interface SexTypeClothesFacadeLocal {

    void create(SexTypeClothes sexTypeClothes);

    void edit(SexTypeClothes sexTypeClothes);

    void remove(SexTypeClothes sexTypeClothes);

    SexTypeClothes find(Object id);

    List<SexTypeClothes> findAll();

    List<SexTypeClothes> findRange(int[] range);

    int count();
    
}
