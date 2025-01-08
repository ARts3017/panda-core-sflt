/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.app.core.panda.sflt.repositorio;

import com.app.core.panda.sflt.entidad.Nombres;
import com.app.core.panda.sflt.persistencia.PandaCoreSfltPercistenciaImp;
import jakarta.ejb.Stateless;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import java.util.List;

/**
 *
 * @author xmk0880
 */
@Stateless
public class NombresRepositorio extends PandaCoreSfltPercistenciaImp<Nombres>{
    
    public NombresRepositorio(){
        super(Nombres.class);
    }
    
     protected EntityManager getEntityManager() {
        return em;
    }
     
     public List<Nombres> findAll(){
         Query query = em.createQuery("SELECT n FROM Nombres n");
        return query.getResultList();
        
       
         
     }
    
    
}
