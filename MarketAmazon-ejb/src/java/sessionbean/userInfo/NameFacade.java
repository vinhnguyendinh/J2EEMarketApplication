/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sessionbean.userInfo;

import entities.userInfo.Name;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author vinhnguyen
 */
@Stateless
public class NameFacade extends AbstractFacade<Name> implements NameFacadeLocal {
    @PersistenceContext(unitName = "MarketAmazon-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public NameFacade() {
        super(Name.class);
    }
    
}
