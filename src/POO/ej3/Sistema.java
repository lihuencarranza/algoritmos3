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


        
}
