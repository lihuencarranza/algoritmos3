package POO.ej3;

import java.util.HashMap;


public class Sistema {
        private HashMap <String, Usuario> usuarios;

        public Sistema(HashMap<String, Usuario> usuarios) {
                this.usuarios = usuarios;
        }

        public void agregarUsuario(String nombre, String password) {
                Usuario usuario = new Usuario(nombre, password);
                usuarios.put(nombre, usuario);
        }

        public boolean existeUsuario(String nombre) {
                return usuarios.containsKey(nombre);
        }

        public boolean passwordCorrecta(String nombre, String password) {
                Usuario usuario = usuarios.get(nombre);
                return usuario.getPassword().equals(password);
        }

        public void mostrarUsuarios() {
                for (String nombre : usuarios.keySet()) {
                        System.out.println(nombre);
                }
        }

        public void enviarMensaje(String nombre, String mensaje) {
                Usuario usuario = usuarios.get(nombre);
                if (!usuarios.containsKey(nombre)) {
                        System.out.println("El usuario no existe");
                } else {
                        usuario.enviarMensaje(usuario, mensaje);

                }
        }

        public void mostrarHistorial() {
                for (String nombre : usuarios.keySet()) {
                        Usuario usuario = usuarios.get(nombre);
                        usuario.mostrarHistorial();
                }
        }

        public boolean historialVacio() {
                for (String nombre : usuarios.keySet()) {
                        Usuario usuario = usuarios.get(nombre);
                        if (!usuario.historialVacio()) {
                                return false;
                        }
                }
                return true;
        }

        
        


        
}
