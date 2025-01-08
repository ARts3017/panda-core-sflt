/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.app.core.panda.sflt.persistencia;

import java.util.List;

/**
 *
 * @author xmk0880
 */
public interface PandaCoreSlftPercistencia<T> {
    
      T save(T entity);

      T update(T entity);

      T findById(Object entityId);

      void delete(T entity);

       List<T> findAll();
    
}
