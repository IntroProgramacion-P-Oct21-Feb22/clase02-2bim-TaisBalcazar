/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declarar y generar arreglos en Java

        int dato;
        int suma = 0;
        String cadena = "Valores:\n";
        // arreglo de tipo entero
        // se le asigna valores concretos al arreglo cuando se lo
        // inicializa
        int[] arreglo1 = {1000, 2000, 3000, 4000, 5000}; // arreglo de 5 elementos

        // Se hace uso del ciclo repetitivo for para recorrer el arreglo
        for (int i = 0; i < arreglo1.length; i++) {
            // agrego el valor de la posición del arreglo a la variable
            // acumuladora  suma
            suma = suma + arreglo1[i];

            // acumula mi cadenaFinal
            cadena = String.format("%s%d\n", cadena, arreglo1[i]);
        }
        
        cadena = String.format("%sLa suma de los valores del arreglo es: %d\n", cadena, suma);
        System.out.printf("%s\n", cadena);

    }

}
