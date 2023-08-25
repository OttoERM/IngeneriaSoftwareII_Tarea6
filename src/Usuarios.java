import java.util.ArrayList;

public class Usuarios {
    public String userName;
    public String telefono;
    private final ArrayList<Usuarios> contactosList = new ArrayList<Usuarios>();
    private final ArrayList<Mensajes> mensajesList = new ArrayList<Mensajes>();

    public Usuarios(String userName, String telefono){
        this.userName = userName;
        this.telefono = telefono;
    }

    public String getUserName() {
        return userName;
    }

    public String getTelefono() {
        return telefono;
    }



    public void agregarContacto(Usuarios nuevoContacto){
        for (Usuarios contactoAlmacenado : contactosList) {
            if(contactoAlmacenado.userName.equals(nuevoContacto.userName)){
                System.out.println("Ya existe un contacto con dicho nombre");
                return;
            }
        }

        contactosList.add(nuevoContacto);
    }

    public Usuarios obtenerContacto(String userName){
        for (Usuarios contactoAlmacenado : contactosList) {
            if(contactoAlmacenado.userName.equals(userName))
                return contactoAlmacenado;
        }

        return null;
    }



    public void enviarMensaje(Usuarios destinatario, String mensaje){
        mensajesList.add(new Mensajes(destinatario.userName, mensaje));
    }

    public void printMensajes(){
        for (Mensajes mensajesAlmacenado : mensajesList) {
            System.out.println("Emisor:" + mensajesAlmacenado.emisor + " - " + mensajesAlmacenado.mensaje);
        }
    }


}
