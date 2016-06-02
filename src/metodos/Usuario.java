/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

public class Usuario {
   private int edad;

    /**
     * @return the edad este es un metodo para que nos 
     */
    public int getEdad() {
        if(edad<0){
            edad=0;
            System.out.println(" No debes meter edades menores a cero ");
        }
        return edad;
    }
public void setEdad (int edad){
    
    this.edad = edad; 
}
}