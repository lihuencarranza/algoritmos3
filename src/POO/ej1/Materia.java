package POO.ej1;

public class Materia {
        private final String nombre;
        private final int codigo;
        private final int creditos;

        public Materia(String nombre, int codigo, int creditos) {
                this.nombre = nombre;
                this.codigo = codigo;
                this.creditos = creditos;
        }

        public int getCreditos() {
                return creditos;
        }

        public String getNombre() {
                return nombre;
        }

        public int hashCode(){
                return this.codigo;
        }

}
