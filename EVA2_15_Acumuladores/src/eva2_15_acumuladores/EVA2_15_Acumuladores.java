/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_15_acumuladores;
import java.util.Scanner;
/**
 *
 * @author licce
 */
public class EVA2_15_Acumuladores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //Acumuladores:
       //++ -- += -= *= /=
       Scanner input = new Scanner(System.in);
       
       int cuenta = 0;
       //Asignación (=)-->
        System.out.println(cuenta);
       
        cuenta = cuenta + 100;//Acumulador
        System.out.println(cuenta);
        
        cuenta = cuenta + 1000;
        System.out.println(cuenta);
        
        cuenta = cuenta - 800;//cuenta -= 800;
        System.out.println(cuenta);
        
        cuenta += 2000;//Cuenta = cuenta + 2000; 
    }
    
}
