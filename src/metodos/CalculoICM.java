/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

/**
 *
 * @author DSGR
 */
public class CalculoICM {
    
    public String calcular_ICM (Usuario u){
        int altura_icm = (u.getAltura()*u.getAltura());
        int pesoo = u.getPeso() * altura_icm;
        return ""+pesoo;
                
    }}
        
        
    
    

