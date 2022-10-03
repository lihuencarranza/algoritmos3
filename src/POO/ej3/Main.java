package POO.ej3;

import java.util.HashMap;
import java.util.Scanner;
        
public class Main {
        public static void main(String[] args) {
                HashMap<String, Usuario> usuarios = new HashMap<String, Usuario>();
                Sistema sistema = new Sistema(usuarios);
                sistema.agregarUsuario("Juan", "1234");
                sistema.agregarUsuario("Pedro", "1234");
                sistema.agregarUsuario("Maria", "1234");
                sistema.agregarUsuario("Jose", "1234");

                System.out.println("Bienvenido al sistema de mensajeria del Hostel");
                System.out.println("Ingrese |1| para registrarse o |2| para ingresar");
                Scanner sc = new Scanner(System.in);
                int opcion = sc.nextInt();
                boolean entrar = false;

                while (!entrar) {
                        if (opcion == 1) {
                                System.out.println("Ingrese su nombre de usuario");
                                String nombre = sc.next();
                                if (sistema.existeUsuario(nombre)) {
                                        System.out.println("El nombre de usuario ya existe");
                                } else {
                                        System.out.println("Ingrese su password");
                                        String password = sc.next();
                                        sistema.agregarUsuario(nombre, password);
                                        System.out.println("Usuario registrado con exito");
                                        entrar = true;
                                }                                
                        } else if (opcion == 2) {
                                System.out.println("Ingrese su nombre de usuario");
                                String nombre = sc.next();
                                 if (sistema.existeUsuario(nombre)) {
                                        System.out.println("Ingrese su password");
                                        String password = sc.next();
                                        while(!sistema.passwordCorrecta(nombre, password)) {
                                                System.out.println("Password incorrecta");
                                                System.out.println("Ingrese su password o |0| para salir");
                                                password = sc.next();
                                                if (password.equals("0")) {
                                                        break;
                                                }
                                        } 
                                        if (sistema.passwordCorrecta(nombre, password)){
                                                System.out.println("Bienvenido " + nombre);  
                                                entrar = true; 
                                        }     
                                } else {
                                        System.out.println("El usuario no existe");
                                        System.out.println("Ingrese |1| para registrarse o |2| para ingresar");
                                        opcion = sc.nextInt();

                                }
                               
                        } else {
                                System.out.println("Opcion incorrecta");
                        }
                }



                
                
               
                
                
        }
                
}
