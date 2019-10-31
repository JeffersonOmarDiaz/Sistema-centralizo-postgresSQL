/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.company.main;

import com.company.session.ProductosJpaController;
import com.mycompany.entidades.Productos;
import java.math.BigDecimal;
import java.util.logging.Level;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Aplicaciones D
 */
public class test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("practicabdd");
        
        ProductosJpaController pjc = new ProductosJpaController(emf);
        
        //creamos un producto
        Productos p = new Productos();
        p.setNombre("yougur");
        Double d1 = 10.35;
        BigDecimal bdl = BigDecimal.valueOf(d1.doubleValue());
        p.setPrecio(bdl);
        try {
            pjc.create(p);
        } catch (Exception e) {
            Logger.getLogger(test.class.getName()).log(Level.ALL.SEVERE,null,e);
        }
}
}
