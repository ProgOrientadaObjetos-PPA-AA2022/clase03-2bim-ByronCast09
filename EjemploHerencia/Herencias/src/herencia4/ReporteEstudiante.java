/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia4;

import herencia2.Docente;
import java.util.ArrayList;
import herencia2.Estudiante;
/**
 *
 * @author reroes
 */
public class ReporteEstudiante extends Reporte {
    double promedioMatriculas;
    ArrayList<Estudiante> lista;
    
    public ReporteEstudiante(String cod){
        super(cod);
    }
     public void calcularPomedioMatriculas() {
        for (int i = 0; i < lista.size(); i++) {
            promedioMatriculas = promedioMatriculas + 
                    lista.get(i).getMatricula();
        }
    }
    public void establecerLista(ArrayList<Estudiante> listaE){
        lista = listaE;
    }
    @Override
    public String toString(){

        String cadena2 = "";
        for (int i = 0; i < lista.size(); i++) {
            cadena2 = String.format("%s\n%s",cadena2,lista.get(i));
        }
        String cadena = String.format("%s"
                + "Lista de Estudiantes: %s \n"
                + "Pomedio Matriculas: %.2f\n", 
                super.toString(),
                cadena2,
                promedioMatriculas);
        return cadena;
    }
}
