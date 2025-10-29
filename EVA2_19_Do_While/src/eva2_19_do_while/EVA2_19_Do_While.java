/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_19_do_while;
import java.util.Scanner;
/**
 *
 * @author licce
 */
public class EVA2_19_Do_While {

    /**
     * @param args the command line arguments
     */
    final static String USUARIO = "admin";
    final static String PWD = "admin";
    public static void main(String[] args) {
        // 1 Pedimos datos de acceso
        Scanner input = new Scanner (System.in);
        String usu, contra;
        //2 Validamos 
        //Incorrecto --> vuelve a preguntar
        //Correcto --> Acceso al sistema
        do{
        
        System.out.print("Usuario: ");
        usu = input.nextLine();
        System.out.print("Contraseña: ");
        contra = input.nextLine();
        
        }while(!(usu.equals(USUARIO)&& contra.equals(PWD)));
         //Validar
        System.out.println("Acceso concedido");
       
        }
    }
    

