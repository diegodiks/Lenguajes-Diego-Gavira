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
public class PrimeraExcepcion {
    
    public static void main(String[] args) {
        //  Veremos primero las mas comunes de unchecked 
        //ArithmeticException 
        float x=4;
        int y = 0;
        System.out.println(x/y);
        //Tipo de dato float arroja  una excepcion infinito ya que la operacion
        //se transforma al dato mas grande es decir FLOAT
        
        String falsoNumero="4";
        int numeroReal = 5;
        System.out.println("Este es antes de la excepscion");
        int suma = Integer.parseInt(falsoNumero) + numeroReal;
        System.out.println("Todo esta bien hasta ");
        //Excepcion NumberFormatException
        if(true){
            System.out.println("siempre aperecera");
        }
        System.out.println("La ejecucion siempre pasa aqui se ejecute o "+"no el if");  
      
    }
    
}
