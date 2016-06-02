/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

public class Usuario {
   private int edad;
   private int peso;
   private int altura;

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
 public int getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(int peso) {
        this.peso = peso;
    }

    /**
     * @return the estatura
     */
    public int getAltura() {
        return altura;
    }

    /**
     * @param altura the estatura to set
     */
    public void setAltura(int altura) {
        this.altura = altura;
        
   
}}