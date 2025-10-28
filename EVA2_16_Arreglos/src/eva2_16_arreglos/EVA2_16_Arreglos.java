/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_16_arreglos;
import java.util.Scanner;
/**
 *
 * @author licce
 */
public class EVA2_16_Arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     
     int matriz[][] = new int [3] [4];

        System.out.println(matriz.length);
        System.out.println(matriz[0].length);
        System.out.println(matriz[1].length);
        System.out.println(matriz[2].length);
     //Ciclos anidados:
     for(int i = 0; i < matriz.length; i++){//Filas
     for(int j = 0; j < matriz[i].length; j++){//Columnas
     matriz[i][j] = (int)(Math.random() * 100);
     
         System.out.print("[" + matriz[i][j] + "]");
     }
         System.out.println("");
     }
        
    }
    
}
