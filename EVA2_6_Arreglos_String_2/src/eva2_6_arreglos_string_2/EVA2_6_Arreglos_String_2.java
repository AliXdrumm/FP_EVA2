/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_6_arreglos_string_2;

import java.util.Scanner;

/**
 *
 * @author licce
 */
public class EVA2_6_Arreglos_String_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        int dia;
        
        String diaSemana[] = {"Domingo", "Lunes", "Martes", "Miercoles", "Jueves",
                                        "Viernes", "Sábado"};
        
         System.out.println("Introduce el número (0-6)");
         
         dia = input.nextInt();
         
         System.out.println("El dia de la semana es: " + diaSemana[dia]);
       
    }
    
}
