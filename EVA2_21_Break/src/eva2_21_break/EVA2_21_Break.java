/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_21_break;
import java.util.Scanner;
/**
 *
 * @author licce
 */
public class EVA2_21_Break {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner input = new Scanner(System.in);
    int valor, adivinar;
    adivinar = (int)(Math.random() * 5) + 1;//Num. entre 1 y 5
    while(true){
        System.out.println("Adivina el número. -1 para terminar");
        valor = input.nextInt();
        if(valor == adivinar){
            System.out.println("Ganaste!!");
            break;
        }
        
        if(valor == -1)
            break;//Termina por completo el ciclo
    }
    System.out.println("Gracias por jugar!!");
    }
    
}
