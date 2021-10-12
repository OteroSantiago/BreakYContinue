/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package breakycontinue;

/**
 *
 * @author Santiago
 */
public class BreakYContinue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Ejercicio 1
        System.out.println("Imprimir los numeros pares entre 0 y 10: ");
        for(int i = 1; i < 10; i++){
            if(i%2==0){
                System.out.println(i + " ");
                continue;
            }
        }
        System.out.println("");
        //Ejercicio 2
        System.out.println("Imprimir el primer numero par que nos encontremos: ");
        for(int i = 1; i < 10; i++){
            if(i%2==0){
                System.out.println(i + " ");
                break;
            }
        }
    }
    
}
