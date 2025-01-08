/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.app.core.panda.sflt.persistencia;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.criteria.CriteriaQuery;
import java.util.List;

/**
 *
 * @author xmk0880
 */
public abstract class PandaCoreSfltPercistenciaImp<T> implements PandaCoreSlftPercistencia<T> {
    
    private final Class<T> entityClass;

    public PandaCoreSfltPercistenciaImp(Class<T>entityClass ) {
        this.entityClass = entityClass;
    }
    
     @PersistenceContext(unitName = "PandaSflt")
     protected EntityManager em;

    protected abstract EntityManager getEntityManager();

    @Override
    public T save(T entity) {
         getEntityManager().persist(entity);
        return entity;
    }

    @Override
    public T update(T entity) {
        getEntityManager().merge(entity);
        return entity;
    }

    @Override
    public T findById(Object entityId) {
        return getEntityManager().find(entityClass, entityId);
    }

    @Override
    public void delete(T entity) {
       getEntityManager().remove(getEntityManager().merge(entity));
    }

    @Override
    public List<T> findAll() {
         CriteriaQuery cq = getEntityManager().getCriteriaBuilder().createQuery();
        cq.select(cq.from(entityClass));
        return getEntityManager().createQuery(cq).getResultList();
    }
    
}
