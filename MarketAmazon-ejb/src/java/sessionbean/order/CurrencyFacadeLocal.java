/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sessionbean.order;

import entities.order.Currency;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author vinhnguyen
 */
@Local
public interface CurrencyFacadeLocal {

    void create(Currency currency);

    void edit(Currency currency);

    void remove(Currency currency);

    Currency find(Object id);

    List<Currency> findAll();

    List<Currency> findRange(int[] range);

    int count();
    
}
