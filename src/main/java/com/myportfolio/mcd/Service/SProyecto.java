/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myportfolio.mcd.Service;

import com.myportfolio.mcd.Entity.Proyecto;
import com.myportfolio.mcd.Respository.RProyecto;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class SProyecto {
    @Autowired
    RProyecto rProyecto;
    
    public List<Proyecto> list(){
        return rProyecto.findAll();
    }
    
    public Optional<Proyecto> getOne(int id){
        return rProyecto.findById(id);
    }
    
    public Optional<Proyecto> getByNombre(String nombre){
        return rProyecto.findByNombre(nombre);
    }
    
    public void save(Proyecto persona){
        rProyecto.save(persona);
    }
    
    public void delete(int id){
        rProyecto.deleteById(id);
    }
    
    public  boolean existsById(int id){
        return rProyecto.existsById(id);
    }
    
    public boolean existsByNombre(String nombre){
        return rProyecto.existsByNombre(nombre);
    }
}
