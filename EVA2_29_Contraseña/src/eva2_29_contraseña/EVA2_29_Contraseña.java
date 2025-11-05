/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_29_contraseña;
import java.util.Scanner;
/**
 *
 * @author licce
 */
public class EVA2_29_Contraseña {

    /**
     * @param args the command line arguments
     */
    public static String PWD = "1234";
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        System.out.println("Introduzca su nombre de usuario:");
        String usuario = input.nextLine();
        System.out.println("Introduzca la contraseña: ");
        
        
        for(int i = 0; i <= 4; i++){
            String a = input.nextLine();
            
        if(a.equals(PWD)){
            System.out.println("Bienvenido " + usuario);
            break;
        }if(i == 4){
            System.out.println("No se pudo ingresar");
        }else
                System.out.println("Intentelo de nuevo");
        
        }
        
    }
    
}
