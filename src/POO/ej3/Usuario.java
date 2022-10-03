package POO.ej3;

public class Usuario {
        private String nombre;
        private String password;
        private Usuario[] contactos;
        private Historial historial;     
       
        public Usuario(String nombre2, String password) {
                this.nombre = nombre2;
                this.password = password;
                this.contactos = new Usuario[10];
        }

        public void addContacto(Usuario contacto, Historial historial) {
                this.historial = historial;
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

        public String getNombre() {
                return nombre;
        }

        public Object getPassword() {
                return password;
        }

        public boolean historialVacio() {
                return historial == null;
        }

}
