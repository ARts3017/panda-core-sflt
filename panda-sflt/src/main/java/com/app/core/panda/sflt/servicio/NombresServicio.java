/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.app.core.panda.sflt.servicio;

import com.app.core.panda.sflt.entidad.Nombres;
import java.util.List;

/**
 *
 * @author xmk0880
 */
public interface NombresServicio {
    
     Nombres guardar(Nombres nombres);

    Nombres editar(Nombres nombres);

    void eliminar(Nombres nombres);

    List<Nombres> findAllElements();
    

}
