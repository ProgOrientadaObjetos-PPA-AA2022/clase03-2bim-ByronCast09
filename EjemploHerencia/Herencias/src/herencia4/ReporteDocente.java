/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia4;

import herencia2.Docente;
import herencia3.EstudianteDistancia;
import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class ReporteDocente extends Reporte {

    double promedioSueldos;
    ArrayList<Docente> lista;

    public ReporteDocente(String cod) {
        super(cod);
    }

    public void calcularPomedioSueldos() {
        for (int i = 0; i < lista.size(); i++) {
            promedioSueldos = promedioSueldos
                    + lista.get(i).getSueldo();
        }
    }

    public void establecerLista(ArrayList<Docente> listad) {
        lista = listad;
    }

    @Override
    public String toString() {

        String cadena2 = "";
        for (int i = 0; i < lista.size(); i++) {
            cadena2 = String.format("%s\n%s", cadena2, lista.get(i));
        }
        String cadena = String.format("%s"
                + "Lista de Docentes: %s \n"
                + "Pomedio Sueldos: %.2f\n",
                super.toString(),
                cadena2,
                promedioSueldos);
        return cadena;
    }
}
