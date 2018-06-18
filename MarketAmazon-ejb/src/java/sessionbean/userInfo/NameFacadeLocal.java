/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sessionbean.userInfo;

import entities.userInfo.Name;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author vinhnguyen
 */
@Local
public interface NameFacadeLocal {

    void create(Name name);

    void edit(Name name);

    void remove(Name name);

    Name find(Object id);

    List<Name> findAll();

    List<Name> findRange(int[] range);

    int count();
    
}
