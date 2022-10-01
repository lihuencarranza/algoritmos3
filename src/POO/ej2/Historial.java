package POO.ej2;

import java.util.ArrayList;

public class Historial {
        private Usuario usuario1;
        private Usuario usuario2;
        private ArrayList<Mensaje> mensajes = new ArrayList<Mensaje>();

        public void addMensaje(Mensaje mensaje) {
                usuario1 = mensaje.getEmisor();
                usuario2 = mensaje.getReceptor();
                mensajes.add(mensaje);
        }

        public void mostrar() {
                for (int i = 0; i < mensajes.size(); i++) {
                        System.out.println(  mensajes.get(i).getEmisor().getNombre() + " hacia " + mensajes.get(i).getReceptor().getNombre() + ": " + mensajes.get(i).getTexto());
                }
        }

        public String getUsuario1() {
                return usuario1.getNombre();
        }

        public String getUsuario2() {
                return usuario2.getNombre();
        }
        
}
