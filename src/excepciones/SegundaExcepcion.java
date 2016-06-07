/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

/**
 *
 * @author DSGR
 * aqui usaremos las excepciones checked en las que tu tienes que hacerte cargo de ellas
 * Vamos a usar un paquete que no se encuentra por defecto, tienes que arreglarlo con un import
 */
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SegundaExcepcion {
    
    public static void main(String[] args) {
        
        File f= new File("C://Users/DSGR/Documents/archivaldo");
         
        
        try {
            FileInputStream fis=new FileInputStream(f);
            
        } catch (FileNotFoundException ex) {
            
        }
        
            
    
    
}}
