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
        
        File f= new File("C:\\archivaldo.txt");
         
        
        try {
            int x=2;
            int y=0;
           // int div= x/y;
            
            FileInputStream fis= new FileInputStream(f);
            int ch=0;
            StringBuilder builder=new   StringBuilder();
            
            
                while ((ch=fis.read())!=-1){        // Excepcion InputOutput (Exception IO)
             
                        builder.append((char)ch);
                } 
                System.out.println("Se leyo bien y se encontro esto: "+builder.toString());
        }
             /*   catch (FileNotFoundException ex) {
               
            }
        catch (IOException ex) {
                         }*/
        catch (Exception e){   System.out.println(e.getMessage());
            
        }finally {
            
        }
    }}
