/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.glassfish.samples;

import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.glassfish.samples.model.Friend;

/**
 *
 * @author pdurbin
 */
@Stateless
@Named
public class FriendEJB {

    @PersistenceContext
    EntityManager em;
    
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    public List getList() {
        return em.createNamedQuery("Friend.findAll").getResultList();
    }
    
}
