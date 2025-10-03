/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_5_arreglo_string;
import java.util.Scanner;
/**
 *
 * @author licce
 */
public class EVA2_5_Arreglo_String {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner input = new Scanner(System.in);
        
        String diaSemana[] = new String[7];
        
        int dia;
        
        diaSemana[0] = "Domingo";
        diaSemana[1] = "Lunes";
        diaSemana[2] = "Martes";
        diaSemana[3] = "Miercoles";
        diaSemana[4] = "Jueves";
        diaSemana[5] = "Viernes";
        diaSemana[6] = "Sábado";
        
         System.out.println("Introduce el número (0-6)");
         
         dia = input.nextInt();
         
         System.out.println("El dia de la semana es: " + diaSemana[dia]);
    }
    
}
