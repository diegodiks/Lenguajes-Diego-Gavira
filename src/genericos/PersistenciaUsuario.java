package genericos;

import java.util.ArrayList;
import java.io.*; //Entrada y salida de archivos

public class PersistenciaUsuario {
   //Esta es una clase MODEL de tipo logico, solamente contiene acciones
   //metodos que representan acciones concretas, la sintaxis y estructura
   //de dicho metodo depende de la accion.
    
    ArrayList<Usuario> usuarios;

    public PersistenciaUsuario() {
        usuarios=new ArrayList<>();
    }
    //Primero generamos el metodo que nos guarda un usuario
    public void guardar(Usuario u) throws Exception{
        //1. Generar el archivo a guardarse
        File f=new File("archivaldo.raton");
        if(f.exists())  usuarios = buscarTodos();
        //2.Indicar que se va a guardar
        FileOutputStream fos=new FileOutputStream(f);
        //3.Generar el objeto que nos va a ayudar a guardar el arrayList de usuarios
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        //4. Ahora si a guardar el objeto
            usuarios.add(u);
            oos.writeObject(usuarios);
    }
    //Empieza el metodo de leer a los usuarios guardados 
    
    public ArrayList<Usuario> buscarTodos ()throws Exception {
        File f=new File ("archivaldo.raton");
        FileInputStream fis = new FileInputStream (f);
        ObjectInputStream ois = new ObjectInputStream(fis);
        usuarios = (ArrayList<Usuario>) ois.readObject();
        return usuarios;
    }
    
    
}