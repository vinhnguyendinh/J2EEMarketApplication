/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sessionbean.item.clothes;

import entities.item.clothes.WomanClothes;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author vinhnguyen
 */
@Local
public interface WomanClothesFacadeLocal {

    void create(WomanClothes womanClothes);

    void edit(WomanClothes womanClothes);

    void remove(WomanClothes womanClothes);

    WomanClothes find(Object id);

    List<WomanClothes> findAll();

    List<WomanClothes> findRange(int[] range);

    int count();
    
}
