/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.glassfish.samples;

import java.util.List;
import javax.ejb.Stateless;
import javax.inject.Inject;
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

    @Inject Friend friend;
    
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    public List getList() {
        return em.createNamedQuery("Friend.findAll").getResultList();
    }

    public void create() {
        Friend f2 = new Friend(friend.getName(), friend.getAge());
        em.persist(f2);
    }
}
