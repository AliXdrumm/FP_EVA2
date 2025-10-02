/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_2_switch;
import java.util.Scanner;
/**
 *
 * @author licce
 */
public class EVA2_2_Switch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
                
        System.out.println("1. Consultar saldo");
        System.out.println("2. Retirar monto");
        System.out.println("3. Depositar monto");
        System.out.println("Selecciona una opción del menú");
        
        int opc = input.nextInt();
        
        switch(opc){
            
            case 1:
                System.out.println("Elegiste imprimir saldo!!");
                break; //romper o detener la instrucción
            case 2:
                System.out.println("Elegiste retirar saldo!!");
                break; //fin del switch
            case 3:
                System.out.println("Elegiste depositar saldo!!");
                break;
                
            default:
                System.out.println("Opción incorrecta!!");
        }
        
    }
    
}
