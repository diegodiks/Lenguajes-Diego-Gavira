/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepciones;

/**
 *
 * @author DSGR
 */
public class ArchivoNoTxtException extends Exception{
    
    public ArchivoNoTxtException(){
        super("Lo siento solo ejecuto archivos txt");                   
           
        //Invoca Mensaje de la clase Padre(Exception) a la clase hijo (ArchivoNoTxtException)
        
        
        
    }
    
    
    
    
    
    
}
