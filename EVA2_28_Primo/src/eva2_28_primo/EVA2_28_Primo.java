/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_28_primo;
import java.util.Scanner;
/**
 *
 * @author licce
 */
public class EVA2_28_Primo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        int val = input.nextInt();
        boolean esprimo = true;
        for (int i = 0; i < val; i++) {
           //Dividir(exacta)
           int residuo = val % 2;
           if(residuo == 0){//Ya no es primo
           esprimo = false;//una división exacta y ya no es primo
               break;
           }
           
        }
        if(esprimo)
            System.out.println("El valor: " + val + " NO es primo");
        else
            System.out.println("El valor: " + val + " SI es primo");
    }
    
}
