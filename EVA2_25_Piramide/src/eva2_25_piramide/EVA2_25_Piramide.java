/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_25_piramide;
import java.util.Scanner;
/**
 *
 * @author licce
 */
public class EVA2_25_Piramide {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.print("Introduce un número que nos dé en la pirámide: ");
        int pira = input.nextInt();
        String aster = "*";
        for(int i = 1; i <= pira; i++){
            for(int j = 1; j <= i; j++){
                System.out.println(" ");
                
                while(j <= i){
                    j++;
                    System.out.print(aster);
                }
            }
            
            
        }for(int i = pira + 1; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                System.out.println(" ");
                
                while(j <= i){
                    j++;
                    System.out.print(aster);
                }
            }
    }
        System.out.println(" ");
}
}
