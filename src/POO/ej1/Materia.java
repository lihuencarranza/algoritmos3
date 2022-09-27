package POO.ej1;

public class Materia {
        private String nombre;
        private int codigo;
        private final int creditos;

        public Materia(String nombre, int codigo, int creditos) {
                this.nombre = nombre;
                this.codigo = codigo;
                this.creditos = creditos;
        }

        public int getCreditos() {
                return creditos;
        }

}
