/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sessionbean.item.clothes;

import entities.item.clothes.Color;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author vinhnguyen
 */
@Stateless
public class ColorFacade extends AbstractFacade<Color> implements ColorFacadeLocal {
    @PersistenceContext(unitName = "MarketAmazon-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ColorFacade() {
        super(Color.class);
    }
    
}
