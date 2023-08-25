public class Mensajes {
    String emisor;
    String mensaje;

    public Mensajes(String emisor, String mensaje){
        this.emisor = emisor;
        this.mensaje = mensaje;
    }

    public String getEmisor() {
        return emisor;
    }

    public String getMensaje() {
        return mensaje;
    }
}
