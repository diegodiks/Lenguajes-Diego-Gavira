/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Constructores;

/**
 *
 * @author T-107
 */
public class Animal {
    
    String nombre ;
    String especie;
    boolean carnivoro;
    int num_jaula;
    String sexo;
    int edad;
    
    
    public Animal(String valor) {
        
        nombre = valor;
    }
    
  
    
    public Animal (String valor1, String valor2){
        
        especie= valor1; 
        nombre=valor2; 
        
    }
    
     public Animal() {
        
        nombre = "Tigre";
    }
     
     public Animal ( int variable1){ 
         
         edad = variable1;
         
     }
     
   /*   public Animal (String sex) {
        
        sexo = sex; 
    } */
    
 
}
