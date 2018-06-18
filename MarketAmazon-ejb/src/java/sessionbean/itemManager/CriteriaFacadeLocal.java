/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sessionbean.itemManager;

import entities.itemManager.Criteria;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author vinhnguyen
 */
@Local
public interface CriteriaFacadeLocal {

    void create(Criteria criteria);

    void edit(Criteria criteria);

    void remove(Criteria criteria);

    Criteria find(Object id);

    List<Criteria> findAll();

    List<Criteria> findRange(int[] range);

    int count();
    
}
