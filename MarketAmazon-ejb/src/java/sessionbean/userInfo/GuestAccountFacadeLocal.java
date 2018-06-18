/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sessionbean.userInfo;

import entities.userInfo.GuestAccount;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author vinhnguyen
 */
@Local
public interface GuestAccountFacadeLocal {

    void create(GuestAccount guestAccount);

    void edit(GuestAccount guestAccount);

    void remove(GuestAccount guestAccount);

    GuestAccount find(Object id);

    List<GuestAccount> findAll();

    List<GuestAccount> findRange(int[] range);

    int count();
    
}
