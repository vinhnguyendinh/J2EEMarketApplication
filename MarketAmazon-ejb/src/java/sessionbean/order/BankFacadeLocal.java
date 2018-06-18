/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sessionbean.order;

import entities.order.Bank;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author vinhnguyen
 */
@Local
public interface BankFacadeLocal {

    void create(Bank bank);

    void edit(Bank bank);

    void remove(Bank bank);

    Bank find(Object id);

    List<Bank> findAll();

    List<Bank> findRange(int[] range);

    int count();
    
}
