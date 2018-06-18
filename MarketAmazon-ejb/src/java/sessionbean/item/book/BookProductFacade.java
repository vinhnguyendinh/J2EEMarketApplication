/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sessionbean.item.book;

import entities.item.book.BookProduct;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author vinhnguyen
 */
@Stateless
public class BookProductFacade extends AbstractFacade<BookProduct> implements BookProductFacadeLocal {
    @PersistenceContext(unitName = "MarketAmazon-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public BookProductFacade() {
        super(BookProduct.class);
    }
    
}
