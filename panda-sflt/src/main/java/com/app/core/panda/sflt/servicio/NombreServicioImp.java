/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.app.core.panda.sflt.servicio;

import com.app.core.panda.sflt.entidad.Nombres;
import com.app.core.panda.sflt.repositorio.NombresRepositorio;
import jakarta.ejb.EJB;
import jakarta.ejb.Stateless;
import java.util.List;

/**
 *
 * @author xmk0880
 */
@Stateless
public class NombreServicioImp implements NombresServicio {
    
    @EJB
    private NombresRepositorio nombreRepositorio;

    @Override
    public Nombres guardar(Nombres nombres) {
      return nombreRepositorio.save(nombres);
    }

    @Override
    public Nombres editar(Nombres nombres) {
        
        return nombreRepositorio.update(nombres);
        
    }

    @Override
    public void eliminar(Nombres nombres) {
        
        nombreRepositorio.delete(nombres);
    }

    @Override
    public List<Nombres> findAllElements() {
        
        return nombreRepositorio.findAll();
    }
    
}
