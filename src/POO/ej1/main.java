package POO.ej1;

public class Main {
        public static void main(String[] args) {
                Materia algo1 = new Materia("Algoritmos y Programación I", 7540, 6);
                Materia fisica1 = new Materia("Física I", 6201, 8);
                Materia discreta = new Materia("Química", 6110, 6);
                Materia am2 = new Materia("Análisis Matemático II", 6103, 8);
                Materia algo2 = new Materia("Algoritmos y Programación II", 7541, 6);
                Materia algebra2 = new Materia("Álgebra II", 6108, 6);
                Materia fisica2 = new Materia("Física II", 6203, 8);
                Materia orga = new Materia("Organización del Computador", 9557, 8);

                Carrera ing = new Carrera(0, new Materia[] {algo1, fisica1}, new Materia[] {}, 16);
                Carrera lic = new Carrera(1, new Materia[] {algo1, fisica1, discreta, am2}, new Materia[] {algo2, algebra2, fisica2, orga}, 32);
                Alumno alumno1 = new Alumno(12345);

                boolean check = alumno1.inscribir(ing);
                if (!check){
                        System.out.println("Algo salió mal");
                        return;
                }

                check = alumno1.aprobar(algo1);
                if (!check){
                        System.out.println("Algo salió mal");
                        return;
                }

        }

        

}
