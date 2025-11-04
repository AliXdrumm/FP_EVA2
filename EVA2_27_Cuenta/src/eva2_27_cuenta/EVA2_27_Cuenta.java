/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_27_cuenta;
import java.util.Scanner;
/**
 *
 * @author licce
 */
public class EVA2_27_Cuenta {

    public static String Conf = "Si";
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int cuenta = 1000000;
        int val;
        do{
            System.out.println("Cantidad a retirar: ");
            val = input.nextInt();
            cuenta = cuenta - val;
                    System.out.println("Tu saldo es: " + cuenta);
        }while(cuenta > 0);
                     
    }
}
        
    
    

