/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos;

/**
 *
 * @author reroes
 */
public class Ejemplo05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declarar y generar arreglos en Java

        // arreglo de tipo entero
        String [] marcas_computadoras = new String [5];
        // Se asigna valores al arreglo
        marcas_computadoras[0] = "Hp";
        marcas_computadoras[1] = "Lenovo";
        marcas_computadoras[2] = "Dell";
        marcas_computadoras[3] = "Asus";
        marcas_computadoras[4] = "Toshiba";
        // Se hace uso del ciclo repetitivo for para recorrer el arreglo
        for (int i = 0; i < marcas_computadoras.length; i++) {
            System.out.printf("Subíndice o Índice %d, con valor %s\n",
                    i, marcas_computadoras[i]);
        }
        
    }

}
