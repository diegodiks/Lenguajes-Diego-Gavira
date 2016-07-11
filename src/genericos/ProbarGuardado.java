/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genericos;

/**
 *
 * @author DSGR
 */
public class ProbarGuardado {
    
    public static void main(String args[]) {
        
        Usuario u=new Usuario("Diego",20,"diego@gmail.com");
        PersistenciaUsuario p=new PersistenciaUsuario();
        try{
            p.guardar(u);
            System.out.println("Uusario Guardado");
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }
                
    }
    
}
