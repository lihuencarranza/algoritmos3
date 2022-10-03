package POO.ej3;

public class Usuario {
        private String nombre;
        private String password;       
       
        public Usuario(String nombre2, String password) {
                this.nombre = nombre2;
                this.password = password;
        }

        public Usuario crearUsuario(String nombre, String password) {
                Usuario usuario = new Usuario(nombre, password);
                return usuario;
        }

        public String getNombre() {
                return nombre;
        }

        public Object getPassword() {
                return password;
        }
}
