/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericos;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/** 
 *
 * @author DSGR
 */
public class ProbarUsuarios {
    public static void main(String[] args) {
        
        //Vamos a leer el ArrayList a ver que hay 
        //Paso 1 Creamos un objeto de la clase PersistenciaUusario
        
        PersistenciaUsuario p=new PersistenciaUsuario();
        try {
            ArrayList<Usuario> usuarios = p.buscarTodos();
           int tam = usuarios.size();
            System.out.println("usuarios guardados: "+tam);
            System.out.println(usuarios.get(2).getNombre());  
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
       
        
        
        
        
    }
    
}
