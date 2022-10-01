package POO.ej2;

public class Main {
        public static void main(String[] args) {
                Usuario usuario1 = new Usuario(1, "usuario1");
                Usuario usuario2 = new Usuario(2, "usuario2");

                usuario1.addContacto(usuario2);
                usuario2.addContacto(usuario1);

                usuario1.enviarMensaje(usuario2, "Hola");
                usuario2.enviarMensaje(usuario1, "Hola, como estás?");
                usuario1.enviarMensaje(usuario2, "Bien, y tú?");
                usuario2.enviarMensaje(usuario1, "Bien también");

                usuario1.mostrarHistorial();
                usuario2.mostrarHistorial();


        }
}
