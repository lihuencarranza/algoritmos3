package POO.ej1;

import java.util.HashMap;

public class Carrera {
        private final int codigo;
        private HashMap<Integer, Materia> materiasObligatorias;;
        private HashMap<Integer, Materia> materiasOptativas;
        private final int creditosNecesarios;

        public Carrera(int codigo, HashMap<Integer, Materia> materiasObligatorias, HashMap<Integer, Materia> materiasOptativas, int creditosNecesarios) {
                this.codigo = codigo;
                this.materiasObligatorias = materiasObligatorias;
                this.materiasOptativas = materiasOptativas;
                this.creditosNecesarios = creditosNecesarios;
        }

        public int getCodigo() {
                return codigo;
        }

        public HashMap<Integer, Materia> getMateriasObligatorias() {
                return materiasObligatorias;
        }

        public HashMap<Integer, Materia> getMateriasOptativas() {
                return materiasOptativas;
        }

        public int getCreditosNecesarios() {
                return creditosNecesarios;
        }




}
