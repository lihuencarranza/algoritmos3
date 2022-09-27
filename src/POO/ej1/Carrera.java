package POO.ej1;

import java.util.ArrayList;

public class Carrera {
        private final int codigo;
        private final Materia[] materiasObligatorias;
        private final Materia[] materiasOptativas;
        private final int creditosNecesarios;

        public Carrera(int codigo, Materia[] materiasObligatorias,Materia[] materiasOptativas, int creditosNecesarios) {
                this.codigo = codigo;
                this.materiasObligatorias = materiasObligatorias;
                this.materiasOptativas = materiasOptativas;
                this.creditosNecesarios = creditosNecesarios;
        }
}
