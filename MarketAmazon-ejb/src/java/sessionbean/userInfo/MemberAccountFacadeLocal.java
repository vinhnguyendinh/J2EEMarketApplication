/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sessionbean.userInfo;

import entities.userInfo.MemberAccount;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author vinhnguyen
 */
@Local
public interface MemberAccountFacadeLocal {

    void create(MemberAccount memberAccount);

    void edit(MemberAccount memberAccount);

    void remove(MemberAccount memberAccount);

    MemberAccount find(Object id);

    List<MemberAccount> findAll();

    List<MemberAccount> findRange(int[] range);

    int count();
    
}
