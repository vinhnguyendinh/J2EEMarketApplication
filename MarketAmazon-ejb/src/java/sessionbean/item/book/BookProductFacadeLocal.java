/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sessionbean.item.book;

import entities.item.book.BookProduct;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author vinhnguyen
 */
@Local
public interface BookProductFacadeLocal {

    void create(BookProduct bookProduct);

    void edit(BookProduct bookProduct);

    void remove(BookProduct bookProduct);

    BookProduct find(Object id);

    List<BookProduct> findAll();

    List<BookProduct> findRange(int[] range);

    int count();
    
}
