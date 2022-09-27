package POO.ej1;

import java.util.ArrayList;

public class Alumno {
        private final int padron;
        private ArrayList<Materia> materiasAprobadas;
        private ArrayList<Carrera> carrerasActivas;

        public Alumno(int padron) {
                this.padron = padron;
                this.materiasAprobadas = new ArrayList<Materia>();
                this.carrerasActivas = new ArrayList<Carrera>();
        }

        public boolean inscribir(Carrera carrera){
                if (this.carrerasActivas.contains(carrera)) {
                        return false;
                }
                this.carrerasActivas.add(carrera);
                return true;
        }

        public boolean aprobar(Materia materia) {
                if (this.materiasAprobadas.contains(materia)) {
                        return false;
                }
                this.materiasAprobadas.add(materia);
                return true;
        }

        public String getEstadoCarrera(Carrera carrera){
                int creditos = 0;
                for (int i = 0; i < materiasAprobadas.size(); i++){
                        creditos += materiasAprobadas.get(i).getCreditos();
                }
                return "Tenés %d créditos".formatted(creditos);
        }

}
