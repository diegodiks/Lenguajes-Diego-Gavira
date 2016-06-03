/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tipos_datos;

/**
 *
 * @author DSGR
 */
public class Tipos1 {
    public static void main(String[] args) {
        
        byte b=2;
        short s=2;
        int i= 2;
        long l=2;
        
        //b=s;  //ERROR DE CASTING
        b=(byte)s;  //ERROR FORZADO
        s=b;
        l=i;
        i=s;
        l=b;
        s=(short)l; 
        i=b;
        
        Operaciones o=new Operaciones();
            System.out.println(o.suma(4.0f,5.0f));
                                //(o.suma((float)4.0,(float)5.0));
    }
    
}
