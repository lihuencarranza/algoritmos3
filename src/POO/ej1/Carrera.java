package POO.ej1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Hashtable;

public class Carrera {
        private final int codigo;
        private Hashtable<Integer, Materia> materiasObligatorias = new Hashtable<Integer, Materia>();
        private Hashtable<Integer, Materia> materiasOptativas = new Hashtable<Integer, Materia>();
        private final int creditosNecesarios;

        public Carrera(int codigo, Hashtable<Integer, Materia> materiasObligatorias, Hashtable<Integer, Materia> materiasOptativas, int creditosNecesarios) {
                this.codigo = codigo;
                this.materiasObligatorias = materiasObligatorias;
                this.materiasOptativas = materiasOptativas;
                this.creditosNecesarios = creditosNecesarios;
        }

        public int hashCode(){
                return this.codigo;
        }


}
