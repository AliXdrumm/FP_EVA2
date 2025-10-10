/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_14_captura;
import java.util.Scanner;
/**
 *
 * @author licce
 */
public class EVA2_14_Captura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int calif;
        
        System.out.println("Cuántas calificaciones tienes?");
        
        calif = input.nextInt();
        
        //Aqui declaro el arreglo con el valor de la variable
        int arreglo[] = new int [calif];
        
        //Length es el tamaño del arreglo, osea si el arreglo es 10, muestra 10
        //elementos, eje: son 4 calificaciones, muestra 89, 90, 100, 78
        for(int i = 0; i < arreglo.length; i++){  
            
        // El (i + 1) solo hace que la posición empieze en 1 y no en 0
            System.out.print("Calificación: " + (i + 1) + ": ");
        
        arreglo[i] = input.nextInt();
        }
        
        System.out.println("Sus calificaciones son: ");
        
        //Leer
        for(int i = 0; i < arreglo.length; i++){            
        // El (i +1) solo hace que la posición empieze en 1 y no en 0
            System.out.println("Calificación: " + arreglo[i]);
        }
    }
    
}
