package POO.ej1;

import java.util.HashMap;

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

                HashMap<Integer, Materia> hashIngObligatorias = new HashMap<Integer, Materia>();
                HashMap<Integer, Materia> hashIngOptativas = new HashMap<Integer, Materia>();

                hashIngObligatorias.put(algo1.getCodigo(), algo1);
                hashIngObligatorias.put(fisica1.getCodigo(), fisica1);
                hashIngObligatorias.put(am2.getCodigo(), am2);
                hashIngObligatorias.put(algo2.getCodigo(), algo2);
                hashIngObligatorias.put(algebra2.getCodigo(), algebra2);
                hashIngObligatorias.put(fisica2.getCodigo(), fisica2);
                hashIngOptativas.put(discreta.getCodigo(), discreta);
                int creditosNecesarios = 44;
                Carrera ing = new Carrera(01, hashIngObligatorias, hashIngOptativas, creditosNecesarios);
               
               
                HashMap<Integer, Materia> hashLicObligatorias = new HashMap<Integer, Materia>();
                HashMap<Integer, Materia> hashLicOptativas = new HashMap<Integer, Materia>();

                hashLicObligatorias.put(algo1.getCodigo(), algo1);
                hashLicObligatorias.put(am2.getCodigo(), am2);
                hashLicObligatorias.put(algo2.getCodigo(), algo2);
                hashLicObligatorias.put(algebra2.getCodigo(), algebra2);
                hashLicObligatorias.put(discreta.getCodigo(), discreta);
                hashLicObligatorias.put(orga.getCodigo(), orga);
                creditosNecesarios = 40;

                Carrera lic = new Carrera(02, hashLicObligatorias, hashLicOptativas, creditosNecesarios);


        }

        

}
