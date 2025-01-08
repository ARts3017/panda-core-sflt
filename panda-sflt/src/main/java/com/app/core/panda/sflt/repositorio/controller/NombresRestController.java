/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.app.core.panda.sflt.repositorio.controller;

import com.app.core.panda.sflt.repositorio.controller.dao.NombresDao;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

/**
 *
 * @author xmk0880
 */
@Path ( "/hello" ) 
public class NombresRestController {
    
@GET 
@Produces( MediaType.APPLICATION_JSON ) 
public NombresDao doGreeting (  )  { 
    NombresDao nombres=new NombresDao();
    nombres.setId(0);
    nombres.setNombre("Abigail");
    nombres.setApellidPaterno("Arce");
    
    return nombres;
}
}
