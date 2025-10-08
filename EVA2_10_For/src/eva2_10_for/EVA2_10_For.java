/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_10_for;

import java.util.Scanner;
/**
 *
 * @author licce
 */
public class EVA2_10_For {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        //Imprimir del 1 al 20
        
        for(int i = 1; i <= 20; i++){
            System.out.print(i + "- ");
        }
        //Imprimir los numeros pares
        //2 - 4 - 6 - ..... 100
        //+= suma, -= resta, *= multiplica, /= divide
  
        for(int i = 0; i <= 100; i+= 2){
            System.out.print(i + "- ");
        }
        for(int i = 100; i >= 1; i--){
            System.out.println(i + "_ ");
        }
        
        //Imprimir entre numeros
        
    System.out.println("Introduzca dos números:");
        int uno = input.nextInt();
        System.out.println("y:");
        int dos = input.nextInt();
        
        if(uno <= dos){
        for(int i = uno; i <= dos; i++){
            System.out.println(i +"- ");
        }
        }
        for(int i = dos; i >= dos; i--){
            System.out.println(i +"- ");
        
    }
        
        //Imprimir las tablas de multiplicar
        
        System.out.println("Ingresa el numero de la tabla que quieres");
        int tab = input.nextInt();
        
        System.out.println("La tabla del " + tab);
        
        for(int i = 1; i <= 10; i++)
            System.out.print(tab * i + "- ");
}
}
