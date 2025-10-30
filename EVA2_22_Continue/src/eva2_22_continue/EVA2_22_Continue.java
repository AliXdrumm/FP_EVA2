/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_22_continue;

/**
 *
 * @author licce
 */
public class EVA2_22_Continue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i = 1;
        while(i < 100){
            int resi = i % 2;
            if(resi != 0){//No Es divisble entre dos
                i++;
                continue;
            }
                System.out.print(i + " - ");
                i++;
            }
        }
    }
    

