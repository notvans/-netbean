/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Administrator
 */
@Stateless
public class PurchaseDetailFacade extends AbstractFacade<PurchaseDetail> {

    @PersistenceContext(unitName = "5705404005PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PurchaseDetailFacade() {
        super(PurchaseDetail.class);
    }
    
}
