/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sessionbean.item.clothes;

import entities.item.clothes.JeansWoman;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author vinhnguyen
 */
@Local
public interface JeansWomanFacadeLocal {

    void create(JeansWoman jeansWoman);

    void edit(JeansWoman jeansWoman);

    void remove(JeansWoman jeansWoman);

    JeansWoman find(Object id);

    List<JeansWoman> findAll();

    List<JeansWoman> findRange(int[] range);

    int count();
    
}
