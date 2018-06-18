/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sessionbean.userInfo;

import entities.userInfo.SMemberAccount;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author vinhnguyen
 */
@Local
public interface SMemberAccountFacadeLocal {

    void create(SMemberAccount sMemberAccount);

    void edit(SMemberAccount sMemberAccount);

    void remove(SMemberAccount sMemberAccount);

    SMemberAccount find(Object id);

    List<SMemberAccount> findAll();

    List<SMemberAccount> findRange(int[] range);

    int count();
    
}
