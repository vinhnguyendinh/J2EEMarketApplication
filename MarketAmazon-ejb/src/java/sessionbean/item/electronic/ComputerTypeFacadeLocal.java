/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sessionbean.item.electronic;

import entities.item.electronic.ComputerType;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author vinhnguyen
 */
@Local
public interface ComputerTypeFacadeLocal {

    void create(ComputerType computerType);

    void edit(ComputerType computerType);

    void remove(ComputerType computerType);

    ComputerType find(Object id);

    List<ComputerType> findAll();

    List<ComputerType> findRange(int[] range);

    int count();
    
}
