/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sessionbean.item.clothes;

import entities.item.clothes.Dress;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author vinhnguyen
 */
@Local
public interface DressFacadeLocal {

    void create(Dress dress);

    void edit(Dress dress);

    void remove(Dress dress);

    Dress find(Object id);

    List<Dress> findAll();

    List<Dress> findRange(int[] range);

    int count();
    
}
