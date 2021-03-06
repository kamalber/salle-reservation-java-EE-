/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.Secretaire;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author kamal
 */
@Stateless
public class SecretaireFacade extends AbstractFacade<Secretaire> {

    @PersistenceContext(unitName = "reservationSallePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public SecretaireFacade() {
        super(Secretaire.class);
    }
    
}
