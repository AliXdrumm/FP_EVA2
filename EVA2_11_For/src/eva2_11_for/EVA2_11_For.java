/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_11_for;
import java.util.Scanner;
/**
 *
 * @author licce
 */
public class EVA2_11_For {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        int uno, dos, resi;
        System.out.println("Pon dos numeros:");
        uno = input.nextInt();
        System.out.println("Y el:");
        dos = input.nextInt();
        
        for(int i = uno; i <= dos; i++){
            resi = i % 2; //Saber si el numero es par
            
            if(resi == 0){
              System.out.print(i + "-");
            }
        }
    }
    
}
