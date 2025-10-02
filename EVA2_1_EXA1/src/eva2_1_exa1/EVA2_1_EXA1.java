/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_1_exa1;
import java.util.Scanner;
/**
 *
 * @author licce
 */
public class EVA2_1_EXA1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pin, opc, mont;
        System.out.println("Introduce el PIN");
        pin = input.nextInt();
        
        if(pin == 1234){
            System.out.println("Seleccione la operación");
           System.out.println("1. Consultar saldo");
           System.out.println("2. Retirar saldo");
           System.out.println("3. Depositar saldo");
           
           opc = input.nextInt();
           
           if(opc == 1){
               int sal = 9000;
           System.out.println("Tu saldo es de " + sal);        
           }else if(opc == 2){
               System.out.println("Seleccione la cantidad a retirar");
               
               mont = input.nextInt();
               int calc = 9000- mont;
               
               if(mont <= 9000 ){
               System.out.println("Tu saldo es " + calc);
               
               }if(mont < 0){
               System.out.println("No puedes hacer ese retiro");
               
               }else{
               System.out.println("No se puede retirar esa cantidad");
               }
                   }else if(opc == 3){
                    System.out.println("Seleccione la cantidad a depositar");
                    
                    int dep = input.nextInt();
                    int pos = 9000 + dep;
                    
                    System.out.println("Tu saldo actual es de " + pos);
                    
                   }else if(opc > 3){
                   System.out.println("Seleccione la operación correcta");
                   }
        }else{
        System.out.println("Acceso denegado");
        } 
    }
    
}
