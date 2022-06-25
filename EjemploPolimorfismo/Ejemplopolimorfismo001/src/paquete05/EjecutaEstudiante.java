
package paquete05;

import java.util.ArrayList;
import java.util.Scanner;

public class EjecutaEstudiante {

    public static void main(String[] args) {

        /*
        Generar un proceso que permita ingresar n número 
        de estudiantes. 
        El usuario decide cuando terminar el proceso
        
        */
        Scanner entrada = new Scanner(System.in);
        String nombresEst;
        String apellidosEst;
        String identificacionEst;
        int edadEst;
        double costoCred;
        int numeroCreds;
        double costoAsig;
        int numeroAsigs;
        int tipoEstudiante;
        String continuar;
        ArrayList<Estudiante> estudiantes = new ArrayList<>();
        do {                                                                     //Reutilicé el codigo del paquete03
                                                                                 //"Ejecutable Estudiante"
            System.out.println("Tipo de Estudiante a ingresar\n"
                    + "Ingrese (1) para Estudiante Presencial"
                    + "Ingrese (2) para Estudiante Distancia");
            
            tipoEstudiante = entrada.nextInt();  // Se guarda el numero de la opcion escogida por el usuario
            entrada.nextLine(); //limpiada de buffer
            
            System.out.println("Ingrese los nombres del estudiante");
            nombresEst = entrada.nextLine();
            System.out.println("Ingrese los apellidos del estudiante");
            apellidosEst = entrada.nextLine();                                   //Se pregunta informacion al usuario y se
                                                                                    //guarda en variables
            System.out.println("Ingrese la identificación del estudiante");
            identificacionEst = entrada.nextLine();
            System.out.println("Ingrese la edad del estudiante");
            edadEst = entrada.nextInt();

            if (tipoEstudiante == 1) {       // se crea un ciclo de si se cumple al escoger la opcion 1 se realiza el proceso
                                             // descrito sino "else" se realiza el otro proceso en este caso opcion 2
                EstudiantePresencial estudianteP = new EstudiantePresencial();
                
                System.out.println("Ingrese el número de créditos");
                numeroCreds = entrada.nextInt();                            //Se pregunta al usuario en base a los
               //                                                       atributos de la clase EstudiantePresencial 
                System.out.println("Ingrese el costo de cada créditos");
                costoCred = entrada.nextDouble();
                
                estudianteP.establecerNombresEstudiante(nombresEst);
                estudianteP.establecerApellidoEstudiante(apellidosEst);
                estudianteP.establecerIdentificacionEstudiante(identificacionEst);//Segun el objeto creado llamado estudianteP
                    //                                                                 establezco las variables que se guardó datos ingresados por el ususario
                estudianteP.establecerEdadEstudiante(edadEst);
                estudianteP.establecerNumeroCreditos(numeroCreds);
                estudianteP.establecerCostoCredito(costoCred);

                
                estudiantes.add(estudianteP); //se añade el objeto arraylist
                
                
            } else {
                
                if (tipoEstudiante == 2) {
                    
                    EstudianteDistancia estudianteD = new EstudianteDistancia();
                    
                    System.out.println("Ingrese el número de asignaturas");
                    numeroAsigs = entrada.nextInt();                                //Se pregunta al usuario en base a los
               //                                                       atributos de la clase EstudianteDistancia 
                    System.out.println("Ingrese el costo de cada cada asignatura");
                    costoAsig = entrada.nextDouble();

                    estudianteD.establecerNombresEstudiante(nombresEst);
                    estudianteD.establecerApellidoEstudiante(apellidosEst);             //Segun el objeto creado llamado estudianteD
                    //                                                                 establezco las variables que se guardó datos ingresados por el ususario
                    estudianteD.establecerIdentificacionEstudiante(identificacionEst);
                    estudianteD.establecerEdadEstudiante(edadEst);
                    estudianteD.establecerNumeroAsginaturas(numeroAsigs);
                    estudianteD.establecerCostoAsignatura(costoAsig);

                    
                    estudiantes.add(estudianteD);//se añade el objeto arraylist

                } else {
                    System.out.println("Opción fuera de rango"); //Control por si no se elige una de las dos opciones

                }
            }

            entrada.nextLine();//limpiar buffer
            
            System.out.println("Desea ingresar más estudiante. Digite la "
                    + "letra S para continuar o digite la letra N para salir " //Pregunta al ususario si desea ingresar más estudiantes
                    + "del proceso");

            continuar = entrada.nextLine();//La letra ingressada se guarda en esta variable "continuar"
            
        } while (continuar.equals("S"));//Si no regresa a preguntar nuevamente las 2 opciones
        
        for (int i = 0; i < estudiantes.size(); i++) {
              
            estudiantes.get(i).calcularMatricula();
                                                             //ciclo for que recorres lista de estudiantes e imprimer
                                                             //con el estudiantes.get(i)
            System.out.printf("Datos Estudiante\n"
                        + "%s\n",                        
                  estudiantes.get(i));
        }
    }
}