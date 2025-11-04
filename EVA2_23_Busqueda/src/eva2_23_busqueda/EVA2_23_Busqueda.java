/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_23_busqueda;
import java.util.Scanner;
/**
 *
 * @author licce
 */
public class EVA2_23_Busqueda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int valor, posi = -1;//-1 Significa que no lo encontramos
        int datos[] = new int[10];
        for (int i = 0; i < datos.length; i++) {
            datos[i] = (int)(Math.random() * 100);
        }
         for (int i = 0; i < datos.length; i++) {
             System.out.print("[" + datos[i] + "]");
            
        }
            System.out.println("");
            System.out.println("Valor a buscar: ");
            valor = input.nextInt();
            //BUSQUEDA LINEAL
            
            for (int i = 0; i < datos.length; i++) {
                if(valor == datos[i]){//Lo encontramos
                posi = i;//Regresamos donde lo encontramos
                break;//Ya lo encontré, detengo la busqueda
                
                }
            }
            System.out.print("Posición: " + posi);
        }
    }


