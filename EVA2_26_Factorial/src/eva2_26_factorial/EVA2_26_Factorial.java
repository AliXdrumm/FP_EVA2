/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_26_factorial;
import java.util.Scanner;
/**
 *
 * @author licce
 */
public class EVA2_26_Factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Introduzca el número que quiera saber su factoriál: ");
        long fact = input.nextInt();
        long num = 1;
    for(long i = 1; i <= fact; i++){
    
        num = num * i;
    }
        System.out.println("El factorial de " + fact + " Es:");
      System.out.println(num); 
    }
    
}
