/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.app.core.panda.sflt.repositorio.controller;

import com.app.core.panda.sflt.servicio.NombresServicio;
import jakarta.ejb.EJB;
import java.io.Serializable;
import com.app.core.panda.sflt.entidad.Nombres;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author xmk0880
 */
@Getter
@Setter
@Named(value = "nombresMD")
@ViewScoped
public class NombresControlador implements Serializable{
    
    @EJB
    private NombresServicio nombreServicio;
    
    private Nombres nombre;
    private List<Nombres> nombres;
    
    public void nuebo(){
        nombre= new Nombres();
    }
    
   public List<Nombres> getAllNombres(){
       
       return nombres=nombreServicio.findAllElements();
   }
}
