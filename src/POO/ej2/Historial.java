package POO.ej2;

import java.util.ArrayList;

public class Historial {
        private Usuario usuario1;
        private Usuario usuario2;
        private ArrayList<Mensaje> mensajes;

        public void addMensaje(Mensaje mensaje) {
                usuario1 = mensaje.getEmisor();
                usuario2 = mensaje.getReceptor();
        }

        public void mostrar() {
                for (int i = 0; i < mensajes.size(); i++) {
                        System.out.println(mensajes.get(i).getEmisor().getNumero() + " - " + mensajes.get(i).getReceptor().getNumero() + " - " + mensajes.get(i).getEmisor().getNombre() + " - " + mensajes.get(i).getReceptor().getNombre() + " - " + mensajes.get(i).getTexto());
                }
        }
        
}
