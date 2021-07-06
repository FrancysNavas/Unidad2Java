package unidad2;

import java.util.Scanner;

public class Unidad2 {

    public static void main(String[] args) {
        // pida al usuario ingresar su nombre, apellido, edad, hobbie,
        //editor de código preferido, sistema operativo que utiliza,
        //luego deberá mostrarse por consola los datos ingresados.
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("***Bienvenodo***");
        System.out.println("Ingrese su Nombre");
        String nombre = scanner.nextLine();
        
        System.out.println("Ingrese su Apellido");
        String apellido = scanner.nextLine();
        
        System.out.println("Ingrese su edad");
        int edad = scanner.nextInt();
        
        System.out.println("Indique su Hobbie preferido");
        String hobbie = scanner.nextLine();
                
        System.out.println("Indique cúal es su editor de texto preferido");
        String ediTexto = scanner.nextLine();
        
        System.out.println("Indique cual es el Sistema Operativo que utiliza");
        String sistOperativo = scanner.nextLine();
        
        System.out.println("Bienvenid@  " + nombre +" "+ apellido + " de: "+edad+" años");
        System.out.println("Su Hobbie preferido es: "+ hobbie);
        System.out.println("Su Editor de Texto Preferido es: "+ediTexto);
        System.out.println("El Sistema operativo que utiliza es: "+sistOperativo);
    }
    
}
