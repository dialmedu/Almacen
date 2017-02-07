/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import Modelo.*;

/**
 *
 * @author SENA
 */
public class TestModelo {

   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Televisor televisores[] = new Televisor[6];
        Licuadora licuadoras[] = new Licuadora[6];
        Labadora labadoras[] = new Labadora[6];
        
        // vender 
        televisores[0]= new Televisor();
        televisores[1]= new Televisor();
        televisores[2]= new Televisor();
        televisores[3]= new Televisor();
        televisores[4]= new Televisor();
        televisores[5]= new Televisor();
        
        System.out.println(televisores[1].getCantidad());
        televisores[1].vender(1);
        System.out.println(televisores[1].getCantidad());
        System.out.println(televisores[1].existen());

        televisores[1].vender(televisores[1].getCantidad());
         
    }
    
}
