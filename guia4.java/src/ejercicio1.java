/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author flavia
 */
import java.util.Scanner;
public class ejercicio1 {
    x/*
Crear un programa que pida una frase y si esa frase es igual a “eureka” el
programa pondrá un mensaje de Correcto, sino mostrará un mensaje de
Incorrecto. Nota: investigar la función equals() en Java.
 */    
 public static void main(String[] args) {
        
        String frase;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese una frase:");
        frase = leer.nextLine();
        
        if(frase.equalsIgnoreCase("eureka")){
            System.out.println("correcto");
        }else{
            System.out.println("incorrecto");
        }
        }
