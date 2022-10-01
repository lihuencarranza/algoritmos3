package POO.ej2;

public class Usuario {
        private int numero;
        private String nombre;
        private Usuario[] contactos;
        private Historial historial;

        public Usuario(int numero, String nombre) {
                this.numero = numero;
                this.nombre = nombre;
                this.contactos = new Usuario[10];
                this.historial = new Historial();
        }


        public void addContacto(Usuario contacto) {
                for (int i = 0; i < contactos.length; i++) {
                        if (contactos[i] == null) {
                                contactos[i] = contacto;
                                break;
                        }
                }
        }

        public void enviarMensaje(Usuario receptor, String texto) {
                Mensaje mensaje = new Mensaje(this, receptor, texto);
                receptor.recibirMensaje(mensaje);
        }

        public void recibirMensaje(Mensaje mensaje) {
                historial.addMensaje(mensaje);
        }

        public void mostrarHistorial() {
                historial.mostrar();
        }

        public void mostrarContactos() {
                for (int i = 0; i < contactos.length; i++) {
                        if (contactos[i] != null) {
                                System.out.println(contactos[i].nombre);
                        }
                }
        }

        public int getNumero() {
                return numero;
        }

        public String getNombre() {
                return nombre;
        }


}
