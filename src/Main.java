import java.util.ArrayList;

public class Main {
    
    public static void main(String[] args) {
        Usuarios usuario1 = new Usuarios("Pedro", "3375-6000");
        Usuarios usuario2 = new Usuarios("Maria", "3375-5000");
        usuario1.agregarContacto(usuario2);
        usuario1.enviarMensaje(usuario1.obtenerContacto("Maria"), "Hola Maria, ¿Como estas?");
        usuario1.printMensajes();
    }
}