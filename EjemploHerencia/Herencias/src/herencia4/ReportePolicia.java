/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia4;

import herencia2.Estudiante;
import herencia2.Policia;
import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class ReportePolicia extends Reporte{
    double promedioEdades;
    ArrayList<Policia> lista;
    
    public ReportePolicia(String cod){
        super(cod);
    }
     public void calcularPomedioEdades() {
        for (int i = 0; i < lista.size(); i++) {
            promedioEdades = promedioEdades + 
                    lista.get(i).getEdad();
        }
    }
    public void establecerLista(ArrayList<Policia> listaP){
        lista = listaP;
    }
    @Override
    public String toString(){

        String cadena2 = "";
        for (int i = 0; i < lista.size(); i++) {
            cadena2 = String.format("%s\n%s",cadena2,lista.get(i));
        }
        String cadena = String.format("%s"
                + "Lista de Policias: %s \n"
                + "Pomedio de Edades: %.2f\n", 
                super.toString(),
                cadena2,
                promedioEdades);
        return cadena;
    }
}
