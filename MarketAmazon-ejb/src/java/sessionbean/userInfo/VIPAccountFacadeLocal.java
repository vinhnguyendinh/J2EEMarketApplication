/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sessionbean.userInfo;

import entities.userInfo.VIPAccount;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author vinhnguyen
 */
@Local
public interface VIPAccountFacadeLocal {

    void create(VIPAccount vIPAccount);

    void edit(VIPAccount vIPAccount);

    void remove(VIPAccount vIPAccount);

    VIPAccount find(Object id);

    List<VIPAccount> findAll();

    List<VIPAccount> findRange(int[] range);

    int count();
    
}
