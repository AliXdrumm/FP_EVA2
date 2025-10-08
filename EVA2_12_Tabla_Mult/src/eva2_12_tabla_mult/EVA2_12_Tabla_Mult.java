/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_12_tabla_mult;
import java.util.Scanner;
/**
 *
 * @author licce
 */
public class EVA2_12_Tabla_Mult {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        int uno;
        
        System.out.println("Introduce el numero de la tabla de multiplicar:");
        uno = input.nextInt();
        
        for(int i = 1; i <= 10; i++){
        int mult = i * uno;
        
            System.out.println(uno + "x" + i + "=" + mult);
        }
    }
    
}
